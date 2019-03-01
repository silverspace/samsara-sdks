#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_machine.h"



tagged_machine_t *tagged_machine_create(
    long id,
    char *name
    ) {
	tagged_machine_t *tagged_machine = malloc(sizeof(tagged_machine_t));
	tagged_machine->id = id;
	tagged_machine->name = name;

	return tagged_machine;
}


void tagged_machine_free(tagged_machine_t *tagged_machine) {
    listEntry_t *listEntry;
    free(tagged_machine->name);

	free(tagged_machine);
}

cJSON *tagged_machine_convertToJSON(tagged_machine_t *tagged_machine) {
	cJSON *item = cJSON_CreateObject();
	// tagged_machine->id
    if(cJSON_AddNumberToObject(item, "id", tagged_machine->id) == NULL) {
    goto fail; //Numeric
    }

	// tagged_machine->name
    if(cJSON_AddStringToObject(item, "name", tagged_machine->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_machine_t *tagged_machine_parseFromJSON(char *jsonString){

    tagged_machine_t *tagged_machine = NULL;
    cJSON *tagged_machineJSON = cJSON_Parse(jsonString);
    if(tagged_machineJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_machine->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_machineJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // tagged_machine->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tagged_machineJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    tagged_machine = tagged_machine_create (
        id->valuedouble,
        strdup(name->valuestring)
        );
 cJSON_Delete(tagged_machineJSON);
    return tagged_machine;
end:
    cJSON_Delete(tagged_machineJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "machine.h"



machine_t *machine_create(
    long id,
    char *name,
    char *notes
    ) {
	machine_t *machine = malloc(sizeof(machine_t));
	machine->id = id;
	machine->name = name;
	machine->notes = notes;

	return machine;
}


void machine_free(machine_t *machine) {
    listEntry_t *listEntry;
    free(machine->name);
    free(machine->notes);

	free(machine);
}

cJSON *machine_convertToJSON(machine_t *machine) {
	cJSON *item = cJSON_CreateObject();
	// machine->id
    if(cJSON_AddNumberToObject(item, "id", machine->id) == NULL) {
    goto fail; //Numeric
    }

	// machine->name
    if(cJSON_AddStringToObject(item, "name", machine->name) == NULL) {
    goto fail; //String
    }

	// machine->notes
    if(cJSON_AddStringToObject(item, "notes", machine->notes) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

machine_t *machine_parseFromJSON(char *jsonString){

    machine_t *machine = NULL;
    cJSON *machineJSON = cJSON_Parse(jsonString);
    if(machineJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // machine->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(machineJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // machine->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(machineJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // machine->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(machineJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }


    machine = machine_create (
        id->valuedouble,
        strdup(name->valuestring),
        strdup(notes->valuestring)
        );
 cJSON_Delete(machineJSON);
    return machine;
end:
    cJSON_Delete(machineJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_machine_base.h"



tagged_machine_base_t *tagged_machine_base_create(
    long id
    ) {
	tagged_machine_base_t *tagged_machine_base = malloc(sizeof(tagged_machine_base_t));
	tagged_machine_base->id = id;

	return tagged_machine_base;
}


void tagged_machine_base_free(tagged_machine_base_t *tagged_machine_base) {
    listEntry_t *listEntry;

	free(tagged_machine_base);
}

cJSON *tagged_machine_base_convertToJSON(tagged_machine_base_t *tagged_machine_base) {
	cJSON *item = cJSON_CreateObject();
	// tagged_machine_base->id
    if(cJSON_AddNumberToObject(item, "id", tagged_machine_base->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_machine_base_t *tagged_machine_base_parseFromJSON(char *jsonString){

    tagged_machine_base_t *tagged_machine_base = NULL;
    cJSON *tagged_machine_baseJSON = cJSON_Parse(jsonString);
    if(tagged_machine_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_machine_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_machine_baseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    tagged_machine_base = tagged_machine_base_create (
        id->valuedouble
        );
 cJSON_Delete(tagged_machine_baseJSON);
    return tagged_machine_base;
end:
    cJSON_Delete(tagged_machine_baseJSON);
    return NULL;

}


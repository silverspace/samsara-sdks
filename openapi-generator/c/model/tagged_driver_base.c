#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_driver_base.h"



tagged_driver_base_t *tagged_driver_base_create(
    long id
    ) {
	tagged_driver_base_t *tagged_driver_base = malloc(sizeof(tagged_driver_base_t));
	tagged_driver_base->id = id;

	return tagged_driver_base;
}


void tagged_driver_base_free(tagged_driver_base_t *tagged_driver_base) {
    listEntry_t *listEntry;

	free(tagged_driver_base);
}

cJSON *tagged_driver_base_convertToJSON(tagged_driver_base_t *tagged_driver_base) {
	cJSON *item = cJSON_CreateObject();
	// tagged_driver_base->id
    if(cJSON_AddNumberToObject(item, "id", tagged_driver_base->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_driver_base_t *tagged_driver_base_parseFromJSON(char *jsonString){

    tagged_driver_base_t *tagged_driver_base = NULL;
    cJSON *tagged_driver_baseJSON = cJSON_Parse(jsonString);
    if(tagged_driver_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_driver_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_driver_baseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    tagged_driver_base = tagged_driver_base_create (
        id->valuedouble
        );
 cJSON_Delete(tagged_driver_baseJSON);
    return tagged_driver_base;
end:
    cJSON_Delete(tagged_driver_baseJSON);
    return NULL;

}


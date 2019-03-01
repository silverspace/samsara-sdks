#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_address_base.h"



tagged_address_base_t *tagged_address_base_create(
    long id
    ) {
	tagged_address_base_t *tagged_address_base = malloc(sizeof(tagged_address_base_t));
	tagged_address_base->id = id;

	return tagged_address_base;
}


void tagged_address_base_free(tagged_address_base_t *tagged_address_base) {
    listEntry_t *listEntry;

	free(tagged_address_base);
}

cJSON *tagged_address_base_convertToJSON(tagged_address_base_t *tagged_address_base) {
	cJSON *item = cJSON_CreateObject();
	// tagged_address_base->id
    if(cJSON_AddNumberToObject(item, "id", tagged_address_base->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_address_base_t *tagged_address_base_parseFromJSON(char *jsonString){

    tagged_address_base_t *tagged_address_base = NULL;
    cJSON *tagged_address_baseJSON = cJSON_Parse(jsonString);
    if(tagged_address_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_address_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_address_baseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    tagged_address_base = tagged_address_base_create (
        id->valuedouble
        );
 cJSON_Delete(tagged_address_baseJSON);
    return tagged_address_base;
end:
    cJSON_Delete(tagged_address_baseJSON);
    return NULL;

}


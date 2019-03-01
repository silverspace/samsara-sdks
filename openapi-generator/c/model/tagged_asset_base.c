#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_asset_base.h"



tagged_asset_base_t *tagged_asset_base_create(
    long id
    ) {
	tagged_asset_base_t *tagged_asset_base = malloc(sizeof(tagged_asset_base_t));
	tagged_asset_base->id = id;

	return tagged_asset_base;
}


void tagged_asset_base_free(tagged_asset_base_t *tagged_asset_base) {
    listEntry_t *listEntry;

	free(tagged_asset_base);
}

cJSON *tagged_asset_base_convertToJSON(tagged_asset_base_t *tagged_asset_base) {
	cJSON *item = cJSON_CreateObject();
	// tagged_asset_base->id
    if(cJSON_AddNumberToObject(item, "id", tagged_asset_base->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_asset_base_t *tagged_asset_base_parseFromJSON(char *jsonString){

    tagged_asset_base_t *tagged_asset_base = NULL;
    cJSON *tagged_asset_baseJSON = cJSON_Parse(jsonString);
    if(tagged_asset_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_asset_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_asset_baseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    tagged_asset_base = tagged_asset_base_create (
        id->valuedouble
        );
 cJSON_Delete(tagged_asset_baseJSON);
    return tagged_asset_base;
end:
    cJSON_Delete(tagged_asset_baseJSON);
    return NULL;

}


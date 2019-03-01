#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_asset.h"



tagged_asset_t *tagged_asset_create(
    long id,
    char *name
    ) {
	tagged_asset_t *tagged_asset = malloc(sizeof(tagged_asset_t));
	tagged_asset->id = id;
	tagged_asset->name = name;

	return tagged_asset;
}


void tagged_asset_free(tagged_asset_t *tagged_asset) {
    listEntry_t *listEntry;
    free(tagged_asset->name);

	free(tagged_asset);
}

cJSON *tagged_asset_convertToJSON(tagged_asset_t *tagged_asset) {
	cJSON *item = cJSON_CreateObject();
	// tagged_asset->id
    if(cJSON_AddNumberToObject(item, "id", tagged_asset->id) == NULL) {
    goto fail; //Numeric
    }

	// tagged_asset->name
    if(cJSON_AddStringToObject(item, "name", tagged_asset->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_asset_t *tagged_asset_parseFromJSON(char *jsonString){

    tagged_asset_t *tagged_asset = NULL;
    cJSON *tagged_assetJSON = cJSON_Parse(jsonString);
    if(tagged_assetJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_asset->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_assetJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // tagged_asset->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tagged_assetJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    tagged_asset = tagged_asset_create (
        id->valuedouble,
        strdup(name->valuestring)
        );
 cJSON_Delete(tagged_assetJSON);
    return tagged_asset;
end:
    cJSON_Delete(tagged_assetJSON);
    return NULL;

}


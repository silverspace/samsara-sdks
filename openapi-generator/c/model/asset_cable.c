#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_cable.h"



asset_cable_t *asset_cable_create(
    char *assetType
    ) {
	asset_cable_t *asset_cable = malloc(sizeof(asset_cable_t));
	asset_cable->assetType = assetType;

	return asset_cable;
}


void asset_cable_free(asset_cable_t *asset_cable) {
    listEntry_t *listEntry;
    free(asset_cable->assetType);

	free(asset_cable);
}

cJSON *asset_cable_convertToJSON(asset_cable_t *asset_cable) {
	cJSON *item = cJSON_CreateObject();
	// asset_cable->assetType
    if(cJSON_AddStringToObject(item, "assetType", asset_cable->assetType) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_cable_t *asset_cable_parseFromJSON(char *jsonString){

    asset_cable_t *asset_cable = NULL;
    cJSON *asset_cableJSON = cJSON_Parse(jsonString);
    if(asset_cableJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_cable->assetType
    cJSON *assetType = cJSON_GetObjectItemCaseSensitive(asset_cableJSON, "assetType");
    if(!cJSON_IsString(assetType) || (assetType->valuestring == NULL)){
    goto end; //String
    }


    asset_cable = asset_cable_create (
        strdup(assetType->valuestring)
        );
 cJSON_Delete(asset_cableJSON);
    return asset_cable;
end:
    cJSON_Delete(asset_cableJSON);
    return NULL;

}


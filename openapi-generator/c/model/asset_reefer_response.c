#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_reefer_response.h"



asset_reefer_response_t *asset_reefer_response_create(
    char *assetType,
    int id,
    char *name,
    asset_reefer_response_reefer_stats_t *reeferStats
    ) {
	asset_reefer_response_t *asset_reefer_response = malloc(sizeof(asset_reefer_response_t));
	asset_reefer_response->assetType = assetType;
	asset_reefer_response->id = id;
	asset_reefer_response->name = name;
	asset_reefer_response->reeferStats = reeferStats;

	return asset_reefer_response;
}


void asset_reefer_response_free(asset_reefer_response_t *asset_reefer_response) {
    listEntry_t *listEntry;
    free(asset_reefer_response->assetType);
    free(asset_reefer_response->name);
	asset_reefer_response_reefer_stats_free(asset_reefer_response->reeferStats);

	free(asset_reefer_response);
}

cJSON *asset_reefer_response_convertToJSON(asset_reefer_response_t *asset_reefer_response) {
	cJSON *item = cJSON_CreateObject();
	// asset_reefer_response->assetType
    if(cJSON_AddStringToObject(item, "assetType", asset_reefer_response->assetType) == NULL) {
    goto fail; //String
    }

	// asset_reefer_response->id
    if(cJSON_AddNumberToObject(item, "id", asset_reefer_response->id) == NULL) {
    goto fail; //Numeric
    }

	// asset_reefer_response->name
    if(cJSON_AddStringToObject(item, "name", asset_reefer_response->name) == NULL) {
    goto fail; //String
    }

	// asset_reefer_response->reeferStats
	cJSON *reeferStats = asset_reefer_response_reefer_stats_convertToJSON(asset_reefer_response->reeferStats);
	if(reeferStats == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "reeferStats", reeferStats);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_reefer_response_t *asset_reefer_response_parseFromJSON(char *jsonString){

    asset_reefer_response_t *asset_reefer_response = NULL;
    cJSON *asset_reefer_responseJSON = cJSON_Parse(jsonString);
    if(asset_reefer_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_reefer_response->assetType
    cJSON *assetType = cJSON_GetObjectItemCaseSensitive(asset_reefer_responseJSON, "assetType");
    if(!cJSON_IsString(assetType) || (assetType->valuestring == NULL)){
    goto end; //String
    }

    // asset_reefer_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(asset_reefer_responseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // asset_reefer_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(asset_reefer_responseJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // asset_reefer_response->reeferStats
    asset_reefer_response_reefer_stats_t *reeferStats;
    cJSON *reeferStatsJSON = cJSON_GetObjectItemCaseSensitive(asset_reefer_responseJSON, "reeferStats");
    if(asset_reefer_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *reeferStatsJSONData = cJSON_Print(reeferStatsJSON);
    reeferStats = asset_reefer_response_reefer_stats_parseFromJSON(reeferStatsJSONData);


    asset_reefer_response = asset_reefer_response_create (
        strdup(assetType->valuestring),
        id->valuedouble,
        strdup(name->valuestring),
        reeferStats
        );
        free(reeferStatsJSONData);
 cJSON_Delete(asset_reefer_responseJSON);
    return asset_reefer_response;
end:
    cJSON_Delete(asset_reefer_responseJSON);
    return NULL;

}


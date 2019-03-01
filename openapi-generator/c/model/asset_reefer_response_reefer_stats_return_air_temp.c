#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_reefer_response_reefer_stats_return_air_temp.h"



asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp_create(
    long tempInMilliC,
    long changedAtMs
    ) {
	asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp = malloc(sizeof(asset_reefer_response_reefer_stats_return_air_temp_t));
	asset_reefer_response_reefer_stats_return_air_temp->tempInMilliC = tempInMilliC;
	asset_reefer_response_reefer_stats_return_air_temp->changedAtMs = changedAtMs;

	return asset_reefer_response_reefer_stats_return_air_temp;
}


void asset_reefer_response_reefer_stats_return_air_temp_free(asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp) {
    listEntry_t *listEntry;

	free(asset_reefer_response_reefer_stats_return_air_temp);
}

cJSON *asset_reefer_response_reefer_stats_return_air_temp_convertToJSON(asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp) {
	cJSON *item = cJSON_CreateObject();
	// asset_reefer_response_reefer_stats_return_air_temp->tempInMilliC
    if(cJSON_AddNumberToObject(item, "tempInMilliC", asset_reefer_response_reefer_stats_return_air_temp->tempInMilliC) == NULL) {
    goto fail; //Numeric
    }

	// asset_reefer_response_reefer_stats_return_air_temp->changedAtMs
    if(cJSON_AddNumberToObject(item, "changedAtMs", asset_reefer_response_reefer_stats_return_air_temp->changedAtMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp_parseFromJSON(char *jsonString){

    asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp = NULL;
    cJSON *asset_reefer_response_reefer_stats_return_air_tempJSON = cJSON_Parse(jsonString);
    if(asset_reefer_response_reefer_stats_return_air_tempJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_reefer_response_reefer_stats_return_air_temp->tempInMilliC
    cJSON *tempInMilliC = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_return_air_tempJSON, "tempInMilliC");
    if(!cJSON_IsNumber(tempInMilliC))
    {
    goto end; //Numeric
    }

    // asset_reefer_response_reefer_stats_return_air_temp->changedAtMs
    cJSON *changedAtMs = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_return_air_tempJSON, "changedAtMs");
    if(!cJSON_IsNumber(changedAtMs))
    {
    goto end; //Numeric
    }


    asset_reefer_response_reefer_stats_return_air_temp = asset_reefer_response_reefer_stats_return_air_temp_create (
        tempInMilliC->valuedouble,
        changedAtMs->valuedouble
        );
 cJSON_Delete(asset_reefer_response_reefer_stats_return_air_tempJSON);
    return asset_reefer_response_reefer_stats_return_air_temp;
end:
    cJSON_Delete(asset_reefer_response_reefer_stats_return_air_tempJSON);
    return NULL;

}


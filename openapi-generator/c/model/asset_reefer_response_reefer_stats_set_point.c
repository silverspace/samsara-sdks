#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_reefer_response_reefer_stats_set_point.h"



asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point_create(
    long tempInMilliC,
    long changedAtMs
    ) {
	asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point = malloc(sizeof(asset_reefer_response_reefer_stats_set_point_t));
	asset_reefer_response_reefer_stats_set_point->tempInMilliC = tempInMilliC;
	asset_reefer_response_reefer_stats_set_point->changedAtMs = changedAtMs;

	return asset_reefer_response_reefer_stats_set_point;
}


void asset_reefer_response_reefer_stats_set_point_free(asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point) {
    listEntry_t *listEntry;

	free(asset_reefer_response_reefer_stats_set_point);
}

cJSON *asset_reefer_response_reefer_stats_set_point_convertToJSON(asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point) {
	cJSON *item = cJSON_CreateObject();
	// asset_reefer_response_reefer_stats_set_point->tempInMilliC
    if(cJSON_AddNumberToObject(item, "tempInMilliC", asset_reefer_response_reefer_stats_set_point->tempInMilliC) == NULL) {
    goto fail; //Numeric
    }

	// asset_reefer_response_reefer_stats_set_point->changedAtMs
    if(cJSON_AddNumberToObject(item, "changedAtMs", asset_reefer_response_reefer_stats_set_point->changedAtMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point_parseFromJSON(char *jsonString){

    asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point = NULL;
    cJSON *asset_reefer_response_reefer_stats_set_pointJSON = cJSON_Parse(jsonString);
    if(asset_reefer_response_reefer_stats_set_pointJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_reefer_response_reefer_stats_set_point->tempInMilliC
    cJSON *tempInMilliC = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_set_pointJSON, "tempInMilliC");
    if(!cJSON_IsNumber(tempInMilliC))
    {
    goto end; //Numeric
    }

    // asset_reefer_response_reefer_stats_set_point->changedAtMs
    cJSON *changedAtMs = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_set_pointJSON, "changedAtMs");
    if(!cJSON_IsNumber(changedAtMs))
    {
    goto end; //Numeric
    }


    asset_reefer_response_reefer_stats_set_point = asset_reefer_response_reefer_stats_set_point_create (
        tempInMilliC->valuedouble,
        changedAtMs->valuedouble
        );
 cJSON_Delete(asset_reefer_response_reefer_stats_set_pointJSON);
    return asset_reefer_response_reefer_stats_set_point;
end:
    cJSON_Delete(asset_reefer_response_reefer_stats_set_pointJSON);
    return NULL;

}


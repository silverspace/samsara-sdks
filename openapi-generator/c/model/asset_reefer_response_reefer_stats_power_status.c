#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_reefer_response_reefer_stats_power_status.h"



asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status_create(
    long changedAtMs,
    char *status
    ) {
	asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status = malloc(sizeof(asset_reefer_response_reefer_stats_power_status_t));
	asset_reefer_response_reefer_stats_power_status->changedAtMs = changedAtMs;
	asset_reefer_response_reefer_stats_power_status->status = status;

	return asset_reefer_response_reefer_stats_power_status;
}


void asset_reefer_response_reefer_stats_power_status_free(asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status) {
    listEntry_t *listEntry;
    free(asset_reefer_response_reefer_stats_power_status->status);

	free(asset_reefer_response_reefer_stats_power_status);
}

cJSON *asset_reefer_response_reefer_stats_power_status_convertToJSON(asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status) {
	cJSON *item = cJSON_CreateObject();
	// asset_reefer_response_reefer_stats_power_status->changedAtMs
    if(cJSON_AddNumberToObject(item, "changedAtMs", asset_reefer_response_reefer_stats_power_status->changedAtMs) == NULL) {
    goto fail; //Numeric
    }

	// asset_reefer_response_reefer_stats_power_status->status
    if(cJSON_AddStringToObject(item, "status", asset_reefer_response_reefer_stats_power_status->status) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status_parseFromJSON(char *jsonString){

    asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status = NULL;
    cJSON *asset_reefer_response_reefer_stats_power_statusJSON = cJSON_Parse(jsonString);
    if(asset_reefer_response_reefer_stats_power_statusJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_reefer_response_reefer_stats_power_status->changedAtMs
    cJSON *changedAtMs = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_power_statusJSON, "changedAtMs");
    if(!cJSON_IsNumber(changedAtMs))
    {
    goto end; //Numeric
    }

    // asset_reefer_response_reefer_stats_power_status->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_power_statusJSON, "status");
    if(!cJSON_IsString(status) || (status->valuestring == NULL)){
    goto end; //String
    }


    asset_reefer_response_reefer_stats_power_status = asset_reefer_response_reefer_stats_power_status_create (
        changedAtMs->valuedouble,
        strdup(status->valuestring)
        );
 cJSON_Delete(asset_reefer_response_reefer_stats_power_statusJSON);
    return asset_reefer_response_reefer_stats_power_status;
end:
    cJSON_Delete(asset_reefer_response_reefer_stats_power_statusJSON);
    return NULL;

}


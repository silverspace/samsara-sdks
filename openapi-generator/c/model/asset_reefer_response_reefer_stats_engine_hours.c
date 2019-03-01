#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_reefer_response_reefer_stats_engine_hours.h"



asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours_create(
    long engineHours,
    long changedAtMs
    ) {
	asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours = malloc(sizeof(asset_reefer_response_reefer_stats_engine_hours_t));
	asset_reefer_response_reefer_stats_engine_hours->engineHours = engineHours;
	asset_reefer_response_reefer_stats_engine_hours->changedAtMs = changedAtMs;

	return asset_reefer_response_reefer_stats_engine_hours;
}


void asset_reefer_response_reefer_stats_engine_hours_free(asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours) {
    listEntry_t *listEntry;

	free(asset_reefer_response_reefer_stats_engine_hours);
}

cJSON *asset_reefer_response_reefer_stats_engine_hours_convertToJSON(asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours) {
	cJSON *item = cJSON_CreateObject();
	// asset_reefer_response_reefer_stats_engine_hours->engineHours
    if(cJSON_AddNumberToObject(item, "engineHours", asset_reefer_response_reefer_stats_engine_hours->engineHours) == NULL) {
    goto fail; //Numeric
    }

	// asset_reefer_response_reefer_stats_engine_hours->changedAtMs
    if(cJSON_AddNumberToObject(item, "changedAtMs", asset_reefer_response_reefer_stats_engine_hours->changedAtMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours_parseFromJSON(char *jsonString){

    asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours = NULL;
    cJSON *asset_reefer_response_reefer_stats_engine_hoursJSON = cJSON_Parse(jsonString);
    if(asset_reefer_response_reefer_stats_engine_hoursJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_reefer_response_reefer_stats_engine_hours->engineHours
    cJSON *engineHours = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_engine_hoursJSON, "engineHours");
    if(!cJSON_IsNumber(engineHours))
    {
    goto end; //Numeric
    }

    // asset_reefer_response_reefer_stats_engine_hours->changedAtMs
    cJSON *changedAtMs = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_engine_hoursJSON, "changedAtMs");
    if(!cJSON_IsNumber(changedAtMs))
    {
    goto end; //Numeric
    }


    asset_reefer_response_reefer_stats_engine_hours = asset_reefer_response_reefer_stats_engine_hours_create (
        engineHours->valuedouble,
        changedAtMs->valuedouble
        );
 cJSON_Delete(asset_reefer_response_reefer_stats_engine_hoursJSON);
    return asset_reefer_response_reefer_stats_engine_hours;
end:
    cJSON_Delete(asset_reefer_response_reefer_stats_engine_hoursJSON);
    return NULL;

}


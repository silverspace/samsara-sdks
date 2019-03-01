#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_reefer_response_reefer_stats_alarms.h"



asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms_create(
    long severity,
    char *operatorAction,
    char *description,
    long alarmCode
    ) {
	asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms = malloc(sizeof(asset_reefer_response_reefer_stats_alarms_t));
	asset_reefer_response_reefer_stats_alarms->severity = severity;
	asset_reefer_response_reefer_stats_alarms->operatorAction = operatorAction;
	asset_reefer_response_reefer_stats_alarms->description = description;
	asset_reefer_response_reefer_stats_alarms->alarmCode = alarmCode;

	return asset_reefer_response_reefer_stats_alarms;
}


void asset_reefer_response_reefer_stats_alarms_free(asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms) {
    listEntry_t *listEntry;
    free(asset_reefer_response_reefer_stats_alarms->operatorAction);
    free(asset_reefer_response_reefer_stats_alarms->description);

	free(asset_reefer_response_reefer_stats_alarms);
}

cJSON *asset_reefer_response_reefer_stats_alarms_convertToJSON(asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms) {
	cJSON *item = cJSON_CreateObject();
	// asset_reefer_response_reefer_stats_alarms->severity
    if(cJSON_AddNumberToObject(item, "severity", asset_reefer_response_reefer_stats_alarms->severity) == NULL) {
    goto fail; //Numeric
    }

	// asset_reefer_response_reefer_stats_alarms->operatorAction
    if(cJSON_AddStringToObject(item, "operatorAction", asset_reefer_response_reefer_stats_alarms->operatorAction) == NULL) {
    goto fail; //String
    }

	// asset_reefer_response_reefer_stats_alarms->description
    if(cJSON_AddStringToObject(item, "description", asset_reefer_response_reefer_stats_alarms->description) == NULL) {
    goto fail; //String
    }

	// asset_reefer_response_reefer_stats_alarms->alarmCode
    if(cJSON_AddNumberToObject(item, "alarmCode", asset_reefer_response_reefer_stats_alarms->alarmCode) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms_parseFromJSON(char *jsonString){

    asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms = NULL;
    cJSON *asset_reefer_response_reefer_stats_alarmsJSON = cJSON_Parse(jsonString);
    if(asset_reefer_response_reefer_stats_alarmsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_reefer_response_reefer_stats_alarms->severity
    cJSON *severity = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_alarmsJSON, "severity");
    if(!cJSON_IsNumber(severity))
    {
    goto end; //Numeric
    }

    // asset_reefer_response_reefer_stats_alarms->operatorAction
    cJSON *operatorAction = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_alarmsJSON, "operatorAction");
    if(!cJSON_IsString(operatorAction) || (operatorAction->valuestring == NULL)){
    goto end; //String
    }

    // asset_reefer_response_reefer_stats_alarms->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_alarmsJSON, "description");
    if(!cJSON_IsString(description) || (description->valuestring == NULL)){
    goto end; //String
    }

    // asset_reefer_response_reefer_stats_alarms->alarmCode
    cJSON *alarmCode = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_alarmsJSON, "alarmCode");
    if(!cJSON_IsNumber(alarmCode))
    {
    goto end; //Numeric
    }


    asset_reefer_response_reefer_stats_alarms = asset_reefer_response_reefer_stats_alarms_create (
        severity->valuedouble,
        strdup(operatorAction->valuestring),
        strdup(description->valuestring),
        alarmCode->valuedouble
        );
 cJSON_Delete(asset_reefer_response_reefer_stats_alarmsJSON);
    return asset_reefer_response_reefer_stats_alarms;
end:
    cJSON_Delete(asset_reefer_response_reefer_stats_alarmsJSON);
    return NULL;

}


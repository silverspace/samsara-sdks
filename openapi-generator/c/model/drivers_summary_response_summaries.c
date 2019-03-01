#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "drivers_summary_response_summaries.h"



drivers_summary_response_summaries_t *drivers_summary_response_summaries_create(
    long driverId,
    double distanceMiles,
    long driveMs,
    long activeMs,
    char *driverUsername,
    long groupId,
    char *driverName,
    long onDutyMs
    ) {
	drivers_summary_response_summaries_t *drivers_summary_response_summaries = malloc(sizeof(drivers_summary_response_summaries_t));
	drivers_summary_response_summaries->driverId = driverId;
	drivers_summary_response_summaries->distanceMiles = distanceMiles;
	drivers_summary_response_summaries->driveMs = driveMs;
	drivers_summary_response_summaries->activeMs = activeMs;
	drivers_summary_response_summaries->driverUsername = driverUsername;
	drivers_summary_response_summaries->groupId = groupId;
	drivers_summary_response_summaries->driverName = driverName;
	drivers_summary_response_summaries->onDutyMs = onDutyMs;

	return drivers_summary_response_summaries;
}


void drivers_summary_response_summaries_free(drivers_summary_response_summaries_t *drivers_summary_response_summaries) {
    listEntry_t *listEntry;
    free(drivers_summary_response_summaries->driverUsername);
    free(drivers_summary_response_summaries->driverName);

	free(drivers_summary_response_summaries);
}

cJSON *drivers_summary_response_summaries_convertToJSON(drivers_summary_response_summaries_t *drivers_summary_response_summaries) {
	cJSON *item = cJSON_CreateObject();
	// drivers_summary_response_summaries->driverId
    if(cJSON_AddNumberToObject(item, "driverId", drivers_summary_response_summaries->driverId) == NULL) {
    goto fail; //Numeric
    }

	// drivers_summary_response_summaries->distanceMiles
    if(cJSON_AddNumberToObject(item, "distanceMiles", drivers_summary_response_summaries->distanceMiles) == NULL) {
    goto fail; //Numeric
    }

	// drivers_summary_response_summaries->driveMs
    if(cJSON_AddNumberToObject(item, "driveMs", drivers_summary_response_summaries->driveMs) == NULL) {
    goto fail; //Numeric
    }

	// drivers_summary_response_summaries->activeMs
    if(cJSON_AddNumberToObject(item, "activeMs", drivers_summary_response_summaries->activeMs) == NULL) {
    goto fail; //Numeric
    }

	// drivers_summary_response_summaries->driverUsername
    if(cJSON_AddStringToObject(item, "driverUsername", drivers_summary_response_summaries->driverUsername) == NULL) {
    goto fail; //String
    }

	// drivers_summary_response_summaries->groupId
    if(cJSON_AddNumberToObject(item, "groupId", drivers_summary_response_summaries->groupId) == NULL) {
    goto fail; //Numeric
    }

	// drivers_summary_response_summaries->driverName
    if(cJSON_AddStringToObject(item, "driverName", drivers_summary_response_summaries->driverName) == NULL) {
    goto fail; //String
    }

	// drivers_summary_response_summaries->onDutyMs
    if(cJSON_AddNumberToObject(item, "onDutyMs", drivers_summary_response_summaries->onDutyMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

drivers_summary_response_summaries_t *drivers_summary_response_summaries_parseFromJSON(char *jsonString){

    drivers_summary_response_summaries_t *drivers_summary_response_summaries = NULL;
    cJSON *drivers_summary_response_summariesJSON = cJSON_Parse(jsonString);
    if(drivers_summary_response_summariesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // drivers_summary_response_summaries->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(drivers_summary_response_summariesJSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // drivers_summary_response_summaries->distanceMiles
    cJSON *distanceMiles = cJSON_GetObjectItemCaseSensitive(drivers_summary_response_summariesJSON, "distanceMiles");
    if(!cJSON_IsNumber(distanceMiles))
    {
    goto end; //Numeric
    }

    // drivers_summary_response_summaries->driveMs
    cJSON *driveMs = cJSON_GetObjectItemCaseSensitive(drivers_summary_response_summariesJSON, "driveMs");
    if(!cJSON_IsNumber(driveMs))
    {
    goto end; //Numeric
    }

    // drivers_summary_response_summaries->activeMs
    cJSON *activeMs = cJSON_GetObjectItemCaseSensitive(drivers_summary_response_summariesJSON, "activeMs");
    if(!cJSON_IsNumber(activeMs))
    {
    goto end; //Numeric
    }

    // drivers_summary_response_summaries->driverUsername
    cJSON *driverUsername = cJSON_GetObjectItemCaseSensitive(drivers_summary_response_summariesJSON, "driverUsername");
    if(!cJSON_IsString(driverUsername) || (driverUsername->valuestring == NULL)){
    goto end; //String
    }

    // drivers_summary_response_summaries->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(drivers_summary_response_summariesJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // drivers_summary_response_summaries->driverName
    cJSON *driverName = cJSON_GetObjectItemCaseSensitive(drivers_summary_response_summariesJSON, "driverName");
    if(!cJSON_IsString(driverName) || (driverName->valuestring == NULL)){
    goto end; //String
    }

    // drivers_summary_response_summaries->onDutyMs
    cJSON *onDutyMs = cJSON_GetObjectItemCaseSensitive(drivers_summary_response_summariesJSON, "onDutyMs");
    if(!cJSON_IsNumber(onDutyMs))
    {
    goto end; //Numeric
    }


    drivers_summary_response_summaries = drivers_summary_response_summaries_create (
        driverId->valuedouble,
        distanceMiles->valuedouble,
        driveMs->valuedouble,
        activeMs->valuedouble,
        strdup(driverUsername->valuestring),
        groupId->valuedouble,
        strdup(driverName->valuestring),
        onDutyMs->valuedouble
        );
 cJSON_Delete(drivers_summary_response_summariesJSON);
    return drivers_summary_response_summaries;
end:
    cJSON_Delete(drivers_summary_response_summariesJSON);
    return NULL;

}


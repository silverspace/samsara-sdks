#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "driver_safety_score_response.h"



driver_safety_score_response_t *driver_safety_score_response_create(
    int crashCount,
    int driverId,
    int harshAccelCount,
    int harshBrakingCount,
    list_t *harshEvents,
    int harshTurningCount,
    int safetyScore,
    char *safetyScoreRank,
    int timeOverSpeedLimitMs,
    int totalDistanceDrivenMeters,
    int totalHarshEventCount,
    int totalTimeDrivenMs
    ) {
	driver_safety_score_response_t *driver_safety_score_response = malloc(sizeof(driver_safety_score_response_t));
	driver_safety_score_response->crashCount = crashCount;
	driver_safety_score_response->driverId = driverId;
	driver_safety_score_response->harshAccelCount = harshAccelCount;
	driver_safety_score_response->harshBrakingCount = harshBrakingCount;
	driver_safety_score_response->harshEvents = harshEvents;
	driver_safety_score_response->harshTurningCount = harshTurningCount;
	driver_safety_score_response->safetyScore = safetyScore;
	driver_safety_score_response->safetyScoreRank = safetyScoreRank;
	driver_safety_score_response->timeOverSpeedLimitMs = timeOverSpeedLimitMs;
	driver_safety_score_response->totalDistanceDrivenMeters = totalDistanceDrivenMeters;
	driver_safety_score_response->totalHarshEventCount = totalHarshEventCount;
	driver_safety_score_response->totalTimeDrivenMs = totalTimeDrivenMs;

	return driver_safety_score_response;
}


void driver_safety_score_response_free(driver_safety_score_response_t *driver_safety_score_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, driver_safety_score_response->harshEvents) {
		safety_report_harsh_event_free(listEntry->data);
	}
	list_free(driver_safety_score_response->harshEvents);
    free(driver_safety_score_response->safetyScoreRank);

	free(driver_safety_score_response);
}

cJSON *driver_safety_score_response_convertToJSON(driver_safety_score_response_t *driver_safety_score_response) {
	cJSON *item = cJSON_CreateObject();
	// driver_safety_score_response->crashCount
    if(cJSON_AddNumberToObject(item, "crashCount", driver_safety_score_response->crashCount) == NULL) {
    goto fail; //Numeric
    }

	// driver_safety_score_response->driverId
    if(cJSON_AddNumberToObject(item, "driverId", driver_safety_score_response->driverId) == NULL) {
    goto fail; //Numeric
    }

	// driver_safety_score_response->harshAccelCount
    if(cJSON_AddNumberToObject(item, "harshAccelCount", driver_safety_score_response->harshAccelCount) == NULL) {
    goto fail; //Numeric
    }

	// driver_safety_score_response->harshBrakingCount
    if(cJSON_AddNumberToObject(item, "harshBrakingCount", driver_safety_score_response->harshBrakingCount) == NULL) {
    goto fail; //Numeric
    }

	// driver_safety_score_response->harshEvents
    cJSON *harshEvents = cJSON_AddArrayToObject(item, "harshEvents");
	if(harshEvents == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *harshEventsListEntry;
	list_ForEach(harshEventsListEntry, driver_safety_score_response->harshEvents) {
		cJSON *item = safety_report_harsh_event_convertToJSON(harshEventsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(harshEvents, item);
	}

	// driver_safety_score_response->harshTurningCount
    if(cJSON_AddNumberToObject(item, "harshTurningCount", driver_safety_score_response->harshTurningCount) == NULL) {
    goto fail; //Numeric
    }

	// driver_safety_score_response->safetyScore
    if(cJSON_AddNumberToObject(item, "safetyScore", driver_safety_score_response->safetyScore) == NULL) {
    goto fail; //Numeric
    }

	// driver_safety_score_response->safetyScoreRank
    if(cJSON_AddStringToObject(item, "safetyScoreRank", driver_safety_score_response->safetyScoreRank) == NULL) {
    goto fail; //String
    }

	// driver_safety_score_response->timeOverSpeedLimitMs
    if(cJSON_AddNumberToObject(item, "timeOverSpeedLimitMs", driver_safety_score_response->timeOverSpeedLimitMs) == NULL) {
    goto fail; //Numeric
    }

	// driver_safety_score_response->totalDistanceDrivenMeters
    if(cJSON_AddNumberToObject(item, "totalDistanceDrivenMeters", driver_safety_score_response->totalDistanceDrivenMeters) == NULL) {
    goto fail; //Numeric
    }

	// driver_safety_score_response->totalHarshEventCount
    if(cJSON_AddNumberToObject(item, "totalHarshEventCount", driver_safety_score_response->totalHarshEventCount) == NULL) {
    goto fail; //Numeric
    }

	// driver_safety_score_response->totalTimeDrivenMs
    if(cJSON_AddNumberToObject(item, "totalTimeDrivenMs", driver_safety_score_response->totalTimeDrivenMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

driver_safety_score_response_t *driver_safety_score_response_parseFromJSON(char *jsonString){

    driver_safety_score_response_t *driver_safety_score_response = NULL;
    cJSON *driver_safety_score_responseJSON = cJSON_Parse(jsonString);
    if(driver_safety_score_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // driver_safety_score_response->crashCount
    cJSON *crashCount = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "crashCount");
    if(!cJSON_IsNumber(crashCount))
    {
    goto end; //Numeric
    }

    // driver_safety_score_response->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // driver_safety_score_response->harshAccelCount
    cJSON *harshAccelCount = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "harshAccelCount");
    if(!cJSON_IsNumber(harshAccelCount))
    {
    goto end; //Numeric
    }

    // driver_safety_score_response->harshBrakingCount
    cJSON *harshBrakingCount = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "harshBrakingCount");
    if(!cJSON_IsNumber(harshBrakingCount))
    {
    goto end; //Numeric
    }

    // driver_safety_score_response->harshEvents
    cJSON *harshEvents;
    cJSON *harshEventsJSON = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON,"harshEvents");
    if(!cJSON_IsArray(harshEventsJSON)){
        goto end; //nonprimitive container
    }

    list_t *harshEventsList = list_create();

    cJSON_ArrayForEach(harshEvents,harshEventsJSON )
    {
        if(!cJSON_IsObject(harshEvents)){
            goto end;
        }
		char *JSONData = cJSON_Print(harshEvents);
        safety_report_harsh_event_t *harshEventsItem = safety_report_harsh_event_parseFromJSON(JSONData);

        list_addElement(harshEventsList, harshEventsItem);
        free(JSONData);
    }

    // driver_safety_score_response->harshTurningCount
    cJSON *harshTurningCount = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "harshTurningCount");
    if(!cJSON_IsNumber(harshTurningCount))
    {
    goto end; //Numeric
    }

    // driver_safety_score_response->safetyScore
    cJSON *safetyScore = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "safetyScore");
    if(!cJSON_IsNumber(safetyScore))
    {
    goto end; //Numeric
    }

    // driver_safety_score_response->safetyScoreRank
    cJSON *safetyScoreRank = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "safetyScoreRank");
    if(!cJSON_IsString(safetyScoreRank) || (safetyScoreRank->valuestring == NULL)){
    goto end; //String
    }

    // driver_safety_score_response->timeOverSpeedLimitMs
    cJSON *timeOverSpeedLimitMs = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "timeOverSpeedLimitMs");
    if(!cJSON_IsNumber(timeOverSpeedLimitMs))
    {
    goto end; //Numeric
    }

    // driver_safety_score_response->totalDistanceDrivenMeters
    cJSON *totalDistanceDrivenMeters = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "totalDistanceDrivenMeters");
    if(!cJSON_IsNumber(totalDistanceDrivenMeters))
    {
    goto end; //Numeric
    }

    // driver_safety_score_response->totalHarshEventCount
    cJSON *totalHarshEventCount = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "totalHarshEventCount");
    if(!cJSON_IsNumber(totalHarshEventCount))
    {
    goto end; //Numeric
    }

    // driver_safety_score_response->totalTimeDrivenMs
    cJSON *totalTimeDrivenMs = cJSON_GetObjectItemCaseSensitive(driver_safety_score_responseJSON, "totalTimeDrivenMs");
    if(!cJSON_IsNumber(totalTimeDrivenMs))
    {
    goto end; //Numeric
    }


    driver_safety_score_response = driver_safety_score_response_create (
        crashCount->valuedouble,
        driverId->valuedouble,
        harshAccelCount->valuedouble,
        harshBrakingCount->valuedouble,
        harshEventsList,
        harshTurningCount->valuedouble,
        safetyScore->valuedouble,
        strdup(safetyScoreRank->valuestring),
        timeOverSpeedLimitMs->valuedouble,
        totalDistanceDrivenMeters->valuedouble,
        totalHarshEventCount->valuedouble,
        totalTimeDrivenMs->valuedouble
        );
 cJSON_Delete(driver_safety_score_responseJSON);
    return driver_safety_score_response;
end:
    cJSON_Delete(driver_safety_score_responseJSON);
    return NULL;

}


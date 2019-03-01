#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_safety_score_response.h"



vehicle_safety_score_response_t *vehicle_safety_score_response_create(
    int crashCount,
    int harshAccelCount,
    int harshBrakingCount,
    list_t *harshEvents,
    int harshTurningCount,
    int safetyScore,
    char *safetyScoreRank,
    int timeOverSpeedLimitMs,
    int totalDistanceDrivenMeters,
    int totalHarshEventCount,
    int totalTimeDrivenMs,
    int vehicleId
    ) {
	vehicle_safety_score_response_t *vehicle_safety_score_response = malloc(sizeof(vehicle_safety_score_response_t));
	vehicle_safety_score_response->crashCount = crashCount;
	vehicle_safety_score_response->harshAccelCount = harshAccelCount;
	vehicle_safety_score_response->harshBrakingCount = harshBrakingCount;
	vehicle_safety_score_response->harshEvents = harshEvents;
	vehicle_safety_score_response->harshTurningCount = harshTurningCount;
	vehicle_safety_score_response->safetyScore = safetyScore;
	vehicle_safety_score_response->safetyScoreRank = safetyScoreRank;
	vehicle_safety_score_response->timeOverSpeedLimitMs = timeOverSpeedLimitMs;
	vehicle_safety_score_response->totalDistanceDrivenMeters = totalDistanceDrivenMeters;
	vehicle_safety_score_response->totalHarshEventCount = totalHarshEventCount;
	vehicle_safety_score_response->totalTimeDrivenMs = totalTimeDrivenMs;
	vehicle_safety_score_response->vehicleId = vehicleId;

	return vehicle_safety_score_response;
}


void vehicle_safety_score_response_free(vehicle_safety_score_response_t *vehicle_safety_score_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, vehicle_safety_score_response->harshEvents) {
		safety_report_harsh_event_free(listEntry->data);
	}
	list_free(vehicle_safety_score_response->harshEvents);
    free(vehicle_safety_score_response->safetyScoreRank);

	free(vehicle_safety_score_response);
}

cJSON *vehicle_safety_score_response_convertToJSON(vehicle_safety_score_response_t *vehicle_safety_score_response) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_safety_score_response->crashCount
    if(cJSON_AddNumberToObject(item, "crashCount", vehicle_safety_score_response->crashCount) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_safety_score_response->harshAccelCount
    if(cJSON_AddNumberToObject(item, "harshAccelCount", vehicle_safety_score_response->harshAccelCount) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_safety_score_response->harshBrakingCount
    if(cJSON_AddNumberToObject(item, "harshBrakingCount", vehicle_safety_score_response->harshBrakingCount) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_safety_score_response->harshEvents
    cJSON *harshEvents = cJSON_AddArrayToObject(item, "harshEvents");
	if(harshEvents == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *harshEventsListEntry;
	list_ForEach(harshEventsListEntry, vehicle_safety_score_response->harshEvents) {
		cJSON *item = safety_report_harsh_event_convertToJSON(harshEventsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(harshEvents, item);
	}

	// vehicle_safety_score_response->harshTurningCount
    if(cJSON_AddNumberToObject(item, "harshTurningCount", vehicle_safety_score_response->harshTurningCount) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_safety_score_response->safetyScore
    if(cJSON_AddNumberToObject(item, "safetyScore", vehicle_safety_score_response->safetyScore) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_safety_score_response->safetyScoreRank
    if(cJSON_AddStringToObject(item, "safetyScoreRank", vehicle_safety_score_response->safetyScoreRank) == NULL) {
    goto fail; //String
    }

	// vehicle_safety_score_response->timeOverSpeedLimitMs
    if(cJSON_AddNumberToObject(item, "timeOverSpeedLimitMs", vehicle_safety_score_response->timeOverSpeedLimitMs) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_safety_score_response->totalDistanceDrivenMeters
    if(cJSON_AddNumberToObject(item, "totalDistanceDrivenMeters", vehicle_safety_score_response->totalDistanceDrivenMeters) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_safety_score_response->totalHarshEventCount
    if(cJSON_AddNumberToObject(item, "totalHarshEventCount", vehicle_safety_score_response->totalHarshEventCount) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_safety_score_response->totalTimeDrivenMs
    if(cJSON_AddNumberToObject(item, "totalTimeDrivenMs", vehicle_safety_score_response->totalTimeDrivenMs) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_safety_score_response->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", vehicle_safety_score_response->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_safety_score_response_t *vehicle_safety_score_response_parseFromJSON(char *jsonString){

    vehicle_safety_score_response_t *vehicle_safety_score_response = NULL;
    cJSON *vehicle_safety_score_responseJSON = cJSON_Parse(jsonString);
    if(vehicle_safety_score_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_safety_score_response->crashCount
    cJSON *crashCount = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "crashCount");
    if(!cJSON_IsNumber(crashCount))
    {
    goto end; //Numeric
    }

    // vehicle_safety_score_response->harshAccelCount
    cJSON *harshAccelCount = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "harshAccelCount");
    if(!cJSON_IsNumber(harshAccelCount))
    {
    goto end; //Numeric
    }

    // vehicle_safety_score_response->harshBrakingCount
    cJSON *harshBrakingCount = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "harshBrakingCount");
    if(!cJSON_IsNumber(harshBrakingCount))
    {
    goto end; //Numeric
    }

    // vehicle_safety_score_response->harshEvents
    cJSON *harshEvents;
    cJSON *harshEventsJSON = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON,"harshEvents");
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

    // vehicle_safety_score_response->harshTurningCount
    cJSON *harshTurningCount = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "harshTurningCount");
    if(!cJSON_IsNumber(harshTurningCount))
    {
    goto end; //Numeric
    }

    // vehicle_safety_score_response->safetyScore
    cJSON *safetyScore = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "safetyScore");
    if(!cJSON_IsNumber(safetyScore))
    {
    goto end; //Numeric
    }

    // vehicle_safety_score_response->safetyScoreRank
    cJSON *safetyScoreRank = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "safetyScoreRank");
    if(!cJSON_IsString(safetyScoreRank) || (safetyScoreRank->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_safety_score_response->timeOverSpeedLimitMs
    cJSON *timeOverSpeedLimitMs = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "timeOverSpeedLimitMs");
    if(!cJSON_IsNumber(timeOverSpeedLimitMs))
    {
    goto end; //Numeric
    }

    // vehicle_safety_score_response->totalDistanceDrivenMeters
    cJSON *totalDistanceDrivenMeters = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "totalDistanceDrivenMeters");
    if(!cJSON_IsNumber(totalDistanceDrivenMeters))
    {
    goto end; //Numeric
    }

    // vehicle_safety_score_response->totalHarshEventCount
    cJSON *totalHarshEventCount = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "totalHarshEventCount");
    if(!cJSON_IsNumber(totalHarshEventCount))
    {
    goto end; //Numeric
    }

    // vehicle_safety_score_response->totalTimeDrivenMs
    cJSON *totalTimeDrivenMs = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "totalTimeDrivenMs");
    if(!cJSON_IsNumber(totalTimeDrivenMs))
    {
    goto end; //Numeric
    }

    // vehicle_safety_score_response->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(vehicle_safety_score_responseJSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }


    vehicle_safety_score_response = vehicle_safety_score_response_create (
        crashCount->valuedouble,
        harshAccelCount->valuedouble,
        harshBrakingCount->valuedouble,
        harshEventsList,
        harshTurningCount->valuedouble,
        safetyScore->valuedouble,
        strdup(safetyScoreRank->valuestring),
        timeOverSpeedLimitMs->valuedouble,
        totalDistanceDrivenMeters->valuedouble,
        totalHarshEventCount->valuedouble,
        totalTimeDrivenMs->valuedouble,
        vehicleId->valuedouble
        );
 cJSON_Delete(vehicle_safety_score_responseJSON);
    return vehicle_safety_score_response;
end:
    cJSON_Delete(vehicle_safety_score_responseJSON);
    return NULL;

}


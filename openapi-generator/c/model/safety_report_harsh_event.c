#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "safety_report_harsh_event.h"



safety_report_harsh_event_t *safety_report_harsh_event_create(
    char *harshEventType,
    int timestampMs,
    int vehicleId
    ) {
	safety_report_harsh_event_t *safety_report_harsh_event = malloc(sizeof(safety_report_harsh_event_t));
	safety_report_harsh_event->harshEventType = harshEventType;
	safety_report_harsh_event->timestampMs = timestampMs;
	safety_report_harsh_event->vehicleId = vehicleId;

	return safety_report_harsh_event;
}


void safety_report_harsh_event_free(safety_report_harsh_event_t *safety_report_harsh_event) {
    listEntry_t *listEntry;
    free(safety_report_harsh_event->harshEventType);

	free(safety_report_harsh_event);
}

cJSON *safety_report_harsh_event_convertToJSON(safety_report_harsh_event_t *safety_report_harsh_event) {
	cJSON *item = cJSON_CreateObject();
	// safety_report_harsh_event->harshEventType
    if(cJSON_AddStringToObject(item, "harshEventType", safety_report_harsh_event->harshEventType) == NULL) {
    goto fail; //String
    }

	// safety_report_harsh_event->timestampMs
    if(cJSON_AddNumberToObject(item, "timestampMs", safety_report_harsh_event->timestampMs) == NULL) {
    goto fail; //Numeric
    }

	// safety_report_harsh_event->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", safety_report_harsh_event->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

safety_report_harsh_event_t *safety_report_harsh_event_parseFromJSON(char *jsonString){

    safety_report_harsh_event_t *safety_report_harsh_event = NULL;
    cJSON *safety_report_harsh_eventJSON = cJSON_Parse(jsonString);
    if(safety_report_harsh_eventJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // safety_report_harsh_event->harshEventType
    cJSON *harshEventType = cJSON_GetObjectItemCaseSensitive(safety_report_harsh_eventJSON, "harshEventType");
    if(!cJSON_IsString(harshEventType) || (harshEventType->valuestring == NULL)){
    goto end; //String
    }

    // safety_report_harsh_event->timestampMs
    cJSON *timestampMs = cJSON_GetObjectItemCaseSensitive(safety_report_harsh_eventJSON, "timestampMs");
    if(!cJSON_IsNumber(timestampMs))
    {
    goto end; //Numeric
    }

    // safety_report_harsh_event->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(safety_report_harsh_eventJSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }


    safety_report_harsh_event = safety_report_harsh_event_create (
        strdup(harshEventType->valuestring),
        timestampMs->valuedouble,
        vehicleId->valuedouble
        );
 cJSON_Delete(safety_report_harsh_eventJSON);
    return safety_report_harsh_event;
end:
    cJSON_Delete(safety_report_harsh_eventJSON);
    return NULL;

}


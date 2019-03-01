#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_harsh_event_response.h"



vehicle_harsh_event_response_t *vehicle_harsh_event_response_create(
    char *downloadForwardVideoUrl,
    char *downloadInwardVideoUrl,
    char *downloadTrackedInwardVideoUrl,
    char *harshEventType,
    char *incidentReportUrl,
    bool isDistracted,
    vehicle_harsh_event_response_location_t *location
    ) {
	vehicle_harsh_event_response_t *vehicle_harsh_event_response = malloc(sizeof(vehicle_harsh_event_response_t));
	vehicle_harsh_event_response->downloadForwardVideoUrl = downloadForwardVideoUrl;
	vehicle_harsh_event_response->downloadInwardVideoUrl = downloadInwardVideoUrl;
	vehicle_harsh_event_response->downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
	vehicle_harsh_event_response->harshEventType = harshEventType;
	vehicle_harsh_event_response->incidentReportUrl = incidentReportUrl;
	vehicle_harsh_event_response->isDistracted = isDistracted;
	vehicle_harsh_event_response->location = location;

	return vehicle_harsh_event_response;
}


void vehicle_harsh_event_response_free(vehicle_harsh_event_response_t *vehicle_harsh_event_response) {
    listEntry_t *listEntry;
    free(vehicle_harsh_event_response->downloadForwardVideoUrl);
    free(vehicle_harsh_event_response->downloadInwardVideoUrl);
    free(vehicle_harsh_event_response->downloadTrackedInwardVideoUrl);
    free(vehicle_harsh_event_response->harshEventType);
    free(vehicle_harsh_event_response->incidentReportUrl);
	vehicle_harsh_event_response_location_free(vehicle_harsh_event_response->location);

	free(vehicle_harsh_event_response);
}

cJSON *vehicle_harsh_event_response_convertToJSON(vehicle_harsh_event_response_t *vehicle_harsh_event_response) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_harsh_event_response->downloadForwardVideoUrl
    if(cJSON_AddStringToObject(item, "downloadForwardVideoUrl", vehicle_harsh_event_response->downloadForwardVideoUrl) == NULL) {
    goto fail; //String
    }

	// vehicle_harsh_event_response->downloadInwardVideoUrl
    if(cJSON_AddStringToObject(item, "downloadInwardVideoUrl", vehicle_harsh_event_response->downloadInwardVideoUrl) == NULL) {
    goto fail; //String
    }

	// vehicle_harsh_event_response->downloadTrackedInwardVideoUrl
    if(cJSON_AddStringToObject(item, "downloadTrackedInwardVideoUrl", vehicle_harsh_event_response->downloadTrackedInwardVideoUrl) == NULL) {
    goto fail; //String
    }

	// vehicle_harsh_event_response->harshEventType
    if(cJSON_AddStringToObject(item, "harshEventType", vehicle_harsh_event_response->harshEventType) == NULL) {
    goto fail; //String
    }

	// vehicle_harsh_event_response->incidentReportUrl
    if(cJSON_AddStringToObject(item, "incidentReportUrl", vehicle_harsh_event_response->incidentReportUrl) == NULL) {
    goto fail; //String
    }

	// vehicle_harsh_event_response->isDistracted
    if(cJSON_AddBoolToObject(item, "isDistracted", vehicle_harsh_event_response->isDistracted) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_harsh_event_response->location
	cJSON *location = vehicle_harsh_event_response_location_convertToJSON(vehicle_harsh_event_response->location);
	if(location == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "location", location);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_harsh_event_response_t *vehicle_harsh_event_response_parseFromJSON(char *jsonString){

    vehicle_harsh_event_response_t *vehicle_harsh_event_response = NULL;
    cJSON *vehicle_harsh_event_responseJSON = cJSON_Parse(jsonString);
    if(vehicle_harsh_event_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_harsh_event_response->downloadForwardVideoUrl
    cJSON *downloadForwardVideoUrl = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_responseJSON, "downloadForwardVideoUrl");
    if(!cJSON_IsString(downloadForwardVideoUrl) || (downloadForwardVideoUrl->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_harsh_event_response->downloadInwardVideoUrl
    cJSON *downloadInwardVideoUrl = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_responseJSON, "downloadInwardVideoUrl");
    if(!cJSON_IsString(downloadInwardVideoUrl) || (downloadInwardVideoUrl->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_harsh_event_response->downloadTrackedInwardVideoUrl
    cJSON *downloadTrackedInwardVideoUrl = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_responseJSON, "downloadTrackedInwardVideoUrl");
    if(!cJSON_IsString(downloadTrackedInwardVideoUrl) || (downloadTrackedInwardVideoUrl->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_harsh_event_response->harshEventType
    cJSON *harshEventType = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_responseJSON, "harshEventType");
    if(!cJSON_IsString(harshEventType) || (harshEventType->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_harsh_event_response->incidentReportUrl
    cJSON *incidentReportUrl = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_responseJSON, "incidentReportUrl");
    if(!cJSON_IsString(incidentReportUrl) || (incidentReportUrl->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_harsh_event_response->isDistracted
    cJSON *isDistracted = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_responseJSON, "isDistracted");
    if(!cJSON_IsBool(isDistracted))
    {
    goto end; //Numeric
    }

    // vehicle_harsh_event_response->location
    vehicle_harsh_event_response_location_t *location;
    cJSON *locationJSON = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_responseJSON, "location");
    if(vehicle_harsh_event_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *locationJSONData = cJSON_Print(locationJSON);
    location = vehicle_harsh_event_response_location_parseFromJSON(locationJSONData);


    vehicle_harsh_event_response = vehicle_harsh_event_response_create (
        strdup(downloadForwardVideoUrl->valuestring),
        strdup(downloadInwardVideoUrl->valuestring),
        strdup(downloadTrackedInwardVideoUrl->valuestring),
        strdup(harshEventType->valuestring),
        strdup(incidentReportUrl->valuestring),
        isDistracted->valueint,
        location
        );
        free(locationJSONData);
 cJSON_Delete(vehicle_harsh_event_responseJSON);
    return vehicle_harsh_event_response;
end:
    cJSON_Delete(vehicle_harsh_event_responseJSON);
    return NULL;

}


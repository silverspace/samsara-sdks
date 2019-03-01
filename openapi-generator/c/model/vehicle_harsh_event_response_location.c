#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_harsh_event_response_location.h"



vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location_create(
    char *address,
    char *latitude,
    char *longitude
    ) {
	vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location = malloc(sizeof(vehicle_harsh_event_response_location_t));
	vehicle_harsh_event_response_location->address = address;
	vehicle_harsh_event_response_location->latitude = latitude;
	vehicle_harsh_event_response_location->longitude = longitude;

	return vehicle_harsh_event_response_location;
}


void vehicle_harsh_event_response_location_free(vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location) {
    listEntry_t *listEntry;
    free(vehicle_harsh_event_response_location->address);
    free(vehicle_harsh_event_response_location->latitude);
    free(vehicle_harsh_event_response_location->longitude);

	free(vehicle_harsh_event_response_location);
}

cJSON *vehicle_harsh_event_response_location_convertToJSON(vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_harsh_event_response_location->address
    if(cJSON_AddStringToObject(item, "address", vehicle_harsh_event_response_location->address) == NULL) {
    goto fail; //String
    }

	// vehicle_harsh_event_response_location->latitude
    if(cJSON_AddStringToObject(item, "latitude", vehicle_harsh_event_response_location->latitude) == NULL) {
    goto fail; //String
    }

	// vehicle_harsh_event_response_location->longitude
    if(cJSON_AddStringToObject(item, "longitude", vehicle_harsh_event_response_location->longitude) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location_parseFromJSON(char *jsonString){

    vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location = NULL;
    cJSON *vehicle_harsh_event_response_locationJSON = cJSON_Parse(jsonString);
    if(vehicle_harsh_event_response_locationJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_harsh_event_response_location->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_response_locationJSON, "address");
    if(!cJSON_IsString(address) || (address->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_harsh_event_response_location->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_response_locationJSON, "latitude");
    if(!cJSON_IsString(latitude) || (latitude->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_harsh_event_response_location->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(vehicle_harsh_event_response_locationJSON, "longitude");
    if(!cJSON_IsString(longitude) || (longitude->valuestring == NULL)){
    goto end; //String
    }


    vehicle_harsh_event_response_location = vehicle_harsh_event_response_location_create (
        strdup(address->valuestring),
        strdup(latitude->valuestring),
        strdup(longitude->valuestring)
        );
 cJSON_Delete(vehicle_harsh_event_response_locationJSON);
    return vehicle_harsh_event_response_location;
end:
    cJSON_Delete(vehicle_harsh_event_response_locationJSON);
    return NULL;

}


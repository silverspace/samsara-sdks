#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fleet_vehicle_location.h"



fleet_vehicle_location_t *fleet_vehicle_location_create(
    double latitude,
    char *location,
    double longitude,
    double speedMilesPerHour,
    long timeMs
    ) {
	fleet_vehicle_location_t *fleet_vehicle_location = malloc(sizeof(fleet_vehicle_location_t));
	fleet_vehicle_location->latitude = latitude;
	fleet_vehicle_location->location = location;
	fleet_vehicle_location->longitude = longitude;
	fleet_vehicle_location->speedMilesPerHour = speedMilesPerHour;
	fleet_vehicle_location->timeMs = timeMs;

	return fleet_vehicle_location;
}


void fleet_vehicle_location_free(fleet_vehicle_location_t *fleet_vehicle_location) {
    listEntry_t *listEntry;
    free(fleet_vehicle_location->location);

	free(fleet_vehicle_location);
}

cJSON *fleet_vehicle_location_convertToJSON(fleet_vehicle_location_t *fleet_vehicle_location) {
	cJSON *item = cJSON_CreateObject();
	// fleet_vehicle_location->latitude
    if(cJSON_AddNumberToObject(item, "latitude", fleet_vehicle_location->latitude) == NULL) {
    goto fail; //Numeric
    }

	// fleet_vehicle_location->location
    if(cJSON_AddStringToObject(item, "location", fleet_vehicle_location->location) == NULL) {
    goto fail; //String
    }

	// fleet_vehicle_location->longitude
    if(cJSON_AddNumberToObject(item, "longitude", fleet_vehicle_location->longitude) == NULL) {
    goto fail; //Numeric
    }

	// fleet_vehicle_location->speedMilesPerHour
    if(cJSON_AddNumberToObject(item, "speedMilesPerHour", fleet_vehicle_location->speedMilesPerHour) == NULL) {
    goto fail; //Numeric
    }

	// fleet_vehicle_location->timeMs
    if(cJSON_AddNumberToObject(item, "timeMs", fleet_vehicle_location->timeMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

fleet_vehicle_location_t *fleet_vehicle_location_parseFromJSON(char *jsonString){

    fleet_vehicle_location_t *fleet_vehicle_location = NULL;
    cJSON *fleet_vehicle_locationJSON = cJSON_Parse(jsonString);
    if(fleet_vehicle_locationJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // fleet_vehicle_location->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_locationJSON, "latitude");
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }

    // fleet_vehicle_location->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_locationJSON, "location");
    if(!cJSON_IsString(location) || (location->valuestring == NULL)){
    goto end; //String
    }

    // fleet_vehicle_location->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_locationJSON, "longitude");
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }

    // fleet_vehicle_location->speedMilesPerHour
    cJSON *speedMilesPerHour = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_locationJSON, "speedMilesPerHour");
    if(!cJSON_IsNumber(speedMilesPerHour))
    {
    goto end; //Numeric
    }

    // fleet_vehicle_location->timeMs
    cJSON *timeMs = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_locationJSON, "timeMs");
    if(!cJSON_IsNumber(timeMs))
    {
    goto end; //Numeric
    }


    fleet_vehicle_location = fleet_vehicle_location_create (
        latitude->valuedouble,
        strdup(location->valuestring),
        longitude->valuedouble,
        speedMilesPerHour->valuedouble,
        timeMs->valuedouble
        );
 cJSON_Delete(fleet_vehicle_locationJSON);
    return fleet_vehicle_location;
end:
    cJSON_Delete(fleet_vehicle_locationJSON);
    return NULL;

}


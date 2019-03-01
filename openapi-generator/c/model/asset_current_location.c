#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_current_location.h"



asset_current_location_t *asset_current_location_create(
    double latitude,
    char *location,
    double longitude,
    double speedMilesPerHour,
    long timeMs
    ) {
	asset_current_location_t *asset_current_location = malloc(sizeof(asset_current_location_t));
	asset_current_location->latitude = latitude;
	asset_current_location->location = location;
	asset_current_location->longitude = longitude;
	asset_current_location->speedMilesPerHour = speedMilesPerHour;
	asset_current_location->timeMs = timeMs;

	return asset_current_location;
}


void asset_current_location_free(asset_current_location_t *asset_current_location) {
    listEntry_t *listEntry;
    free(asset_current_location->location);

	free(asset_current_location);
}

cJSON *asset_current_location_convertToJSON(asset_current_location_t *asset_current_location) {
	cJSON *item = cJSON_CreateObject();
	// asset_current_location->latitude
    if(cJSON_AddNumberToObject(item, "latitude", asset_current_location->latitude) == NULL) {
    goto fail; //Numeric
    }

	// asset_current_location->location
    if(cJSON_AddStringToObject(item, "location", asset_current_location->location) == NULL) {
    goto fail; //String
    }

	// asset_current_location->longitude
    if(cJSON_AddNumberToObject(item, "longitude", asset_current_location->longitude) == NULL) {
    goto fail; //Numeric
    }

	// asset_current_location->speedMilesPerHour
    if(cJSON_AddNumberToObject(item, "speedMilesPerHour", asset_current_location->speedMilesPerHour) == NULL) {
    goto fail; //Numeric
    }

	// asset_current_location->timeMs
    if(cJSON_AddNumberToObject(item, "timeMs", asset_current_location->timeMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_current_location_t *asset_current_location_parseFromJSON(char *jsonString){

    asset_current_location_t *asset_current_location = NULL;
    cJSON *asset_current_locationJSON = cJSON_Parse(jsonString);
    if(asset_current_locationJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_current_location->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(asset_current_locationJSON, "latitude");
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }

    // asset_current_location->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(asset_current_locationJSON, "location");
    if(!cJSON_IsString(location) || (location->valuestring == NULL)){
    goto end; //String
    }

    // asset_current_location->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(asset_current_locationJSON, "longitude");
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }

    // asset_current_location->speedMilesPerHour
    cJSON *speedMilesPerHour = cJSON_GetObjectItemCaseSensitive(asset_current_locationJSON, "speedMilesPerHour");
    if(!cJSON_IsNumber(speedMilesPerHour))
    {
    goto end; //Numeric
    }

    // asset_current_location->timeMs
    cJSON *timeMs = cJSON_GetObjectItemCaseSensitive(asset_current_locationJSON, "timeMs");
    if(!cJSON_IsNumber(timeMs))
    {
    goto end; //Numeric
    }


    asset_current_location = asset_current_location_create (
        latitude->valuedouble,
        strdup(location->valuestring),
        longitude->valuedouble,
        speedMilesPerHour->valuedouble,
        timeMs->valuedouble
        );
 cJSON_Delete(asset_current_locationJSON);
    return asset_current_location;
end:
    cJSON_Delete(asset_current_locationJSON);
    return NULL;

}


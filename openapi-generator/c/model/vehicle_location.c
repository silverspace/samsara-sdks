#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_location.h"



vehicle_location_t *vehicle_location_create(
    double heading,
    long id,
    double latitude,
    char *location,
    double longitude,
    char *name,
    long odometerMeters,
    bool onTrip,
    double speed,
    int time,
    char *vin
    ) {
	vehicle_location_t *vehicle_location = malloc(sizeof(vehicle_location_t));
	vehicle_location->heading = heading;
	vehicle_location->id = id;
	vehicle_location->latitude = latitude;
	vehicle_location->location = location;
	vehicle_location->longitude = longitude;
	vehicle_location->name = name;
	vehicle_location->odometerMeters = odometerMeters;
	vehicle_location->onTrip = onTrip;
	vehicle_location->speed = speed;
	vehicle_location->time = time;
	vehicle_location->vin = vin;

	return vehicle_location;
}


void vehicle_location_free(vehicle_location_t *vehicle_location) {
    listEntry_t *listEntry;
    free(vehicle_location->location);
    free(vehicle_location->name);
    free(vehicle_location->vin);

	free(vehicle_location);
}

cJSON *vehicle_location_convertToJSON(vehicle_location_t *vehicle_location) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_location->heading
    if(cJSON_AddNumberToObject(item, "heading", vehicle_location->heading) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_location->id
    if(cJSON_AddNumberToObject(item, "id", vehicle_location->id) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_location->latitude
    if(cJSON_AddNumberToObject(item, "latitude", vehicle_location->latitude) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_location->location
    if(cJSON_AddStringToObject(item, "location", vehicle_location->location) == NULL) {
    goto fail; //String
    }

	// vehicle_location->longitude
    if(cJSON_AddNumberToObject(item, "longitude", vehicle_location->longitude) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_location->name
    if(cJSON_AddStringToObject(item, "name", vehicle_location->name) == NULL) {
    goto fail; //String
    }

	// vehicle_location->odometerMeters
    if(cJSON_AddNumberToObject(item, "odometerMeters", vehicle_location->odometerMeters) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_location->onTrip
    if(cJSON_AddBoolToObject(item, "onTrip", vehicle_location->onTrip) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_location->speed
    if(cJSON_AddNumberToObject(item, "speed", vehicle_location->speed) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_location->time
    if(cJSON_AddNumberToObject(item, "time", vehicle_location->time) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_location->vin
    if(cJSON_AddStringToObject(item, "vin", vehicle_location->vin) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_location_t *vehicle_location_parseFromJSON(char *jsonString){

    vehicle_location_t *vehicle_location = NULL;
    cJSON *vehicle_locationJSON = cJSON_Parse(jsonString);
    if(vehicle_locationJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_location->heading
    cJSON *heading = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "heading");
    if(!cJSON_IsNumber(heading))
    {
    goto end; //Numeric
    }

    // vehicle_location->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // vehicle_location->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "latitude");
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }

    // vehicle_location->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "location");
    if(!cJSON_IsString(location) || (location->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_location->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "longitude");
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }

    // vehicle_location->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_location->odometerMeters
    cJSON *odometerMeters = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "odometerMeters");
    if(!cJSON_IsNumber(odometerMeters))
    {
    goto end; //Numeric
    }

    // vehicle_location->onTrip
    cJSON *onTrip = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "onTrip");
    if(!cJSON_IsBool(onTrip))
    {
    goto end; //Numeric
    }

    // vehicle_location->speed
    cJSON *speed = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "speed");
    if(!cJSON_IsNumber(speed))
    {
    goto end; //Numeric
    }

    // vehicle_location->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "time");
    if(!cJSON_IsNumber(time))
    {
    goto end; //Numeric
    }

    // vehicle_location->vin
    cJSON *vin = cJSON_GetObjectItemCaseSensitive(vehicle_locationJSON, "vin");
    if(!cJSON_IsString(vin) || (vin->valuestring == NULL)){
    goto end; //String
    }


    vehicle_location = vehicle_location_create (
        heading->valuedouble,
        id->valuedouble,
        latitude->valuedouble,
        strdup(location->valuestring),
        longitude->valuedouble,
        strdup(name->valuestring),
        odometerMeters->valuedouble,
        onTrip->valueint,
        speed->valuedouble,
        time->valuedouble,
        strdup(vin->valuestring)
        );
 cJSON_Delete(vehicle_locationJSON);
    return vehicle_location;
end:
    cJSON_Delete(vehicle_locationJSON);
    return NULL;

}


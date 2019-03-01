#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trip_response_trips.h"



trip_response_trips_t *trip_response_trips_create(
    int endOdometer,
    int distanceMeters,
    int endMs,
    int startMs,
    int fuelConsumedMl,
    char *startAddress,
    trip_response_start_coordinates_t *startCoordinates,
    trip_response_end_coordinates_t *endCoordinates,
    int startOdometer,
    int driverId,
    char *startLocation,
    int tollMeters,
    char *endAddress,
    char *endLocation
    ) {
	trip_response_trips_t *trip_response_trips = malloc(sizeof(trip_response_trips_t));
	trip_response_trips->endOdometer = endOdometer;
	trip_response_trips->distanceMeters = distanceMeters;
	trip_response_trips->endMs = endMs;
	trip_response_trips->startMs = startMs;
	trip_response_trips->fuelConsumedMl = fuelConsumedMl;
	trip_response_trips->startAddress = startAddress;
	trip_response_trips->startCoordinates = startCoordinates;
	trip_response_trips->endCoordinates = endCoordinates;
	trip_response_trips->startOdometer = startOdometer;
	trip_response_trips->driverId = driverId;
	trip_response_trips->startLocation = startLocation;
	trip_response_trips->tollMeters = tollMeters;
	trip_response_trips->endAddress = endAddress;
	trip_response_trips->endLocation = endLocation;

	return trip_response_trips;
}


void trip_response_trips_free(trip_response_trips_t *trip_response_trips) {
    listEntry_t *listEntry;
    free(trip_response_trips->startAddress);
	trip_response_start_coordinates_free(trip_response_trips->startCoordinates);
	trip_response_end_coordinates_free(trip_response_trips->endCoordinates);
    free(trip_response_trips->startLocation);
    free(trip_response_trips->endAddress);
    free(trip_response_trips->endLocation);

	free(trip_response_trips);
}

cJSON *trip_response_trips_convertToJSON(trip_response_trips_t *trip_response_trips) {
	cJSON *item = cJSON_CreateObject();
	// trip_response_trips->endOdometer
    if(cJSON_AddNumberToObject(item, "endOdometer", trip_response_trips->endOdometer) == NULL) {
    goto fail; //Numeric
    }

	// trip_response_trips->distanceMeters
    if(cJSON_AddNumberToObject(item, "distanceMeters", trip_response_trips->distanceMeters) == NULL) {
    goto fail; //Numeric
    }

	// trip_response_trips->endMs
    if(cJSON_AddNumberToObject(item, "endMs", trip_response_trips->endMs) == NULL) {
    goto fail; //Numeric
    }

	// trip_response_trips->startMs
    if(cJSON_AddNumberToObject(item, "startMs", trip_response_trips->startMs) == NULL) {
    goto fail; //Numeric
    }

	// trip_response_trips->fuelConsumedMl
    if(cJSON_AddNumberToObject(item, "fuelConsumedMl", trip_response_trips->fuelConsumedMl) == NULL) {
    goto fail; //Numeric
    }

	// trip_response_trips->startAddress
    if(cJSON_AddStringToObject(item, "startAddress", trip_response_trips->startAddress) == NULL) {
    goto fail; //String
    }

	// trip_response_trips->startCoordinates
	cJSON *startCoordinates = trip_response_start_coordinates_convertToJSON(trip_response_trips->startCoordinates);
	if(startCoordinates == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "startCoordinates", startCoordinates);
	if(item->child == NULL) {
		goto fail;
	}

	// trip_response_trips->endCoordinates
	cJSON *endCoordinates = trip_response_end_coordinates_convertToJSON(trip_response_trips->endCoordinates);
	if(endCoordinates == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "endCoordinates", endCoordinates);
	if(item->child == NULL) {
		goto fail;
	}

	// trip_response_trips->startOdometer
    if(cJSON_AddNumberToObject(item, "startOdometer", trip_response_trips->startOdometer) == NULL) {
    goto fail; //Numeric
    }

	// trip_response_trips->driverId
    if(cJSON_AddNumberToObject(item, "driverId", trip_response_trips->driverId) == NULL) {
    goto fail; //Numeric
    }

	// trip_response_trips->startLocation
    if(cJSON_AddStringToObject(item, "startLocation", trip_response_trips->startLocation) == NULL) {
    goto fail; //String
    }

	// trip_response_trips->tollMeters
    if(cJSON_AddNumberToObject(item, "tollMeters", trip_response_trips->tollMeters) == NULL) {
    goto fail; //Numeric
    }

	// trip_response_trips->endAddress
    if(cJSON_AddStringToObject(item, "endAddress", trip_response_trips->endAddress) == NULL) {
    goto fail; //String
    }

	// trip_response_trips->endLocation
    if(cJSON_AddStringToObject(item, "endLocation", trip_response_trips->endLocation) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

trip_response_trips_t *trip_response_trips_parseFromJSON(char *jsonString){

    trip_response_trips_t *trip_response_trips = NULL;
    cJSON *trip_response_tripsJSON = cJSON_Parse(jsonString);
    if(trip_response_tripsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // trip_response_trips->endOdometer
    cJSON *endOdometer = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "endOdometer");
    if(!cJSON_IsNumber(endOdometer))
    {
    goto end; //Numeric
    }

    // trip_response_trips->distanceMeters
    cJSON *distanceMeters = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "distanceMeters");
    if(!cJSON_IsNumber(distanceMeters))
    {
    goto end; //Numeric
    }

    // trip_response_trips->endMs
    cJSON *endMs = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "endMs");
    if(!cJSON_IsNumber(endMs))
    {
    goto end; //Numeric
    }

    // trip_response_trips->startMs
    cJSON *startMs = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "startMs");
    if(!cJSON_IsNumber(startMs))
    {
    goto end; //Numeric
    }

    // trip_response_trips->fuelConsumedMl
    cJSON *fuelConsumedMl = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "fuelConsumedMl");
    if(!cJSON_IsNumber(fuelConsumedMl))
    {
    goto end; //Numeric
    }

    // trip_response_trips->startAddress
    cJSON *startAddress = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "startAddress");
    if(!cJSON_IsString(startAddress) || (startAddress->valuestring == NULL)){
    goto end; //String
    }

    // trip_response_trips->startCoordinates
    trip_response_start_coordinates_t *startCoordinates;
    cJSON *startCoordinatesJSON = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "startCoordinates");
    if(trip_response_tripsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *startCoordinatesJSONData = cJSON_Print(startCoordinatesJSON);
    startCoordinates = trip_response_start_coordinates_parseFromJSON(startCoordinatesJSONData);

    // trip_response_trips->endCoordinates
    trip_response_end_coordinates_t *endCoordinates;
    cJSON *endCoordinatesJSON = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "endCoordinates");
    if(trip_response_tripsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *endCoordinatesJSONData = cJSON_Print(endCoordinatesJSON);
    endCoordinates = trip_response_end_coordinates_parseFromJSON(endCoordinatesJSONData);

    // trip_response_trips->startOdometer
    cJSON *startOdometer = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "startOdometer");
    if(!cJSON_IsNumber(startOdometer))
    {
    goto end; //Numeric
    }

    // trip_response_trips->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // trip_response_trips->startLocation
    cJSON *startLocation = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "startLocation");
    if(!cJSON_IsString(startLocation) || (startLocation->valuestring == NULL)){
    goto end; //String
    }

    // trip_response_trips->tollMeters
    cJSON *tollMeters = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "tollMeters");
    if(!cJSON_IsNumber(tollMeters))
    {
    goto end; //Numeric
    }

    // trip_response_trips->endAddress
    cJSON *endAddress = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "endAddress");
    if(!cJSON_IsString(endAddress) || (endAddress->valuestring == NULL)){
    goto end; //String
    }

    // trip_response_trips->endLocation
    cJSON *endLocation = cJSON_GetObjectItemCaseSensitive(trip_response_tripsJSON, "endLocation");
    if(!cJSON_IsString(endLocation) || (endLocation->valuestring == NULL)){
    goto end; //String
    }


    trip_response_trips = trip_response_trips_create (
        endOdometer->valuedouble,
        distanceMeters->valuedouble,
        endMs->valuedouble,
        startMs->valuedouble,
        fuelConsumedMl->valuedouble,
        strdup(startAddress->valuestring),
        startCoordinates,
        endCoordinates,
        startOdometer->valuedouble,
        driverId->valuedouble,
        strdup(startLocation->valuestring),
        tollMeters->valuedouble,
        strdup(endAddress->valuestring),
        strdup(endLocation->valuestring)
        );
        free(startCoordinatesJSONData);
        free(endCoordinatesJSONData);
 cJSON_Delete(trip_response_tripsJSON);
    return trip_response_trips;
end:
    cJSON_Delete(trip_response_tripsJSON);
    return NULL;

}


/*
 * trip_response_trips.h
 *
 * 
 */

#ifndef _trip_response_trips_H_
#define _trip_response_trips_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "trip_response_end_coordinates.h"
#include "trip_response_start_coordinates.h"




typedef struct trip_response_trips_t {
        int endOdometer; //numeric
        int distanceMeters; //numeric
        int endMs; //numeric
        int startMs; //numeric
        int fuelConsumedMl; //numeric
        char *startAddress; //no enum string
        trip_response_start_coordinates_t *startCoordinates; //nonprimitive
        trip_response_end_coordinates_t *endCoordinates; //nonprimitive
        int startOdometer; //numeric
        int driverId; //numeric
        char *startLocation; //no enum string
        int tollMeters; //numeric
        char *endAddress; //no enum string
        char *endLocation; //no enum string

} trip_response_trips_t;

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
);

void trip_response_trips_free(trip_response_trips_t *trip_response_trips);

trip_response_trips_t *trip_response_trips_parseFromJSON(char *jsonString);

cJSON *trip_response_trips_convertToJSON(trip_response_trips_t *trip_response_trips);

#endif /* _trip_response_trips_H_ */


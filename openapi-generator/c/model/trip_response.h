/*
 * trip_response.h
 *
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 */

#ifndef _trip_response_H_
#define _trip_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "trip_response_trips.h"




typedef struct trip_response_t {
        list_t *trips; //nonprimitive container

} trip_response_t;

trip_response_t *trip_response_create(
        list_t *trips
);

void trip_response_free(trip_response_t *trip_response);

trip_response_t *trip_response_parseFromJSON(char *jsonString);

cJSON *trip_response_convertToJSON(trip_response_t *trip_response);

#endif /* _trip_response_H_ */


/*
 * trip_response_start_coordinates.h
 *
 * Start (latitude, longitude) in decimal degrees.
 */

#ifndef _trip_response_start_coordinates_H_
#define _trip_response_start_coordinates_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct trip_response_start_coordinates_t {
        double latitude; //numeric
        double longitude; //numeric

} trip_response_start_coordinates_t;

trip_response_start_coordinates_t *trip_response_start_coordinates_create(
        double latitude,
        double longitude
);

void trip_response_start_coordinates_free(trip_response_start_coordinates_t *trip_response_start_coordinates);

trip_response_start_coordinates_t *trip_response_start_coordinates_parseFromJSON(char *jsonString);

cJSON *trip_response_start_coordinates_convertToJSON(trip_response_start_coordinates_t *trip_response_start_coordinates);

#endif /* _trip_response_start_coordinates_H_ */


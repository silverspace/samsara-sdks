/*
 * trip_response_end_coordinates.h
 *
 * End (latitude, longitude) in decimal degrees.
 */

#ifndef _trip_response_end_coordinates_H_
#define _trip_response_end_coordinates_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct trip_response_end_coordinates_t {
        double latitude; //numeric
        double longitude; //numeric

} trip_response_end_coordinates_t;

trip_response_end_coordinates_t *trip_response_end_coordinates_create(
        double latitude,
        double longitude
);

void trip_response_end_coordinates_free(trip_response_end_coordinates_t *trip_response_end_coordinates);

trip_response_end_coordinates_t *trip_response_end_coordinates_parseFromJSON(char *jsonString);

cJSON *trip_response_end_coordinates_convertToJSON(trip_response_end_coordinates_t *trip_response_end_coordinates);

#endif /* _trip_response_end_coordinates_H_ */


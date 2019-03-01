/*
 * vehicle_harsh_event_response_location.h
 *
 * 
 */

#ifndef _vehicle_harsh_event_response_location_H_
#define _vehicle_harsh_event_response_location_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct vehicle_harsh_event_response_location_t {
        char *address; //no enum string
        char *latitude; //no enum string
        char *longitude; //no enum string

} vehicle_harsh_event_response_location_t;

vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location_create(
        char *address,
        char *latitude,
        char *longitude
);

void vehicle_harsh_event_response_location_free(vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location);

vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location_parseFromJSON(char *jsonString);

cJSON *vehicle_harsh_event_response_location_convertToJSON(vehicle_harsh_event_response_location_t *vehicle_harsh_event_response_location);

#endif /* _vehicle_harsh_event_response_location_H_ */


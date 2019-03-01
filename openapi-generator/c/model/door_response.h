/*
 * door_response.h
 *
 * Contains the current door status of a sensor.
 */

#ifndef _door_response_H_
#define _door_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "door_response_sensors.h"




typedef struct door_response_t {
        long groupId; //numeric
        list_t *sensors; //nonprimitive container

} door_response_t;

door_response_t *door_response_create(
        long groupId,
        list_t *sensors
);

void door_response_free(door_response_t *door_response);

door_response_t *door_response_parseFromJSON(char *jsonString);

cJSON *door_response_convertToJSON(door_response_t *door_response);

#endif /* _door_response_H_ */


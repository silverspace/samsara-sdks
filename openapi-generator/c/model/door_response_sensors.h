/*
 * door_response_sensors.h
 *
 * 
 */

#ifndef _door_response_sensors_H_
#define _door_response_sensors_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

typedef int bool;
#define true 1
#define false 0



typedef struct door_response_sensors_t {
        bool doorClosed; //boolean
        char *name; //no enum string
        long id; //numeric

} door_response_sensors_t;

door_response_sensors_t *door_response_sensors_create(
        bool doorClosed,
        char *name,
        long id
);

void door_response_sensors_free(door_response_sensors_t *door_response_sensors);

door_response_sensors_t *door_response_sensors_parseFromJSON(char *jsonString);

cJSON *door_response_sensors_convertToJSON(door_response_sensors_t *door_response_sensors);

#endif /* _door_response_sensors_H_ */


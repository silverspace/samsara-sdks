/*
 * humidity_response.h
 *
 * Contains the current humidity of a sensor.
 */

#ifndef _humidity_response_H_
#define _humidity_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "humidity_response_sensors.h"




typedef struct humidity_response_t {
        long groupId; //numeric
        list_t *sensors; //nonprimitive container

} humidity_response_t;

humidity_response_t *humidity_response_create(
        long groupId,
        list_t *sensors
);

void humidity_response_free(humidity_response_t *humidity_response);

humidity_response_t *humidity_response_parseFromJSON(char *jsonString);

cJSON *humidity_response_convertToJSON(humidity_response_t *humidity_response);

#endif /* _humidity_response_H_ */


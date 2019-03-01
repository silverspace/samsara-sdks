/*
 * temperature_response.h
 *
 * Contains the current temperatures of a sensor.
 */

#ifndef _temperature_response_H_
#define _temperature_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "temperature_response_sensors.h"




typedef struct temperature_response_t {
        long groupId; //numeric
        list_t *sensors; //nonprimitive container

} temperature_response_t;

temperature_response_t *temperature_response_create(
        long groupId,
        list_t *sensors
);

void temperature_response_free(temperature_response_t *temperature_response);

temperature_response_t *temperature_response_parseFromJSON(char *jsonString);

cJSON *temperature_response_convertToJSON(temperature_response_t *temperature_response);

#endif /* _temperature_response_H_ */


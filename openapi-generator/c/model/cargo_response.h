/*
 * cargo_response.h
 *
 * Contains the current cargo status of a sensor.
 */

#ifndef _cargo_response_H_
#define _cargo_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "cargo_response_sensors.h"




typedef struct cargo_response_t {
        long groupId; //numeric
        list_t *sensors; //nonprimitive container

} cargo_response_t;

cargo_response_t *cargo_response_create(
        long groupId,
        list_t *sensors
);

void cargo_response_free(cargo_response_t *cargo_response);

cargo_response_t *cargo_response_parseFromJSON(char *jsonString);

cJSON *cargo_response_convertToJSON(cargo_response_t *cargo_response);

#endif /* _cargo_response_H_ */


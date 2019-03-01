/*
 * humidity_response_sensors.h
 *
 * 
 */

#ifndef _humidity_response_sensors_H_
#define _humidity_response_sensors_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct humidity_response_sensors_t {
        char *name; //no enum string
        int humidity; //numeric
        long id; //numeric

} humidity_response_sensors_t;

humidity_response_sensors_t *humidity_response_sensors_create(
        char *name,
        int humidity,
        long id
);

void humidity_response_sensors_free(humidity_response_sensors_t *humidity_response_sensors);

humidity_response_sensors_t *humidity_response_sensors_parseFromJSON(char *jsonString);

cJSON *humidity_response_sensors_convertToJSON(humidity_response_sensors_t *humidity_response_sensors);

#endif /* _humidity_response_sensors_H_ */


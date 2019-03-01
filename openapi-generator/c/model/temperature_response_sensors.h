/*
 * temperature_response_sensors.h
 *
 * 
 */

#ifndef _temperature_response_sensors_H_
#define _temperature_response_sensors_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct temperature_response_sensors_t {
        int probeTemperature; //numeric
        char *name; //no enum string
        long id; //numeric
        int ambientTemperature; //numeric

} temperature_response_sensors_t;

temperature_response_sensors_t *temperature_response_sensors_create(
        int probeTemperature,
        char *name,
        long id,
        int ambientTemperature
);

void temperature_response_sensors_free(temperature_response_sensors_t *temperature_response_sensors);

temperature_response_sensors_t *temperature_response_sensors_parseFromJSON(char *jsonString);

cJSON *temperature_response_sensors_convertToJSON(temperature_response_sensors_t *temperature_response_sensors);

#endif /* _temperature_response_sensors_H_ */


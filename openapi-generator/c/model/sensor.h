/*
 * sensor.h
 *
 * Contains information about a sensor.
 */

#ifndef _sensor_H_
#define _sensor_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct sensor_t {
        long id; //numeric
        char *macAddress; //no enum string
        char *name; //no enum string

} sensor_t;

sensor_t *sensor_create(
        long id,
        char *macAddress,
        char *name
);

void sensor_free(sensor_t *sensor);

sensor_t *sensor_parseFromJSON(char *jsonString);

cJSON *sensor_convertToJSON(sensor_t *sensor);

#endif /* _sensor_H_ */


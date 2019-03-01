/*
 * sensor_history_response.h
 *
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 */

#ifndef _sensor_history_response_H_
#define _sensor_history_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "sensor_history_response_results.h"




typedef struct sensor_history_response_t {
        list_t *results; //nonprimitive container

} sensor_history_response_t;

sensor_history_response_t *sensor_history_response_create(
        list_t *results
);

void sensor_history_response_free(sensor_history_response_t *sensor_history_response);

sensor_history_response_t *sensor_history_response_parseFromJSON(char *jsonString);

cJSON *sensor_history_response_convertToJSON(sensor_history_response_t *sensor_history_response);

#endif /* _sensor_history_response_H_ */


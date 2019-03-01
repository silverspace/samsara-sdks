/*
 * sensor_history_response_results.h
 *
 * 
 */

#ifndef _sensor_history_response_results_H_
#define _sensor_history_response_results_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct sensor_history_response_results_t {
        list_t *series; //primitive container
        int timeMs; //numeric

} sensor_history_response_results_t;

sensor_history_response_results_t *sensor_history_response_results_create(
        list_t *series,
        int timeMs
);

void sensor_history_response_results_free(sensor_history_response_results_t *sensor_history_response_results);

sensor_history_response_results_t *sensor_history_response_results_parseFromJSON(char *jsonString);

cJSON *sensor_history_response_results_convertToJSON(sensor_history_response_results_t *sensor_history_response_results);

#endif /* _sensor_history_response_results_H_ */


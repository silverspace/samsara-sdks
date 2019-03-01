/*
 * data_input_history_response_points.h
 *
 * 
 */

#ifndef _data_input_history_response_points_H_
#define _data_input_history_response_points_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct data_input_history_response_points_t {
        double value; //numeric
        long timeMs; //numeric

} data_input_history_response_points_t;

data_input_history_response_points_t *data_input_history_response_points_create(
        double value,
        long timeMs
);

void data_input_history_response_points_free(data_input_history_response_points_t *data_input_history_response_points);

data_input_history_response_points_t *data_input_history_response_points_parseFromJSON(char *jsonString);

cJSON *data_input_history_response_points_convertToJSON(data_input_history_response_points_t *data_input_history_response_points);

#endif /* _data_input_history_response_points_H_ */


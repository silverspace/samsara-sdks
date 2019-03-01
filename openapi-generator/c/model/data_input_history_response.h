/*
 * data_input_history_response.h
 *
 * 
 */

#ifndef _data_input_history_response_H_
#define _data_input_history_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "data_input_history_response_points.h"




typedef struct data_input_history_response_t {
        long id; //numeric
        char *name; //no enum string
        list_t *points; //nonprimitive container

} data_input_history_response_t;

data_input_history_response_t *data_input_history_response_create(
        long id,
        char *name,
        list_t *points
);

void data_input_history_response_free(data_input_history_response_t *data_input_history_response);

data_input_history_response_t *data_input_history_response_parseFromJSON(char *jsonString);

cJSON *data_input_history_response_convertToJSON(data_input_history_response_t *data_input_history_response);

#endif /* _data_input_history_response_H_ */


/*
 * hos_logs_response.h
 *
 * 
 */

#ifndef _hos_logs_response_H_
#define _hos_logs_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "hos_logs_response_logs.h"




typedef struct hos_logs_response_t {
        list_t *logs; //nonprimitive container

} hos_logs_response_t;

hos_logs_response_t *hos_logs_response_create(
        list_t *logs
);

void hos_logs_response_free(hos_logs_response_t *hos_logs_response);

hos_logs_response_t *hos_logs_response_parseFromJSON(char *jsonString);

cJSON *hos_logs_response_convertToJSON(hos_logs_response_t *hos_logs_response);

#endif /* _hos_logs_response_H_ */


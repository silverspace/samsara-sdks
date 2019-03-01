/*
 * hos_authentication_logs_response_authentication_logs.h
 *
 * 
 */

#ifndef _hos_authentication_logs_response_authentication_logs_H_
#define _hos_authentication_logs_response_authentication_logs_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct hos_authentication_logs_response_authentication_logs_t {
        char *actionType; //no enum string
        char *address; //no enum string
        char *city; //no enum string
        long happenedAtMs; //numeric
        char *addressName; //no enum string
        char *state; //no enum string

} hos_authentication_logs_response_authentication_logs_t;

hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs_create(
        char *actionType,
        char *address,
        char *city,
        long happenedAtMs,
        char *addressName,
        char *state
);

void hos_authentication_logs_response_authentication_logs_free(hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs);

hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs_parseFromJSON(char *jsonString);

cJSON *hos_authentication_logs_response_authentication_logs_convertToJSON(hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs);

#endif /* _hos_authentication_logs_response_authentication_logs_H_ */


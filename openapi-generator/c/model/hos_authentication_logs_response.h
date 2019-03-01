/*
 * hos_authentication_logs_response.h
 *
 * 
 */

#ifndef _hos_authentication_logs_response_H_
#define _hos_authentication_logs_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "hos_authentication_logs_response_authentication_logs.h"




typedef struct hos_authentication_logs_response_t {
        list_t *authenticationLogs; //nonprimitive container

} hos_authentication_logs_response_t;

hos_authentication_logs_response_t *hos_authentication_logs_response_create(
        list_t *authenticationLogs
);

void hos_authentication_logs_response_free(hos_authentication_logs_response_t *hos_authentication_logs_response);

hos_authentication_logs_response_t *hos_authentication_logs_response_parseFromJSON(char *jsonString);

cJSON *hos_authentication_logs_response_convertToJSON(hos_authentication_logs_response_t *hos_authentication_logs_response);

#endif /* _hos_authentication_logs_response_H_ */


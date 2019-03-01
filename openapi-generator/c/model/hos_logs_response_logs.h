/*
 * hos_logs_response_logs.h
 *
 * 
 */

#ifndef _hos_logs_response_logs_H_
#define _hos_logs_response_logs_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct hos_logs_response_logs_t {
        double locLng; //numeric
        long logStartMs; //numeric
        long driverId; //numeric
        char *statusType; //no enum string
        char *locCity; //no enum string
        long groupId; //numeric
        char *locName; //no enum string
        double locLat; //numeric
        char *remark; //no enum string
        char *locState; //no enum string
        long vehicleId; //numeric
        list_t *codriverIds; //primitive container

} hos_logs_response_logs_t;

hos_logs_response_logs_t *hos_logs_response_logs_create(
        double locLng,
        long logStartMs,
        long driverId,
        char *statusType,
        char *locCity,
        long groupId,
        char *locName,
        double locLat,
        char *remark,
        char *locState,
        long vehicleId,
        list_t *codriverIds
);

void hos_logs_response_logs_free(hos_logs_response_logs_t *hos_logs_response_logs);

hos_logs_response_logs_t *hos_logs_response_logs_parseFromJSON(char *jsonString);

cJSON *hos_logs_response_logs_convertToJSON(hos_logs_response_logs_t *hos_logs_response_logs);

#endif /* _hos_logs_response_logs_H_ */


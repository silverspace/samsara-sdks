/*
 * asset_reefer_response_reefer_stats_alarms.h
 *
 * 
 */

#ifndef _asset_reefer_response_reefer_stats_alarms_H_
#define _asset_reefer_response_reefer_stats_alarms_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct asset_reefer_response_reefer_stats_alarms_t {
        long severity; //numeric
        char *operatorAction; //no enum string
        char *description; //no enum string
        long alarmCode; //numeric

} asset_reefer_response_reefer_stats_alarms_t;

asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms_create(
        long severity,
        char *operatorAction,
        char *description,
        long alarmCode
);

void asset_reefer_response_reefer_stats_alarms_free(asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms);

asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms_parseFromJSON(char *jsonString);

cJSON *asset_reefer_response_reefer_stats_alarms_convertToJSON(asset_reefer_response_reefer_stats_alarms_t *asset_reefer_response_reefer_stats_alarms);

#endif /* _asset_reefer_response_reefer_stats_alarms_H_ */


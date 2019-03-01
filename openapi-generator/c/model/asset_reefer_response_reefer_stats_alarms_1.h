/*
 * asset_reefer_response_reefer_stats_alarms_1.h
 *
 * 
 */

#ifndef _asset_reefer_response_reefer_stats_alarms_1_H_
#define _asset_reefer_response_reefer_stats_alarms_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "asset_reefer_response_reefer_stats_alarms.h"




typedef struct asset_reefer_response_reefer_stats_alarms_1_t {
        list_t *alarms; //nonprimitive container
        long changedAtMs; //numeric

} asset_reefer_response_reefer_stats_alarms_1_t;

asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1_create(
        list_t *alarms,
        long changedAtMs
);

void asset_reefer_response_reefer_stats_alarms_1_free(asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1);

asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1_parseFromJSON(char *jsonString);

cJSON *asset_reefer_response_reefer_stats_alarms_1_convertToJSON(asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1);

#endif /* _asset_reefer_response_reefer_stats_alarms_1_H_ */


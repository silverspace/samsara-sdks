/*
 * asset_reefer_response_reefer_stats_power_status.h
 *
 * 
 */

#ifndef _asset_reefer_response_reefer_stats_power_status_H_
#define _asset_reefer_response_reefer_stats_power_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct asset_reefer_response_reefer_stats_power_status_t {
        long changedAtMs; //numeric
        char *status; //no enum string

} asset_reefer_response_reefer_stats_power_status_t;

asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status_create(
        long changedAtMs,
        char *status
);

void asset_reefer_response_reefer_stats_power_status_free(asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status);

asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status_parseFromJSON(char *jsonString);

cJSON *asset_reefer_response_reefer_stats_power_status_convertToJSON(asset_reefer_response_reefer_stats_power_status_t *asset_reefer_response_reefer_stats_power_status);

#endif /* _asset_reefer_response_reefer_stats_power_status_H_ */


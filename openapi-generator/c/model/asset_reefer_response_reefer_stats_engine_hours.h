/*
 * asset_reefer_response_reefer_stats_engine_hours.h
 *
 * 
 */

#ifndef _asset_reefer_response_reefer_stats_engine_hours_H_
#define _asset_reefer_response_reefer_stats_engine_hours_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct asset_reefer_response_reefer_stats_engine_hours_t {
        long engineHours; //numeric
        long changedAtMs; //numeric

} asset_reefer_response_reefer_stats_engine_hours_t;

asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours_create(
        long engineHours,
        long changedAtMs
);

void asset_reefer_response_reefer_stats_engine_hours_free(asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours);

asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours_parseFromJSON(char *jsonString);

cJSON *asset_reefer_response_reefer_stats_engine_hours_convertToJSON(asset_reefer_response_reefer_stats_engine_hours_t *asset_reefer_response_reefer_stats_engine_hours);

#endif /* _asset_reefer_response_reefer_stats_engine_hours_H_ */


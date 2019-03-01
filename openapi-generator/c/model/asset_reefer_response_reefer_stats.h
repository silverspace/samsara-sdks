/*
 * asset_reefer_response_reefer_stats.h
 *
 * 
 */

#ifndef _asset_reefer_response_reefer_stats_H_
#define _asset_reefer_response_reefer_stats_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "asset_reefer_response_reefer_stats_alarms_1.h"
#include "asset_reefer_response_reefer_stats_engine_hours.h"
#include "asset_reefer_response_reefer_stats_fuel_percentage.h"
#include "asset_reefer_response_reefer_stats_power_status.h"
#include "asset_reefer_response_reefer_stats_return_air_temp.h"
#include "asset_reefer_response_reefer_stats_set_point.h"




typedef struct asset_reefer_response_reefer_stats_t {
        list_t *fuelPercentage; //nonprimitive container
        list_t *powerStatus; //nonprimitive container
        list_t *engineHours; //nonprimitive container
        list_t *setPoint; //nonprimitive container
        list_t *returnAirTemp; //nonprimitive container
        list_t *alarms; //nonprimitive container

} asset_reefer_response_reefer_stats_t;

asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats_create(
        list_t *fuelPercentage,
        list_t *powerStatus,
        list_t *engineHours,
        list_t *setPoint,
        list_t *returnAirTemp,
        list_t *alarms
);

void asset_reefer_response_reefer_stats_free(asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats);

asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats_parseFromJSON(char *jsonString);

cJSON *asset_reefer_response_reefer_stats_convertToJSON(asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats);

#endif /* _asset_reefer_response_reefer_stats_H_ */


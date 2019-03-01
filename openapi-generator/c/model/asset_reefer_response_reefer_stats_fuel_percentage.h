/*
 * asset_reefer_response_reefer_stats_fuel_percentage.h
 *
 * 
 */

#ifndef _asset_reefer_response_reefer_stats_fuel_percentage_H_
#define _asset_reefer_response_reefer_stats_fuel_percentage_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct asset_reefer_response_reefer_stats_fuel_percentage_t {
        long fuelPercentage; //numeric
        long changedAtMs; //numeric

} asset_reefer_response_reefer_stats_fuel_percentage_t;

asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage_create(
        long fuelPercentage,
        long changedAtMs
);

void asset_reefer_response_reefer_stats_fuel_percentage_free(asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage);

asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage_parseFromJSON(char *jsonString);

cJSON *asset_reefer_response_reefer_stats_fuel_percentage_convertToJSON(asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage);

#endif /* _asset_reefer_response_reefer_stats_fuel_percentage_H_ */


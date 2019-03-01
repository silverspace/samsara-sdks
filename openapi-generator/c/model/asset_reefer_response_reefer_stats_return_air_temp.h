/*
 * asset_reefer_response_reefer_stats_return_air_temp.h
 *
 * 
 */

#ifndef _asset_reefer_response_reefer_stats_return_air_temp_H_
#define _asset_reefer_response_reefer_stats_return_air_temp_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct asset_reefer_response_reefer_stats_return_air_temp_t {
        long tempInMilliC; //numeric
        long changedAtMs; //numeric

} asset_reefer_response_reefer_stats_return_air_temp_t;

asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp_create(
        long tempInMilliC,
        long changedAtMs
);

void asset_reefer_response_reefer_stats_return_air_temp_free(asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp);

asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp_parseFromJSON(char *jsonString);

cJSON *asset_reefer_response_reefer_stats_return_air_temp_convertToJSON(asset_reefer_response_reefer_stats_return_air_temp_t *asset_reefer_response_reefer_stats_return_air_temp);

#endif /* _asset_reefer_response_reefer_stats_return_air_temp_H_ */


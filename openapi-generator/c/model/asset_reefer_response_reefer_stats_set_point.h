/*
 * asset_reefer_response_reefer_stats_set_point.h
 *
 * 
 */

#ifndef _asset_reefer_response_reefer_stats_set_point_H_
#define _asset_reefer_response_reefer_stats_set_point_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct asset_reefer_response_reefer_stats_set_point_t {
        long tempInMilliC; //numeric
        long changedAtMs; //numeric

} asset_reefer_response_reefer_stats_set_point_t;

asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point_create(
        long tempInMilliC,
        long changedAtMs
);

void asset_reefer_response_reefer_stats_set_point_free(asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point);

asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point_parseFromJSON(char *jsonString);

cJSON *asset_reefer_response_reefer_stats_set_point_convertToJSON(asset_reefer_response_reefer_stats_set_point_t *asset_reefer_response_reefer_stats_set_point);

#endif /* _asset_reefer_response_reefer_stats_set_point_H_ */


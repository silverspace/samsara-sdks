/*
 * asset_reefer_response.h
 *
 * Reefer-specific asset details
 */

#ifndef _asset_reefer_response_H_
#define _asset_reefer_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "asset_reefer_response_reefer_stats.h"




typedef struct asset_reefer_response_t {
        char *assetType; //no enum string
        int id; //numeric
        char *name; //no enum string
        asset_reefer_response_reefer_stats_t *reeferStats; //nonprimitive

} asset_reefer_response_t;

asset_reefer_response_t *asset_reefer_response_create(
        char *assetType,
        int id,
        char *name,
        asset_reefer_response_reefer_stats_t *reeferStats
);

void asset_reefer_response_free(asset_reefer_response_t *asset_reefer_response);

asset_reefer_response_t *asset_reefer_response_parseFromJSON(char *jsonString);

cJSON *asset_reefer_response_convertToJSON(asset_reefer_response_t *asset_reefer_response);

#endif /* _asset_reefer_response_H_ */


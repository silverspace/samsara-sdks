/*
 * asset_cable.h
 *
 * 
 */

#ifndef _asset_cable_H_
#define _asset_cable_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct asset_cable_t {
        char *assetType; //no enum string

} asset_cable_t;

asset_cable_t *asset_cable_create(
        char *assetType
);

void asset_cable_free(asset_cable_t *asset_cable);

asset_cable_t *asset_cable_parseFromJSON(char *jsonString);

cJSON *asset_cable_convertToJSON(asset_cable_t *asset_cable);

#endif /* _asset_cable_H_ */


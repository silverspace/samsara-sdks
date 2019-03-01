/*
 * asset.h
 *
 * Basic information of an asset
 */

#ifndef _asset_H_
#define _asset_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "asset_cable.h"




typedef struct asset_t {
        char *assetSerialNumber; //no enum string
        list_t *cable; //nonprimitive container
        int engineHours; //numeric
        long id; //numeric
        char *name; //no enum string

} asset_t;

asset_t *asset_create(
        char *assetSerialNumber,
        list_t *cable,
        int engineHours,
        long id,
        char *name
);

void asset_free(asset_t *asset);

asset_t *asset_parseFromJSON(char *jsonString);

cJSON *asset_convertToJSON(asset_t *asset);

#endif /* _asset_H_ */


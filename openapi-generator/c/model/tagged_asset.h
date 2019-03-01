/*
 * tagged_asset.h
 *
 * 
 */

#ifndef _tagged_asset_H_
#define _tagged_asset_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_asset_base.h"




typedef struct tagged_asset_t {
        long id; //numeric
        char *name; //no enum string

} tagged_asset_t;

tagged_asset_t *tagged_asset_create(
        long id,
        char *name
);

void tagged_asset_free(tagged_asset_t *tagged_asset);

tagged_asset_t *tagged_asset_parseFromJSON(char *jsonString);

cJSON *tagged_asset_convertToJSON(tagged_asset_t *tagged_asset);

#endif /* _tagged_asset_H_ */


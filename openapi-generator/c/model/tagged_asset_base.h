/*
 * tagged_asset_base.h
 *
 * 
 */

#ifndef _tagged_asset_base_H_
#define _tagged_asset_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct tagged_asset_base_t {
        long id; //numeric

} tagged_asset_base_t;

tagged_asset_base_t *tagged_asset_base_create(
        long id
);

void tagged_asset_base_free(tagged_asset_base_t *tagged_asset_base);

tagged_asset_base_t *tagged_asset_base_parseFromJSON(char *jsonString);

cJSON *tagged_asset_base_convertToJSON(tagged_asset_base_t *tagged_asset_base);

#endif /* _tagged_asset_base_H_ */


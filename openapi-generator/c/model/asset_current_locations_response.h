/*
 * asset_current_locations_response.h
 *
 * Basic information of an asset
 */

#ifndef _asset_current_locations_response_H_
#define _asset_current_locations_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "asset_cable.h"
#include "asset_current_location.h"




typedef struct asset_current_locations_response_t {
        list_t *cable; //nonprimitive container
        int engineHours; //numeric
        long id; //numeric
        list_t *location; //nonprimitive container
        char *name; //no enum string

} asset_current_locations_response_t;

asset_current_locations_response_t *asset_current_locations_response_create(
        list_t *cable,
        int engineHours,
        long id,
        list_t *location,
        char *name
);

void asset_current_locations_response_free(asset_current_locations_response_t *asset_current_locations_response);

asset_current_locations_response_t *asset_current_locations_response_parseFromJSON(char *jsonString);

cJSON *asset_current_locations_response_convertToJSON(asset_current_locations_response_t *asset_current_locations_response);

#endif /* _asset_current_locations_response_H_ */


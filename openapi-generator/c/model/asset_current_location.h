/*
 * asset_current_location.h
 *
 * Current location of an asset
 */

#ifndef _asset_current_location_H_
#define _asset_current_location_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct asset_current_location_t {
        double latitude; //numeric
        char *location; //no enum string
        double longitude; //numeric
        double speedMilesPerHour; //numeric
        long timeMs; //numeric

} asset_current_location_t;

asset_current_location_t *asset_current_location_create(
        double latitude,
        char *location,
        double longitude,
        double speedMilesPerHour,
        long timeMs
);

void asset_current_location_free(asset_current_location_t *asset_current_location);

asset_current_location_t *asset_current_location_parseFromJSON(char *jsonString);

cJSON *asset_current_location_convertToJSON(asset_current_location_t *asset_current_location);

#endif /* _asset_current_location_H_ */


#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/asset_reefer_response.h"
#include "../model/inline_response_200.h"
#include "../model/inline_response_200_1.h"
#include "../model/object.h"


// /fleet/assets/locations
//
// Fetch current locations of all assets for the group.
//
inline_response_200_1_t*
AssetsAPI_getAllAssetCurrentLocations(apiClient_t *apiClient,char* access_token ,long group_id );



// /fleet/assets
//
// Fetch all of the assets for the group.
//
inline_response_200_t*
AssetsAPI_getAllAssets(apiClient_t *apiClient,char* access_token ,long group_id );



// /fleet/assets/{assetId:[0-9]+}/locations
//
// Fetch the historical locations for the asset.
//
list_t*
AssetsAPI_getAssetLocation(apiClient_t *apiClient,char* access_token ,long asset_id ,long startMs ,long endMs );



// /fleet/assets/{assetId:[0-9]+}/reefer
//
// Fetch the reefer-specific stats of an asset.
//
asset_reefer_response_t*
AssetsAPI_getAssetReefer(apiClient_t *apiClient,char* access_token ,long asset_id ,long startMs ,long endMs );




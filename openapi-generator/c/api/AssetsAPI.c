#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AssetsAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// /fleet/assets/locations
//
// Fetch current locations of all assets for the group.
//
inline_response_200_1_t*
AssetsAPI_getAllAssetCurrentLocations(apiClient_t *apiClient, char* access_token, long group_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/assets/locations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/assets/locations");


    // query parameters
    char *keyQuery_access_token;
    char *valueQuery_access_token;
    keyValuePair_t *keyPairQuery_access_token = 0;
    if (access_token)
    {
    //string
    keyQuery_access_token = strdup("access_token");
    valueQuery_access_token = strdup(access_token);
    keyPairQuery_access_token = keyValuePair_create(keyQuery_access_token, valueQuery_access_token);
    list_addElement(localVarQueryParameters,keyPairQuery_access_token);
    }

    // query parameters
    char *keyQuery_group_id;
    long valueQuery_group_id;
    keyValuePair_t *keyPairQuery_group_id = 0;
    if (group_id)
    {
    //not string
    keyQuery_group_id = strdup("group_id");
    valueQuery_group_id = group_id;
    keyPairQuery_group_id = keyValuePair_create(keyQuery_group_id, &valueQuery_group_id);
    list_addElement(localVarQueryParameters,keyPairQuery_group_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","List of assets and their current locations.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    inline_response_200_1_t *elementToReturn = inline_response_200_1_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_group_id);
    keyValuePair_free(keyPairQuery_group_id);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/assets
//
// Fetch all of the assets for the group.
//
inline_response_200_t*
AssetsAPI_getAllAssets(apiClient_t *apiClient, char* access_token, long group_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/assets")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/assets");


    // query parameters
    char *keyQuery_access_token;
    char *valueQuery_access_token;
    keyValuePair_t *keyPairQuery_access_token = 0;
    if (access_token)
    {
    //string
    keyQuery_access_token = strdup("access_token");
    valueQuery_access_token = strdup(access_token);
    keyPairQuery_access_token = keyValuePair_create(keyQuery_access_token, valueQuery_access_token);
    list_addElement(localVarQueryParameters,keyPairQuery_access_token);
    }

    // query parameters
    char *keyQuery_group_id;
    long valueQuery_group_id;
    keyValuePair_t *keyPairQuery_group_id = 0;
    if (group_id)
    {
    //not string
    keyQuery_group_id = strdup("group_id");
    valueQuery_group_id = group_id;
    keyPairQuery_group_id = keyValuePair_create(keyQuery_group_id, &valueQuery_group_id);
    list_addElement(localVarQueryParameters,keyPairQuery_group_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","List of assets.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    inline_response_200_t *elementToReturn = inline_response_200_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_group_id);
    keyValuePair_free(keyPairQuery_group_id);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/assets/{assetId:[0-9]+}/locations
//
// Fetch the historical locations for the asset.
//
list_t*
AssetsAPI_getAssetLocation(apiClient_t *apiClient, char* access_token, long asset_id, long startMs, long endMs) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/assets/{asset_id}/locations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/assets/{asset_id}/locations");


    // Path Params
    long sizeOfPathParams_asset_id = sizeof(asset_id)+3 + strlen("{ asset_id }");

    if(asset_id == 0){
        goto end;
    }
    char* localVarToReplace_asset_id = malloc(sizeOfPathParams_asset_id);
    snprintf(localVarToReplace_asset_id, sizeOfPathParams_asset_id, "%s%s%s", "{", "asset_id", "}");

    char localVarBuff_asset_id[256];
    intToStr(localVarBuff_asset_id, asset_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_asset_id, localVarBuff_asset_id);


    // query parameters
    char *keyQuery_access_token;
    char *valueQuery_access_token;
    keyValuePair_t *keyPairQuery_access_token = 0;
    if (access_token)
    {
    //string
    keyQuery_access_token = strdup("access_token");
    valueQuery_access_token = strdup(access_token);
    keyPairQuery_access_token = keyValuePair_create(keyQuery_access_token, valueQuery_access_token);
    list_addElement(localVarQueryParameters,keyPairQuery_access_token);
    }

    // query parameters
    char *keyQuery_startMs;
    long valueQuery_startMs;
    keyValuePair_t *keyPairQuery_startMs = 0;
    if (startMs)
    {
    //not string
    keyQuery_startMs = strdup("startMs");
    valueQuery_startMs = startMs;
    keyPairQuery_startMs = keyValuePair_create(keyQuery_startMs, &valueQuery_startMs);
    list_addElement(localVarQueryParameters,keyPairQuery_startMs);
    }

    // query parameters
    char *keyQuery_endMs;
    long valueQuery_endMs;
    keyValuePair_t *keyPairQuery_endMs = 0;
    if (endMs)
    {
    //not string
    keyQuery_endMs = strdup("endMs");
    valueQuery_endMs = endMs;
    keyPairQuery_endMs = keyValuePair_create(keyQuery_endMs, &valueQuery_endMs);
    list_addElement(localVarQueryParameters,keyPairQuery_endMs);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Asset location details.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *AssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(AssetsAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, AssetsAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( AssetsAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_asset_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_startMs);
    keyValuePair_free(keyPairQuery_startMs);
    free(keyQuery_endMs);
    keyValuePair_free(keyPairQuery_endMs);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/assets/{assetId:[0-9]+}/reefer
//
// Fetch the reefer-specific stats of an asset.
//
asset_reefer_response_t*
AssetsAPI_getAssetReefer(apiClient_t *apiClient, char* access_token, long asset_id, long startMs, long endMs) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/assets/{asset_id}/reefer")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/assets/{asset_id}/reefer");


    // Path Params
    long sizeOfPathParams_asset_id = sizeof(asset_id)+3 + strlen("{ asset_id }");

    if(asset_id == 0){
        goto end;
    }
    char* localVarToReplace_asset_id = malloc(sizeOfPathParams_asset_id);
    snprintf(localVarToReplace_asset_id, sizeOfPathParams_asset_id, "%s%s%s", "{", "asset_id", "}");

    char localVarBuff_asset_id[256];
    intToStr(localVarBuff_asset_id, asset_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_asset_id, localVarBuff_asset_id);


    // query parameters
    char *keyQuery_access_token;
    char *valueQuery_access_token;
    keyValuePair_t *keyPairQuery_access_token = 0;
    if (access_token)
    {
    //string
    keyQuery_access_token = strdup("access_token");
    valueQuery_access_token = strdup(access_token);
    keyPairQuery_access_token = keyValuePair_create(keyQuery_access_token, valueQuery_access_token);
    list_addElement(localVarQueryParameters,keyPairQuery_access_token);
    }

    // query parameters
    char *keyQuery_startMs;
    long valueQuery_startMs;
    keyValuePair_t *keyPairQuery_startMs = 0;
    if (startMs)
    {
    //not string
    keyQuery_startMs = strdup("startMs");
    valueQuery_startMs = startMs;
    keyPairQuery_startMs = keyValuePair_create(keyQuery_startMs, &valueQuery_startMs);
    list_addElement(localVarQueryParameters,keyPairQuery_startMs);
    }

    // query parameters
    char *keyQuery_endMs;
    long valueQuery_endMs;
    keyValuePair_t *keyPairQuery_endMs = 0;
    if (endMs)
    {
    //not string
    keyQuery_endMs = strdup("endMs");
    valueQuery_endMs = endMs;
    keyPairQuery_endMs = keyValuePair_create(keyQuery_endMs, &valueQuery_endMs);
    list_addElement(localVarQueryParameters,keyPairQuery_endMs);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Reefer-specific asset details.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    asset_reefer_response_t *elementToReturn = asset_reefer_response_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_asset_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_startMs);
    keyValuePair_free(keyPairQuery_startMs);
    free(keyQuery_endMs);
    keyValuePair_free(keyPairQuery_endMs);
    return elementToReturn;
end:
    return NULL;

}


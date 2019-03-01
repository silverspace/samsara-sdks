#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "SafetyAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// /fleet/drivers/{driverId:[0-9]+}/safety/score
//
// Fetch the safety score for the driver.
//
driver_safety_score_response_t*
SafetyAPI_getDriverSafetyScore(apiClient_t *apiClient, long driverId, char* access_token, long startMs, long endMs) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/{driverId}/safety/score")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/{driverId}/safety/score");


    // Path Params
    long sizeOfPathParams_driverId = sizeof(driverId)+3 + strlen("{ driverId }");

    if(driverId == 0){
        goto end;
    }
    char* localVarToReplace_driverId = malloc(sizeOfPathParams_driverId);
    snprintf(localVarToReplace_driverId, sizeOfPathParams_driverId, "%s%s%s", "{", "driverId", "}");

    char localVarBuff_driverId[256];
    intToStr(localVarBuff_driverId, driverId);

    localVarPath = strReplace(localVarPath, localVarToReplace_driverId, localVarBuff_driverId);


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
        printf("%s\n","Safety score details.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    driver_safety_score_response_t *elementToReturn = driver_safety_score_response_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_driverId);
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

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
//
// Fetch harsh event details for a vehicle.
//
vehicle_harsh_event_response_t*
SafetyAPI_getVehicleHarshEvent(apiClient_t *apiClient, long vehicleId, char* access_token, long timestamp) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/vehicles/{vehicleId}/safety/harsh_event")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/vehicles/{vehicleId}/safety/harsh_event");


    // Path Params
    long sizeOfPathParams_vehicleId = sizeof(vehicleId)+3 + strlen("{ vehicleId }");

    if(vehicleId == 0){
        goto end;
    }
    char* localVarToReplace_vehicleId = malloc(sizeOfPathParams_vehicleId);
    snprintf(localVarToReplace_vehicleId, sizeOfPathParams_vehicleId, "%s%s%s", "{", "vehicleId", "}");

    char localVarBuff_vehicleId[256];
    intToStr(localVarBuff_vehicleId, vehicleId);

    localVarPath = strReplace(localVarPath, localVarToReplace_vehicleId, localVarBuff_vehicleId);


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
    char *keyQuery_timestamp;
    long valueQuery_timestamp;
    keyValuePair_t *keyPairQuery_timestamp = 0;
    if (timestamp)
    {
    //not string
    keyQuery_timestamp = strdup("timestamp");
    valueQuery_timestamp = timestamp;
    keyPairQuery_timestamp = keyValuePair_create(keyQuery_timestamp, &valueQuery_timestamp);
    list_addElement(localVarQueryParameters,keyPairQuery_timestamp);
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
        printf("%s\n","Harsh event details.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    vehicle_harsh_event_response_t *elementToReturn = vehicle_harsh_event_response_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_vehicleId);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_timestamp);
    keyValuePair_free(keyPairQuery_timestamp);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
//
// Fetch the safety score for the vehicle.
//
vehicle_safety_score_response_t*
SafetyAPI_getVehicleSafetyScore(apiClient_t *apiClient, long vehicleId, char* access_token, long startMs, long endMs) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/vehicles/{vehicleId}/safety/score")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/vehicles/{vehicleId}/safety/score");


    // Path Params
    long sizeOfPathParams_vehicleId = sizeof(vehicleId)+3 + strlen("{ vehicleId }");

    if(vehicleId == 0){
        goto end;
    }
    char* localVarToReplace_vehicleId = malloc(sizeOfPathParams_vehicleId);
    snprintf(localVarToReplace_vehicleId, sizeOfPathParams_vehicleId, "%s%s%s", "{", "vehicleId", "}");

    char localVarBuff_vehicleId[256];
    intToStr(localVarBuff_vehicleId, vehicleId);

    localVarPath = strReplace(localVarPath, localVarToReplace_vehicleId, localVarBuff_vehicleId);


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
        printf("%s\n","Safety score details.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    vehicle_safety_score_response_t *elementToReturn = vehicle_safety_score_response_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_vehicleId);
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


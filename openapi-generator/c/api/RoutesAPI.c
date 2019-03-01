#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "RoutesAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// /fleet/dispatch/routes
//
// Create a new dispatch route.
//
dispatch_route_t*
RoutesAPI_createDispatchRoute(apiClient_t *apiClient, char* access_token, dispatch_route_create_t* createDispatchRouteParams) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/dispatch/routes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/dispatch/routes");


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

    // Body Param
    cJSON *localVarSingleItemJSON_createDispatchRouteParams;
    if (createDispatchRouteParams != NULL) {
        //string
        localVarSingleItemJSON_createDispatchRouteParams = createDispatchRouteParams_convertToJSON(createDispatchRouteParams);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_createDispatchRouteParams);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Created route object including the new route ID.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    dispatch_route_t *elementToReturn = dispatch_route_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_createDispatchRouteParams);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
//
// Create a new dispatch route for the driver with driver_id.
//
dispatch_route_t*
RoutesAPI_createDriverDispatchRoute(apiClient_t *apiClient, char* access_token, long driver_id, dispatch_route_create_t* createDispatchRouteParams) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/{driver_id}/dispatch/routes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/{driver_id}/dispatch/routes");


    // Path Params
    long sizeOfPathParams_driver_id = sizeof(driver_id)+3 + strlen("{ driver_id }");

    if(driver_id == 0){
        goto end;
    }
    char* localVarToReplace_driver_id = malloc(sizeOfPathParams_driver_id);
    snprintf(localVarToReplace_driver_id, sizeOfPathParams_driver_id, "%s%s%s", "{", "driver_id", "}");

    char localVarBuff_driver_id[256];
    intToStr(localVarBuff_driver_id, driver_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_driver_id, localVarBuff_driver_id);


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

    // Body Param
    cJSON *localVarSingleItemJSON_createDispatchRouteParams;
    if (createDispatchRouteParams != NULL) {
        //string
        localVarSingleItemJSON_createDispatchRouteParams = createDispatchRouteParams_convertToJSON(createDispatchRouteParams);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_createDispatchRouteParams);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Created route object including the new route ID.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    dispatch_route_t *elementToReturn = dispatch_route_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_driver_id);
    cJSON_Delete(localVarSingleItemJSON_createDispatchRouteParams);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
//
// Create a new dispatch route for the vehicle with vehicle_id.
//
dispatch_route_t*
RoutesAPI_createVehicleDispatchRoute(apiClient_t *apiClient, char* access_token, long vehicle_id, dispatch_route_create_t* createDispatchRouteParams) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/vehicles/{vehicle_id}/dispatch/routes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/vehicles/{vehicle_id}/dispatch/routes");


    // Path Params
    long sizeOfPathParams_vehicle_id = sizeof(vehicle_id)+3 + strlen("{ vehicle_id }");

    if(vehicle_id == 0){
        goto end;
    }
    char* localVarToReplace_vehicle_id = malloc(sizeOfPathParams_vehicle_id);
    snprintf(localVarToReplace_vehicle_id, sizeOfPathParams_vehicle_id, "%s%s%s", "{", "vehicle_id", "}");

    char localVarBuff_vehicle_id[256];
    intToStr(localVarBuff_vehicle_id, vehicle_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_vehicle_id, localVarBuff_vehicle_id);


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

    // Body Param
    cJSON *localVarSingleItemJSON_createDispatchRouteParams;
    if (createDispatchRouteParams != NULL) {
        //string
        localVarSingleItemJSON_createDispatchRouteParams = createDispatchRouteParams_convertToJSON(createDispatchRouteParams);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_createDispatchRouteParams);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Created route object including the new route ID.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    dispatch_route_t *elementToReturn = dispatch_route_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_vehicle_id);
    cJSON_Delete(localVarSingleItemJSON_createDispatchRouteParams);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/dispatch/routes/{route_id:[0-9]+}/
//
// Delete a dispatch route and its associated jobs.
//
void
RoutesAPI_deleteDispatchRouteById(apiClient_t *apiClient, char* access_token, long route_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/dispatch/routes/{route_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/dispatch/routes/{route_id}");


    // Path Params
    long sizeOfPathParams_route_id = sizeof(route_id)+3 + strlen("{ route_id }");

    if(route_id == 0){
        goto end;
    }
    char* localVarToReplace_route_id = malloc(sizeOfPathParams_route_id);
    snprintf(localVarToReplace_route_id, sizeOfPathParams_route_id, "%s%s%s", "{", "route_id", "}");

    char localVarBuff_route_id[256];
    intToStr(localVarBuff_route_id, route_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_route_id, localVarBuff_route_id);


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
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    if (apiClient->response_code == 200) {
        printf("%s\n","Successfully deleted the dispatch route. No response body is returned.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_route_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);

}

// /fleet/dispatch/routes
//
// Fetch all of the dispatch routes for the group.
//
list_t*
RoutesAPI_fetchAllDispatchRoutes(apiClient_t *apiClient, char* access_token, long group_id, long end_time, long duration) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/dispatch/routes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/dispatch/routes");


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

    // query parameters
    char *keyQuery_end_time;
    long valueQuery_end_time;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
    //not string
    keyQuery_end_time = strdup("end_time");
    valueQuery_end_time = end_time;
    keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, &valueQuery_end_time);
    list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_duration;
    long valueQuery_duration;
    keyValuePair_t *keyPairQuery_duration = 0;
    if (duration)
    {
    //not string
    keyQuery_duration = strdup("duration");
    valueQuery_duration = duration;
    keyPairQuery_duration = keyValuePair_create(keyQuery_duration, &valueQuery_duration);
    list_addElement(localVarQueryParameters,keyPairQuery_duration);
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
        printf("%s\n","All dispatch route objects for the group.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *RoutesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(RoutesAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, RoutesAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( RoutesAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
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
    free(keyQuery_end_time);
    keyValuePair_free(keyPairQuery_end_time);
    free(keyQuery_duration);
    keyValuePair_free(keyPairQuery_duration);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/dispatch/routes/job_updates
//
// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
//
all_route_job_updates_t*
RoutesAPI_fetchAllRouteJobUpdates(apiClient_t *apiClient, char* access_token, long group_id, char* sequence_id, char* include) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/dispatch/routes/job_updates")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/dispatch/routes/job_updates");


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

    // query parameters
    char *keyQuery_sequence_id;
    char *valueQuery_sequence_id;
    keyValuePair_t *keyPairQuery_sequence_id = 0;
    if (sequence_id)
    {
    //string
    keyQuery_sequence_id = strdup("sequence_id");
    valueQuery_sequence_id = strdup(sequence_id);
    keyPairQuery_sequence_id = keyValuePair_create(keyQuery_sequence_id, valueQuery_sequence_id);
    list_addElement(localVarQueryParameters,keyPairQuery_sequence_id);
    }

    // query parameters
    char *keyQuery_include;
    char *valueQuery_include;
    keyValuePair_t *keyPairQuery_include = 0;
    if (include)
    {
    //string
    keyQuery_include = strdup("include");
    valueQuery_include = strdup(include);
    keyPairQuery_include = keyValuePair_create(keyQuery_include, valueQuery_include);
    list_addElement(localVarQueryParameters,keyPairQuery_include);
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
        printf("%s\n","All job updates on routes.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    all_route_job_updates_t *elementToReturn = all_route_job_updates_parseFromJSON(apiClient->dataReceived);
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
    free(keyQuery_sequence_id);
    free(valueQuery_sequence_id);
    keyValuePair_free(keyPairQuery_sequence_id);
    free(keyQuery_include);
    free(valueQuery_include);
    keyValuePair_free(keyPairQuery_include);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/dispatch/routes/{route_id:[0-9]+}
//
// Fetch a dispatch route by id.
//
dispatch_route_t*
RoutesAPI_getDispatchRouteById(apiClient_t *apiClient, char* access_token, long route_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/dispatch/routes/{route_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/dispatch/routes/{route_id}");


    // Path Params
    long sizeOfPathParams_route_id = sizeof(route_id)+3 + strlen("{ route_id }");

    if(route_id == 0){
        goto end;
    }
    char* localVarToReplace_route_id = malloc(sizeOfPathParams_route_id);
    snprintf(localVarToReplace_route_id, sizeOfPathParams_route_id, "%s%s%s", "{", "route_id", "}");

    char localVarBuff_route_id[256];
    intToStr(localVarBuff_route_id, route_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_route_id, localVarBuff_route_id);


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
        printf("%s\n","The dispatch route corresponding to route_id.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    dispatch_route_t *elementToReturn = dispatch_route_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_route_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/dispatch/routes/{route_id:[0-9]+}/history
//
// Fetch the history of a dispatch route.
//
dispatch_route_history_t*
RoutesAPI_getDispatchRouteHistory(apiClient_t *apiClient, char* access_token, long route_id, long start_time, long end_time) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/dispatch/routes/{route_id}/history")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/dispatch/routes/{route_id}/history");


    // Path Params
    long sizeOfPathParams_route_id = sizeof(route_id)+3 + strlen("{ route_id }");

    if(route_id == 0){
        goto end;
    }
    char* localVarToReplace_route_id = malloc(sizeOfPathParams_route_id);
    snprintf(localVarToReplace_route_id, sizeOfPathParams_route_id, "%s%s%s", "{", "route_id", "}");

    char localVarBuff_route_id[256];
    intToStr(localVarBuff_route_id, route_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_route_id, localVarBuff_route_id);


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
    char *keyQuery_start_time;
    long valueQuery_start_time;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
    //not string
    keyQuery_start_time = strdup("start_time");
    valueQuery_start_time = start_time;
    keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, &valueQuery_start_time);
    list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time;
    long valueQuery_end_time;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
    //not string
    keyQuery_end_time = strdup("end_time");
    valueQuery_end_time = end_time;
    keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, &valueQuery_end_time);
    list_addElement(localVarQueryParameters,keyPairQuery_end_time);
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
        printf("%s\n","The historical route state changes between start_time and end_time.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    dispatch_route_history_t *elementToReturn = dispatch_route_history_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_route_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_start_time);
    keyValuePair_free(keyPairQuery_start_time);
    free(keyQuery_end_time);
    keyValuePair_free(keyPairQuery_end_time);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
//
// Fetch all of the dispatch routes for a given driver.
//
list_t*
RoutesAPI_getDispatchRoutesByDriverId(apiClient_t *apiClient, char* access_token, long driver_id, long end_time, long duration) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/{driver_id}/dispatch/routes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/{driver_id}/dispatch/routes");


    // Path Params
    long sizeOfPathParams_driver_id = sizeof(driver_id)+3 + strlen("{ driver_id }");

    if(driver_id == 0){
        goto end;
    }
    char* localVarToReplace_driver_id = malloc(sizeOfPathParams_driver_id);
    snprintf(localVarToReplace_driver_id, sizeOfPathParams_driver_id, "%s%s%s", "{", "driver_id", "}");

    char localVarBuff_driver_id[256];
    intToStr(localVarBuff_driver_id, driver_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_driver_id, localVarBuff_driver_id);


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
    char *keyQuery_end_time;
    long valueQuery_end_time;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
    //not string
    keyQuery_end_time = strdup("end_time");
    valueQuery_end_time = end_time;
    keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, &valueQuery_end_time);
    list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_duration;
    long valueQuery_duration;
    keyValuePair_t *keyPairQuery_duration = 0;
    if (duration)
    {
    //not string
    keyQuery_duration = strdup("duration");
    valueQuery_duration = duration;
    keyPairQuery_duration = keyValuePair_create(keyQuery_duration, &valueQuery_duration);
    list_addElement(localVarQueryParameters,keyPairQuery_duration);
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
        printf("%s\n","Returns the dispatch routes for the given driver_id.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *RoutesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(RoutesAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, RoutesAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( RoutesAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_driver_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_end_time);
    keyValuePair_free(keyPairQuery_end_time);
    free(keyQuery_duration);
    keyValuePair_free(keyPairQuery_duration);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
//
// Fetch all of the dispatch routes for a given vehicle.
//
list_t*
RoutesAPI_getDispatchRoutesByVehicleId(apiClient_t *apiClient, char* access_token, long vehicle_id, long end_time, long duration) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/vehicles/{vehicle_id}/dispatch/routes")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/vehicles/{vehicle_id}/dispatch/routes");


    // Path Params
    long sizeOfPathParams_vehicle_id = sizeof(vehicle_id)+3 + strlen("{ vehicle_id }");

    if(vehicle_id == 0){
        goto end;
    }
    char* localVarToReplace_vehicle_id = malloc(sizeOfPathParams_vehicle_id);
    snprintf(localVarToReplace_vehicle_id, sizeOfPathParams_vehicle_id, "%s%s%s", "{", "vehicle_id", "}");

    char localVarBuff_vehicle_id[256];
    intToStr(localVarBuff_vehicle_id, vehicle_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_vehicle_id, localVarBuff_vehicle_id);


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
    char *keyQuery_end_time;
    long valueQuery_end_time;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
    //not string
    keyQuery_end_time = strdup("end_time");
    valueQuery_end_time = end_time;
    keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, &valueQuery_end_time);
    list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_duration;
    long valueQuery_duration;
    keyValuePair_t *keyPairQuery_duration = 0;
    if (duration)
    {
    //not string
    keyQuery_duration = strdup("duration");
    valueQuery_duration = duration;
    keyPairQuery_duration = keyValuePair_create(keyQuery_duration, &valueQuery_duration);
    list_addElement(localVarQueryParameters,keyPairQuery_duration);
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
        printf("%s\n","Returns all of the dispatch routes for the given vehicle_id.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *RoutesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(RoutesAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, RoutesAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( RoutesAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_vehicle_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_end_time);
    keyValuePair_free(keyPairQuery_end_time);
    free(keyQuery_duration);
    keyValuePair_free(keyPairQuery_duration);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/dispatch/routes/{route_id:[0-9]+}/
//
// Update a dispatch route and its associated jobs.
//
dispatch_route_t*
RoutesAPI_updateDispatchRouteById(apiClient_t *apiClient, char* access_token, long route_id, dispatch_route_t* updateDispatchRouteParams) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/dispatch/routes/{route_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/dispatch/routes/{route_id}");


    // Path Params
    long sizeOfPathParams_route_id = sizeof(route_id)+3 + strlen("{ route_id }");

    if(route_id == 0){
        goto end;
    }
    char* localVarToReplace_route_id = malloc(sizeOfPathParams_route_id);
    snprintf(localVarToReplace_route_id, sizeOfPathParams_route_id, "%s%s%s", "{", "route_id", "}");

    char localVarBuff_route_id[256];
    intToStr(localVarBuff_route_id, route_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_route_id, localVarBuff_route_id);


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

    // Body Param
    cJSON *localVarSingleItemJSON_updateDispatchRouteParams;
    if (updateDispatchRouteParams != NULL) {
        //string
        localVarSingleItemJSON_updateDispatchRouteParams = updateDispatchRouteParams_convertToJSON(updateDispatchRouteParams);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_updateDispatchRouteParams);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    dispatch_route_t *elementToReturn = dispatch_route_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_route_id);
    cJSON_Delete(localVarSingleItemJSON_updateDispatchRouteParams);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}


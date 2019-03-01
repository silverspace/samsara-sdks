#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "FleetAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// /fleet/add_address
//
// This method adds an address book entry to the specified group.
//
void
FleetAPI_addFleetAddress(apiClient_t *apiClient, char* access_token, inline_object_2_t* addressParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/add_address")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/add_address");


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
    cJSON *localVarSingleItemJSON_addressParam;
    if (addressParam != NULL) {
        //string
        localVarSingleItemJSON_addressParam = addressParam_convertToJSON(addressParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_addressParam);
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
        printf("%s\n","Address was successfully added. No response body is returned.");
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
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_addressParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);

}

// /addresses
//
// Add one or more addresses to the organization
//
list_t*
FleetAPI_addOrganizationAddresses(apiClient_t *apiClient, char* access_token, inline_object_t* addresses) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/addresses")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/addresses");


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
    cJSON *localVarSingleItemJSON_addresses;
    if (addresses != NULL) {
        //string
        localVarSingleItemJSON_addresses = addresses_convertToJSON(addresses);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_addresses);
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
        printf("%s\n","List of added addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_addresses);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/dispatch/routes
//
// Create a new dispatch route.
//
dispatch_route_t*
FleetAPI_createDispatchRoute(apiClient_t *apiClient, char* access_token, dispatch_route_create_t* createDispatchRouteParams) {
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

// /fleet/drivers/create
//
// Create a new driver.
//
driver_t*
FleetAPI_createDriver(apiClient_t *apiClient, char* access_token, driver_for_create_t* createDriverParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/create")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/create");


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
    cJSON *localVarSingleItemJSON_createDriverParam;
    if (createDriverParam != NULL) {
        //string
        localVarSingleItemJSON_createDriverParam = createDriverParam_convertToJSON(createDriverParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_createDriverParam);
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
        printf("%s\n","Returns the successfully created the driver.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    driver_t *elementToReturn = driver_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_createDriverParam);
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
FleetAPI_createDriverDispatchRoute(apiClient_t *apiClient, char* access_token, long driver_id, dispatch_route_create_t* createDispatchRouteParams) {
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

// /fleet/drivers/{driver_id:[0-9]+}/documents
//
// Create a driver document for the given driver.
//
document_t*
FleetAPI_createDriverDocument(apiClient_t *apiClient, char* access_token, long driver_id, document_create_t* createDocumentParams) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/{driver_id}/documents")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/{driver_id}/documents");


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
    cJSON *localVarSingleItemJSON_createDocumentParams;
    if (createDocumentParams != NULL) {
        //string
        localVarSingleItemJSON_createDocumentParams = createDocumentParams_convertToJSON(createDocumentParams);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_createDocumentParams);
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
        printf("%s\n","Returns the created document.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    document_t *elementToReturn = document_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_createDocumentParams);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/maintenance/dvirs
//
// Create a new dvir, marking a vehicle or trailer safe or unsafe.
//
dvir_base_t*
FleetAPI_createDvir(apiClient_t *apiClient, char* access_token, inline_object_12_t* createDvirParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/maintenance/dvirs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/maintenance/dvirs");


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
    cJSON *localVarSingleItemJSON_createDvirParam;
    if (createDvirParam != NULL) {
        //string
        localVarSingleItemJSON_createDvirParam = createDvirParam_convertToJSON(createDvirParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_createDvirParam);
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
        printf("%s\n","Newly created DVIR.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    dvir_base_t *elementToReturn = dvir_base_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_createDvirParam);
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
FleetAPI_createVehicleDispatchRoute(apiClient_t *apiClient, char* access_token, long vehicle_id, dispatch_route_create_t* createDispatchRouteParams) {
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

// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Deactivate a driver with the given id.
//
void
FleetAPI_deactivateDriver(apiClient_t *apiClient, char* access_token, char* driver_id_or_external_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/{driver_id_or_external_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/{driver_id_or_external_id}");


    // Path Params
    long sizeOfPathParams_driver_id_or_external_id = strlen(driver_id_or_external_id)+3 + strlen("{ driver_id_or_external_id }");

    if(driver_id_or_external_id == NULL) {
        goto end;
    }
    char* localVarToReplace_driver_id_or_external_id = malloc(sizeOfPathParams_driver_id_or_external_id);
    sprintf(localVarToReplace_driver_id_or_external_id, "%s%s%s", "{", "driver_id_or_external_id", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_driver_id_or_external_id, driver_id_or_external_id);

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
        printf("%s\n","Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.");
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
    free(localVarToReplace_driver_id_or_external_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);

}

// /fleet/dispatch/routes/{route_id:[0-9]+}/
//
// Delete a dispatch route and its associated jobs.
//
void
FleetAPI_deleteDispatchRouteById(apiClient_t *apiClient, char* access_token, long route_id) {
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

// /addresses/{addressId}
//
// Delete an address.
//
void
FleetAPI_deleteOrganizationAddress(apiClient_t *apiClient, char* access_token, long addressId) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/addresses/{addressId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/addresses/{addressId}");


    // Path Params
    long sizeOfPathParams_addressId = sizeof(addressId)+3 + strlen("{ addressId }");

    if(addressId == 0){
        goto end;
    }
    char* localVarToReplace_addressId = malloc(sizeOfPathParams_addressId);
    snprintf(localVarToReplace_addressId, sizeOfPathParams_addressId, "%s%s%s", "{", "addressId", "}");

    char localVarBuff_addressId[256];
    intToStr(localVarBuff_addressId, addressId);

    localVarPath = strReplace(localVarPath, localVarToReplace_addressId, localVarBuff_addressId);


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
        printf("%s\n","Address was successfully deleted. No response body is returned.");
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
    free(localVarToReplace_addressId);
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
FleetAPI_fetchAllDispatchRoutes(apiClient_t *apiClient, char* access_token, long group_id, long end_time, long duration) {
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
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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
FleetAPI_fetchAllRouteJobUpdates(apiClient_t *apiClient, char* access_token, long group_id, char* sequence_id, char* include) {
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

// /fleet/assets/locations
//
// Fetch current locations of all assets for the group.
//
inline_response_200_1_t*
FleetAPI_getAllAssetCurrentLocations(apiClient_t *apiClient, char* access_token, long group_id) {
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
FleetAPI_getAllAssets(apiClient_t *apiClient, char* access_token, long group_id) {
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

// /fleet/drivers/inactive
//
// Fetch all deactivated drivers for the group.
//
list_t*
FleetAPI_getAllDeactivatedDrivers(apiClient_t *apiClient, char* access_token, long group_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/inactive")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/inactive");


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
        printf("%s\n","Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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
    return elementToReturn;
end:
    return NULL;

}

// /fleet/assets/{assetId:[0-9]+}/locations
//
// Fetch the historical locations for the asset.
//
list_t*
FleetAPI_getAssetLocation(apiClient_t *apiClient, char* access_token, long asset_id, long startMs, long endMs) {
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
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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
FleetAPI_getAssetReefer(apiClient_t *apiClient, char* access_token, long asset_id, long startMs, long endMs) {
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

// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Fetch deactivated driver by id.
//
driver_t*
FleetAPI_getDeactivatedDriverById(apiClient_t *apiClient, char* access_token, char* driver_id_or_external_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/inactive/{driver_id_or_external_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/inactive/{driver_id_or_external_id}");


    // Path Params
    long sizeOfPathParams_driver_id_or_external_id = strlen(driver_id_or_external_id)+3 + strlen("{ driver_id_or_external_id }");

    if(driver_id_or_external_id == NULL) {
        goto end;
    }
    char* localVarToReplace_driver_id_or_external_id = malloc(sizeOfPathParams_driver_id_or_external_id);
    sprintf(localVarToReplace_driver_id_or_external_id, "%s%s%s", "{", "driver_id_or_external_id", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_driver_id_or_external_id, driver_id_or_external_id);

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
        printf("%s\n","Returns the deactivated driver with the given driver_id.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    driver_t *elementToReturn = driver_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_driver_id_or_external_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/dispatch/routes/{route_id:[0-9]+}
//
// Fetch a dispatch route by id.
//
dispatch_route_t*
FleetAPI_getDispatchRouteById(apiClient_t *apiClient, char* access_token, long route_id) {
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
FleetAPI_getDispatchRouteHistory(apiClient_t *apiClient, char* access_token, long route_id, long start_time, long end_time) {
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
FleetAPI_getDispatchRoutesByDriverId(apiClient_t *apiClient, char* access_token, long driver_id, long end_time, long duration) {
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
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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
FleetAPI_getDispatchRoutesByVehicleId(apiClient_t *apiClient, char* access_token, long vehicle_id, long end_time, long duration) {
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
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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

// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Fetch driver by id.
//
driver_t*
FleetAPI_getDriverById(apiClient_t *apiClient, char* access_token, char* driver_id_or_external_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/{driver_id_or_external_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/{driver_id_or_external_id}");


    // Path Params
    long sizeOfPathParams_driver_id_or_external_id = strlen(driver_id_or_external_id)+3 + strlen("{ driver_id_or_external_id }");

    if(driver_id_or_external_id == NULL) {
        goto end;
    }
    char* localVarToReplace_driver_id_or_external_id = malloc(sizeOfPathParams_driver_id_or_external_id);
    sprintf(localVarToReplace_driver_id_or_external_id, "%s%s%s", "{", "driver_id_or_external_id", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_driver_id_or_external_id, driver_id_or_external_id);

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
        printf("%s\n","Returns the driver for the given driver_id.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    driver_t *elementToReturn = driver_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_driver_id_or_external_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/drivers/document_types
//
// Fetch all of the document types.
//
list_t*
FleetAPI_getDriverDocumentTypesByOrgId(apiClient_t *apiClient) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/document_types")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/document_types");

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
        printf("%s\n","Returns all of the document types.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/drivers/documents
//
// Fetch all of the documents.
//
list_t*
FleetAPI_getDriverDocumentsByOrgId(apiClient_t *apiClient, char* access_token, long endMs, long durationMs) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/documents")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/documents");


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

    // query parameters
    char *keyQuery_durationMs;
    long valueQuery_durationMs;
    keyValuePair_t *keyPairQuery_durationMs = 0;
    if (durationMs)
    {
    //not string
    keyQuery_durationMs = strdup("durationMs");
    valueQuery_durationMs = durationMs;
    keyPairQuery_durationMs = keyValuePair_create(keyQuery_durationMs, &valueQuery_durationMs);
    list_addElement(localVarQueryParameters,keyPairQuery_durationMs);
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
        printf("%s\n","Returns all of the documents.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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
    free(keyQuery_endMs);
    keyValuePair_free(keyPairQuery_endMs);
    free(keyQuery_durationMs);
    keyValuePair_free(keyPairQuery_durationMs);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/drivers/{driverId:[0-9]+}/safety/score
//
// Fetch the safety score for the driver.
//
driver_safety_score_response_t*
FleetAPI_getDriverSafetyScore(apiClient_t *apiClient, long driverId, char* access_token, long startMs, long endMs) {
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

// /fleet/maintenance/dvirs
//
// Get DVIRs for the org within provided time constraints
//
dvir_list_response_t*
FleetAPI_getDvirs(apiClient_t *apiClient, char* access_token, int end_ms, int duration_ms, int group_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/maintenance/dvirs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/maintenance/dvirs");


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
    char *keyQuery_end_ms;
    int valueQuery_end_ms;
    keyValuePair_t *keyPairQuery_end_ms = 0;
    if (end_ms)
    {
    //not string
    keyQuery_end_ms = strdup("end_ms");
    valueQuery_end_ms = end_ms;
    keyPairQuery_end_ms = keyValuePair_create(keyQuery_end_ms, &valueQuery_end_ms);
    list_addElement(localVarQueryParameters,keyPairQuery_end_ms);
    }

    // query parameters
    char *keyQuery_duration_ms;
    int valueQuery_duration_ms;
    keyValuePair_t *keyPairQuery_duration_ms = 0;
    if (duration_ms)
    {
    //not string
    keyQuery_duration_ms = strdup("duration_ms");
    valueQuery_duration_ms = duration_ms;
    keyPairQuery_duration_ms = keyValuePair_create(keyQuery_duration_ms, &valueQuery_duration_ms);
    list_addElement(localVarQueryParameters,keyPairQuery_duration_ms);
    }

    // query parameters
    char *keyQuery_group_id;
    int valueQuery_group_id;
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
        printf("%s\n","DVIRs for the specified duration.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    dvir_list_response_t *elementToReturn = dvir_list_response_parseFromJSON(apiClient->dataReceived);
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
    free(keyQuery_end_ms);
    keyValuePair_free(keyPairQuery_end_ms);
    free(keyQuery_duration_ms);
    keyValuePair_free(keyPairQuery_duration_ms);
    free(keyQuery_group_id);
    keyValuePair_free(keyPairQuery_group_id);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/drivers
//
// Get all the drivers for the specified group.
//
drivers_response_t*
FleetAPI_getFleetDrivers(apiClient_t *apiClient, char* access_token, inline_object_3_t* groupDriversParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers");


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
    cJSON *localVarSingleItemJSON_groupDriversParam;
    if (groupDriversParam != NULL) {
        //string
        localVarSingleItemJSON_groupDriversParam = groupDriversParam_convertToJSON(groupDriversParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_groupDriversParam);
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
        printf("%s\n","All drivers in the group.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    drivers_response_t *elementToReturn = drivers_response_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_groupDriversParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
//
// Get summarized daily HOS charts for a specified driver.
//
driver_daily_log_response_t*
FleetAPI_getFleetDriversHosDailyLogs(apiClient_t *apiClient, char* access_token, long driver_id, inline_object_6_t* hosLogsParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/{driver_id}/hos_daily_logs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/{driver_id}/hos_daily_logs");


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
    cJSON *localVarSingleItemJSON_hosLogsParam;
    if (hosLogsParam != NULL) {
        //string
        localVarSingleItemJSON_hosLogsParam = hosLogsParam_convertToJSON(hosLogsParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_hosLogsParam);
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
        printf("%s\n","Distance traveled and time active for each driver in the organization over the specified time period.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    driver_daily_log_response_t *elementToReturn = driver_daily_log_response_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_hosLogsParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/drivers/summary
//
// Get the distance and time each driver in an organization has driven in a given time period.
//
drivers_summary_response_t*
FleetAPI_getFleetDriversSummary(apiClient_t *apiClient, char* access_token, inline_object_5_t* driversSummaryParam, int snap_to_day_bounds) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/summary")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/summary");


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
    char *keyQuery_snap_to_day_bounds;
    int valueQuery_snap_to_day_bounds;
    keyValuePair_t *keyPairQuery_snap_to_day_bounds = 0;
    if (snap_to_day_bounds)
    {
    //not string
    keyQuery_snap_to_day_bounds = strdup("snap_to_day_bounds");
    valueQuery_snap_to_day_bounds = snap_to_day_bounds;
    keyPairQuery_snap_to_day_bounds = keyValuePair_create(keyQuery_snap_to_day_bounds, &valueQuery_snap_to_day_bounds);
    list_addElement(localVarQueryParameters,keyPairQuery_snap_to_day_bounds);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_driversSummaryParam;
    if (driversSummaryParam != NULL) {
        //string
        localVarSingleItemJSON_driversSummaryParam = driversSummaryParam_convertToJSON(driversSummaryParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_driversSummaryParam);
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
        printf("%s\n","Distance traveled and time active for each driver in the organization over the specified time period.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    drivers_summary_response_t *elementToReturn = drivers_summary_response_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_driversSummaryParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_snap_to_day_bounds);
    keyValuePair_free(keyPairQuery_snap_to_day_bounds);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/hos_authentication_logs
//
// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
//
hos_authentication_logs_response_t*
FleetAPI_getFleetHosAuthenticationLogs(apiClient_t *apiClient, char* access_token, inline_object_7_t* hosAuthenticationLogsParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/hos_authentication_logs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/hos_authentication_logs");


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
    cJSON *localVarSingleItemJSON_hosAuthenticationLogsParam;
    if (hosAuthenticationLogsParam != NULL) {
        //string
        localVarSingleItemJSON_hosAuthenticationLogsParam = hosAuthenticationLogsParam_convertToJSON(hosAuthenticationLogsParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_hosAuthenticationLogsParam);
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
        printf("%s\n","HOS authentication logs for the specified driver.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    hos_authentication_logs_response_t *elementToReturn = hos_authentication_logs_response_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_hosAuthenticationLogsParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/hos_logs
//
// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
//
hos_logs_response_t*
FleetAPI_getFleetHosLogs(apiClient_t *apiClient, char* access_token, inline_object_8_t* hosLogsParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/hos_logs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/hos_logs");


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
    cJSON *localVarSingleItemJSON_hosLogsParam;
    if (hosLogsParam != NULL) {
        //string
        localVarSingleItemJSON_hosLogsParam = hosLogsParam_convertToJSON(hosLogsParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_hosLogsParam);
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
        printf("%s\n","HOS logs for the specified driver.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    hos_logs_response_t *elementToReturn = hos_logs_response_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_hosLogsParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/hos_logs_summary
//
// Get the current HOS status for all drivers in the group.
//
hos_logs_summary_response_t*
FleetAPI_getFleetHosLogsSummary(apiClient_t *apiClient, char* access_token, inline_object_9_t* hosLogsParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/hos_logs_summary")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/hos_logs_summary");


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
    cJSON *localVarSingleItemJSON_hosLogsParam;
    if (hosLogsParam != NULL) {
        //string
        localVarSingleItemJSON_hosLogsParam = hosLogsParam_convertToJSON(hosLogsParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_hosLogsParam);
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
        printf("%s\n","HOS logs for the specified driver.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    hos_logs_summary_response_t *elementToReturn = hos_logs_summary_response_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_hosLogsParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/locations
//
// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
//
inline_response_200_3_t*
FleetAPI_getFleetLocations(apiClient_t *apiClient, char* access_token, inline_object_11_t* groupParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/locations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/locations");


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
    cJSON *localVarSingleItemJSON_groupParam;
    if (groupParam != NULL) {
        //string
        localVarSingleItemJSON_groupParam = groupParam_convertToJSON(groupParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_groupParam);
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
        printf("%s\n","List of vehicle objects containing their location and the time at which that location was logged.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    inline_response_200_3_t *elementToReturn = inline_response_200_3_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_groupParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/maintenance/list
//
// Get list of the vehicles with any engine faults or check light data.
//
inline_response_200_4_t*
FleetAPI_getFleetMaintenanceList(apiClient_t *apiClient, char* access_token, inline_object_13_t* groupParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/maintenance/list")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/maintenance/list");


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
    cJSON *localVarSingleItemJSON_groupParam;
    if (groupParam != NULL) {
        //string
        localVarSingleItemJSON_groupParam = groupParam_convertToJSON(groupParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_groupParam);
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
        printf("%s\n","List of vehicles and maintenance information about each.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    inline_response_200_4_t *elementToReturn = inline_response_200_4_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_groupParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/trips
//
// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
//
trip_response_t*
FleetAPI_getFleetTrips(apiClient_t *apiClient, char* access_token, inline_object_15_t* tripsParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/trips")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/trips");


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
    cJSON *localVarSingleItemJSON_tripsParam;
    if (tripsParam != NULL) {
        //string
        localVarSingleItemJSON_tripsParam = tripsParam_convertToJSON(tripsParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_tripsParam);
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
        printf("%s\n","List of trips taken by the requested vehicle within the specified timeframe.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    trip_response_t *elementToReturn = trip_response_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_tripsParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Gets a specific vehicle.
//
fleet_vehicle_response_t*
FleetAPI_getFleetVehicle(apiClient_t *apiClient, char* access_token, char* vehicle_id_or_external_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/vehicles/{vehicle_id_or_external_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/vehicles/{vehicle_id_or_external_id}");


    // Path Params
    long sizeOfPathParams_vehicle_id_or_external_id = strlen(vehicle_id_or_external_id)+3 + strlen("{ vehicle_id_or_external_id }");

    if(vehicle_id_or_external_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vehicle_id_or_external_id = malloc(sizeOfPathParams_vehicle_id_or_external_id);
    sprintf(localVarToReplace_vehicle_id_or_external_id, "%s%s%s", "{", "vehicle_id_or_external_id", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_vehicle_id_or_external_id, vehicle_id_or_external_id);

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
        printf("%s\n","The specified vehicle.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    fleet_vehicle_response_t *elementToReturn = fleet_vehicle_response_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_vehicle_id_or_external_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /addresses/{addressId}
//
// Fetch an address by its id.
//
address_t*
FleetAPI_getOrganizationAddress(apiClient_t *apiClient, char* access_token, long addressId) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/addresses/{addressId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/addresses/{addressId}");


    // Path Params
    long sizeOfPathParams_addressId = sizeof(addressId)+3 + strlen("{ addressId }");

    if(addressId == 0){
        goto end;
    }
    char* localVarToReplace_addressId = malloc(sizeOfPathParams_addressId);
    snprintf(localVarToReplace_addressId, sizeOfPathParams_addressId, "%s%s%s", "{", "addressId", "}");

    char localVarBuff_addressId[256];
    intToStr(localVarBuff_addressId, addressId);

    localVarPath = strReplace(localVarPath, localVarToReplace_addressId, localVarBuff_addressId);


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
        printf("%s\n","The address/geofence. The geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    address_t *elementToReturn = address_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_addressId);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /addresses
//
// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
//
list_t*
FleetAPI_getOrganizationAddresses(apiClient_t *apiClient, char* access_token) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/addresses")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/addresses");


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
        printf("%s\n","List of addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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
    return elementToReturn;
end:
    return NULL;

}

// /contacts/{contact_id}
//
// Fetch a contact by its id.
//
contact_t*
FleetAPI_getOrganizationContact(apiClient_t *apiClient, char* access_token, long contact_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/contacts/{contact_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/contacts/{contact_id}");


    // Path Params
    long sizeOfPathParams_contact_id = sizeof(contact_id)+3 + strlen("{ contact_id }");

    if(contact_id == 0){
        goto end;
    }
    char* localVarToReplace_contact_id = malloc(sizeOfPathParams_contact_id);
    snprintf(localVarToReplace_contact_id, sizeOfPathParams_contact_id, "%s%s%s", "{", "contact_id", "}");

    char localVarBuff_contact_id[256];
    intToStr(localVarBuff_contact_id, contact_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_contact_id, localVarBuff_contact_id);


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
        printf("%s\n","The contact.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    contact_t *elementToReturn = contact_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_contact_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
//
// Fetch harsh event details for a vehicle.
//
vehicle_harsh_event_response_t*
FleetAPI_getVehicleHarshEvent(apiClient_t *apiClient, long vehicleId, char* access_token, long timestamp) {
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

// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
//
// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
//
list_t*
FleetAPI_getVehicleLocations(apiClient_t *apiClient, char* access_token, long vehicle_id, long startMs, long endMs) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/vehicles/{vehicle_id}/locations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/vehicles/{vehicle_id}/locations");


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
        printf("%s\n","Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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
    free(keyQuery_startMs);
    keyValuePair_free(keyPairQuery_startMs);
    free(keyQuery_endMs);
    keyValuePair_free(keyPairQuery_endMs);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
//
// Fetch the safety score for the vehicle.
//
vehicle_safety_score_response_t*
FleetAPI_getVehicleSafetyScore(apiClient_t *apiClient, long vehicleId, char* access_token, long startMs, long endMs) {
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

// /fleet/vehicles/stats
//
// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
//
inline_response_200_5_t*
FleetAPI_getVehicleStats(apiClient_t *apiClient, char* access_token, int startMs, int endMs, char* series, char* tagIds, char* startingAfter, char* endingBefore, long limit) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/vehicles/stats")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/vehicles/stats");


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
    int valueQuery_startMs;
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
    int valueQuery_endMs;
    keyValuePair_t *keyPairQuery_endMs = 0;
    if (endMs)
    {
    //not string
    keyQuery_endMs = strdup("endMs");
    valueQuery_endMs = endMs;
    keyPairQuery_endMs = keyValuePair_create(keyQuery_endMs, &valueQuery_endMs);
    list_addElement(localVarQueryParameters,keyPairQuery_endMs);
    }

    // query parameters
    char *keyQuery_series;
    char *valueQuery_series;
    keyValuePair_t *keyPairQuery_series = 0;
    if (series)
    {
    //string
    keyQuery_series = strdup("series");
    valueQuery_series = strdup(series);
    keyPairQuery_series = keyValuePair_create(keyQuery_series, valueQuery_series);
    list_addElement(localVarQueryParameters,keyPairQuery_series);
    }

    // query parameters
    char *keyQuery_tagIds;
    char *valueQuery_tagIds;
    keyValuePair_t *keyPairQuery_tagIds = 0;
    if (tagIds)
    {
    //string
    keyQuery_tagIds = strdup("tagIds");
    valueQuery_tagIds = strdup(tagIds);
    keyPairQuery_tagIds = keyValuePair_create(keyQuery_tagIds, valueQuery_tagIds);
    list_addElement(localVarQueryParameters,keyPairQuery_tagIds);
    }

    // query parameters
    char *keyQuery_startingAfter;
    char *valueQuery_startingAfter;
    keyValuePair_t *keyPairQuery_startingAfter = 0;
    if (startingAfter)
    {
    //string
    keyQuery_startingAfter = strdup("startingAfter");
    valueQuery_startingAfter = strdup(startingAfter);
    keyPairQuery_startingAfter = keyValuePair_create(keyQuery_startingAfter, valueQuery_startingAfter);
    list_addElement(localVarQueryParameters,keyPairQuery_startingAfter);
    }

    // query parameters
    char *keyQuery_endingBefore;
    char *valueQuery_endingBefore;
    keyValuePair_t *keyPairQuery_endingBefore = 0;
    if (endingBefore)
    {
    //string
    keyQuery_endingBefore = strdup("endingBefore");
    valueQuery_endingBefore = strdup(endingBefore);
    keyPairQuery_endingBefore = keyValuePair_create(keyQuery_endingBefore, valueQuery_endingBefore);
    list_addElement(localVarQueryParameters,keyPairQuery_endingBefore);
    }

    // query parameters
    char *keyQuery_limit;
    long valueQuery_limit;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
    //not string
    keyQuery_limit = strdup("limit");
    valueQuery_limit = limit;
    keyPairQuery_limit = keyValuePair_create(keyQuery_limit, &valueQuery_limit);
    list_addElement(localVarQueryParameters,keyPairQuery_limit);
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
        printf("%s\n","Returns engine state and/or aux input data for all vehicles in the group between a start/end time.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    inline_response_200_5_t *elementToReturn = inline_response_200_5_parseFromJSON(apiClient->dataReceived);
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
    free(keyQuery_startMs);
    keyValuePair_free(keyPairQuery_startMs);
    free(keyQuery_endMs);
    keyValuePair_free(keyPairQuery_endMs);
    free(keyQuery_series);
    free(valueQuery_series);
    keyValuePair_free(keyPairQuery_series);
    free(keyQuery_tagIds);
    free(valueQuery_tagIds);
    keyValuePair_free(keyPairQuery_tagIds);
    free(keyQuery_startingAfter);
    free(valueQuery_startingAfter);
    keyValuePair_free(keyPairQuery_startingAfter);
    free(keyQuery_endingBefore);
    free(valueQuery_endingBefore);
    keyValuePair_free(keyPairQuery_endingBefore);
    free(keyQuery_limit);
    keyValuePair_free(keyPairQuery_limit);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/vehicles/locations
//
// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
//
list_t*
FleetAPI_getVehiclesLocations(apiClient_t *apiClient, char* access_token, int startMs, int endMs) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/vehicles/locations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/vehicles/locations");


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
    int valueQuery_startMs;
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
    int valueQuery_endMs;
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
        printf("%s\n","Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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
    free(keyQuery_startMs);
    keyValuePair_free(keyPairQuery_startMs);
    free(keyQuery_endMs);
    keyValuePair_free(keyPairQuery_endMs);
    return elementToReturn;
end:
    return NULL;

}

// /contacts
//
// Fetch all contacts for the organization.
//
list_t*
FleetAPI_listContacts(apiClient_t *apiClient, char* access_token) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/contacts")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/contacts");


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
        printf("%s\n","List of contacts.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    cJSON *FleetAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(FleetAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, FleetAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( FleetAPIlocalVarJSON);
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
    return elementToReturn;
end:
    return NULL;

}

// /fleet/list
//
// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
//
inline_response_200_2_t*
FleetAPI_listFleet(apiClient_t *apiClient, char* access_token, inline_object_10_t* groupParam, char* startingAfter, char* endingBefore, long limit) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/list")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/list");


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
    char *keyQuery_startingAfter;
    char *valueQuery_startingAfter;
    keyValuePair_t *keyPairQuery_startingAfter = 0;
    if (startingAfter)
    {
    //string
    keyQuery_startingAfter = strdup("startingAfter");
    valueQuery_startingAfter = strdup(startingAfter);
    keyPairQuery_startingAfter = keyValuePair_create(keyQuery_startingAfter, valueQuery_startingAfter);
    list_addElement(localVarQueryParameters,keyPairQuery_startingAfter);
    }

    // query parameters
    char *keyQuery_endingBefore;
    char *valueQuery_endingBefore;
    keyValuePair_t *keyPairQuery_endingBefore = 0;
    if (endingBefore)
    {
    //string
    keyQuery_endingBefore = strdup("endingBefore");
    valueQuery_endingBefore = strdup(endingBefore);
    keyPairQuery_endingBefore = keyValuePair_create(keyQuery_endingBefore, valueQuery_endingBefore);
    list_addElement(localVarQueryParameters,keyPairQuery_endingBefore);
    }

    // query parameters
    char *keyQuery_limit;
    long valueQuery_limit;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
    //not string
    keyQuery_limit = strdup("limit");
    valueQuery_limit = limit;
    keyPairQuery_limit = keyValuePair_create(keyQuery_limit, &valueQuery_limit);
    list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_groupParam;
    if (groupParam != NULL) {
        //string
        localVarSingleItemJSON_groupParam = groupParam_convertToJSON(groupParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_groupParam);
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
        printf("%s\n","List of vehicles and information about each.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    inline_response_200_2_t *elementToReturn = inline_response_200_2_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_groupParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_startingAfter);
    free(valueQuery_startingAfter);
    keyValuePair_free(keyPairQuery_startingAfter);
    free(keyQuery_endingBefore);
    free(valueQuery_endingBefore);
    keyValuePair_free(keyPairQuery_endingBefore);
    free(keyQuery_limit);
    keyValuePair_free(keyPairQuery_limit);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
//
fleet_vehicle_response_t*
FleetAPI_patchFleetVehicle(apiClient_t *apiClient, char* access_token, char* vehicle_id_or_external_id, inline_object_16_t* data) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/vehicles/{vehicle_id_or_external_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/vehicles/{vehicle_id_or_external_id}");


    // Path Params
    long sizeOfPathParams_vehicle_id_or_external_id = strlen(vehicle_id_or_external_id)+3 + strlen("{ vehicle_id_or_external_id }");

    if(vehicle_id_or_external_id == NULL) {
        goto end;
    }
    char* localVarToReplace_vehicle_id_or_external_id = malloc(sizeOfPathParams_vehicle_id_or_external_id);
    sprintf(localVarToReplace_vehicle_id_or_external_id, "%s%s%s", "{", "vehicle_id_or_external_id", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_vehicle_id_or_external_id, vehicle_id_or_external_id);

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
    cJSON *localVarSingleItemJSON_data;
    if (data != NULL) {
        //string
        localVarSingleItemJSON_data = data_convertToJSON(data);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_data);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    list_addElement(localVarContentType,"application/merge-patch+json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "PATCH");

    if (apiClient->response_code == 200) {
        printf("%s\n","The updated vehicle.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    fleet_vehicle_response_t *elementToReturn = fleet_vehicle_response_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_vehicle_id_or_external_id);
    cJSON_Delete(localVarSingleItemJSON_data);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Reactivate the inactive driver having id.
//
driver_t*
FleetAPI_reactivateDriverById(apiClient_t *apiClient, char* access_token, char* driver_id_or_external_id, inline_object_4_t* reactivateDriverParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/drivers/inactive/{driver_id_or_external_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/drivers/inactive/{driver_id_or_external_id}");


    // Path Params
    long sizeOfPathParams_driver_id_or_external_id = strlen(driver_id_or_external_id)+3 + strlen("{ driver_id_or_external_id }");

    if(driver_id_or_external_id == NULL) {
        goto end;
    }
    char* localVarToReplace_driver_id_or_external_id = malloc(sizeOfPathParams_driver_id_or_external_id);
    sprintf(localVarToReplace_driver_id_or_external_id, "%s%s%s", "{", "driver_id_or_external_id", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_driver_id_or_external_id, driver_id_or_external_id);

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
    cJSON *localVarSingleItemJSON_reactivateDriverParam;
    if (reactivateDriverParam != NULL) {
        //string
        localVarSingleItemJSON_reactivateDriverParam = reactivateDriverParam_convertToJSON(reactivateDriverParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_reactivateDriverParam);
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
        printf("%s\n","Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    driver_t *elementToReturn = driver_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_driver_id_or_external_id);
    cJSON_Delete(localVarSingleItemJSON_reactivateDriverParam);
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
// Update a dispatch route and its associated jobs.
//
dispatch_route_t*
FleetAPI_updateDispatchRouteById(apiClient_t *apiClient, char* access_token, long route_id, dispatch_route_t* updateDispatchRouteParams) {
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

// /addresses/{addressId}
//
// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
//
void
FleetAPI_updateOrganizationAddress(apiClient_t *apiClient, char* access_token, long addressId, inline_object_1_t* address) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/addresses/{addressId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/addresses/{addressId}");


    // Path Params
    long sizeOfPathParams_addressId = sizeof(addressId)+3 + strlen("{ addressId }");

    if(addressId == 0){
        goto end;
    }
    char* localVarToReplace_addressId = malloc(sizeOfPathParams_addressId);
    snprintf(localVarToReplace_addressId, sizeOfPathParams_addressId, "%s%s%s", "{", "addressId", "}");

    char localVarBuff_addressId[256];
    intToStr(localVarBuff_addressId, addressId);

    localVarPath = strReplace(localVarPath, localVarToReplace_addressId, localVarBuff_addressId);


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
    cJSON *localVarSingleItemJSON_address;
    if (address != NULL) {
        //string
        localVarSingleItemJSON_address = address_convertToJSON(address);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_address);
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
                    "PATCH");

    if (apiClient->response_code == 200) {
        printf("%s\n","Address was successfully updated. No response body is returned.");
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
    list_free(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_addressId);
    cJSON_Delete(localVarSingleItemJSON_address);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);

}

// /fleet/set_data
//
// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
//
void
FleetAPI_updateVehicles(apiClient_t *apiClient, char* access_token, inline_object_14_t* vehicleUpdateParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/fleet/set_data")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/fleet/set_data");


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
    cJSON *localVarSingleItemJSON_vehicleUpdateParam;
    if (vehicleUpdateParam != NULL) {
        //string
        localVarSingleItemJSON_vehicleUpdateParam = vehicleUpdateParam_convertToJSON(vehicleUpdateParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_vehicleUpdateParam);
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
        printf("%s\n","Vehicles were successfully updated. No response body is returned.");
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
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_vehicleUpdateParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);

}


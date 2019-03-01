#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "DriversAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// /fleet/drivers/create
//
// Create a new driver.
//
driver_t*
DriversAPI_createDriver(apiClient_t *apiClient, char* access_token, driver_for_create_t* createDriverParam) {
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

// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Deactivate a driver with the given id.
//
void
DriversAPI_deactivateDriver(apiClient_t *apiClient, char* access_token, char* driver_id_or_external_id) {
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

// /fleet/drivers/inactive
//
// Fetch all deactivated drivers for the group.
//
list_t*
DriversAPI_getAllDeactivatedDrivers(apiClient_t *apiClient, char* access_token, long group_id) {
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
    cJSON *DriversAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(DriversAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, DriversAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( DriversAPIlocalVarJSON);
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

// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Fetch deactivated driver by id.
//
driver_t*
DriversAPI_getDeactivatedDriverById(apiClient_t *apiClient, char* access_token, char* driver_id_or_external_id) {
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

// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Fetch driver by id.
//
driver_t*
DriversAPI_getDriverById(apiClient_t *apiClient, char* access_token, char* driver_id_or_external_id) {
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

// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Reactivate the inactive driver having id.
//
driver_t*
DriversAPI_reactivateDriverById(apiClient_t *apiClient, char* access_token, char* driver_id_or_external_id, inline_object_4_t* reactivateDriverParam) {
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


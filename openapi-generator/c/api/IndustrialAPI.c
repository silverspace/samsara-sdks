#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "IndustrialAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// /industrial/data
//
// Fetch all of the data inputs for a group.
//
inline_response_200_6_t*
IndustrialAPI_getAllDataInputs(apiClient_t *apiClient, char* access_token, long group_id, long startMs, long endMs) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/industrial/data")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/industrial/data");


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
        printf("%s\n","List of data inputs.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    inline_response_200_6_t *elementToReturn = inline_response_200_6_parseFromJSON(apiClient->dataReceived);
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
    free(keyQuery_startMs);
    keyValuePair_free(keyPairQuery_startMs);
    free(keyQuery_endMs);
    keyValuePair_free(keyPairQuery_endMs);
    return elementToReturn;
end:
    return NULL;

}

// /industrial/data/{data_input_id:[0-9]+}
//
// Fetch datapoints from a given data input.
//
data_input_history_response_t*
IndustrialAPI_getDataInput(apiClient_t *apiClient, char* access_token, long data_input_id, long startMs, long endMs) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/industrial/data/{data_input_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/industrial/data/{data_input_id}");


    // Path Params
    long sizeOfPathParams_data_input_id = sizeof(data_input_id)+3 + strlen("{ data_input_id }");

    if(data_input_id == 0){
        goto end;
    }
    char* localVarToReplace_data_input_id = malloc(sizeOfPathParams_data_input_id);
    snprintf(localVarToReplace_data_input_id, sizeOfPathParams_data_input_id, "%s%s%s", "{", "data_input_id", "}");

    char localVarBuff_data_input_id[256];
    intToStr(localVarBuff_data_input_id, data_input_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_data_input_id, localVarBuff_data_input_id);


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
        printf("%s\n","Returns datapoints for the given data input");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    data_input_history_response_t *elementToReturn = data_input_history_response_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_data_input_id);
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

// /machines/list
//
// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
//
inline_response_200_7_t*
IndustrialAPI_getMachines(apiClient_t *apiClient, char* access_token, inline_object_18_t* groupParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/machines/list")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/machines/list");


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
        printf("%s\n","List of machine objects.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    inline_response_200_7_t *elementToReturn = inline_response_200_7_parseFromJSON(apiClient->dataReceived);
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

// /machines/history
//
// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
//
machine_history_response_t*
IndustrialAPI_getMachinesHistory(apiClient_t *apiClient, char* access_token, inline_object_17_t* historyParam) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/machines/history")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/machines/history");


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
    cJSON *localVarSingleItemJSON_historyParam;
    if (historyParam != NULL) {
        //string
        localVarSingleItemJSON_historyParam = historyParam_convertToJSON(historyParam);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_historyParam);
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
        printf("%s\n","List of machine results objects, each containing a time and a datapoint.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    machine_history_response_t *elementToReturn = machine_history_response_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_historyParam);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}


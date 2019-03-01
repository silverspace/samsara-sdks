#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "TagsAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// /tags
//
// Create a new tag for the group.
//
tag_t*
TagsAPI_createTag(apiClient_t *apiClient, char* access_token, tag_create_t* tagCreateParams) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/tags")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/tags");


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
    cJSON *localVarSingleItemJSON_tagCreateParams;
    if (tagCreateParams != NULL) {
        //string
        localVarSingleItemJSON_tagCreateParams = tagCreateParams_convertToJSON(tagCreateParams);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_tagCreateParams);
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
        printf("%s\n","Newly created tag object, including the new tag ID.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    tag_t *elementToReturn = tag_parseFromJSON(apiClient->dataReceived);
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
    cJSON_Delete(localVarSingleItemJSON_tagCreateParams);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /tags/{tag_id:[0-9]+}
//
// Permanently deletes a tag.
//
void
TagsAPI_deleteTagById(apiClient_t *apiClient, char* access_token, long tag_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/tags/{tag_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/tags/{tag_id}");


    // Path Params
    long sizeOfPathParams_tag_id = sizeof(tag_id)+3 + strlen("{ tag_id }");

    if(tag_id == 0){
        goto end;
    }
    char* localVarToReplace_tag_id = malloc(sizeOfPathParams_tag_id);
    snprintf(localVarToReplace_tag_id, sizeOfPathParams_tag_id, "%s%s%s", "{", "tag_id", "}");

    char localVarBuff_tag_id[256];
    intToStr(localVarBuff_tag_id, tag_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_tag_id, localVarBuff_tag_id);


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
        printf("%s\n","Successfully deleted the tag. No response body is returned.");
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
    free(localVarToReplace_tag_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    free(keyQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);

}

// /tags
//
// Fetch all of the tags for a group.
//
inline_response_200_9_t*
TagsAPI_getAllTags(apiClient_t *apiClient, char* access_token, long group_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/tags")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/tags");


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
        printf("%s\n","List of tags.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    inline_response_200_9_t *elementToReturn = inline_response_200_9_parseFromJSON(apiClient->dataReceived);
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

// /tags/{tag_id:[0-9]+}
//
// Fetch a tag by id.
//
tag_t*
TagsAPI_getTagById(apiClient_t *apiClient, char* access_token, long tag_id) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/tags/{tag_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/tags/{tag_id}");


    // Path Params
    long sizeOfPathParams_tag_id = sizeof(tag_id)+3 + strlen("{ tag_id }");

    if(tag_id == 0){
        goto end;
    }
    char* localVarToReplace_tag_id = malloc(sizeOfPathParams_tag_id);
    snprintf(localVarToReplace_tag_id, sizeOfPathParams_tag_id, "%s%s%s", "{", "tag_id", "}");

    char localVarBuff_tag_id[256];
    intToStr(localVarBuff_tag_id, tag_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_tag_id, localVarBuff_tag_id);


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
        printf("%s\n","The tag corresponding to tag_id.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    tag_t *elementToReturn = tag_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_tag_id);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /tags/{tag_id:[0-9]+}
//
// Add or delete specific members from a tag, or modify the name of a tag.
//
tag_t*
TagsAPI_modifyTagById(apiClient_t *apiClient, char* access_token, long tag_id, tag_modify_t* tagModifyParams) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/tags/{tag_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/tags/{tag_id}");


    // Path Params
    long sizeOfPathParams_tag_id = sizeof(tag_id)+3 + strlen("{ tag_id }");

    if(tag_id == 0){
        goto end;
    }
    char* localVarToReplace_tag_id = malloc(sizeOfPathParams_tag_id);
    snprintf(localVarToReplace_tag_id, sizeOfPathParams_tag_id, "%s%s%s", "{", "tag_id", "}");

    char localVarBuff_tag_id[256];
    intToStr(localVarBuff_tag_id, tag_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_tag_id, localVarBuff_tag_id);


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
    cJSON *localVarSingleItemJSON_tagModifyParams;
    if (tagModifyParams != NULL) {
        //string
        localVarSingleItemJSON_tagModifyParams = tagModifyParams_convertToJSON(tagModifyParams);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_tagModifyParams);
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
        printf("%s\n","The updated tag data.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    tag_t *elementToReturn = tag_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_tag_id);
    cJSON_Delete(localVarSingleItemJSON_tagModifyParams);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}

// /tags/{tag_id:[0-9]+}
//
// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
//
tag_t*
TagsAPI_updateTagById(apiClient_t *apiClient, char* access_token, long tag_id, tag_update_t* updateTagParams) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/tags/{tag_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/tags/{tag_id}");


    // Path Params
    long sizeOfPathParams_tag_id = sizeof(tag_id)+3 + strlen("{ tag_id }");

    if(tag_id == 0){
        goto end;
    }
    char* localVarToReplace_tag_id = malloc(sizeOfPathParams_tag_id);
    snprintf(localVarToReplace_tag_id, sizeOfPathParams_tag_id, "%s%s%s", "{", "tag_id", "}");

    char localVarBuff_tag_id[256];
    intToStr(localVarBuff_tag_id, tag_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_tag_id, localVarBuff_tag_id);


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
    cJSON *localVarSingleItemJSON_updateTagParams;
    if (updateTagParams != NULL) {
        //string
        localVarSingleItemJSON_updateTagParams = updateTagParams_convertToJSON(updateTagParams);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_updateTagParams);
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
        printf("%s\n","The updated tag data.");
    }
    if (apiClient->response_code == 0) {
        printf("%s\n","Unexpected error.");
    }
    //nonprimitive not container
    tag_t *elementToReturn = tag_parseFromJSON(apiClient->dataReceived);
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
    free(localVarToReplace_tag_id);
    cJSON_Delete(localVarSingleItemJSON_updateTagParams);
    free(localVarBodyParameters);
    free(keyQuery_access_token);
    free(valueQuery_access_token);
    keyValuePair_free(keyPairQuery_access_token);
    return elementToReturn;
end:
    return NULL;

}


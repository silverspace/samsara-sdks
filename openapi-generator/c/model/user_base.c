#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_base.h"


char* authTypeuser_base_ToString(authType_e authType){
    char *authTypeArray[] =  { "default","saml" };
    return authTypeArray[authType];

}

authType_e authTypeuser_base_FromString(char* authType){
    int stringToReturn = 0;
    char *authTypeArray[] =  { "default","saml" };
    size_t sizeofArray = sizeof(authTypeArray) / sizeof(authTypeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(authType, authTypeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
}

user_base_t *user_base_create(
    authType_e authType,
    char *email,
    char *name,
    char *organizationRoleId
    ) {
	user_base_t *user_base = malloc(sizeof(user_base_t));
	user_base->authType = authType;
	user_base->email = email;
	user_base->name = name;
	user_base->organizationRoleId = organizationRoleId;

	return user_base;
}


void user_base_free(user_base_t *user_base) {
    listEntry_t *listEntry;
    free(user_base->email);
    free(user_base->name);
    free(user_base->organizationRoleId);

	free(user_base);
}

cJSON *user_base_convertToJSON(user_base_t *user_base) {
	cJSON *item = cJSON_CreateObject();
	// user_base->authType
    if(cJSON_AddStringToObject(item, "authType", authTypeuser_base_ToString(user_base->authType)) == NULL) {
    goto fail; //String
    }

	// user_base->email
    if(cJSON_AddStringToObject(item, "email", user_base->email) == NULL) {
    goto fail; //String
    }

	// user_base->name
    if(cJSON_AddStringToObject(item, "name", user_base->name) == NULL) {
    goto fail; //String
    }

	// user_base->organizationRoleId
    if(cJSON_AddStringToObject(item, "organizationRoleId", user_base->organizationRoleId) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

user_base_t *user_base_parseFromJSON(char *jsonString){

    user_base_t *user_base = NULL;
    cJSON *user_baseJSON = cJSON_Parse(jsonString);
    if(user_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // user_base->authType
    authType_e authTypeVariable;
    cJSON *authType = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "authType");
    if(!cJSON_IsString(authType) || (authType->valuestring == NULL)){
    goto end; //String
    }

    authTypeVariable = authTypeuser_base_FromString(authType->valuestring);

    // user_base->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "email");
    if(!cJSON_IsString(email) || (email->valuestring == NULL)){
    goto end; //String
    }

    // user_base->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // user_base->organizationRoleId
    cJSON *organizationRoleId = cJSON_GetObjectItemCaseSensitive(user_baseJSON, "organizationRoleId");
    if(!cJSON_IsString(organizationRoleId) || (organizationRoleId->valuestring == NULL)){
    goto end; //String
    }


    user_base = user_base_create (
        authTypeVariable,
        strdup(email->valuestring),
        strdup(name->valuestring),
        strdup(organizationRoleId->valuestring)
        );
 cJSON_Delete(user_baseJSON);
    return user_base;
end:
    cJSON_Delete(user_baseJSON);
    return NULL;

}


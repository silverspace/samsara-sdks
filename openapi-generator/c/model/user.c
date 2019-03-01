#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user.h"


char* authTypeuser_ToString(authType_e authType){
    char *authTypeArray[] =  { "default","saml" };
    return authTypeArray[authType];

}

authType_e authTypeuser_FromString(char* authType){
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

user_t *user_create(
    authType_e authType,
    char *email,
    char *name,
    char *organizationRoleId,
    long id,
    char *organizationRole,
    list_t *tagRoles
    ) {
	user_t *user = malloc(sizeof(user_t));
	user->authType = authType;
	user->email = email;
	user->name = name;
	user->organizationRoleId = organizationRoleId;
	user->id = id;
	user->organizationRole = organizationRole;
	user->tagRoles = tagRoles;

	return user;
}


void user_free(user_t *user) {
    listEntry_t *listEntry;
    free(user->email);
    free(user->name);
    free(user->organizationRoleId);
    free(user->organizationRole);
		list_ForEach(listEntry, user->tagRoles) {
		user_tag_role_free(listEntry->data);
	}
	list_free(user->tagRoles);

	free(user);
}

cJSON *user_convertToJSON(user_t *user) {
	cJSON *item = cJSON_CreateObject();
	// user->authType
    if(cJSON_AddStringToObject(item, "authType", authTypeuser_ToString(user->authType)) == NULL) {
    goto fail; //String
    }

	// user->email
    if(cJSON_AddStringToObject(item, "email", user->email) == NULL) {
    goto fail; //String
    }

	// user->name
    if(cJSON_AddStringToObject(item, "name", user->name) == NULL) {
    goto fail; //String
    }

	// user->organizationRoleId
    if(cJSON_AddStringToObject(item, "organizationRoleId", user->organizationRoleId) == NULL) {
    goto fail; //String
    }

	// user->id
    if(cJSON_AddNumberToObject(item, "id", user->id) == NULL) {
    goto fail; //Numeric
    }

	// user->organizationRole
    if(cJSON_AddStringToObject(item, "organizationRole", user->organizationRole) == NULL) {
    goto fail; //String
    }

	// user->tagRoles
    cJSON *tagRoles = cJSON_AddArrayToObject(item, "tagRoles");
	if(tagRoles == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *tagRolesListEntry;
	list_ForEach(tagRolesListEntry, user->tagRoles) {
		cJSON *item = user_tag_role_convertToJSON(tagRolesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(tagRoles, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

user_t *user_parseFromJSON(char *jsonString){

    user_t *user = NULL;
    cJSON *userJSON = cJSON_Parse(jsonString);
    if(userJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // user->authType
    authType_e authTypeVariable;
    cJSON *authType = cJSON_GetObjectItemCaseSensitive(userJSON, "authType");
    if(!cJSON_IsString(authType) || (authType->valuestring == NULL)){
    goto end; //String
    }

    authTypeVariable = authTypeuser_FromString(authType->valuestring);

    // user->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(userJSON, "email");
    if(!cJSON_IsString(email) || (email->valuestring == NULL)){
    goto end; //String
    }

    // user->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(userJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // user->organizationRoleId
    cJSON *organizationRoleId = cJSON_GetObjectItemCaseSensitive(userJSON, "organizationRoleId");
    if(!cJSON_IsString(organizationRoleId) || (organizationRoleId->valuestring == NULL)){
    goto end; //String
    }

    // user->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(userJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // user->organizationRole
    cJSON *organizationRole = cJSON_GetObjectItemCaseSensitive(userJSON, "organizationRole");
    if(!cJSON_IsString(organizationRole) || (organizationRole->valuestring == NULL)){
    goto end; //String
    }

    // user->tagRoles
    cJSON *tagRoles;
    cJSON *tagRolesJSON = cJSON_GetObjectItemCaseSensitive(userJSON,"tagRoles");
    if(!cJSON_IsArray(tagRolesJSON)){
        goto end; //nonprimitive container
    }

    list_t *tagRolesList = list_create();

    cJSON_ArrayForEach(tagRoles,tagRolesJSON )
    {
        if(!cJSON_IsObject(tagRoles)){
            goto end;
        }
		char *JSONData = cJSON_Print(tagRoles);
        user_tag_role_t *tagRolesItem = user_tag_role_parseFromJSON(JSONData);

        list_addElement(tagRolesList, tagRolesItem);
        free(JSONData);
    }


    user = user_create (
        authTypeVariable,
        strdup(email->valuestring),
        strdup(name->valuestring),
        strdup(organizationRoleId->valuestring),
        id->valuedouble,
        strdup(organizationRole->valuestring),
        tagRolesList
        );
 cJSON_Delete(userJSON);
    return user;
end:
    cJSON_Delete(userJSON);
    return NULL;

}


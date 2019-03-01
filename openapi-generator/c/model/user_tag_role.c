#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_tag_role.h"



user_tag_role_t *user_tag_role_create(
    char *role,
    char *roleId,
    user_tag_role_tag_t *tag
    ) {
	user_tag_role_t *user_tag_role = malloc(sizeof(user_tag_role_t));
	user_tag_role->role = role;
	user_tag_role->roleId = roleId;
	user_tag_role->tag = tag;

	return user_tag_role;
}


void user_tag_role_free(user_tag_role_t *user_tag_role) {
    listEntry_t *listEntry;
    free(user_tag_role->role);
    free(user_tag_role->roleId);
	user_tag_role_tag_free(user_tag_role->tag);

	free(user_tag_role);
}

cJSON *user_tag_role_convertToJSON(user_tag_role_t *user_tag_role) {
	cJSON *item = cJSON_CreateObject();
	// user_tag_role->role
    if(cJSON_AddStringToObject(item, "role", user_tag_role->role) == NULL) {
    goto fail; //String
    }

	// user_tag_role->roleId
    if(cJSON_AddStringToObject(item, "roleId", user_tag_role->roleId) == NULL) {
    goto fail; //String
    }

	// user_tag_role->tag
	cJSON *tag = user_tag_role_tag_convertToJSON(user_tag_role->tag);
	if(tag == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "tag", tag);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

user_tag_role_t *user_tag_role_parseFromJSON(char *jsonString){

    user_tag_role_t *user_tag_role = NULL;
    cJSON *user_tag_roleJSON = cJSON_Parse(jsonString);
    if(user_tag_roleJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // user_tag_role->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(user_tag_roleJSON, "role");
    if(!cJSON_IsString(role) || (role->valuestring == NULL)){
    goto end; //String
    }

    // user_tag_role->roleId
    cJSON *roleId = cJSON_GetObjectItemCaseSensitive(user_tag_roleJSON, "roleId");
    if(!cJSON_IsString(roleId) || (roleId->valuestring == NULL)){
    goto end; //String
    }

    // user_tag_role->tag
    user_tag_role_tag_t *tag;
    cJSON *tagJSON = cJSON_GetObjectItemCaseSensitive(user_tag_roleJSON, "tag");
    if(user_tag_roleJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *tagJSONData = cJSON_Print(tagJSON);
    tag = user_tag_role_tag_parseFromJSON(tagJSONData);


    user_tag_role = user_tag_role_create (
        strdup(role->valuestring),
        strdup(roleId->valuestring),
        tag
        );
        free(tagJSONData);
 cJSON_Delete(user_tag_roleJSON);
    return user_tag_role;
end:
    cJSON_Delete(user_tag_roleJSON);
    return NULL;

}


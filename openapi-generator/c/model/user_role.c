#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_role.h"



user_role_t *user_role_create(
    char *id,
    char *name
    ) {
	user_role_t *user_role = malloc(sizeof(user_role_t));
	user_role->id = id;
	user_role->name = name;

	return user_role;
}


void user_role_free(user_role_t *user_role) {
    listEntry_t *listEntry;
    free(user_role->id);
    free(user_role->name);

	free(user_role);
}

cJSON *user_role_convertToJSON(user_role_t *user_role) {
	cJSON *item = cJSON_CreateObject();
	// user_role->id
    if(cJSON_AddStringToObject(item, "id", user_role->id) == NULL) {
    goto fail; //String
    }

	// user_role->name
    if(cJSON_AddStringToObject(item, "name", user_role->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

user_role_t *user_role_parseFromJSON(char *jsonString){

    user_role_t *user_role = NULL;
    cJSON *user_roleJSON = cJSON_Parse(jsonString);
    if(user_roleJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // user_role->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(user_roleJSON, "id");
    if(!cJSON_IsString(id) || (id->valuestring == NULL)){
    goto end; //String
    }

    // user_role->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(user_roleJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    user_role = user_role_create (
        strdup(id->valuestring),
        strdup(name->valuestring)
        );
 cJSON_Delete(user_roleJSON);
    return user_role;
end:
    cJSON_Delete(user_roleJSON);
    return NULL;

}


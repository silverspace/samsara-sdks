#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_tag_role_tag.h"



user_tag_role_tag_t *user_tag_role_tag_create(
    long parentTagId,
    char *name,
    long id
    ) {
	user_tag_role_tag_t *user_tag_role_tag = malloc(sizeof(user_tag_role_tag_t));
	user_tag_role_tag->parentTagId = parentTagId;
	user_tag_role_tag->name = name;
	user_tag_role_tag->id = id;

	return user_tag_role_tag;
}


void user_tag_role_tag_free(user_tag_role_tag_t *user_tag_role_tag) {
    listEntry_t *listEntry;
    free(user_tag_role_tag->name);

	free(user_tag_role_tag);
}

cJSON *user_tag_role_tag_convertToJSON(user_tag_role_tag_t *user_tag_role_tag) {
	cJSON *item = cJSON_CreateObject();
	// user_tag_role_tag->parentTagId
    if(cJSON_AddNumberToObject(item, "parentTagId", user_tag_role_tag->parentTagId) == NULL) {
    goto fail; //Numeric
    }

	// user_tag_role_tag->name
    if(cJSON_AddStringToObject(item, "name", user_tag_role_tag->name) == NULL) {
    goto fail; //String
    }

	// user_tag_role_tag->id
    if(cJSON_AddNumberToObject(item, "id", user_tag_role_tag->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

user_tag_role_tag_t *user_tag_role_tag_parseFromJSON(char *jsonString){

    user_tag_role_tag_t *user_tag_role_tag = NULL;
    cJSON *user_tag_role_tagJSON = cJSON_Parse(jsonString);
    if(user_tag_role_tagJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // user_tag_role_tag->parentTagId
    cJSON *parentTagId = cJSON_GetObjectItemCaseSensitive(user_tag_role_tagJSON, "parentTagId");
    if(!cJSON_IsNumber(parentTagId))
    {
    goto end; //Numeric
    }

    // user_tag_role_tag->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(user_tag_role_tagJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // user_tag_role_tag->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(user_tag_role_tagJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    user_tag_role_tag = user_tag_role_tag_create (
        parentTagId->valuedouble,
        strdup(name->valuestring),
        id->valuedouble
        );
 cJSON_Delete(user_tag_role_tagJSON);
    return user_tag_role_tag;
end:
    cJSON_Delete(user_tag_role_tagJSON);
    return NULL;

}


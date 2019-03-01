#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_18.h"



inline_object_18_t *inline_object_18_create(
    long groupId
    ) {
	inline_object_18_t *inline_object_18 = malloc(sizeof(inline_object_18_t));
	inline_object_18->groupId = groupId;

	return inline_object_18;
}


void inline_object_18_free(inline_object_18_t *inline_object_18) {
    listEntry_t *listEntry;

	free(inline_object_18);
}

cJSON *inline_object_18_convertToJSON(inline_object_18_t *inline_object_18) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_18->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_18->groupId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_18_t *inline_object_18_parseFromJSON(char *jsonString){

    inline_object_18_t *inline_object_18 = NULL;
    cJSON *inline_object_18JSON = cJSON_Parse(jsonString);
    if(inline_object_18JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_18->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_18JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }


    inline_object_18 = inline_object_18_create (
        groupId->valuedouble
        );
 cJSON_Delete(inline_object_18JSON);
    return inline_object_18;
end:
    cJSON_Delete(inline_object_18JSON);
    return NULL;

}


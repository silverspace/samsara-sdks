#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_9.h"



inline_object_9_t *inline_object_9_create(
    long groupId
    ) {
	inline_object_9_t *inline_object_9 = malloc(sizeof(inline_object_9_t));
	inline_object_9->groupId = groupId;

	return inline_object_9;
}


void inline_object_9_free(inline_object_9_t *inline_object_9) {
    listEntry_t *listEntry;

	free(inline_object_9);
}

cJSON *inline_object_9_convertToJSON(inline_object_9_t *inline_object_9) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_9->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_9->groupId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_9_t *inline_object_9_parseFromJSON(char *jsonString){

    inline_object_9_t *inline_object_9 = NULL;
    cJSON *inline_object_9JSON = cJSON_Parse(jsonString);
    if(inline_object_9JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_9->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_9JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }


    inline_object_9 = inline_object_9_create (
        groupId->valuedouble
        );
 cJSON_Delete(inline_object_9JSON);
    return inline_object_9;
end:
    cJSON_Delete(inline_object_9JSON);
    return NULL;

}


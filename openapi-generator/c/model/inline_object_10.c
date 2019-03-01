#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_10.h"



inline_object_10_t *inline_object_10_create(
    long groupId
    ) {
	inline_object_10_t *inline_object_10 = malloc(sizeof(inline_object_10_t));
	inline_object_10->groupId = groupId;

	return inline_object_10;
}


void inline_object_10_free(inline_object_10_t *inline_object_10) {
    listEntry_t *listEntry;

	free(inline_object_10);
}

cJSON *inline_object_10_convertToJSON(inline_object_10_t *inline_object_10) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_10->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_10->groupId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_10_t *inline_object_10_parseFromJSON(char *jsonString){

    inline_object_10_t *inline_object_10 = NULL;
    cJSON *inline_object_10JSON = cJSON_Parse(jsonString);
    if(inline_object_10JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_10->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_10JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }


    inline_object_10 = inline_object_10_create (
        groupId->valuedouble
        );
 cJSON_Delete(inline_object_10JSON);
    return inline_object_10;
end:
    cJSON_Delete(inline_object_10JSON);
    return NULL;

}


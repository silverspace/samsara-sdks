#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_23.h"



inline_object_23_t *inline_object_23_create(
    long groupId
    ) {
	inline_object_23_t *inline_object_23 = malloc(sizeof(inline_object_23_t));
	inline_object_23->groupId = groupId;

	return inline_object_23;
}


void inline_object_23_free(inline_object_23_t *inline_object_23) {
    listEntry_t *listEntry;

	free(inline_object_23);
}

cJSON *inline_object_23_convertToJSON(inline_object_23_t *inline_object_23) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_23->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_23->groupId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_23_t *inline_object_23_parseFromJSON(char *jsonString){

    inline_object_23_t *inline_object_23 = NULL;
    cJSON *inline_object_23JSON = cJSON_Parse(jsonString);
    if(inline_object_23JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_23->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_23JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }


    inline_object_23 = inline_object_23_create (
        groupId->valuedouble
        );
 cJSON_Delete(inline_object_23JSON);
    return inline_object_23;
end:
    cJSON_Delete(inline_object_23JSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_11.h"



inline_object_11_t *inline_object_11_create(
    long groupId
    ) {
	inline_object_11_t *inline_object_11 = malloc(sizeof(inline_object_11_t));
	inline_object_11->groupId = groupId;

	return inline_object_11;
}


void inline_object_11_free(inline_object_11_t *inline_object_11) {
    listEntry_t *listEntry;

	free(inline_object_11);
}

cJSON *inline_object_11_convertToJSON(inline_object_11_t *inline_object_11) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_11->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_11->groupId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_11_t *inline_object_11_parseFromJSON(char *jsonString){

    inline_object_11_t *inline_object_11 = NULL;
    cJSON *inline_object_11JSON = cJSON_Parse(jsonString);
    if(inline_object_11JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_11->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_11JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }


    inline_object_11 = inline_object_11_create (
        groupId->valuedouble
        );
 cJSON_Delete(inline_object_11JSON);
    return inline_object_11;
end:
    cJSON_Delete(inline_object_11JSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_13.h"



inline_object_13_t *inline_object_13_create(
    long groupId
    ) {
	inline_object_13_t *inline_object_13 = malloc(sizeof(inline_object_13_t));
	inline_object_13->groupId = groupId;

	return inline_object_13;
}


void inline_object_13_free(inline_object_13_t *inline_object_13) {
    listEntry_t *listEntry;

	free(inline_object_13);
}

cJSON *inline_object_13_convertToJSON(inline_object_13_t *inline_object_13) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_13->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_13->groupId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_13_t *inline_object_13_parseFromJSON(char *jsonString){

    inline_object_13_t *inline_object_13 = NULL;
    cJSON *inline_object_13JSON = cJSON_Parse(jsonString);
    if(inline_object_13JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_13->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_13JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }


    inline_object_13 = inline_object_13_create (
        groupId->valuedouble
        );
 cJSON_Delete(inline_object_13JSON);
    return inline_object_13;
end:
    cJSON_Delete(inline_object_13JSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_3.h"



inline_object_3_t *inline_object_3_create(
    long groupId
    ) {
	inline_object_3_t *inline_object_3 = malloc(sizeof(inline_object_3_t));
	inline_object_3->groupId = groupId;

	return inline_object_3;
}


void inline_object_3_free(inline_object_3_t *inline_object_3) {
    listEntry_t *listEntry;

	free(inline_object_3);
}

cJSON *inline_object_3_convertToJSON(inline_object_3_t *inline_object_3) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_3->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_3->groupId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_3_t *inline_object_3_parseFromJSON(char *jsonString){

    inline_object_3_t *inline_object_3 = NULL;
    cJSON *inline_object_3JSON = cJSON_Parse(jsonString);
    if(inline_object_3JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_3->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_3JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }


    inline_object_3 = inline_object_3_create (
        groupId->valuedouble
        );
 cJSON_Delete(inline_object_3JSON);
    return inline_object_3;
end:
    cJSON_Delete(inline_object_3JSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_17.h"



inline_object_17_t *inline_object_17_create(
    int endMs,
    long groupId,
    int startMs
    ) {
	inline_object_17_t *inline_object_17 = malloc(sizeof(inline_object_17_t));
	inline_object_17->endMs = endMs;
	inline_object_17->groupId = groupId;
	inline_object_17->startMs = startMs;

	return inline_object_17;
}


void inline_object_17_free(inline_object_17_t *inline_object_17) {
    listEntry_t *listEntry;

	free(inline_object_17);
}

cJSON *inline_object_17_convertToJSON(inline_object_17_t *inline_object_17) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_17->endMs
    if(cJSON_AddNumberToObject(item, "endMs", inline_object_17->endMs) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_17->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_17->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_17->startMs
    if(cJSON_AddNumberToObject(item, "startMs", inline_object_17->startMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_17_t *inline_object_17_parseFromJSON(char *jsonString){

    inline_object_17_t *inline_object_17 = NULL;
    cJSON *inline_object_17JSON = cJSON_Parse(jsonString);
    if(inline_object_17JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_17->endMs
    cJSON *endMs = cJSON_GetObjectItemCaseSensitive(inline_object_17JSON, "endMs");
    if(!cJSON_IsNumber(endMs))
    {
    goto end; //Numeric
    }

    // inline_object_17->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_17JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_object_17->startMs
    cJSON *startMs = cJSON_GetObjectItemCaseSensitive(inline_object_17JSON, "startMs");
    if(!cJSON_IsNumber(startMs))
    {
    goto end; //Numeric
    }


    inline_object_17 = inline_object_17_create (
        endMs->valuedouble,
        groupId->valuedouble,
        startMs->valuedouble
        );
 cJSON_Delete(inline_object_17JSON);
    return inline_object_17;
end:
    cJSON_Delete(inline_object_17JSON);
    return NULL;

}


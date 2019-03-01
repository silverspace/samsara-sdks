#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_5.h"



inline_object_5_t *inline_object_5_create(
    long endMs,
    long orgId,
    long startMs
    ) {
	inline_object_5_t *inline_object_5 = malloc(sizeof(inline_object_5_t));
	inline_object_5->endMs = endMs;
	inline_object_5->orgId = orgId;
	inline_object_5->startMs = startMs;

	return inline_object_5;
}


void inline_object_5_free(inline_object_5_t *inline_object_5) {
    listEntry_t *listEntry;

	free(inline_object_5);
}

cJSON *inline_object_5_convertToJSON(inline_object_5_t *inline_object_5) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_5->endMs
    if(cJSON_AddNumberToObject(item, "endMs", inline_object_5->endMs) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_5->orgId
    if(cJSON_AddNumberToObject(item, "orgId", inline_object_5->orgId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_5->startMs
    if(cJSON_AddNumberToObject(item, "startMs", inline_object_5->startMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_5_t *inline_object_5_parseFromJSON(char *jsonString){

    inline_object_5_t *inline_object_5 = NULL;
    cJSON *inline_object_5JSON = cJSON_Parse(jsonString);
    if(inline_object_5JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_5->endMs
    cJSON *endMs = cJSON_GetObjectItemCaseSensitive(inline_object_5JSON, "endMs");
    if(!cJSON_IsNumber(endMs))
    {
    goto end; //Numeric
    }

    // inline_object_5->orgId
    cJSON *orgId = cJSON_GetObjectItemCaseSensitive(inline_object_5JSON, "orgId");
    if(!cJSON_IsNumber(orgId))
    {
    goto end; //Numeric
    }

    // inline_object_5->startMs
    cJSON *startMs = cJSON_GetObjectItemCaseSensitive(inline_object_5JSON, "startMs");
    if(!cJSON_IsNumber(startMs))
    {
    goto end; //Numeric
    }


    inline_object_5 = inline_object_5_create (
        endMs->valuedouble,
        orgId->valuedouble,
        startMs->valuedouble
        );
 cJSON_Delete(inline_object_5JSON);
    return inline_object_5;
end:
    cJSON_Delete(inline_object_5JSON);
    return NULL;

}


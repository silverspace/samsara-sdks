#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_6.h"



inline_object_6_t *inline_object_6_create(
    long driverId,
    int endMs,
    long groupId,
    int startMs
    ) {
	inline_object_6_t *inline_object_6 = malloc(sizeof(inline_object_6_t));
	inline_object_6->driverId = driverId;
	inline_object_6->endMs = endMs;
	inline_object_6->groupId = groupId;
	inline_object_6->startMs = startMs;

	return inline_object_6;
}


void inline_object_6_free(inline_object_6_t *inline_object_6) {
    listEntry_t *listEntry;

	free(inline_object_6);
}

cJSON *inline_object_6_convertToJSON(inline_object_6_t *inline_object_6) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_6->driverId
    if(cJSON_AddNumberToObject(item, "driverId", inline_object_6->driverId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_6->endMs
    if(cJSON_AddNumberToObject(item, "endMs", inline_object_6->endMs) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_6->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_6->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_6->startMs
    if(cJSON_AddNumberToObject(item, "startMs", inline_object_6->startMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_6_t *inline_object_6_parseFromJSON(char *jsonString){

    inline_object_6_t *inline_object_6 = NULL;
    cJSON *inline_object_6JSON = cJSON_Parse(jsonString);
    if(inline_object_6JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_6->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(inline_object_6JSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // inline_object_6->endMs
    cJSON *endMs = cJSON_GetObjectItemCaseSensitive(inline_object_6JSON, "endMs");
    if(!cJSON_IsNumber(endMs))
    {
    goto end; //Numeric
    }

    // inline_object_6->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_6JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_object_6->startMs
    cJSON *startMs = cJSON_GetObjectItemCaseSensitive(inline_object_6JSON, "startMs");
    if(!cJSON_IsNumber(startMs))
    {
    goto end; //Numeric
    }


    inline_object_6 = inline_object_6_create (
        driverId->valuedouble,
        endMs->valuedouble,
        groupId->valuedouble,
        startMs->valuedouble
        );
 cJSON_Delete(inline_object_6JSON);
    return inline_object_6;
end:
    cJSON_Delete(inline_object_6JSON);
    return NULL;

}


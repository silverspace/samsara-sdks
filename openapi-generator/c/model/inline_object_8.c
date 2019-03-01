#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_8.h"



inline_object_8_t *inline_object_8_create(
    long driverId,
    int endMs,
    long groupId,
    int startMs
    ) {
	inline_object_8_t *inline_object_8 = malloc(sizeof(inline_object_8_t));
	inline_object_8->driverId = driverId;
	inline_object_8->endMs = endMs;
	inline_object_8->groupId = groupId;
	inline_object_8->startMs = startMs;

	return inline_object_8;
}


void inline_object_8_free(inline_object_8_t *inline_object_8) {
    listEntry_t *listEntry;

	free(inline_object_8);
}

cJSON *inline_object_8_convertToJSON(inline_object_8_t *inline_object_8) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_8->driverId
    if(cJSON_AddNumberToObject(item, "driverId", inline_object_8->driverId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_8->endMs
    if(cJSON_AddNumberToObject(item, "endMs", inline_object_8->endMs) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_8->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_8->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_8->startMs
    if(cJSON_AddNumberToObject(item, "startMs", inline_object_8->startMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_8_t *inline_object_8_parseFromJSON(char *jsonString){

    inline_object_8_t *inline_object_8 = NULL;
    cJSON *inline_object_8JSON = cJSON_Parse(jsonString);
    if(inline_object_8JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_8->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(inline_object_8JSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // inline_object_8->endMs
    cJSON *endMs = cJSON_GetObjectItemCaseSensitive(inline_object_8JSON, "endMs");
    if(!cJSON_IsNumber(endMs))
    {
    goto end; //Numeric
    }

    // inline_object_8->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_8JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_object_8->startMs
    cJSON *startMs = cJSON_GetObjectItemCaseSensitive(inline_object_8JSON, "startMs");
    if(!cJSON_IsNumber(startMs))
    {
    goto end; //Numeric
    }


    inline_object_8 = inline_object_8_create (
        driverId->valuedouble,
        endMs->valuedouble,
        groupId->valuedouble,
        startMs->valuedouble
        );
 cJSON_Delete(inline_object_8JSON);
    return inline_object_8;
end:
    cJSON_Delete(inline_object_8JSON);
    return NULL;

}


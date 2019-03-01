#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_7.h"



inline_object_7_t *inline_object_7_create(
    long driverId,
    int endMs,
    long groupId,
    int startMs
    ) {
	inline_object_7_t *inline_object_7 = malloc(sizeof(inline_object_7_t));
	inline_object_7->driverId = driverId;
	inline_object_7->endMs = endMs;
	inline_object_7->groupId = groupId;
	inline_object_7->startMs = startMs;

	return inline_object_7;
}


void inline_object_7_free(inline_object_7_t *inline_object_7) {
    listEntry_t *listEntry;

	free(inline_object_7);
}

cJSON *inline_object_7_convertToJSON(inline_object_7_t *inline_object_7) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_7->driverId
    if(cJSON_AddNumberToObject(item, "driverId", inline_object_7->driverId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_7->endMs
    if(cJSON_AddNumberToObject(item, "endMs", inline_object_7->endMs) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_7->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_7->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_7->startMs
    if(cJSON_AddNumberToObject(item, "startMs", inline_object_7->startMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_7_t *inline_object_7_parseFromJSON(char *jsonString){

    inline_object_7_t *inline_object_7 = NULL;
    cJSON *inline_object_7JSON = cJSON_Parse(jsonString);
    if(inline_object_7JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_7->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(inline_object_7JSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // inline_object_7->endMs
    cJSON *endMs = cJSON_GetObjectItemCaseSensitive(inline_object_7JSON, "endMs");
    if(!cJSON_IsNumber(endMs))
    {
    goto end; //Numeric
    }

    // inline_object_7->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_7JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_object_7->startMs
    cJSON *startMs = cJSON_GetObjectItemCaseSensitive(inline_object_7JSON, "startMs");
    if(!cJSON_IsNumber(startMs))
    {
    goto end; //Numeric
    }


    inline_object_7 = inline_object_7_create (
        driverId->valuedouble,
        endMs->valuedouble,
        groupId->valuedouble,
        startMs->valuedouble
        );
 cJSON_Delete(inline_object_7JSON);
    return inline_object_7;
end:
    cJSON_Delete(inline_object_7JSON);
    return NULL;

}


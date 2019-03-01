#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_15.h"



inline_object_15_t *inline_object_15_create(
    int endMs,
    long groupId,
    int startMs,
    long vehicleId
    ) {
	inline_object_15_t *inline_object_15 = malloc(sizeof(inline_object_15_t));
	inline_object_15->endMs = endMs;
	inline_object_15->groupId = groupId;
	inline_object_15->startMs = startMs;
	inline_object_15->vehicleId = vehicleId;

	return inline_object_15;
}


void inline_object_15_free(inline_object_15_t *inline_object_15) {
    listEntry_t *listEntry;

	free(inline_object_15);
}

cJSON *inline_object_15_convertToJSON(inline_object_15_t *inline_object_15) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_15->endMs
    if(cJSON_AddNumberToObject(item, "endMs", inline_object_15->endMs) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_15->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_15->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_15->startMs
    if(cJSON_AddNumberToObject(item, "startMs", inline_object_15->startMs) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_15->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", inline_object_15->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_15_t *inline_object_15_parseFromJSON(char *jsonString){

    inline_object_15_t *inline_object_15 = NULL;
    cJSON *inline_object_15JSON = cJSON_Parse(jsonString);
    if(inline_object_15JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_15->endMs
    cJSON *endMs = cJSON_GetObjectItemCaseSensitive(inline_object_15JSON, "endMs");
    if(!cJSON_IsNumber(endMs))
    {
    goto end; //Numeric
    }

    // inline_object_15->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_15JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_object_15->startMs
    cJSON *startMs = cJSON_GetObjectItemCaseSensitive(inline_object_15JSON, "startMs");
    if(!cJSON_IsNumber(startMs))
    {
    goto end; //Numeric
    }

    // inline_object_15->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(inline_object_15JSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }


    inline_object_15 = inline_object_15_create (
        endMs->valuedouble,
        groupId->valuedouble,
        startMs->valuedouble,
        vehicleId->valuedouble
        );
 cJSON_Delete(inline_object_15JSON);
    return inline_object_15;
end:
    cJSON_Delete(inline_object_15JSON);
    return NULL;

}


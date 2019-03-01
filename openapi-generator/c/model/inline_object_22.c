#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_22.h"



inline_object_22_t *inline_object_22_create(
    long groupId,
    list_t *sensors
    ) {
	inline_object_22_t *inline_object_22 = malloc(sizeof(inline_object_22_t));
	inline_object_22->groupId = groupId;
	inline_object_22->sensors = sensors;

	return inline_object_22;
}


void inline_object_22_free(inline_object_22_t *inline_object_22) {
    listEntry_t *listEntry;
	list_ForEach(listEntry, inline_object_22->sensors) {
		free(listEntry->data);
	}
	list_free(inline_object_22->sensors);

	free(inline_object_22);
}

cJSON *inline_object_22_convertToJSON(inline_object_22_t *inline_object_22) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_22->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_22->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_22->sensors
	cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *sensorsListEntry;
    list_ForEach(sensorsListEntry, inline_object_22->sensors) {
        if(cJSON_AddNumberToObject(sensors, "", *(double *)sensorsListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_22_t *inline_object_22_parseFromJSON(char *jsonString){

    inline_object_22_t *inline_object_22 = NULL;
    cJSON *inline_object_22JSON = cJSON_Parse(jsonString);
    if(inline_object_22JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_22->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_22JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_object_22->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(inline_object_22JSON, "sensors");
    if(!cJSON_IsArray(sensorsJSON)) {
        goto end;//primitive container
    }
    list_t *sensorsList = list_create();

    cJSON_ArrayForEach(sensors, sensorsJSON)
    {
        if(!cJSON_IsNumber(sensors))
        {
            goto end;
        }
        list_addElement(sensorsList , &sensors->valuedouble);

    }


    inline_object_22 = inline_object_22_create (
        groupId->valuedouble,
        sensorsList
        );
 cJSON_Delete(inline_object_22JSON);
    return inline_object_22;
end:
    cJSON_Delete(inline_object_22JSON);
    return NULL;

}


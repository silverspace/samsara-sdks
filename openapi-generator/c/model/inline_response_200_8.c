#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_8.h"



inline_response_200_8_t *inline_response_200_8_create(
    list_t *sensors
    ) {
	inline_response_200_8_t *inline_response_200_8 = malloc(sizeof(inline_response_200_8_t));
	inline_response_200_8->sensors = sensors;

	return inline_response_200_8;
}


void inline_response_200_8_free(inline_response_200_8_t *inline_response_200_8) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_response_200_8->sensors) {
		sensor_free(listEntry->data);
	}
	list_free(inline_response_200_8->sensors);

	free(inline_response_200_8);
}

cJSON *inline_response_200_8_convertToJSON(inline_response_200_8_t *inline_response_200_8) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200_8->sensors
    cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *sensorsListEntry;
	list_ForEach(sensorsListEntry, inline_response_200_8->sensors) {
		cJSON *item = sensor_convertToJSON(sensorsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(sensors, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_200_8_t *inline_response_200_8_parseFromJSON(char *jsonString){

    inline_response_200_8_t *inline_response_200_8 = NULL;
    cJSON *inline_response_200_8JSON = cJSON_Parse(jsonString);
    if(inline_response_200_8JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200_8->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_8JSON,"sensors");
    if(!cJSON_IsArray(sensorsJSON)){
        goto end; //nonprimitive container
    }

    list_t *sensorsList = list_create();

    cJSON_ArrayForEach(sensors,sensorsJSON )
    {
        if(!cJSON_IsObject(sensors)){
            goto end;
        }
		char *JSONData = cJSON_Print(sensors);
        sensor_t *sensorsItem = sensor_parseFromJSON(JSONData);

        list_addElement(sensorsList, sensorsItem);
        free(JSONData);
    }


    inline_response_200_8 = inline_response_200_8_create (
        sensorsList
        );
 cJSON_Delete(inline_response_200_8JSON);
    return inline_response_200_8;
end:
    cJSON_Delete(inline_response_200_8JSON);
    return NULL;

}


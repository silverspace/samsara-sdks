#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "humidity_response.h"



humidity_response_t *humidity_response_create(
    long groupId,
    list_t *sensors
    ) {
	humidity_response_t *humidity_response = malloc(sizeof(humidity_response_t));
	humidity_response->groupId = groupId;
	humidity_response->sensors = sensors;

	return humidity_response;
}


void humidity_response_free(humidity_response_t *humidity_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, humidity_response->sensors) {
		humidity_response_sensors_free(listEntry->data);
	}
	list_free(humidity_response->sensors);

	free(humidity_response);
}

cJSON *humidity_response_convertToJSON(humidity_response_t *humidity_response) {
	cJSON *item = cJSON_CreateObject();
	// humidity_response->groupId
    if(cJSON_AddNumberToObject(item, "groupId", humidity_response->groupId) == NULL) {
    goto fail; //Numeric
    }

	// humidity_response->sensors
    cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *sensorsListEntry;
	list_ForEach(sensorsListEntry, humidity_response->sensors) {
		cJSON *item = humidity_response_sensors_convertToJSON(sensorsListEntry->data);
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

humidity_response_t *humidity_response_parseFromJSON(char *jsonString){

    humidity_response_t *humidity_response = NULL;
    cJSON *humidity_responseJSON = cJSON_Parse(jsonString);
    if(humidity_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // humidity_response->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(humidity_responseJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // humidity_response->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(humidity_responseJSON,"sensors");
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
        humidity_response_sensors_t *sensorsItem = humidity_response_sensors_parseFromJSON(JSONData);

        list_addElement(sensorsList, sensorsItem);
        free(JSONData);
    }


    humidity_response = humidity_response_create (
        groupId->valuedouble,
        sensorsList
        );
 cJSON_Delete(humidity_responseJSON);
    return humidity_response;
end:
    cJSON_Delete(humidity_responseJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "door_response.h"



door_response_t *door_response_create(
    long groupId,
    list_t *sensors
    ) {
	door_response_t *door_response = malloc(sizeof(door_response_t));
	door_response->groupId = groupId;
	door_response->sensors = sensors;

	return door_response;
}


void door_response_free(door_response_t *door_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, door_response->sensors) {
		door_response_sensors_free(listEntry->data);
	}
	list_free(door_response->sensors);

	free(door_response);
}

cJSON *door_response_convertToJSON(door_response_t *door_response) {
	cJSON *item = cJSON_CreateObject();
	// door_response->groupId
    if(cJSON_AddNumberToObject(item, "groupId", door_response->groupId) == NULL) {
    goto fail; //Numeric
    }

	// door_response->sensors
    cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *sensorsListEntry;
	list_ForEach(sensorsListEntry, door_response->sensors) {
		cJSON *item = door_response_sensors_convertToJSON(sensorsListEntry->data);
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

door_response_t *door_response_parseFromJSON(char *jsonString){

    door_response_t *door_response = NULL;
    cJSON *door_responseJSON = cJSON_Parse(jsonString);
    if(door_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // door_response->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(door_responseJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // door_response->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(door_responseJSON,"sensors");
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
        door_response_sensors_t *sensorsItem = door_response_sensors_parseFromJSON(JSONData);

        list_addElement(sensorsList, sensorsItem);
        free(JSONData);
    }


    door_response = door_response_create (
        groupId->valuedouble,
        sensorsList
        );
 cJSON_Delete(door_responseJSON);
    return door_response;
end:
    cJSON_Delete(door_responseJSON);
    return NULL;

}


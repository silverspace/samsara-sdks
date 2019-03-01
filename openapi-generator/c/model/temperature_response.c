#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "temperature_response.h"



temperature_response_t *temperature_response_create(
    long groupId,
    list_t *sensors
    ) {
	temperature_response_t *temperature_response = malloc(sizeof(temperature_response_t));
	temperature_response->groupId = groupId;
	temperature_response->sensors = sensors;

	return temperature_response;
}


void temperature_response_free(temperature_response_t *temperature_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, temperature_response->sensors) {
		temperature_response_sensors_free(listEntry->data);
	}
	list_free(temperature_response->sensors);

	free(temperature_response);
}

cJSON *temperature_response_convertToJSON(temperature_response_t *temperature_response) {
	cJSON *item = cJSON_CreateObject();
	// temperature_response->groupId
    if(cJSON_AddNumberToObject(item, "groupId", temperature_response->groupId) == NULL) {
    goto fail; //Numeric
    }

	// temperature_response->sensors
    cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *sensorsListEntry;
	list_ForEach(sensorsListEntry, temperature_response->sensors) {
		cJSON *item = temperature_response_sensors_convertToJSON(sensorsListEntry->data);
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

temperature_response_t *temperature_response_parseFromJSON(char *jsonString){

    temperature_response_t *temperature_response = NULL;
    cJSON *temperature_responseJSON = cJSON_Parse(jsonString);
    if(temperature_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // temperature_response->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(temperature_responseJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // temperature_response->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(temperature_responseJSON,"sensors");
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
        temperature_response_sensors_t *sensorsItem = temperature_response_sensors_parseFromJSON(JSONData);

        list_addElement(sensorsList, sensorsItem);
        free(JSONData);
    }


    temperature_response = temperature_response_create (
        groupId->valuedouble,
        sensorsList
        );
 cJSON_Delete(temperature_responseJSON);
    return temperature_response;
end:
    cJSON_Delete(temperature_responseJSON);
    return NULL;

}


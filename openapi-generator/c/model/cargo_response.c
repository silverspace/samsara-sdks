#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cargo_response.h"



cargo_response_t *cargo_response_create(
    long groupId,
    list_t *sensors
    ) {
	cargo_response_t *cargo_response = malloc(sizeof(cargo_response_t));
	cargo_response->groupId = groupId;
	cargo_response->sensors = sensors;

	return cargo_response;
}


void cargo_response_free(cargo_response_t *cargo_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, cargo_response->sensors) {
		cargo_response_sensors_free(listEntry->data);
	}
	list_free(cargo_response->sensors);

	free(cargo_response);
}

cJSON *cargo_response_convertToJSON(cargo_response_t *cargo_response) {
	cJSON *item = cJSON_CreateObject();
	// cargo_response->groupId
    if(cJSON_AddNumberToObject(item, "groupId", cargo_response->groupId) == NULL) {
    goto fail; //Numeric
    }

	// cargo_response->sensors
    cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *sensorsListEntry;
	list_ForEach(sensorsListEntry, cargo_response->sensors) {
		cJSON *item = cargo_response_sensors_convertToJSON(sensorsListEntry->data);
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

cargo_response_t *cargo_response_parseFromJSON(char *jsonString){

    cargo_response_t *cargo_response = NULL;
    cJSON *cargo_responseJSON = cJSON_Parse(jsonString);
    if(cargo_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // cargo_response->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(cargo_responseJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // cargo_response->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(cargo_responseJSON,"sensors");
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
        cargo_response_sensors_t *sensorsItem = cargo_response_sensors_parseFromJSON(JSONData);

        list_addElement(sensorsList, sensorsItem);
        free(JSONData);
    }


    cargo_response = cargo_response_create (
        groupId->valuedouble,
        sensorsList
        );
 cJSON_Delete(cargo_responseJSON);
    return cargo_response;
end:
    cJSON_Delete(cargo_responseJSON);
    return NULL;

}


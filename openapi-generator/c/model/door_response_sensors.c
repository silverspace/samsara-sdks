#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "door_response_sensors.h"



door_response_sensors_t *door_response_sensors_create(
    bool doorClosed,
    char *name,
    long id
    ) {
	door_response_sensors_t *door_response_sensors = malloc(sizeof(door_response_sensors_t));
	door_response_sensors->doorClosed = doorClosed;
	door_response_sensors->name = name;
	door_response_sensors->id = id;

	return door_response_sensors;
}


void door_response_sensors_free(door_response_sensors_t *door_response_sensors) {
    listEntry_t *listEntry;
    free(door_response_sensors->name);

	free(door_response_sensors);
}

cJSON *door_response_sensors_convertToJSON(door_response_sensors_t *door_response_sensors) {
	cJSON *item = cJSON_CreateObject();
	// door_response_sensors->doorClosed
    if(cJSON_AddBoolToObject(item, "doorClosed", door_response_sensors->doorClosed) == NULL) {
    goto fail; //Numeric
    }

	// door_response_sensors->name
    if(cJSON_AddStringToObject(item, "name", door_response_sensors->name) == NULL) {
    goto fail; //String
    }

	// door_response_sensors->id
    if(cJSON_AddNumberToObject(item, "id", door_response_sensors->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

door_response_sensors_t *door_response_sensors_parseFromJSON(char *jsonString){

    door_response_sensors_t *door_response_sensors = NULL;
    cJSON *door_response_sensorsJSON = cJSON_Parse(jsonString);
    if(door_response_sensorsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // door_response_sensors->doorClosed
    cJSON *doorClosed = cJSON_GetObjectItemCaseSensitive(door_response_sensorsJSON, "doorClosed");
    if(!cJSON_IsBool(doorClosed))
    {
    goto end; //Numeric
    }

    // door_response_sensors->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(door_response_sensorsJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // door_response_sensors->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(door_response_sensorsJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    door_response_sensors = door_response_sensors_create (
        doorClosed->valueint,
        strdup(name->valuestring),
        id->valuedouble
        );
 cJSON_Delete(door_response_sensorsJSON);
    return door_response_sensors;
end:
    cJSON_Delete(door_response_sensorsJSON);
    return NULL;

}


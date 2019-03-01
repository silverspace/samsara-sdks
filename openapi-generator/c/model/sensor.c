#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "sensor.h"



sensor_t *sensor_create(
    long id,
    char *macAddress,
    char *name
    ) {
	sensor_t *sensor = malloc(sizeof(sensor_t));
	sensor->id = id;
	sensor->macAddress = macAddress;
	sensor->name = name;

	return sensor;
}


void sensor_free(sensor_t *sensor) {
    listEntry_t *listEntry;
    free(sensor->macAddress);
    free(sensor->name);

	free(sensor);
}

cJSON *sensor_convertToJSON(sensor_t *sensor) {
	cJSON *item = cJSON_CreateObject();
	// sensor->id
    if(cJSON_AddNumberToObject(item, "id", sensor->id) == NULL) {
    goto fail; //Numeric
    }

	// sensor->macAddress
    if(cJSON_AddStringToObject(item, "macAddress", sensor->macAddress) == NULL) {
    goto fail; //String
    }

	// sensor->name
    if(cJSON_AddStringToObject(item, "name", sensor->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

sensor_t *sensor_parseFromJSON(char *jsonString){

    sensor_t *sensor = NULL;
    cJSON *sensorJSON = cJSON_Parse(jsonString);
    if(sensorJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // sensor->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(sensorJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // sensor->macAddress
    cJSON *macAddress = cJSON_GetObjectItemCaseSensitive(sensorJSON, "macAddress");
    if(!cJSON_IsString(macAddress) || (macAddress->valuestring == NULL)){
    goto end; //String
    }

    // sensor->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(sensorJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    sensor = sensor_create (
        id->valuedouble,
        strdup(macAddress->valuestring),
        strdup(name->valuestring)
        );
 cJSON_Delete(sensorJSON);
    return sensor;
end:
    cJSON_Delete(sensorJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "humidity_response_sensors.h"



humidity_response_sensors_t *humidity_response_sensors_create(
    char *name,
    int humidity,
    long id
    ) {
	humidity_response_sensors_t *humidity_response_sensors = malloc(sizeof(humidity_response_sensors_t));
	humidity_response_sensors->name = name;
	humidity_response_sensors->humidity = humidity;
	humidity_response_sensors->id = id;

	return humidity_response_sensors;
}


void humidity_response_sensors_free(humidity_response_sensors_t *humidity_response_sensors) {
    listEntry_t *listEntry;
    free(humidity_response_sensors->name);

	free(humidity_response_sensors);
}

cJSON *humidity_response_sensors_convertToJSON(humidity_response_sensors_t *humidity_response_sensors) {
	cJSON *item = cJSON_CreateObject();
	// humidity_response_sensors->name
    if(cJSON_AddStringToObject(item, "name", humidity_response_sensors->name) == NULL) {
    goto fail; //String
    }

	// humidity_response_sensors->humidity
    if(cJSON_AddNumberToObject(item, "humidity", humidity_response_sensors->humidity) == NULL) {
    goto fail; //Numeric
    }

	// humidity_response_sensors->id
    if(cJSON_AddNumberToObject(item, "id", humidity_response_sensors->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

humidity_response_sensors_t *humidity_response_sensors_parseFromJSON(char *jsonString){

    humidity_response_sensors_t *humidity_response_sensors = NULL;
    cJSON *humidity_response_sensorsJSON = cJSON_Parse(jsonString);
    if(humidity_response_sensorsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // humidity_response_sensors->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(humidity_response_sensorsJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // humidity_response_sensors->humidity
    cJSON *humidity = cJSON_GetObjectItemCaseSensitive(humidity_response_sensorsJSON, "humidity");
    if(!cJSON_IsNumber(humidity))
    {
    goto end; //Numeric
    }

    // humidity_response_sensors->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(humidity_response_sensorsJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    humidity_response_sensors = humidity_response_sensors_create (
        strdup(name->valuestring),
        humidity->valuedouble,
        id->valuedouble
        );
 cJSON_Delete(humidity_response_sensorsJSON);
    return humidity_response_sensors;
end:
    cJSON_Delete(humidity_response_sensorsJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "temperature_response_sensors.h"



temperature_response_sensors_t *temperature_response_sensors_create(
    int probeTemperature,
    char *name,
    long id,
    int ambientTemperature
    ) {
	temperature_response_sensors_t *temperature_response_sensors = malloc(sizeof(temperature_response_sensors_t));
	temperature_response_sensors->probeTemperature = probeTemperature;
	temperature_response_sensors->name = name;
	temperature_response_sensors->id = id;
	temperature_response_sensors->ambientTemperature = ambientTemperature;

	return temperature_response_sensors;
}


void temperature_response_sensors_free(temperature_response_sensors_t *temperature_response_sensors) {
    listEntry_t *listEntry;
    free(temperature_response_sensors->name);

	free(temperature_response_sensors);
}

cJSON *temperature_response_sensors_convertToJSON(temperature_response_sensors_t *temperature_response_sensors) {
	cJSON *item = cJSON_CreateObject();
	// temperature_response_sensors->probeTemperature
    if(cJSON_AddNumberToObject(item, "probeTemperature", temperature_response_sensors->probeTemperature) == NULL) {
    goto fail; //Numeric
    }

	// temperature_response_sensors->name
    if(cJSON_AddStringToObject(item, "name", temperature_response_sensors->name) == NULL) {
    goto fail; //String
    }

	// temperature_response_sensors->id
    if(cJSON_AddNumberToObject(item, "id", temperature_response_sensors->id) == NULL) {
    goto fail; //Numeric
    }

	// temperature_response_sensors->ambientTemperature
    if(cJSON_AddNumberToObject(item, "ambientTemperature", temperature_response_sensors->ambientTemperature) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

temperature_response_sensors_t *temperature_response_sensors_parseFromJSON(char *jsonString){

    temperature_response_sensors_t *temperature_response_sensors = NULL;
    cJSON *temperature_response_sensorsJSON = cJSON_Parse(jsonString);
    if(temperature_response_sensorsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // temperature_response_sensors->probeTemperature
    cJSON *probeTemperature = cJSON_GetObjectItemCaseSensitive(temperature_response_sensorsJSON, "probeTemperature");
    if(!cJSON_IsNumber(probeTemperature))
    {
    goto end; //Numeric
    }

    // temperature_response_sensors->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(temperature_response_sensorsJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // temperature_response_sensors->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(temperature_response_sensorsJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // temperature_response_sensors->ambientTemperature
    cJSON *ambientTemperature = cJSON_GetObjectItemCaseSensitive(temperature_response_sensorsJSON, "ambientTemperature");
    if(!cJSON_IsNumber(ambientTemperature))
    {
    goto end; //Numeric
    }


    temperature_response_sensors = temperature_response_sensors_create (
        probeTemperature->valuedouble,
        strdup(name->valuestring),
        id->valuedouble,
        ambientTemperature->valuedouble
        );
 cJSON_Delete(temperature_response_sensorsJSON);
    return temperature_response_sensors;
end:
    cJSON_Delete(temperature_response_sensorsJSON);
    return NULL;

}


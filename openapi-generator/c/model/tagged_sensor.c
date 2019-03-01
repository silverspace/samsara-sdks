#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_sensor.h"



tagged_sensor_t *tagged_sensor_create(
    long id,
    char *name
    ) {
	tagged_sensor_t *tagged_sensor = malloc(sizeof(tagged_sensor_t));
	tagged_sensor->id = id;
	tagged_sensor->name = name;

	return tagged_sensor;
}


void tagged_sensor_free(tagged_sensor_t *tagged_sensor) {
    listEntry_t *listEntry;
    free(tagged_sensor->name);

	free(tagged_sensor);
}

cJSON *tagged_sensor_convertToJSON(tagged_sensor_t *tagged_sensor) {
	cJSON *item = cJSON_CreateObject();
	// tagged_sensor->id
    if(cJSON_AddNumberToObject(item, "id", tagged_sensor->id) == NULL) {
    goto fail; //Numeric
    }

	// tagged_sensor->name
    if(cJSON_AddStringToObject(item, "name", tagged_sensor->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_sensor_t *tagged_sensor_parseFromJSON(char *jsonString){

    tagged_sensor_t *tagged_sensor = NULL;
    cJSON *tagged_sensorJSON = cJSON_Parse(jsonString);
    if(tagged_sensorJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_sensor->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_sensorJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // tagged_sensor->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tagged_sensorJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    tagged_sensor = tagged_sensor_create (
        id->valuedouble,
        strdup(name->valuestring)
        );
 cJSON_Delete(tagged_sensorJSON);
    return tagged_sensor;
end:
    cJSON_Delete(tagged_sensorJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cargo_response_sensors.h"



cargo_response_sensors_t *cargo_response_sensors_create(
    bool cargoEmpty,
    char *name,
    long id
    ) {
	cargo_response_sensors_t *cargo_response_sensors = malloc(sizeof(cargo_response_sensors_t));
	cargo_response_sensors->cargoEmpty = cargoEmpty;
	cargo_response_sensors->name = name;
	cargo_response_sensors->id = id;

	return cargo_response_sensors;
}


void cargo_response_sensors_free(cargo_response_sensors_t *cargo_response_sensors) {
    listEntry_t *listEntry;
    free(cargo_response_sensors->name);

	free(cargo_response_sensors);
}

cJSON *cargo_response_sensors_convertToJSON(cargo_response_sensors_t *cargo_response_sensors) {
	cJSON *item = cJSON_CreateObject();
	// cargo_response_sensors->cargoEmpty
    if(cJSON_AddBoolToObject(item, "cargoEmpty", cargo_response_sensors->cargoEmpty) == NULL) {
    goto fail; //Numeric
    }

	// cargo_response_sensors->name
    if(cJSON_AddStringToObject(item, "name", cargo_response_sensors->name) == NULL) {
    goto fail; //String
    }

	// cargo_response_sensors->id
    if(cJSON_AddNumberToObject(item, "id", cargo_response_sensors->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

cargo_response_sensors_t *cargo_response_sensors_parseFromJSON(char *jsonString){

    cargo_response_sensors_t *cargo_response_sensors = NULL;
    cJSON *cargo_response_sensorsJSON = cJSON_Parse(jsonString);
    if(cargo_response_sensorsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // cargo_response_sensors->cargoEmpty
    cJSON *cargoEmpty = cJSON_GetObjectItemCaseSensitive(cargo_response_sensorsJSON, "cargoEmpty");
    if(!cJSON_IsBool(cargoEmpty))
    {
    goto end; //Numeric
    }

    // cargo_response_sensors->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(cargo_response_sensorsJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // cargo_response_sensors->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(cargo_response_sensorsJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    cargo_response_sensors = cargo_response_sensors_create (
        cargoEmpty->valueint,
        strdup(name->valuestring),
        id->valuedouble
        );
 cJSON_Delete(cargo_response_sensorsJSON);
    return cargo_response_sensors;
end:
    cJSON_Delete(cargo_response_sensorsJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dvir_base_vehicle.h"



dvir_base_vehicle_t *dvir_base_vehicle_create(
    char *name,
    long id
    ) {
	dvir_base_vehicle_t *dvir_base_vehicle = malloc(sizeof(dvir_base_vehicle_t));
	dvir_base_vehicle->name = name;
	dvir_base_vehicle->id = id;

	return dvir_base_vehicle;
}


void dvir_base_vehicle_free(dvir_base_vehicle_t *dvir_base_vehicle) {
    listEntry_t *listEntry;
    free(dvir_base_vehicle->name);

	free(dvir_base_vehicle);
}

cJSON *dvir_base_vehicle_convertToJSON(dvir_base_vehicle_t *dvir_base_vehicle) {
	cJSON *item = cJSON_CreateObject();
	// dvir_base_vehicle->name
    if(cJSON_AddStringToObject(item, "name", dvir_base_vehicle->name) == NULL) {
    goto fail; //String
    }

	// dvir_base_vehicle->id
    if(cJSON_AddNumberToObject(item, "id", dvir_base_vehicle->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dvir_base_vehicle_t *dvir_base_vehicle_parseFromJSON(char *jsonString){

    dvir_base_vehicle_t *dvir_base_vehicle = NULL;
    cJSON *dvir_base_vehicleJSON = cJSON_Parse(jsonString);
    if(dvir_base_vehicleJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dvir_base_vehicle->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(dvir_base_vehicleJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // dvir_base_vehicle->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(dvir_base_vehicleJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    dvir_base_vehicle = dvir_base_vehicle_create (
        strdup(name->valuestring),
        id->valuedouble
        );
 cJSON_Delete(dvir_base_vehicleJSON);
    return dvir_base_vehicle;
end:
    cJSON_Delete(dvir_base_vehicleJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_vehicle.h"



tagged_vehicle_t *tagged_vehicle_create(
    long id,
    char *name
    ) {
	tagged_vehicle_t *tagged_vehicle = malloc(sizeof(tagged_vehicle_t));
	tagged_vehicle->id = id;
	tagged_vehicle->name = name;

	return tagged_vehicle;
}


void tagged_vehicle_free(tagged_vehicle_t *tagged_vehicle) {
    listEntry_t *listEntry;
    free(tagged_vehicle->name);

	free(tagged_vehicle);
}

cJSON *tagged_vehicle_convertToJSON(tagged_vehicle_t *tagged_vehicle) {
	cJSON *item = cJSON_CreateObject();
	// tagged_vehicle->id
    if(cJSON_AddNumberToObject(item, "id", tagged_vehicle->id) == NULL) {
    goto fail; //Numeric
    }

	// tagged_vehicle->name
    if(cJSON_AddStringToObject(item, "name", tagged_vehicle->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_vehicle_t *tagged_vehicle_parseFromJSON(char *jsonString){

    tagged_vehicle_t *tagged_vehicle = NULL;
    cJSON *tagged_vehicleJSON = cJSON_Parse(jsonString);
    if(tagged_vehicleJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_vehicle->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_vehicleJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // tagged_vehicle->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tagged_vehicleJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    tagged_vehicle = tagged_vehicle_create (
        id->valuedouble,
        strdup(name->valuestring)
        );
 cJSON_Delete(tagged_vehicleJSON);
    return tagged_vehicle;
end:
    cJSON_Delete(tagged_vehicleJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_maintenance_passenger_check_engine_light.h"



vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light_create(
    bool isOn
    ) {
	vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light = malloc(sizeof(vehicle_maintenance_passenger_check_engine_light_t));
	vehicle_maintenance_passenger_check_engine_light->isOn = isOn;

	return vehicle_maintenance_passenger_check_engine_light;
}


void vehicle_maintenance_passenger_check_engine_light_free(vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light) {
    listEntry_t *listEntry;

	free(vehicle_maintenance_passenger_check_engine_light);
}

cJSON *vehicle_maintenance_passenger_check_engine_light_convertToJSON(vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_maintenance_passenger_check_engine_light->isOn
    if(cJSON_AddBoolToObject(item, "isOn", vehicle_maintenance_passenger_check_engine_light->isOn) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light_parseFromJSON(char *jsonString){

    vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light = NULL;
    cJSON *vehicle_maintenance_passenger_check_engine_lightJSON = cJSON_Parse(jsonString);
    if(vehicle_maintenance_passenger_check_engine_lightJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_maintenance_passenger_check_engine_light->isOn
    cJSON *isOn = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_passenger_check_engine_lightJSON, "isOn");
    if(!cJSON_IsBool(isOn))
    {
    goto end; //Numeric
    }


    vehicle_maintenance_passenger_check_engine_light = vehicle_maintenance_passenger_check_engine_light_create (
        isOn->valueint
        );
 cJSON_Delete(vehicle_maintenance_passenger_check_engine_lightJSON);
    return vehicle_maintenance_passenger_check_engine_light;
end:
    cJSON_Delete(vehicle_maintenance_passenger_check_engine_lightJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_maintenance_j1939_check_engine_light.h"



vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light_create(
    bool protectIsOn,
    bool stopIsOn,
    bool warningIsOn,
    bool emissionsIsOn
    ) {
	vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light = malloc(sizeof(vehicle_maintenance_j1939_check_engine_light_t));
	vehicle_maintenance_j1939_check_engine_light->protectIsOn = protectIsOn;
	vehicle_maintenance_j1939_check_engine_light->stopIsOn = stopIsOn;
	vehicle_maintenance_j1939_check_engine_light->warningIsOn = warningIsOn;
	vehicle_maintenance_j1939_check_engine_light->emissionsIsOn = emissionsIsOn;

	return vehicle_maintenance_j1939_check_engine_light;
}


void vehicle_maintenance_j1939_check_engine_light_free(vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light) {
    listEntry_t *listEntry;

	free(vehicle_maintenance_j1939_check_engine_light);
}

cJSON *vehicle_maintenance_j1939_check_engine_light_convertToJSON(vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_maintenance_j1939_check_engine_light->protectIsOn
    if(cJSON_AddBoolToObject(item, "protectIsOn", vehicle_maintenance_j1939_check_engine_light->protectIsOn) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_maintenance_j1939_check_engine_light->stopIsOn
    if(cJSON_AddBoolToObject(item, "stopIsOn", vehicle_maintenance_j1939_check_engine_light->stopIsOn) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_maintenance_j1939_check_engine_light->warningIsOn
    if(cJSON_AddBoolToObject(item, "warningIsOn", vehicle_maintenance_j1939_check_engine_light->warningIsOn) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_maintenance_j1939_check_engine_light->emissionsIsOn
    if(cJSON_AddBoolToObject(item, "emissionsIsOn", vehicle_maintenance_j1939_check_engine_light->emissionsIsOn) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light_parseFromJSON(char *jsonString){

    vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light = NULL;
    cJSON *vehicle_maintenance_j1939_check_engine_lightJSON = cJSON_Parse(jsonString);
    if(vehicle_maintenance_j1939_check_engine_lightJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_maintenance_j1939_check_engine_light->protectIsOn
    cJSON *protectIsOn = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_check_engine_lightJSON, "protectIsOn");
    if(!cJSON_IsBool(protectIsOn))
    {
    goto end; //Numeric
    }

    // vehicle_maintenance_j1939_check_engine_light->stopIsOn
    cJSON *stopIsOn = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_check_engine_lightJSON, "stopIsOn");
    if(!cJSON_IsBool(stopIsOn))
    {
    goto end; //Numeric
    }

    // vehicle_maintenance_j1939_check_engine_light->warningIsOn
    cJSON *warningIsOn = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_check_engine_lightJSON, "warningIsOn");
    if(!cJSON_IsBool(warningIsOn))
    {
    goto end; //Numeric
    }

    // vehicle_maintenance_j1939_check_engine_light->emissionsIsOn
    cJSON *emissionsIsOn = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_check_engine_lightJSON, "emissionsIsOn");
    if(!cJSON_IsBool(emissionsIsOn))
    {
    goto end; //Numeric
    }


    vehicle_maintenance_j1939_check_engine_light = vehicle_maintenance_j1939_check_engine_light_create (
        protectIsOn->valueint,
        stopIsOn->valueint,
        warningIsOn->valueint,
        emissionsIsOn->valueint
        );
 cJSON_Delete(vehicle_maintenance_j1939_check_engine_lightJSON);
    return vehicle_maintenance_j1939_check_engine_light;
end:
    cJSON_Delete(vehicle_maintenance_j1939_check_engine_lightJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_maintenance.h"



vehicle_maintenance_t *vehicle_maintenance_create(
    long id,
    vehicle_maintenance_j1939_t *j1939,
    vehicle_maintenance_passenger_t *passenger
    ) {
	vehicle_maintenance_t *vehicle_maintenance = malloc(sizeof(vehicle_maintenance_t));
	vehicle_maintenance->id = id;
	vehicle_maintenance->j1939 = j1939;
	vehicle_maintenance->passenger = passenger;

	return vehicle_maintenance;
}


void vehicle_maintenance_free(vehicle_maintenance_t *vehicle_maintenance) {
    listEntry_t *listEntry;
	vehicle_maintenance_j1939_free(vehicle_maintenance->j1939);
	vehicle_maintenance_passenger_free(vehicle_maintenance->passenger);

	free(vehicle_maintenance);
}

cJSON *vehicle_maintenance_convertToJSON(vehicle_maintenance_t *vehicle_maintenance) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_maintenance->id
    if(cJSON_AddNumberToObject(item, "id", vehicle_maintenance->id) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_maintenance->j1939
	cJSON *j1939 = vehicle_maintenance_j1939_convertToJSON(vehicle_maintenance->j1939);
	if(j1939 == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "j1939", j1939);
	if(item->child == NULL) {
		goto fail;
	}

	// vehicle_maintenance->passenger
	cJSON *passenger = vehicle_maintenance_passenger_convertToJSON(vehicle_maintenance->passenger);
	if(passenger == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "passenger", passenger);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_maintenance_t *vehicle_maintenance_parseFromJSON(char *jsonString){

    vehicle_maintenance_t *vehicle_maintenance = NULL;
    cJSON *vehicle_maintenanceJSON = cJSON_Parse(jsonString);
    if(vehicle_maintenanceJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_maintenance->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(vehicle_maintenanceJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // vehicle_maintenance->j1939
    vehicle_maintenance_j1939_t *j1939;
    cJSON *j1939JSON = cJSON_GetObjectItemCaseSensitive(vehicle_maintenanceJSON, "j1939");
    if(vehicle_maintenanceJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *j1939JSONData = cJSON_Print(j1939JSON);
    j1939 = vehicle_maintenance_j1939_parseFromJSON(j1939JSONData);

    // vehicle_maintenance->passenger
    vehicle_maintenance_passenger_t *passenger;
    cJSON *passengerJSON = cJSON_GetObjectItemCaseSensitive(vehicle_maintenanceJSON, "passenger");
    if(vehicle_maintenanceJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *passengerJSONData = cJSON_Print(passengerJSON);
    passenger = vehicle_maintenance_passenger_parseFromJSON(passengerJSONData);


    vehicle_maintenance = vehicle_maintenance_create (
        id->valuedouble,
        j1939,
        passenger
        );
        free(j1939JSONData);
        free(passengerJSONData);
 cJSON_Delete(vehicle_maintenanceJSON);
    return vehicle_maintenance;
end:
    cJSON_Delete(vehicle_maintenanceJSON);
    return NULL;

}


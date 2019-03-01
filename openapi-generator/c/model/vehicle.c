#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle.h"



vehicle_t *vehicle_create(
    long engineHours,
    double fuelLevelPercent,
    long id,
    char *name,
    char *note,
    long odometerMeters,
    char *vin
    ) {
	vehicle_t *vehicle = malloc(sizeof(vehicle_t));
	vehicle->engineHours = engineHours;
	vehicle->fuelLevelPercent = fuelLevelPercent;
	vehicle->id = id;
	vehicle->name = name;
	vehicle->note = note;
	vehicle->odometerMeters = odometerMeters;
	vehicle->vin = vin;

	return vehicle;
}


void vehicle_free(vehicle_t *vehicle) {
    listEntry_t *listEntry;
    free(vehicle->name);
    free(vehicle->note);
    free(vehicle->vin);

	free(vehicle);
}

cJSON *vehicle_convertToJSON(vehicle_t *vehicle) {
	cJSON *item = cJSON_CreateObject();
	// vehicle->engineHours
    if(cJSON_AddNumberToObject(item, "engineHours", vehicle->engineHours) == NULL) {
    goto fail; //Numeric
    }

	// vehicle->fuelLevelPercent
    if(cJSON_AddNumberToObject(item, "fuelLevelPercent", vehicle->fuelLevelPercent) == NULL) {
    goto fail; //Numeric
    }

	// vehicle->id
    if(cJSON_AddNumberToObject(item, "id", vehicle->id) == NULL) {
    goto fail; //Numeric
    }

	// vehicle->name
    if(cJSON_AddStringToObject(item, "name", vehicle->name) == NULL) {
    goto fail; //String
    }

	// vehicle->note
    if(cJSON_AddStringToObject(item, "note", vehicle->note) == NULL) {
    goto fail; //String
    }

	// vehicle->odometerMeters
    if(cJSON_AddNumberToObject(item, "odometerMeters", vehicle->odometerMeters) == NULL) {
    goto fail; //Numeric
    }

	// vehicle->vin
    if(cJSON_AddStringToObject(item, "vin", vehicle->vin) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_t *vehicle_parseFromJSON(char *jsonString){

    vehicle_t *vehicle = NULL;
    cJSON *vehicleJSON = cJSON_Parse(jsonString);
    if(vehicleJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle->engineHours
    cJSON *engineHours = cJSON_GetObjectItemCaseSensitive(vehicleJSON, "engineHours");
    if(!cJSON_IsNumber(engineHours))
    {
    goto end; //Numeric
    }

    // vehicle->fuelLevelPercent
    cJSON *fuelLevelPercent = cJSON_GetObjectItemCaseSensitive(vehicleJSON, "fuelLevelPercent");
    if(!cJSON_IsNumber(fuelLevelPercent))
    {
    goto end; //Numeric
    }

    // vehicle->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(vehicleJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // vehicle->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(vehicleJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // vehicle->note
    cJSON *note = cJSON_GetObjectItemCaseSensitive(vehicleJSON, "note");
    if(!cJSON_IsString(note) || (note->valuestring == NULL)){
    goto end; //String
    }

    // vehicle->odometerMeters
    cJSON *odometerMeters = cJSON_GetObjectItemCaseSensitive(vehicleJSON, "odometerMeters");
    if(!cJSON_IsNumber(odometerMeters))
    {
    goto end; //Numeric
    }

    // vehicle->vin
    cJSON *vin = cJSON_GetObjectItemCaseSensitive(vehicleJSON, "vin");
    if(!cJSON_IsString(vin) || (vin->valuestring == NULL)){
    goto end; //String
    }


    vehicle = vehicle_create (
        engineHours->valuedouble,
        fuelLevelPercent->valuedouble,
        id->valuedouble,
        strdup(name->valuestring),
        strdup(note->valuestring),
        odometerMeters->valuedouble,
        strdup(vin->valuestring)
        );
 cJSON_Delete(vehicleJSON);
    return vehicle;
end:
    cJSON_Delete(vehicleJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fleet_vehicle_response_vehicle_info.h"



fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info_create(
    long year,
    char *model,
    char *vin,
    char *make
    ) {
	fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info = malloc(sizeof(fleet_vehicle_response_vehicle_info_t));
	fleet_vehicle_response_vehicle_info->year = year;
	fleet_vehicle_response_vehicle_info->model = model;
	fleet_vehicle_response_vehicle_info->vin = vin;
	fleet_vehicle_response_vehicle_info->make = make;

	return fleet_vehicle_response_vehicle_info;
}


void fleet_vehicle_response_vehicle_info_free(fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info) {
    listEntry_t *listEntry;
    free(fleet_vehicle_response_vehicle_info->model);
    free(fleet_vehicle_response_vehicle_info->vin);
    free(fleet_vehicle_response_vehicle_info->make);

	free(fleet_vehicle_response_vehicle_info);
}

cJSON *fleet_vehicle_response_vehicle_info_convertToJSON(fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info) {
	cJSON *item = cJSON_CreateObject();
	// fleet_vehicle_response_vehicle_info->year
    if(cJSON_AddNumberToObject(item, "year", fleet_vehicle_response_vehicle_info->year) == NULL) {
    goto fail; //Numeric
    }

	// fleet_vehicle_response_vehicle_info->model
    if(cJSON_AddStringToObject(item, "model", fleet_vehicle_response_vehicle_info->model) == NULL) {
    goto fail; //String
    }

	// fleet_vehicle_response_vehicle_info->vin
    if(cJSON_AddStringToObject(item, "vin", fleet_vehicle_response_vehicle_info->vin) == NULL) {
    goto fail; //String
    }

	// fleet_vehicle_response_vehicle_info->make
    if(cJSON_AddStringToObject(item, "make", fleet_vehicle_response_vehicle_info->make) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info_parseFromJSON(char *jsonString){

    fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info = NULL;
    cJSON *fleet_vehicle_response_vehicle_infoJSON = cJSON_Parse(jsonString);
    if(fleet_vehicle_response_vehicle_infoJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // fleet_vehicle_response_vehicle_info->year
    cJSON *year = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_response_vehicle_infoJSON, "year");
    if(!cJSON_IsNumber(year))
    {
    goto end; //Numeric
    }

    // fleet_vehicle_response_vehicle_info->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_response_vehicle_infoJSON, "model");
    if(!cJSON_IsString(model) || (model->valuestring == NULL)){
    goto end; //String
    }

    // fleet_vehicle_response_vehicle_info->vin
    cJSON *vin = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_response_vehicle_infoJSON, "vin");
    if(!cJSON_IsString(vin) || (vin->valuestring == NULL)){
    goto end; //String
    }

    // fleet_vehicle_response_vehicle_info->make
    cJSON *make = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_response_vehicle_infoJSON, "make");
    if(!cJSON_IsString(make) || (make->valuestring == NULL)){
    goto end; //String
    }


    fleet_vehicle_response_vehicle_info = fleet_vehicle_response_vehicle_info_create (
        year->valuedouble,
        strdup(model->valuestring),
        strdup(vin->valuestring),
        strdup(make->valuestring)
        );
 cJSON_Delete(fleet_vehicle_response_vehicle_infoJSON);
    return fleet_vehicle_response_vehicle_info;
end:
    cJSON_Delete(fleet_vehicle_response_vehicle_infoJSON);
    return NULL;

}


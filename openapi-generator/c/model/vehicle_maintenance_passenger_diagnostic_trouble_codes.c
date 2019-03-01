#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_maintenance_passenger_diagnostic_trouble_codes.h"



vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes_create(
    char *dtcShortCode,
    int dtcId,
    char *dtcDescription
    ) {
	vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes = malloc(sizeof(vehicle_maintenance_passenger_diagnostic_trouble_codes_t));
	vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcShortCode = dtcShortCode;
	vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcId = dtcId;
	vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcDescription = dtcDescription;

	return vehicle_maintenance_passenger_diagnostic_trouble_codes;
}


void vehicle_maintenance_passenger_diagnostic_trouble_codes_free(vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes) {
    listEntry_t *listEntry;
    free(vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcShortCode);
    free(vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcDescription);

	free(vehicle_maintenance_passenger_diagnostic_trouble_codes);
}

cJSON *vehicle_maintenance_passenger_diagnostic_trouble_codes_convertToJSON(vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcShortCode
    if(cJSON_AddStringToObject(item, "dtcShortCode", vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcShortCode) == NULL) {
    goto fail; //String
    }

	// vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcId
    if(cJSON_AddNumberToObject(item, "dtcId", vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcId) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcDescription
    if(cJSON_AddStringToObject(item, "dtcDescription", vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcDescription) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes_parseFromJSON(char *jsonString){

    vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes = NULL;
    cJSON *vehicle_maintenance_passenger_diagnostic_trouble_codesJSON = cJSON_Parse(jsonString);
    if(vehicle_maintenance_passenger_diagnostic_trouble_codesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcShortCode
    cJSON *dtcShortCode = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_passenger_diagnostic_trouble_codesJSON, "dtcShortCode");
    if(!cJSON_IsString(dtcShortCode) || (dtcShortCode->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcId
    cJSON *dtcId = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_passenger_diagnostic_trouble_codesJSON, "dtcId");
    if(!cJSON_IsNumber(dtcId))
    {
    goto end; //Numeric
    }

    // vehicle_maintenance_passenger_diagnostic_trouble_codes->dtcDescription
    cJSON *dtcDescription = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_passenger_diagnostic_trouble_codesJSON, "dtcDescription");
    if(!cJSON_IsString(dtcDescription) || (dtcDescription->valuestring == NULL)){
    goto end; //String
    }


    vehicle_maintenance_passenger_diagnostic_trouble_codes = vehicle_maintenance_passenger_diagnostic_trouble_codes_create (
        strdup(dtcShortCode->valuestring),
        dtcId->valuedouble,
        strdup(dtcDescription->valuestring)
        );
 cJSON_Delete(vehicle_maintenance_passenger_diagnostic_trouble_codesJSON);
    return vehicle_maintenance_passenger_diagnostic_trouble_codes;
end:
    cJSON_Delete(vehicle_maintenance_passenger_diagnostic_trouble_codesJSON);
    return NULL;

}


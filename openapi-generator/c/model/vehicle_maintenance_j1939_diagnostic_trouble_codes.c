#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_maintenance_j1939_diagnostic_trouble_codes.h"



vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes_create(
    char *spnDescription,
    char *fmiText,
    int spnId,
    int occurrenceCount,
    int txId,
    int fmiId
    ) {
	vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes = malloc(sizeof(vehicle_maintenance_j1939_diagnostic_trouble_codes_t));
	vehicle_maintenance_j1939_diagnostic_trouble_codes->spnDescription = spnDescription;
	vehicle_maintenance_j1939_diagnostic_trouble_codes->fmiText = fmiText;
	vehicle_maintenance_j1939_diagnostic_trouble_codes->spnId = spnId;
	vehicle_maintenance_j1939_diagnostic_trouble_codes->occurrenceCount = occurrenceCount;
	vehicle_maintenance_j1939_diagnostic_trouble_codes->txId = txId;
	vehicle_maintenance_j1939_diagnostic_trouble_codes->fmiId = fmiId;

	return vehicle_maintenance_j1939_diagnostic_trouble_codes;
}


void vehicle_maintenance_j1939_diagnostic_trouble_codes_free(vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes) {
    listEntry_t *listEntry;
    free(vehicle_maintenance_j1939_diagnostic_trouble_codes->spnDescription);
    free(vehicle_maintenance_j1939_diagnostic_trouble_codes->fmiText);

	free(vehicle_maintenance_j1939_diagnostic_trouble_codes);
}

cJSON *vehicle_maintenance_j1939_diagnostic_trouble_codes_convertToJSON(vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_maintenance_j1939_diagnostic_trouble_codes->spnDescription
    if(cJSON_AddStringToObject(item, "spnDescription", vehicle_maintenance_j1939_diagnostic_trouble_codes->spnDescription) == NULL) {
    goto fail; //String
    }

	// vehicle_maintenance_j1939_diagnostic_trouble_codes->fmiText
    if(cJSON_AddStringToObject(item, "fmiText", vehicle_maintenance_j1939_diagnostic_trouble_codes->fmiText) == NULL) {
    goto fail; //String
    }

	// vehicle_maintenance_j1939_diagnostic_trouble_codes->spnId
    if(cJSON_AddNumberToObject(item, "spnId", vehicle_maintenance_j1939_diagnostic_trouble_codes->spnId) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_maintenance_j1939_diagnostic_trouble_codes->occurrenceCount
    if(cJSON_AddNumberToObject(item, "occurrenceCount", vehicle_maintenance_j1939_diagnostic_trouble_codes->occurrenceCount) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_maintenance_j1939_diagnostic_trouble_codes->txId
    if(cJSON_AddNumberToObject(item, "txId", vehicle_maintenance_j1939_diagnostic_trouble_codes->txId) == NULL) {
    goto fail; //Numeric
    }

	// vehicle_maintenance_j1939_diagnostic_trouble_codes->fmiId
    if(cJSON_AddNumberToObject(item, "fmiId", vehicle_maintenance_j1939_diagnostic_trouble_codes->fmiId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes_parseFromJSON(char *jsonString){

    vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes = NULL;
    cJSON *vehicle_maintenance_j1939_diagnostic_trouble_codesJSON = cJSON_Parse(jsonString);
    if(vehicle_maintenance_j1939_diagnostic_trouble_codesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_maintenance_j1939_diagnostic_trouble_codes->spnDescription
    cJSON *spnDescription = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_diagnostic_trouble_codesJSON, "spnDescription");
    if(!cJSON_IsString(spnDescription) || (spnDescription->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_maintenance_j1939_diagnostic_trouble_codes->fmiText
    cJSON *fmiText = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_diagnostic_trouble_codesJSON, "fmiText");
    if(!cJSON_IsString(fmiText) || (fmiText->valuestring == NULL)){
    goto end; //String
    }

    // vehicle_maintenance_j1939_diagnostic_trouble_codes->spnId
    cJSON *spnId = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_diagnostic_trouble_codesJSON, "spnId");
    if(!cJSON_IsNumber(spnId))
    {
    goto end; //Numeric
    }

    // vehicle_maintenance_j1939_diagnostic_trouble_codes->occurrenceCount
    cJSON *occurrenceCount = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_diagnostic_trouble_codesJSON, "occurrenceCount");
    if(!cJSON_IsNumber(occurrenceCount))
    {
    goto end; //Numeric
    }

    // vehicle_maintenance_j1939_diagnostic_trouble_codes->txId
    cJSON *txId = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_diagnostic_trouble_codesJSON, "txId");
    if(!cJSON_IsNumber(txId))
    {
    goto end; //Numeric
    }

    // vehicle_maintenance_j1939_diagnostic_trouble_codes->fmiId
    cJSON *fmiId = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939_diagnostic_trouble_codesJSON, "fmiId");
    if(!cJSON_IsNumber(fmiId))
    {
    goto end; //Numeric
    }


    vehicle_maintenance_j1939_diagnostic_trouble_codes = vehicle_maintenance_j1939_diagnostic_trouble_codes_create (
        strdup(spnDescription->valuestring),
        strdup(fmiText->valuestring),
        spnId->valuedouble,
        occurrenceCount->valuedouble,
        txId->valuedouble,
        fmiId->valuedouble
        );
 cJSON_Delete(vehicle_maintenance_j1939_diagnostic_trouble_codesJSON);
    return vehicle_maintenance_j1939_diagnostic_trouble_codes;
end:
    cJSON_Delete(vehicle_maintenance_j1939_diagnostic_trouble_codesJSON);
    return NULL;

}


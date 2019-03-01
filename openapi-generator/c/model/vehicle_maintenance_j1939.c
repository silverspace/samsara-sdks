#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vehicle_maintenance_j1939.h"



vehicle_maintenance_j1939_t *vehicle_maintenance_j1939_create(
    vehicle_maintenance_j1939_check_engine_light_t *checkEngineLight,
    list_t *diagnosticTroubleCodes
    ) {
	vehicle_maintenance_j1939_t *vehicle_maintenance_j1939 = malloc(sizeof(vehicle_maintenance_j1939_t));
	vehicle_maintenance_j1939->checkEngineLight = checkEngineLight;
	vehicle_maintenance_j1939->diagnosticTroubleCodes = diagnosticTroubleCodes;

	return vehicle_maintenance_j1939;
}


void vehicle_maintenance_j1939_free(vehicle_maintenance_j1939_t *vehicle_maintenance_j1939) {
    listEntry_t *listEntry;
	vehicle_maintenance_j1939_check_engine_light_free(vehicle_maintenance_j1939->checkEngineLight);
		list_ForEach(listEntry, vehicle_maintenance_j1939->diagnosticTroubleCodes) {
		vehicle_maintenance_j1939_diagnostic_trouble_codes_free(listEntry->data);
	}
	list_free(vehicle_maintenance_j1939->diagnosticTroubleCodes);

	free(vehicle_maintenance_j1939);
}

cJSON *vehicle_maintenance_j1939_convertToJSON(vehicle_maintenance_j1939_t *vehicle_maintenance_j1939) {
	cJSON *item = cJSON_CreateObject();
	// vehicle_maintenance_j1939->checkEngineLight
	cJSON *checkEngineLight = vehicle_maintenance_j1939_check_engine_light_convertToJSON(vehicle_maintenance_j1939->checkEngineLight);
	if(checkEngineLight == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "checkEngineLight", checkEngineLight);
	if(item->child == NULL) {
		goto fail;
	}

	// vehicle_maintenance_j1939->diagnosticTroubleCodes
    cJSON *diagnosticTroubleCodes = cJSON_AddArrayToObject(item, "diagnosticTroubleCodes");
	if(diagnosticTroubleCodes == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *diagnosticTroubleCodesListEntry;
	list_ForEach(diagnosticTroubleCodesListEntry, vehicle_maintenance_j1939->diagnosticTroubleCodes) {
		cJSON *item = vehicle_maintenance_j1939_diagnostic_trouble_codes_convertToJSON(diagnosticTroubleCodesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(diagnosticTroubleCodes, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

vehicle_maintenance_j1939_t *vehicle_maintenance_j1939_parseFromJSON(char *jsonString){

    vehicle_maintenance_j1939_t *vehicle_maintenance_j1939 = NULL;
    cJSON *vehicle_maintenance_j1939JSON = cJSON_Parse(jsonString);
    if(vehicle_maintenance_j1939JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // vehicle_maintenance_j1939->checkEngineLight
    vehicle_maintenance_j1939_check_engine_light_t *checkEngineLight;
    cJSON *checkEngineLightJSON = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939JSON, "checkEngineLight");
    if(vehicle_maintenance_j1939JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *checkEngineLightJSONData = cJSON_Print(checkEngineLightJSON);
    checkEngineLight = vehicle_maintenance_j1939_check_engine_light_parseFromJSON(checkEngineLightJSONData);

    // vehicle_maintenance_j1939->diagnosticTroubleCodes
    cJSON *diagnosticTroubleCodes;
    cJSON *diagnosticTroubleCodesJSON = cJSON_GetObjectItemCaseSensitive(vehicle_maintenance_j1939JSON,"diagnosticTroubleCodes");
    if(!cJSON_IsArray(diagnosticTroubleCodesJSON)){
        goto end; //nonprimitive container
    }

    list_t *diagnosticTroubleCodesList = list_create();

    cJSON_ArrayForEach(diagnosticTroubleCodes,diagnosticTroubleCodesJSON )
    {
        if(!cJSON_IsObject(diagnosticTroubleCodes)){
            goto end;
        }
		char *JSONData = cJSON_Print(diagnosticTroubleCodes);
        vehicle_maintenance_j1939_diagnostic_trouble_codes_t *diagnosticTroubleCodesItem = vehicle_maintenance_j1939_diagnostic_trouble_codes_parseFromJSON(JSONData);

        list_addElement(diagnosticTroubleCodesList, diagnosticTroubleCodesItem);
        free(JSONData);
    }


    vehicle_maintenance_j1939 = vehicle_maintenance_j1939_create (
        checkEngineLight,
        diagnosticTroubleCodesList
        );
        free(checkEngineLightJSONData);
 cJSON_Delete(vehicle_maintenance_j1939JSON);
    return vehicle_maintenance_j1939;
end:
    cJSON_Delete(vehicle_maintenance_j1939JSON);
    return NULL;

}


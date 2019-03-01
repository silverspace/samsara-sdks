#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_5_vehicle_stats.h"



inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats_create(
    list_t *engineState,
    aux_input_series_t *auxInput2,
    long vehicleId,
    aux_input_series_t *auxInput1
    ) {
	inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats = malloc(sizeof(inline_response_200_5_vehicle_stats_t));
	inline_response_200_5_vehicle_stats->engineState = engineState;
	inline_response_200_5_vehicle_stats->auxInput2 = auxInput2;
	inline_response_200_5_vehicle_stats->vehicleId = vehicleId;
	inline_response_200_5_vehicle_stats->auxInput1 = auxInput1;

	return inline_response_200_5_vehicle_stats;
}


void inline_response_200_5_vehicle_stats_free(inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_response_200_5_vehicle_stats->engineState) {
		engine_state_free(listEntry->data);
	}
	list_free(inline_response_200_5_vehicle_stats->engineState);
	aux_input_series_free(inline_response_200_5_vehicle_stats->auxInput2);
	aux_input_series_free(inline_response_200_5_vehicle_stats->auxInput1);

	free(inline_response_200_5_vehicle_stats);
}

cJSON *inline_response_200_5_vehicle_stats_convertToJSON(inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200_5_vehicle_stats->engineState
    cJSON *engineState = cJSON_AddArrayToObject(item, "engineState");
	if(engineState == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *engineStateListEntry;
	list_ForEach(engineStateListEntry, inline_response_200_5_vehicle_stats->engineState) {
		cJSON *item = engine_state_convertToJSON(engineStateListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(engineState, item);
	}

	// inline_response_200_5_vehicle_stats->auxInput2
	cJSON *auxInput2 = aux_input_series_convertToJSON(inline_response_200_5_vehicle_stats->auxInput2);
	if(auxInput2 == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "auxInput2", auxInput2);
	if(item->child == NULL) {
		goto fail;
	}

	// inline_response_200_5_vehicle_stats->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", inline_response_200_5_vehicle_stats->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	// inline_response_200_5_vehicle_stats->auxInput1
	cJSON *auxInput1 = aux_input_series_convertToJSON(inline_response_200_5_vehicle_stats->auxInput1);
	if(auxInput1 == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "auxInput1", auxInput1);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats_parseFromJSON(char *jsonString){

    inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats = NULL;
    cJSON *inline_response_200_5_vehicle_statsJSON = cJSON_Parse(jsonString);
    if(inline_response_200_5_vehicle_statsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200_5_vehicle_stats->engineState
    cJSON *engineState;
    cJSON *engineStateJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_5_vehicle_statsJSON,"engineState");
    if(!cJSON_IsArray(engineStateJSON)){
        goto end; //nonprimitive container
    }

    list_t *engineStateList = list_create();

    cJSON_ArrayForEach(engineState,engineStateJSON )
    {
        if(!cJSON_IsObject(engineState)){
            goto end;
        }
		char *JSONData = cJSON_Print(engineState);
        engine_state_t *engineStateItem = engine_state_parseFromJSON(JSONData);

        list_addElement(engineStateList, engineStateItem);
        free(JSONData);
    }

    // inline_response_200_5_vehicle_stats->auxInput2
    aux_input_series_t *auxInput2;
    cJSON *auxInput2JSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_5_vehicle_statsJSON, "auxInput2");
    if(inline_response_200_5_vehicle_statsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *auxInput2JSONData = cJSON_Print(auxInput2JSON);
    auxInput2 = aux_input_series_parseFromJSON(auxInput2JSONData);

    // inline_response_200_5_vehicle_stats->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(inline_response_200_5_vehicle_statsJSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }

    // inline_response_200_5_vehicle_stats->auxInput1
    aux_input_series_t *auxInput1;
    cJSON *auxInput1JSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_5_vehicle_statsJSON, "auxInput1");
    if(inline_response_200_5_vehicle_statsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *auxInput1JSONData = cJSON_Print(auxInput1JSON);
    auxInput1 = aux_input_series_parseFromJSON(auxInput1JSONData);


    inline_response_200_5_vehicle_stats = inline_response_200_5_vehicle_stats_create (
        engineStateList,
        auxInput2,
        vehicleId->valuedouble,
        auxInput1
        );
        free(auxInput2JSONData);
        free(auxInput1JSONData);
 cJSON_Delete(inline_response_200_5_vehicle_statsJSON);
    return inline_response_200_5_vehicle_stats;
end:
    cJSON_Delete(inline_response_200_5_vehicle_statsJSON);
    return NULL;

}


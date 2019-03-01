#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_4.h"



inline_response_200_4_t *inline_response_200_4_create(
    list_t *vehicles
    ) {
	inline_response_200_4_t *inline_response_200_4 = malloc(sizeof(inline_response_200_4_t));
	inline_response_200_4->vehicles = vehicles;

	return inline_response_200_4;
}


void inline_response_200_4_free(inline_response_200_4_t *inline_response_200_4) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_response_200_4->vehicles) {
		vehicle_maintenance_free(listEntry->data);
	}
	list_free(inline_response_200_4->vehicles);

	free(inline_response_200_4);
}

cJSON *inline_response_200_4_convertToJSON(inline_response_200_4_t *inline_response_200_4) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200_4->vehicles
    cJSON *vehicles = cJSON_AddArrayToObject(item, "vehicles");
	if(vehicles == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehiclesListEntry;
	list_ForEach(vehiclesListEntry, inline_response_200_4->vehicles) {
		cJSON *item = vehicle_maintenance_convertToJSON(vehiclesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(vehicles, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_200_4_t *inline_response_200_4_parseFromJSON(char *jsonString){

    inline_response_200_4_t *inline_response_200_4 = NULL;
    cJSON *inline_response_200_4JSON = cJSON_Parse(jsonString);
    if(inline_response_200_4JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200_4->vehicles
    cJSON *vehicles;
    cJSON *vehiclesJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_4JSON,"vehicles");
    if(!cJSON_IsArray(vehiclesJSON)){
        goto end; //nonprimitive container
    }

    list_t *vehiclesList = list_create();

    cJSON_ArrayForEach(vehicles,vehiclesJSON )
    {
        if(!cJSON_IsObject(vehicles)){
            goto end;
        }
		char *JSONData = cJSON_Print(vehicles);
        vehicle_maintenance_t *vehiclesItem = vehicle_maintenance_parseFromJSON(JSONData);

        list_addElement(vehiclesList, vehiclesItem);
        free(JSONData);
    }


    inline_response_200_4 = inline_response_200_4_create (
        vehiclesList
        );
 cJSON_Delete(inline_response_200_4JSON);
    return inline_response_200_4;
end:
    cJSON_Delete(inline_response_200_4JSON);
    return NULL;

}


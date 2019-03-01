#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_3.h"



inline_response_200_3_t *inline_response_200_3_create(
    long groupId,
    list_t *vehicles
    ) {
	inline_response_200_3_t *inline_response_200_3 = malloc(sizeof(inline_response_200_3_t));
	inline_response_200_3->groupId = groupId;
	inline_response_200_3->vehicles = vehicles;

	return inline_response_200_3;
}


void inline_response_200_3_free(inline_response_200_3_t *inline_response_200_3) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_response_200_3->vehicles) {
		vehicle_location_free(listEntry->data);
	}
	list_free(inline_response_200_3->vehicles);

	free(inline_response_200_3);
}

cJSON *inline_response_200_3_convertToJSON(inline_response_200_3_t *inline_response_200_3) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200_3->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_response_200_3->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_response_200_3->vehicles
    cJSON *vehicles = cJSON_AddArrayToObject(item, "vehicles");
	if(vehicles == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehiclesListEntry;
	list_ForEach(vehiclesListEntry, inline_response_200_3->vehicles) {
		cJSON *item = vehicle_location_convertToJSON(vehiclesListEntry->data);
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

inline_response_200_3_t *inline_response_200_3_parseFromJSON(char *jsonString){

    inline_response_200_3_t *inline_response_200_3 = NULL;
    cJSON *inline_response_200_3JSON = cJSON_Parse(jsonString);
    if(inline_response_200_3JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200_3->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_response_200_3JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_response_200_3->vehicles
    cJSON *vehicles;
    cJSON *vehiclesJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_3JSON,"vehicles");
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
        vehicle_location_t *vehiclesItem = vehicle_location_parseFromJSON(JSONData);

        list_addElement(vehiclesList, vehiclesItem);
        free(JSONData);
    }


    inline_response_200_3 = inline_response_200_3_create (
        groupId->valuedouble,
        vehiclesList
        );
 cJSON_Delete(inline_response_200_3JSON);
    return inline_response_200_3;
end:
    cJSON_Delete(inline_response_200_3JSON);
    return NULL;

}


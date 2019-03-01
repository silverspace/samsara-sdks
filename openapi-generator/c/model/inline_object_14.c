#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_14.h"



inline_object_14_t *inline_object_14_create(
    long groupId,
    list_t *vehicles
    ) {
	inline_object_14_t *inline_object_14 = malloc(sizeof(inline_object_14_t));
	inline_object_14->groupId = groupId;
	inline_object_14->vehicles = vehicles;

	return inline_object_14;
}


void inline_object_14_free(inline_object_14_t *inline_object_14) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_object_14->vehicles) {
		vehicle_free(listEntry->data);
	}
	list_free(inline_object_14->vehicles);

	free(inline_object_14);
}

cJSON *inline_object_14_convertToJSON(inline_object_14_t *inline_object_14) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_14->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_14->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_14->vehicles
    cJSON *vehicles = cJSON_AddArrayToObject(item, "vehicles");
	if(vehicles == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehiclesListEntry;
	list_ForEach(vehiclesListEntry, inline_object_14->vehicles) {
		cJSON *item = vehicle_convertToJSON(vehiclesListEntry->data);
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

inline_object_14_t *inline_object_14_parseFromJSON(char *jsonString){

    inline_object_14_t *inline_object_14 = NULL;
    cJSON *inline_object_14JSON = cJSON_Parse(jsonString);
    if(inline_object_14JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_14->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_14JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_object_14->vehicles
    cJSON *vehicles;
    cJSON *vehiclesJSON = cJSON_GetObjectItemCaseSensitive(inline_object_14JSON,"vehicles");
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
        vehicle_t *vehiclesItem = vehicle_parseFromJSON(JSONData);

        list_addElement(vehiclesList, vehiclesItem);
        free(JSONData);
    }


    inline_object_14 = inline_object_14_create (
        groupId->valuedouble,
        vehiclesList
        );
 cJSON_Delete(inline_object_14JSON);
    return inline_object_14;
end:
    cJSON_Delete(inline_object_14JSON);
    return NULL;

}


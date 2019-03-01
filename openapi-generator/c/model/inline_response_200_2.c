#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_2.h"



inline_response_200_2_t *inline_response_200_2_create(
    pagination_t *pagination,
    long groupId,
    list_t *vehicles
    ) {
	inline_response_200_2_t *inline_response_200_2 = malloc(sizeof(inline_response_200_2_t));
	inline_response_200_2->pagination = pagination;
	inline_response_200_2->groupId = groupId;
	inline_response_200_2->vehicles = vehicles;

	return inline_response_200_2;
}


void inline_response_200_2_free(inline_response_200_2_t *inline_response_200_2) {
    listEntry_t *listEntry;
	pagination_free(inline_response_200_2->pagination);
		list_ForEach(listEntry, inline_response_200_2->vehicles) {
		vehicle_free(listEntry->data);
	}
	list_free(inline_response_200_2->vehicles);

	free(inline_response_200_2);
}

cJSON *inline_response_200_2_convertToJSON(inline_response_200_2_t *inline_response_200_2) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200_2->pagination
	cJSON *pagination = pagination_convertToJSON(inline_response_200_2->pagination);
	if(pagination == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "pagination", pagination);
	if(item->child == NULL) {
		goto fail;
	}

	// inline_response_200_2->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_response_200_2->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_response_200_2->vehicles
    cJSON *vehicles = cJSON_AddArrayToObject(item, "vehicles");
	if(vehicles == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehiclesListEntry;
	list_ForEach(vehiclesListEntry, inline_response_200_2->vehicles) {
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

inline_response_200_2_t *inline_response_200_2_parseFromJSON(char *jsonString){

    inline_response_200_2_t *inline_response_200_2 = NULL;
    cJSON *inline_response_200_2JSON = cJSON_Parse(jsonString);
    if(inline_response_200_2JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200_2->pagination
    pagination_t *pagination;
    cJSON *paginationJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_2JSON, "pagination");
    if(inline_response_200_2JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *paginationJSONData = cJSON_Print(paginationJSON);
    pagination = pagination_parseFromJSON(paginationJSONData);

    // inline_response_200_2->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_response_200_2JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_response_200_2->vehicles
    cJSON *vehicles;
    cJSON *vehiclesJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_2JSON,"vehicles");
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


    inline_response_200_2 = inline_response_200_2_create (
        pagination,
        groupId->valuedouble,
        vehiclesList
        );
        free(paginationJSONData);
 cJSON_Delete(inline_response_200_2JSON);
    return inline_response_200_2;
end:
    cJSON_Delete(inline_response_200_2JSON);
    return NULL;

}


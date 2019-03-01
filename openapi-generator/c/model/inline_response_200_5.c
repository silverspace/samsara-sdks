#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_5.h"



inline_response_200_5_t *inline_response_200_5_create(
    pagination_t *pagination,
    list_t *vehicleStats
    ) {
	inline_response_200_5_t *inline_response_200_5 = malloc(sizeof(inline_response_200_5_t));
	inline_response_200_5->pagination = pagination;
	inline_response_200_5->vehicleStats = vehicleStats;

	return inline_response_200_5;
}


void inline_response_200_5_free(inline_response_200_5_t *inline_response_200_5) {
    listEntry_t *listEntry;
	pagination_free(inline_response_200_5->pagination);
		list_ForEach(listEntry, inline_response_200_5->vehicleStats) {
		inline_response_200_5_vehicle_stats_free(listEntry->data);
	}
	list_free(inline_response_200_5->vehicleStats);

	free(inline_response_200_5);
}

cJSON *inline_response_200_5_convertToJSON(inline_response_200_5_t *inline_response_200_5) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200_5->pagination
	cJSON *pagination = pagination_convertToJSON(inline_response_200_5->pagination);
	if(pagination == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "pagination", pagination);
	if(item->child == NULL) {
		goto fail;
	}

	// inline_response_200_5->vehicleStats
    cJSON *vehicleStats = cJSON_AddArrayToObject(item, "vehicleStats");
	if(vehicleStats == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehicleStatsListEntry;
	list_ForEach(vehicleStatsListEntry, inline_response_200_5->vehicleStats) {
		cJSON *item = inline_response_200_5_vehicle_stats_convertToJSON(vehicleStatsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(vehicleStats, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_200_5_t *inline_response_200_5_parseFromJSON(char *jsonString){

    inline_response_200_5_t *inline_response_200_5 = NULL;
    cJSON *inline_response_200_5JSON = cJSON_Parse(jsonString);
    if(inline_response_200_5JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200_5->pagination
    pagination_t *pagination;
    cJSON *paginationJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_5JSON, "pagination");
    if(inline_response_200_5JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *paginationJSONData = cJSON_Print(paginationJSON);
    pagination = pagination_parseFromJSON(paginationJSONData);

    // inline_response_200_5->vehicleStats
    cJSON *vehicleStats;
    cJSON *vehicleStatsJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_5JSON,"vehicleStats");
    if(!cJSON_IsArray(vehicleStatsJSON)){
        goto end; //nonprimitive container
    }

    list_t *vehicleStatsList = list_create();

    cJSON_ArrayForEach(vehicleStats,vehicleStatsJSON )
    {
        if(!cJSON_IsObject(vehicleStats)){
            goto end;
        }
		char *JSONData = cJSON_Print(vehicleStats);
        inline_response_200_5_vehicle_stats_t *vehicleStatsItem = inline_response_200_5_vehicle_stats_parseFromJSON(JSONData);

        list_addElement(vehicleStatsList, vehicleStatsItem);
        free(JSONData);
    }


    inline_response_200_5 = inline_response_200_5_create (
        pagination,
        vehicleStatsList
        );
        free(paginationJSONData);
 cJSON_Delete(inline_response_200_5JSON);
    return inline_response_200_5;
end:
    cJSON_Delete(inline_response_200_5JSON);
    return NULL;

}


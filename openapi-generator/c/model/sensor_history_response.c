#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "sensor_history_response.h"



sensor_history_response_t *sensor_history_response_create(
    list_t *results
    ) {
	sensor_history_response_t *sensor_history_response = malloc(sizeof(sensor_history_response_t));
	sensor_history_response->results = results;

	return sensor_history_response;
}


void sensor_history_response_free(sensor_history_response_t *sensor_history_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, sensor_history_response->results) {
		sensor_history_response_results_free(listEntry->data);
	}
	list_free(sensor_history_response->results);

	free(sensor_history_response);
}

cJSON *sensor_history_response_convertToJSON(sensor_history_response_t *sensor_history_response) {
	cJSON *item = cJSON_CreateObject();
	// sensor_history_response->results
    cJSON *results = cJSON_AddArrayToObject(item, "results");
	if(results == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *resultsListEntry;
	list_ForEach(resultsListEntry, sensor_history_response->results) {
		cJSON *item = sensor_history_response_results_convertToJSON(resultsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(results, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

sensor_history_response_t *sensor_history_response_parseFromJSON(char *jsonString){

    sensor_history_response_t *sensor_history_response = NULL;
    cJSON *sensor_history_responseJSON = cJSON_Parse(jsonString);
    if(sensor_history_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // sensor_history_response->results
    cJSON *results;
    cJSON *resultsJSON = cJSON_GetObjectItemCaseSensitive(sensor_history_responseJSON,"results");
    if(!cJSON_IsArray(resultsJSON)){
        goto end; //nonprimitive container
    }

    list_t *resultsList = list_create();

    cJSON_ArrayForEach(results,resultsJSON )
    {
        if(!cJSON_IsObject(results)){
            goto end;
        }
		char *JSONData = cJSON_Print(results);
        sensor_history_response_results_t *resultsItem = sensor_history_response_results_parseFromJSON(JSONData);

        list_addElement(resultsList, resultsItem);
        free(JSONData);
    }


    sensor_history_response = sensor_history_response_create (
        resultsList
        );
 cJSON_Delete(sensor_history_responseJSON);
    return sensor_history_response;
end:
    cJSON_Delete(sensor_history_responseJSON);
    return NULL;

}


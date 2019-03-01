#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "sensor_history_response_results.h"



sensor_history_response_results_t *sensor_history_response_results_create(
    list_t *series,
    int timeMs
    ) {
	sensor_history_response_results_t *sensor_history_response_results = malloc(sizeof(sensor_history_response_results_t));
	sensor_history_response_results->series = series;
	sensor_history_response_results->timeMs = timeMs;

	return sensor_history_response_results;
}


void sensor_history_response_results_free(sensor_history_response_results_t *sensor_history_response_results) {
    listEntry_t *listEntry;
	list_ForEach(listEntry, sensor_history_response_results->series) {
		free(listEntry->data);
	}
	list_free(sensor_history_response_results->series);

	free(sensor_history_response_results);
}

cJSON *sensor_history_response_results_convertToJSON(sensor_history_response_results_t *sensor_history_response_results) {
	cJSON *item = cJSON_CreateObject();
	// sensor_history_response_results->series
	cJSON *series = cJSON_AddArrayToObject(item, "series");
	if(series == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *seriesListEntry;
    list_ForEach(seriesListEntry, sensor_history_response_results->series) {
        if(cJSON_AddNumberToObject(series, "", *(double *)seriesListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	// sensor_history_response_results->timeMs
    if(cJSON_AddNumberToObject(item, "timeMs", sensor_history_response_results->timeMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

sensor_history_response_results_t *sensor_history_response_results_parseFromJSON(char *jsonString){

    sensor_history_response_results_t *sensor_history_response_results = NULL;
    cJSON *sensor_history_response_resultsJSON = cJSON_Parse(jsonString);
    if(sensor_history_response_resultsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // sensor_history_response_results->series
    cJSON *series;
    cJSON *seriesJSON = cJSON_GetObjectItemCaseSensitive(sensor_history_response_resultsJSON, "series");
    if(!cJSON_IsArray(seriesJSON)) {
        goto end;//primitive container
    }
    list_t *seriesList = list_create();

    cJSON_ArrayForEach(series, seriesJSON)
    {
        if(!cJSON_IsNumber(series))
        {
            goto end;
        }
        list_addElement(seriesList , &series->valuedouble);

    }

    // sensor_history_response_results->timeMs
    cJSON *timeMs = cJSON_GetObjectItemCaseSensitive(sensor_history_response_resultsJSON, "timeMs");
    if(!cJSON_IsNumber(timeMs))
    {
    goto end; //Numeric
    }


    sensor_history_response_results = sensor_history_response_results_create (
        seriesList,
        timeMs->valuedouble
        );
 cJSON_Delete(sensor_history_response_resultsJSON);
    return sensor_history_response_results;
end:
    cJSON_Delete(sensor_history_response_resultsJSON);
    return NULL;

}


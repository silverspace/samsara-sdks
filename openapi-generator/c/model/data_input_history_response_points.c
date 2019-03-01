#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "data_input_history_response_points.h"



data_input_history_response_points_t *data_input_history_response_points_create(
    double value,
    long timeMs
    ) {
	data_input_history_response_points_t *data_input_history_response_points = malloc(sizeof(data_input_history_response_points_t));
	data_input_history_response_points->value = value;
	data_input_history_response_points->timeMs = timeMs;

	return data_input_history_response_points;
}


void data_input_history_response_points_free(data_input_history_response_points_t *data_input_history_response_points) {
    listEntry_t *listEntry;

	free(data_input_history_response_points);
}

cJSON *data_input_history_response_points_convertToJSON(data_input_history_response_points_t *data_input_history_response_points) {
	cJSON *item = cJSON_CreateObject();
	// data_input_history_response_points->value
    if(cJSON_AddNumberToObject(item, "value", data_input_history_response_points->value) == NULL) {
    goto fail; //Numeric
    }

	// data_input_history_response_points->timeMs
    if(cJSON_AddNumberToObject(item, "timeMs", data_input_history_response_points->timeMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

data_input_history_response_points_t *data_input_history_response_points_parseFromJSON(char *jsonString){

    data_input_history_response_points_t *data_input_history_response_points = NULL;
    cJSON *data_input_history_response_pointsJSON = cJSON_Parse(jsonString);
    if(data_input_history_response_pointsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // data_input_history_response_points->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(data_input_history_response_pointsJSON, "value");
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }

    // data_input_history_response_points->timeMs
    cJSON *timeMs = cJSON_GetObjectItemCaseSensitive(data_input_history_response_pointsJSON, "timeMs");
    if(!cJSON_IsNumber(timeMs))
    {
    goto end; //Numeric
    }


    data_input_history_response_points = data_input_history_response_points_create (
        value->valuedouble,
        timeMs->valuedouble
        );
 cJSON_Delete(data_input_history_response_pointsJSON);
    return data_input_history_response_points;
end:
    cJSON_Delete(data_input_history_response_pointsJSON);
    return NULL;

}


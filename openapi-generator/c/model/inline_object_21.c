#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_21.h"


char* fillMissinginline_object_21_ToString(fillMissing_e fillMissing){
    char *fillMissingArray[] =  { "withNull","withPrevious" };
    return fillMissingArray[fillMissing];

}

fillMissing_e fillMissinginline_object_21_FromString(char* fillMissing){
    int stringToReturn = 0;
    char *fillMissingArray[] =  { "withNull","withPrevious" };
    size_t sizeofArray = sizeof(fillMissingArray) / sizeof(fillMissingArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(fillMissing, fillMissingArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
}

inline_object_21_t *inline_object_21_create(
    int endMs,
    fillMissing_e fillMissing,
    long groupId,
    list_t *series,
    int startMs,
    int stepMs
    ) {
	inline_object_21_t *inline_object_21 = malloc(sizeof(inline_object_21_t));
	inline_object_21->endMs = endMs;
	inline_object_21->fillMissing = fillMissing;
	inline_object_21->groupId = groupId;
	inline_object_21->series = series;
	inline_object_21->startMs = startMs;
	inline_object_21->stepMs = stepMs;

	return inline_object_21;
}


void inline_object_21_free(inline_object_21_t *inline_object_21) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_object_21->series) {
		_sensors_history_series_free(listEntry->data);
	}
	list_free(inline_object_21->series);

	free(inline_object_21);
}

cJSON *inline_object_21_convertToJSON(inline_object_21_t *inline_object_21) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_21->endMs
    if(cJSON_AddNumberToObject(item, "endMs", inline_object_21->endMs) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_21->fillMissing
    if(cJSON_AddStringToObject(item, "fillMissing", fillMissinginline_object_21_ToString(inline_object_21->fillMissing)) == NULL) {
    goto fail; //String
    }

	// inline_object_21->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_21->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_21->series
    cJSON *series = cJSON_AddArrayToObject(item, "series");
	if(series == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *seriesListEntry;
	list_ForEach(seriesListEntry, inline_object_21->series) {
		cJSON *item = _sensors_history_series_convertToJSON(seriesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(series, item);
	}

	// inline_object_21->startMs
    if(cJSON_AddNumberToObject(item, "startMs", inline_object_21->startMs) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_21->stepMs
    if(cJSON_AddNumberToObject(item, "stepMs", inline_object_21->stepMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_21_t *inline_object_21_parseFromJSON(char *jsonString){

    inline_object_21_t *inline_object_21 = NULL;
    cJSON *inline_object_21JSON = cJSON_Parse(jsonString);
    if(inline_object_21JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_21->endMs
    cJSON *endMs = cJSON_GetObjectItemCaseSensitive(inline_object_21JSON, "endMs");
    if(!cJSON_IsNumber(endMs))
    {
    goto end; //Numeric
    }

    // inline_object_21->fillMissing
    fillMissing_e fillMissingVariable;
    cJSON *fillMissing = cJSON_GetObjectItemCaseSensitive(inline_object_21JSON, "fillMissing");
    if(!cJSON_IsString(fillMissing) || (fillMissing->valuestring == NULL)){
    goto end; //String
    }

    fillMissingVariable = fillMissinginline_object_21_FromString(fillMissing->valuestring);

    // inline_object_21->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_21JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_object_21->series
    cJSON *series;
    cJSON *seriesJSON = cJSON_GetObjectItemCaseSensitive(inline_object_21JSON,"series");
    if(!cJSON_IsArray(seriesJSON)){
        goto end; //nonprimitive container
    }

    list_t *seriesList = list_create();

    cJSON_ArrayForEach(series,seriesJSON )
    {
        if(!cJSON_IsObject(series)){
            goto end;
        }
		char *JSONData = cJSON_Print(series);
        _sensors_history_series_t *seriesItem = _sensors_history_series_parseFromJSON(JSONData);

        list_addElement(seriesList, seriesItem);
        free(JSONData);
    }

    // inline_object_21->startMs
    cJSON *startMs = cJSON_GetObjectItemCaseSensitive(inline_object_21JSON, "startMs");
    if(!cJSON_IsNumber(startMs))
    {
    goto end; //Numeric
    }

    // inline_object_21->stepMs
    cJSON *stepMs = cJSON_GetObjectItemCaseSensitive(inline_object_21JSON, "stepMs");
    if(!cJSON_IsNumber(stepMs))
    {
    goto end; //Numeric
    }


    inline_object_21 = inline_object_21_create (
        endMs->valuedouble,
        fillMissingVariable,
        groupId->valuedouble,
        seriesList,
        startMs->valuedouble,
        stepMs->valuedouble
        );
 cJSON_Delete(inline_object_21JSON);
    return inline_object_21;
end:
    cJSON_Delete(inline_object_21JSON);
    return NULL;

}


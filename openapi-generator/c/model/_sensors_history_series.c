#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "_sensors_history_series.h"


char* field_sensors_history_series_ToString(field_e field){
    char *fieldArray[] =  { "ambientTemperature","probeTemperature","currentLoop1Raw","currentLoop1Mapped","currentLoop2Raw","currentLoop2Mapped","pmPowerTotal","pmPhase1Power","pmPhase2Power","pmPhase3Power","pmPhase1PowerFactor","pmPhase2PowerFactor","pmPhase3PowerFactor" };
    return fieldArray[field];

}

field_e field_sensors_history_series_FromString(char* field){
    int stringToReturn = 0;
    char *fieldArray[] =  { "ambientTemperature","probeTemperature","currentLoop1Raw","currentLoop1Mapped","currentLoop2Raw","currentLoop2Mapped","pmPowerTotal","pmPhase1Power","pmPhase2Power","pmPhase3Power","pmPhase1PowerFactor","pmPhase2PowerFactor","pmPhase3PowerFactor" };
    size_t sizeofArray = sizeof(fieldArray) / sizeof(fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(field, fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
}

_sensors_history_series_t *_sensors_history_series_create(
    field_e field,
    long widgetId
    ) {
	_sensors_history_series_t *_sensors_history_series = malloc(sizeof(_sensors_history_series_t));
	_sensors_history_series->field = field;
	_sensors_history_series->widgetId = widgetId;

	return _sensors_history_series;
}


void _sensors_history_series_free(_sensors_history_series_t *_sensors_history_series) {
    listEntry_t *listEntry;

	free(_sensors_history_series);
}

cJSON *_sensors_history_series_convertToJSON(_sensors_history_series_t *_sensors_history_series) {
	cJSON *item = cJSON_CreateObject();
	// _sensors_history_series->field
    if(cJSON_AddStringToObject(item, "field", field_sensors_history_series_ToString(_sensors_history_series->field)) == NULL) {
    goto fail; //String
    }

	// _sensors_history_series->widgetId
    if(cJSON_AddNumberToObject(item, "widgetId", _sensors_history_series->widgetId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

_sensors_history_series_t *_sensors_history_series_parseFromJSON(char *jsonString){

    _sensors_history_series_t *_sensors_history_series = NULL;
    cJSON *_sensors_history_seriesJSON = cJSON_Parse(jsonString);
    if(_sensors_history_seriesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // _sensors_history_series->field
    field_e fieldVariable;
    cJSON *field = cJSON_GetObjectItemCaseSensitive(_sensors_history_seriesJSON, "field");
    if(!cJSON_IsString(field) || (field->valuestring == NULL)){
    goto end; //String
    }

    fieldVariable = field_sensors_history_series_FromString(field->valuestring);

    // _sensors_history_series->widgetId
    cJSON *widgetId = cJSON_GetObjectItemCaseSensitive(_sensors_history_seriesJSON, "widgetId");
    if(!cJSON_IsNumber(widgetId))
    {
    goto end; //Numeric
    }


    _sensors_history_series = _sensors_history_series_create (
        fieldVariable,
        widgetId->valuedouble
        );
 cJSON_Delete(_sensors_history_seriesJSON);
    return _sensors_history_series;
end:
    cJSON_Delete(_sensors_history_seriesJSON);
    return NULL;

}


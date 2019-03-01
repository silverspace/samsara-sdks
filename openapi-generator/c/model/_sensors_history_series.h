/*
 * _sensors_history_series.h
 *
 * Sensor ID and field to query.
 */

#ifndef __sensors_history_series_H_
#define __sensors_history_series_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"


typedef enum  {  ambientTemperature, probeTemperature, currentLoop1Raw, currentLoop1Mapped, currentLoop2Raw, currentLoop2Mapped, pmPowerTotal, pmPhase1Power, pmPhase2Power, pmPhase3Power, pmPhase1PowerFactor, pmPhase2PowerFactor, pmPhase3PowerFactor } field_e;

char* field_sensors_history_series_ToString(field_e field);

field_e field_sensors_history_series_FromString(char* field);

typedef struct _sensors_history_series_t {
        field_e field; //enum string
        long widgetId; //numeric

} _sensors_history_series_t;

_sensors_history_series_t *_sensors_history_series_create(
        field_e field,
        long widgetId
);

void _sensors_history_series_free(_sensors_history_series_t *_sensors_history_series);

_sensors_history_series_t *_sensors_history_series_parseFromJSON(char *jsonString);

cJSON *_sensors_history_series_convertToJSON(_sensors_history_series_t *_sensors_history_series);

#endif /* __sensors_history_series_H_ */


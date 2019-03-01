/*
 * safety_report_harsh_event.h
 *
 * List of harsh events
 */

#ifndef _safety_report_harsh_event_H_
#define _safety_report_harsh_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct safety_report_harsh_event_t {
        char *harshEventType; //no enum string
        int timestampMs; //numeric
        int vehicleId; //numeric

} safety_report_harsh_event_t;

safety_report_harsh_event_t *safety_report_harsh_event_create(
        char *harshEventType,
        int timestampMs,
        int vehicleId
);

void safety_report_harsh_event_free(safety_report_harsh_event_t *safety_report_harsh_event);

safety_report_harsh_event_t *safety_report_harsh_event_parseFromJSON(char *jsonString);

cJSON *safety_report_harsh_event_convertToJSON(safety_report_harsh_event_t *safety_report_harsh_event);

#endif /* _safety_report_harsh_event_H_ */


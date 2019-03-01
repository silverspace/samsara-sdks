/*
 * vehicle_harsh_event_response.h
 *
 * Harsh event details for a vehicle
 */

#ifndef _vehicle_harsh_event_response_H_
#define _vehicle_harsh_event_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "vehicle_harsh_event_response_location.h"

typedef int bool;
#define true 1
#define false 0



typedef struct vehicle_harsh_event_response_t {
        char *downloadForwardVideoUrl; //no enum string
        char *downloadInwardVideoUrl; //no enum string
        char *downloadTrackedInwardVideoUrl; //no enum string
        char *harshEventType; //no enum string
        char *incidentReportUrl; //no enum string
        bool isDistracted; //boolean
        vehicle_harsh_event_response_location_t *location; //nonprimitive

} vehicle_harsh_event_response_t;

vehicle_harsh_event_response_t *vehicle_harsh_event_response_create(
        char *downloadForwardVideoUrl,
        char *downloadInwardVideoUrl,
        char *downloadTrackedInwardVideoUrl,
        char *harshEventType,
        char *incidentReportUrl,
        bool isDistracted,
        vehicle_harsh_event_response_location_t *location
);

void vehicle_harsh_event_response_free(vehicle_harsh_event_response_t *vehicle_harsh_event_response);

vehicle_harsh_event_response_t *vehicle_harsh_event_response_parseFromJSON(char *jsonString);

cJSON *vehicle_harsh_event_response_convertToJSON(vehicle_harsh_event_response_t *vehicle_harsh_event_response);

#endif /* _vehicle_harsh_event_response_H_ */


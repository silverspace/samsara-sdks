/*
 * vehicle_safety_score_response.h
 *
 * Safety score details for a vehicle
 */

#ifndef _vehicle_safety_score_response_H_
#define _vehicle_safety_score_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "safety_report_harsh_event.h"




typedef struct vehicle_safety_score_response_t {
        int crashCount; //numeric
        int harshAccelCount; //numeric
        int harshBrakingCount; //numeric
        list_t *harshEvents; //nonprimitive container
        int harshTurningCount; //numeric
        int safetyScore; //numeric
        char *safetyScoreRank; //no enum string
        int timeOverSpeedLimitMs; //numeric
        int totalDistanceDrivenMeters; //numeric
        int totalHarshEventCount; //numeric
        int totalTimeDrivenMs; //numeric
        int vehicleId; //numeric

} vehicle_safety_score_response_t;

vehicle_safety_score_response_t *vehicle_safety_score_response_create(
        int crashCount,
        int harshAccelCount,
        int harshBrakingCount,
        list_t *harshEvents,
        int harshTurningCount,
        int safetyScore,
        char *safetyScoreRank,
        int timeOverSpeedLimitMs,
        int totalDistanceDrivenMeters,
        int totalHarshEventCount,
        int totalTimeDrivenMs,
        int vehicleId
);

void vehicle_safety_score_response_free(vehicle_safety_score_response_t *vehicle_safety_score_response);

vehicle_safety_score_response_t *vehicle_safety_score_response_parseFromJSON(char *jsonString);

cJSON *vehicle_safety_score_response_convertToJSON(vehicle_safety_score_response_t *vehicle_safety_score_response);

#endif /* _vehicle_safety_score_response_H_ */


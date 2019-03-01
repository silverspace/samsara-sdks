/*
 * driver_safety_score_response.h
 *
 * Safety score details for a driver
 */

#ifndef _driver_safety_score_response_H_
#define _driver_safety_score_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "safety_report_harsh_event.h"




typedef struct driver_safety_score_response_t {
        int crashCount; //numeric
        int driverId; //numeric
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

} driver_safety_score_response_t;

driver_safety_score_response_t *driver_safety_score_response_create(
        int crashCount,
        int driverId,
        int harshAccelCount,
        int harshBrakingCount,
        list_t *harshEvents,
        int harshTurningCount,
        int safetyScore,
        char *safetyScoreRank,
        int timeOverSpeedLimitMs,
        int totalDistanceDrivenMeters,
        int totalHarshEventCount,
        int totalTimeDrivenMs
);

void driver_safety_score_response_free(driver_safety_score_response_t *driver_safety_score_response);

driver_safety_score_response_t *driver_safety_score_response_parseFromJSON(char *jsonString);

cJSON *driver_safety_score_response_convertToJSON(driver_safety_score_response_t *driver_safety_score_response);

#endif /* _driver_safety_score_response_H_ */


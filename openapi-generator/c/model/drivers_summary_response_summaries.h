/*
 * drivers_summary_response_summaries.h
 *
 * 
 */

#ifndef _drivers_summary_response_summaries_H_
#define _drivers_summary_response_summaries_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct drivers_summary_response_summaries_t {
        long driverId; //numeric
        double distanceMiles; //numeric
        long driveMs; //numeric
        long activeMs; //numeric
        char *driverUsername; //no enum string
        long groupId; //numeric
        char *driverName; //no enum string
        long onDutyMs; //numeric

} drivers_summary_response_summaries_t;

drivers_summary_response_summaries_t *drivers_summary_response_summaries_create(
        long driverId,
        double distanceMiles,
        long driveMs,
        long activeMs,
        char *driverUsername,
        long groupId,
        char *driverName,
        long onDutyMs
);

void drivers_summary_response_summaries_free(drivers_summary_response_summaries_t *drivers_summary_response_summaries);

drivers_summary_response_summaries_t *drivers_summary_response_summaries_parseFromJSON(char *jsonString);

cJSON *drivers_summary_response_summaries_convertToJSON(drivers_summary_response_summaries_t *drivers_summary_response_summaries);

#endif /* _drivers_summary_response_summaries_H_ */


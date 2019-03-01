/*
 * driver_daily_log_response_days.h
 *
 * 
 */

#ifndef _driver_daily_log_response_days_H_
#define _driver_daily_log_response_days_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "object.h"

typedef int bool;
#define true 1
#define false 0



typedef struct driver_daily_log_response_days_t {
        long certifiedAtMs; //numeric
        int endMs; //numeric
        int startMs; //numeric
        object_t *trailerIds; //nonprimitive
        double activeHours; //numeric
        double distanceMiles; //numeric
        long activeMs; //numeric
        bool certified; //boolean
        object_t *vehicleIds; //nonprimitive

} driver_daily_log_response_days_t;

driver_daily_log_response_days_t *driver_daily_log_response_days_create(
        long certifiedAtMs,
        int endMs,
        int startMs,
        object_t *trailerIds,
        double activeHours,
        double distanceMiles,
        long activeMs,
        bool certified,
        object_t *vehicleIds
);

void driver_daily_log_response_days_free(driver_daily_log_response_days_t *driver_daily_log_response_days);

driver_daily_log_response_days_t *driver_daily_log_response_days_parseFromJSON(char *jsonString);

cJSON *driver_daily_log_response_days_convertToJSON(driver_daily_log_response_days_t *driver_daily_log_response_days);

#endif /* _driver_daily_log_response_days_H_ */


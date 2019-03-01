/*
 * hos_logs_summary_response_drivers.h
 *
 * 
 */

#ifndef _hos_logs_summary_response_drivers_H_
#define _hos_logs_summary_response_drivers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct hos_logs_summary_response_drivers_t {
        long timeUntilBreak; //numeric
        char *vehicleName; //no enum string
        long drivingInViolationToday; //numeric
        long driverId; //numeric
        long cycleRemaining; //numeric
        char *driverName; //no enum string
        char *dutyStatus; //no enum string
        long cycleTomorrow; //numeric
        long shiftDriveRemaining; //numeric
        long timeInCurrentStatus; //numeric
        long drivingInViolationCycle; //numeric
        long shiftRemaining; //numeric

} hos_logs_summary_response_drivers_t;

hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers_create(
        long timeUntilBreak,
        char *vehicleName,
        long drivingInViolationToday,
        long driverId,
        long cycleRemaining,
        char *driverName,
        char *dutyStatus,
        long cycleTomorrow,
        long shiftDriveRemaining,
        long timeInCurrentStatus,
        long drivingInViolationCycle,
        long shiftRemaining
);

void hos_logs_summary_response_drivers_free(hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers);

hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers_parseFromJSON(char *jsonString);

cJSON *hos_logs_summary_response_drivers_convertToJSON(hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers);

#endif /* _hos_logs_summary_response_drivers_H_ */


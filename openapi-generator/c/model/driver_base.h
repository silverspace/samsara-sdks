/*
 * driver_base.h
 *
 * 
 */

#ifndef _driver_base_H_
#define _driver_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0



typedef struct driver_base_t {
        bool eldAdverseWeatherExemptionEnabled; //boolean
        bool eldBigDayExemptionEnabled; //boolean
        int eldDayStartHour; //numeric
        bool eldExempt; //boolean
        char *eldExemptReason; //no enum string
        bool eldPcEnabled; //boolean
        bool eldYmEnabled; //boolean
        list_t* externalIds;
        // TODO map/hash not supported at the moment
        long groupId; //numeric
        char *licenseNumber; //no enum string
        char *licenseState; //no enum string
        char *name; //no enum string
        char *notes; //no enum string
        char *phone; //no enum string
        char *username; //no enum string
        long vehicleId; //numeric

} driver_base_t;

driver_base_t *driver_base_create(
        bool eldAdverseWeatherExemptionEnabled,
        bool eldBigDayExemptionEnabled,
        int eldDayStartHour,
        bool eldExempt,
        char *eldExemptReason,
        bool eldPcEnabled,
        bool eldYmEnabled,
        list_t* externalIds,
        // TODO map/hash not supported at the moment
        long groupId,
        char *licenseNumber,
        char *licenseState,
        char *name,
        char *notes,
        char *phone,
        char *username,
        long vehicleId
);

void driver_base_free(driver_base_t *driver_base);

driver_base_t *driver_base_parseFromJSON(char *jsonString);

cJSON *driver_base_convertToJSON(driver_base_t *driver_base);

#endif /* _driver_base_H_ */


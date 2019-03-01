/*
 * driver.h
 *
 * 
 */

#ifndef _driver_H_
#define _driver_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "driver_base.h"
#include "tag_metadata.h"

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
typedef int bool;
#define true 1
#define false 0



typedef struct driver_t {
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
        long id; //numeric
        bool isDeactivated; //boolean
        list_t *tags; //nonprimitive container

} driver_t;

driver_t *driver_create(
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
        long vehicleId,
        long id,
        bool isDeactivated,
        list_t *tags
);

void driver_free(driver_t *driver);

driver_t *driver_parseFromJSON(char *jsonString);

cJSON *driver_convertToJSON(driver_t *driver);

#endif /* _driver_H_ */


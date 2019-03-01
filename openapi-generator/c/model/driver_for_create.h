/*
 * driver_for_create.h
 *
 * 
 */

#ifndef _driver_for_create_H_
#define _driver_for_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "driver_base.h"

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



typedef struct driver_for_create_t {
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
        char *password; //no enum string
        list_t *tagIds; //primitive container

} driver_for_create_t;

driver_for_create_t *driver_for_create_create(
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
        char *password,
        list_t *tagIds
);

void driver_for_create_free(driver_for_create_t *driver_for_create);

driver_for_create_t *driver_for_create_parseFromJSON(char *jsonString);

cJSON *driver_for_create_convertToJSON(driver_for_create_t *driver_for_create);

#endif /* _driver_for_create_H_ */


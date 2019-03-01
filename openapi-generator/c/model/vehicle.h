/*
 * vehicle.h
 *
 * A vehicle object.
 */

#ifndef _vehicle_H_
#define _vehicle_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct vehicle_t {
        long engineHours; //numeric
        double fuelLevelPercent; //numeric
        long id; //numeric
        char *name; //no enum string
        char *note; //no enum string
        long odometerMeters; //numeric
        char *vin; //no enum string

} vehicle_t;

vehicle_t *vehicle_create(
        long engineHours,
        double fuelLevelPercent,
        long id,
        char *name,
        char *note,
        long odometerMeters,
        char *vin
);

void vehicle_free(vehicle_t *vehicle);

vehicle_t *vehicle_parseFromJSON(char *jsonString);

cJSON *vehicle_convertToJSON(vehicle_t *vehicle);

#endif /* _vehicle_H_ */


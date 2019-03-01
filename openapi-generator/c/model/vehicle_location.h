/*
 * vehicle_location.h
 *
 * Contains the location, in latitude and longitude, of a vehicle.
 */

#ifndef _vehicle_location_H_
#define _vehicle_location_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

typedef int bool;
#define true 1
#define false 0



typedef struct vehicle_location_t {
        double heading; //numeric
        long id; //numeric
        double latitude; //numeric
        char *location; //no enum string
        double longitude; //numeric
        char *name; //no enum string
        long odometerMeters; //numeric
        bool onTrip; //boolean
        double speed; //numeric
        int time; //numeric
        char *vin; //no enum string

} vehicle_location_t;

vehicle_location_t *vehicle_location_create(
        double heading,
        long id,
        double latitude,
        char *location,
        double longitude,
        char *name,
        long odometerMeters,
        bool onTrip,
        double speed,
        int time,
        char *vin
);

void vehicle_location_free(vehicle_location_t *vehicle_location);

vehicle_location_t *vehicle_location_parseFromJSON(char *jsonString);

cJSON *vehicle_location_convertToJSON(vehicle_location_t *vehicle_location);

#endif /* _vehicle_location_H_ */


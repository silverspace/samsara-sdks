/*
 * fleet_vehicle_location.h
 *
 * Contains the location and speed of a vehicle at a particular time
 */

#ifndef _fleet_vehicle_location_H_
#define _fleet_vehicle_location_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct fleet_vehicle_location_t {
        double latitude; //numeric
        char *location; //no enum string
        double longitude; //numeric
        double speedMilesPerHour; //numeric
        long timeMs; //numeric

} fleet_vehicle_location_t;

fleet_vehicle_location_t *fleet_vehicle_location_create(
        double latitude,
        char *location,
        double longitude,
        double speedMilesPerHour,
        long timeMs
);

void fleet_vehicle_location_free(fleet_vehicle_location_t *fleet_vehicle_location);

fleet_vehicle_location_t *fleet_vehicle_location_parseFromJSON(char *jsonString);

cJSON *fleet_vehicle_location_convertToJSON(fleet_vehicle_location_t *fleet_vehicle_location);

#endif /* _fleet_vehicle_location_H_ */


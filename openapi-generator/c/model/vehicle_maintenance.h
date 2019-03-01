/*
 * vehicle_maintenance.h
 *
 * Contains any J1939/Passenger engine light warnings and engine faults.
 */

#ifndef _vehicle_maintenance_H_
#define _vehicle_maintenance_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "vehicle_maintenance_j1939.h"
#include "vehicle_maintenance_passenger.h"




typedef struct vehicle_maintenance_t {
        long id; //numeric
        vehicle_maintenance_j1939_t *j1939; //nonprimitive
        vehicle_maintenance_passenger_t *passenger; //nonprimitive

} vehicle_maintenance_t;

vehicle_maintenance_t *vehicle_maintenance_create(
        long id,
        vehicle_maintenance_j1939_t *j1939,
        vehicle_maintenance_passenger_t *passenger
);

void vehicle_maintenance_free(vehicle_maintenance_t *vehicle_maintenance);

vehicle_maintenance_t *vehicle_maintenance_parseFromJSON(char *jsonString);

cJSON *vehicle_maintenance_convertToJSON(vehicle_maintenance_t *vehicle_maintenance);

#endif /* _vehicle_maintenance_H_ */


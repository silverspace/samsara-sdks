/*
 * vehicle_maintenance_passenger.h
 *
 * Passenger vehicle data. Null if no data is available.
 */

#ifndef _vehicle_maintenance_passenger_H_
#define _vehicle_maintenance_passenger_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "vehicle_maintenance_passenger_check_engine_light.h"
#include "vehicle_maintenance_passenger_diagnostic_trouble_codes.h"




typedef struct vehicle_maintenance_passenger_t {
        vehicle_maintenance_passenger_check_engine_light_t *checkEngineLight; //nonprimitive
        list_t *diagnosticTroubleCodes; //nonprimitive container

} vehicle_maintenance_passenger_t;

vehicle_maintenance_passenger_t *vehicle_maintenance_passenger_create(
        vehicle_maintenance_passenger_check_engine_light_t *checkEngineLight,
        list_t *diagnosticTroubleCodes
);

void vehicle_maintenance_passenger_free(vehicle_maintenance_passenger_t *vehicle_maintenance_passenger);

vehicle_maintenance_passenger_t *vehicle_maintenance_passenger_parseFromJSON(char *jsonString);

cJSON *vehicle_maintenance_passenger_convertToJSON(vehicle_maintenance_passenger_t *vehicle_maintenance_passenger);

#endif /* _vehicle_maintenance_passenger_H_ */


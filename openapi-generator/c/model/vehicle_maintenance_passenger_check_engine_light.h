/*
 * vehicle_maintenance_passenger_check_engine_light.h
 *
 * Passenger vehicle check engine light.
 */

#ifndef _vehicle_maintenance_passenger_check_engine_light_H_
#define _vehicle_maintenance_passenger_check_engine_light_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

typedef int bool;
#define true 1
#define false 0



typedef struct vehicle_maintenance_passenger_check_engine_light_t {
        bool isOn; //boolean

} vehicle_maintenance_passenger_check_engine_light_t;

vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light_create(
        bool isOn
);

void vehicle_maintenance_passenger_check_engine_light_free(vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light);

vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light_parseFromJSON(char *jsonString);

cJSON *vehicle_maintenance_passenger_check_engine_light_convertToJSON(vehicle_maintenance_passenger_check_engine_light_t *vehicle_maintenance_passenger_check_engine_light);

#endif /* _vehicle_maintenance_passenger_check_engine_light_H_ */


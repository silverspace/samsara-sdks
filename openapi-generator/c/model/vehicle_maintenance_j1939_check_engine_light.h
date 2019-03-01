/*
 * vehicle_maintenance_j1939_check_engine_light.h
 *
 * J1939 check engine lights.
 */

#ifndef _vehicle_maintenance_j1939_check_engine_light_H_
#define _vehicle_maintenance_j1939_check_engine_light_H_

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



typedef struct vehicle_maintenance_j1939_check_engine_light_t {
        bool protectIsOn; //boolean
        bool stopIsOn; //boolean
        bool warningIsOn; //boolean
        bool emissionsIsOn; //boolean

} vehicle_maintenance_j1939_check_engine_light_t;

vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light_create(
        bool protectIsOn,
        bool stopIsOn,
        bool warningIsOn,
        bool emissionsIsOn
);

void vehicle_maintenance_j1939_check_engine_light_free(vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light);

vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light_parseFromJSON(char *jsonString);

cJSON *vehicle_maintenance_j1939_check_engine_light_convertToJSON(vehicle_maintenance_j1939_check_engine_light_t *vehicle_maintenance_j1939_check_engine_light);

#endif /* _vehicle_maintenance_j1939_check_engine_light_H_ */


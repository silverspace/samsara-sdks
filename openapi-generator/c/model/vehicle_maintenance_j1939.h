/*
 * vehicle_maintenance_j1939.h
 *
 * J1939 based data. Null if no data is available.
 */

#ifndef _vehicle_maintenance_j1939_H_
#define _vehicle_maintenance_j1939_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "vehicle_maintenance_j1939_check_engine_light.h"
#include "vehicle_maintenance_j1939_diagnostic_trouble_codes.h"




typedef struct vehicle_maintenance_j1939_t {
        vehicle_maintenance_j1939_check_engine_light_t *checkEngineLight; //nonprimitive
        list_t *diagnosticTroubleCodes; //nonprimitive container

} vehicle_maintenance_j1939_t;

vehicle_maintenance_j1939_t *vehicle_maintenance_j1939_create(
        vehicle_maintenance_j1939_check_engine_light_t *checkEngineLight,
        list_t *diagnosticTroubleCodes
);

void vehicle_maintenance_j1939_free(vehicle_maintenance_j1939_t *vehicle_maintenance_j1939);

vehicle_maintenance_j1939_t *vehicle_maintenance_j1939_parseFromJSON(char *jsonString);

cJSON *vehicle_maintenance_j1939_convertToJSON(vehicle_maintenance_j1939_t *vehicle_maintenance_j1939);

#endif /* _vehicle_maintenance_j1939_H_ */


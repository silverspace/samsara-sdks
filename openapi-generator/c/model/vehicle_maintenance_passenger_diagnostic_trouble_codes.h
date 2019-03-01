/*
 * vehicle_maintenance_passenger_diagnostic_trouble_codes.h
 *
 * 
 */

#ifndef _vehicle_maintenance_passenger_diagnostic_trouble_codes_H_
#define _vehicle_maintenance_passenger_diagnostic_trouble_codes_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct vehicle_maintenance_passenger_diagnostic_trouble_codes_t {
        char *dtcShortCode; //no enum string
        int dtcId; //numeric
        char *dtcDescription; //no enum string

} vehicle_maintenance_passenger_diagnostic_trouble_codes_t;

vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes_create(
        char *dtcShortCode,
        int dtcId,
        char *dtcDescription
);

void vehicle_maintenance_passenger_diagnostic_trouble_codes_free(vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes);

vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes_parseFromJSON(char *jsonString);

cJSON *vehicle_maintenance_passenger_diagnostic_trouble_codes_convertToJSON(vehicle_maintenance_passenger_diagnostic_trouble_codes_t *vehicle_maintenance_passenger_diagnostic_trouble_codes);

#endif /* _vehicle_maintenance_passenger_diagnostic_trouble_codes_H_ */


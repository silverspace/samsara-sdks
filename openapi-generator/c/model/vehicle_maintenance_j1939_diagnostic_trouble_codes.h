/*
 * vehicle_maintenance_j1939_diagnostic_trouble_codes.h
 *
 * 
 */

#ifndef _vehicle_maintenance_j1939_diagnostic_trouble_codes_H_
#define _vehicle_maintenance_j1939_diagnostic_trouble_codes_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct vehicle_maintenance_j1939_diagnostic_trouble_codes_t {
        char *spnDescription; //no enum string
        char *fmiText; //no enum string
        int spnId; //numeric
        int occurrenceCount; //numeric
        int txId; //numeric
        int fmiId; //numeric

} vehicle_maintenance_j1939_diagnostic_trouble_codes_t;

vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes_create(
        char *spnDescription,
        char *fmiText,
        int spnId,
        int occurrenceCount,
        int txId,
        int fmiId
);

void vehicle_maintenance_j1939_diagnostic_trouble_codes_free(vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes);

vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes_parseFromJSON(char *jsonString);

cJSON *vehicle_maintenance_j1939_diagnostic_trouble_codes_convertToJSON(vehicle_maintenance_j1939_diagnostic_trouble_codes_t *vehicle_maintenance_j1939_diagnostic_trouble_codes);

#endif /* _vehicle_maintenance_j1939_diagnostic_trouble_codes_H_ */


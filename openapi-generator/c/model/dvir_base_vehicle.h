/*
 * dvir_base_vehicle.h
 *
 * The vehicle on which DVIR was done.
 */

#ifndef _dvir_base_vehicle_H_
#define _dvir_base_vehicle_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct dvir_base_vehicle_t {
        char *name; //no enum string
        long id; //numeric

} dvir_base_vehicle_t;

dvir_base_vehicle_t *dvir_base_vehicle_create(
        char *name,
        long id
);

void dvir_base_vehicle_free(dvir_base_vehicle_t *dvir_base_vehicle);

dvir_base_vehicle_t *dvir_base_vehicle_parseFromJSON(char *jsonString);

cJSON *dvir_base_vehicle_convertToJSON(dvir_base_vehicle_t *dvir_base_vehicle);

#endif /* _dvir_base_vehicle_H_ */


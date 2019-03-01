/*
 * cargo_response_sensors.h
 *
 * 
 */

#ifndef _cargo_response_sensors_H_
#define _cargo_response_sensors_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

typedef int bool;
#define true 1
#define false 0



typedef struct cargo_response_sensors_t {
        bool cargoEmpty; //boolean
        char *name; //no enum string
        long id; //numeric

} cargo_response_sensors_t;

cargo_response_sensors_t *cargo_response_sensors_create(
        bool cargoEmpty,
        char *name,
        long id
);

void cargo_response_sensors_free(cargo_response_sensors_t *cargo_response_sensors);

cargo_response_sensors_t *cargo_response_sensors_parseFromJSON(char *jsonString);

cJSON *cargo_response_sensors_convertToJSON(cargo_response_sensors_t *cargo_response_sensors);

#endif /* _cargo_response_sensors_H_ */


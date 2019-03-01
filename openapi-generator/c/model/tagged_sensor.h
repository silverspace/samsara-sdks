/*
 * tagged_sensor.h
 *
 * 
 */

#ifndef _tagged_sensor_H_
#define _tagged_sensor_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_sensor_base.h"




typedef struct tagged_sensor_t {
        long id; //numeric
        char *name; //no enum string

} tagged_sensor_t;

tagged_sensor_t *tagged_sensor_create(
        long id,
        char *name
);

void tagged_sensor_free(tagged_sensor_t *tagged_sensor);

tagged_sensor_t *tagged_sensor_parseFromJSON(char *jsonString);

cJSON *tagged_sensor_convertToJSON(tagged_sensor_t *tagged_sensor);

#endif /* _tagged_sensor_H_ */


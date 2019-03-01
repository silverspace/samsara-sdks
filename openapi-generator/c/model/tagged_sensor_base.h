/*
 * tagged_sensor_base.h
 *
 * 
 */

#ifndef _tagged_sensor_base_H_
#define _tagged_sensor_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct tagged_sensor_base_t {
        long id; //numeric

} tagged_sensor_base_t;

tagged_sensor_base_t *tagged_sensor_base_create(
        long id
);

void tagged_sensor_base_free(tagged_sensor_base_t *tagged_sensor_base);

tagged_sensor_base_t *tagged_sensor_base_parseFromJSON(char *jsonString);

cJSON *tagged_sensor_base_convertToJSON(tagged_sensor_base_t *tagged_sensor_base);

#endif /* _tagged_sensor_base_H_ */


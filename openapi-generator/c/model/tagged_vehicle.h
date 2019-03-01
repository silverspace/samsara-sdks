/*
 * tagged_vehicle.h
 *
 * 
 */

#ifndef _tagged_vehicle_H_
#define _tagged_vehicle_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_vehicle_base.h"




typedef struct tagged_vehicle_t {
        long id; //numeric
        char *name; //no enum string

} tagged_vehicle_t;

tagged_vehicle_t *tagged_vehicle_create(
        long id,
        char *name
);

void tagged_vehicle_free(tagged_vehicle_t *tagged_vehicle);

tagged_vehicle_t *tagged_vehicle_parseFromJSON(char *jsonString);

cJSON *tagged_vehicle_convertToJSON(tagged_vehicle_t *tagged_vehicle);

#endif /* _tagged_vehicle_H_ */


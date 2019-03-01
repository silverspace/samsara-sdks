/*
 * tagged_vehicle_base.h
 *
 * 
 */

#ifndef _tagged_vehicle_base_H_
#define _tagged_vehicle_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct tagged_vehicle_base_t {
        long id; //numeric

} tagged_vehicle_base_t;

tagged_vehicle_base_t *tagged_vehicle_base_create(
        long id
);

void tagged_vehicle_base_free(tagged_vehicle_base_t *tagged_vehicle_base);

tagged_vehicle_base_t *tagged_vehicle_base_parseFromJSON(char *jsonString);

cJSON *tagged_vehicle_base_convertToJSON(tagged_vehicle_base_t *tagged_vehicle_base);

#endif /* _tagged_vehicle_base_H_ */


/*
 * tagged_driver_base.h
 *
 * 
 */

#ifndef _tagged_driver_base_H_
#define _tagged_driver_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct tagged_driver_base_t {
        long id; //numeric

} tagged_driver_base_t;

tagged_driver_base_t *tagged_driver_base_create(
        long id
);

void tagged_driver_base_free(tagged_driver_base_t *tagged_driver_base);

tagged_driver_base_t *tagged_driver_base_parseFromJSON(char *jsonString);

cJSON *tagged_driver_base_convertToJSON(tagged_driver_base_t *tagged_driver_base);

#endif /* _tagged_driver_base_H_ */


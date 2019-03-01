/*
 * tagged_driver.h
 *
 * 
 */

#ifndef _tagged_driver_H_
#define _tagged_driver_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_driver_base.h"




typedef struct tagged_driver_t {
        long id; //numeric
        char *name; //no enum string

} tagged_driver_t;

tagged_driver_t *tagged_driver_create(
        long id,
        char *name
);

void tagged_driver_free(tagged_driver_t *tagged_driver);

tagged_driver_t *tagged_driver_parseFromJSON(char *jsonString);

cJSON *tagged_driver_convertToJSON(tagged_driver_t *tagged_driver);

#endif /* _tagged_driver_H_ */


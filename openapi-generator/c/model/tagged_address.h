/*
 * tagged_address.h
 *
 * 
 */

#ifndef _tagged_address_H_
#define _tagged_address_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_address_base.h"




typedef struct tagged_address_t {
        long id; //numeric
        char *name; //no enum string

} tagged_address_t;

tagged_address_t *tagged_address_create(
        long id,
        char *name
);

void tagged_address_free(tagged_address_t *tagged_address);

tagged_address_t *tagged_address_parseFromJSON(char *jsonString);

cJSON *tagged_address_convertToJSON(tagged_address_t *tagged_address);

#endif /* _tagged_address_H_ */


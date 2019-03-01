/*
 * tagged_address_base.h
 *
 * 
 */

#ifndef _tagged_address_base_H_
#define _tagged_address_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct tagged_address_base_t {
        long id; //numeric

} tagged_address_base_t;

tagged_address_base_t *tagged_address_base_create(
        long id
);

void tagged_address_base_free(tagged_address_base_t *tagged_address_base);

tagged_address_base_t *tagged_address_base_parseFromJSON(char *jsonString);

cJSON *tagged_address_base_convertToJSON(tagged_address_base_t *tagged_address_base);

#endif /* _tagged_address_base_H_ */


/*
 * inline_object.h
 *
 * 
 */

#ifndef _inline_object_H_
#define _inline_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "_addresses_addresses.h"




typedef struct inline_object_t {
        list_t *addresses; //nonprimitive container

} inline_object_t;

inline_object_t *inline_object_create(
        list_t *addresses
);

void inline_object_free(inline_object_t *inline_object);

inline_object_t *inline_object_parseFromJSON(char *jsonString);

cJSON *inline_object_convertToJSON(inline_object_t *inline_object);

#endif /* _inline_object_H_ */


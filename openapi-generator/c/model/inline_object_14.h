/*
 * inline_object_14.h
 *
 * 
 */

#ifndef _inline_object_14_H_
#define _inline_object_14_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "vehicle.h"




typedef struct inline_object_14_t {
        long groupId; //numeric
        list_t *vehicles; //nonprimitive container

} inline_object_14_t;

inline_object_14_t *inline_object_14_create(
        long groupId,
        list_t *vehicles
);

void inline_object_14_free(inline_object_14_t *inline_object_14);

inline_object_14_t *inline_object_14_parseFromJSON(char *jsonString);

cJSON *inline_object_14_convertToJSON(inline_object_14_t *inline_object_14);

#endif /* _inline_object_14_H_ */


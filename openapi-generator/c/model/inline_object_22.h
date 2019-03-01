/*
 * inline_object_22.h
 *
 * 
 */

#ifndef _inline_object_22_H_
#define _inline_object_22_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_22_t {
        long groupId; //numeric
        list_t *sensors; //primitive container

} inline_object_22_t;

inline_object_22_t *inline_object_22_create(
        long groupId,
        list_t *sensors
);

void inline_object_22_free(inline_object_22_t *inline_object_22);

inline_object_22_t *inline_object_22_parseFromJSON(char *jsonString);

cJSON *inline_object_22_convertToJSON(inline_object_22_t *inline_object_22);

#endif /* _inline_object_22_H_ */


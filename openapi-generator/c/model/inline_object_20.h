/*
 * inline_object_20.h
 *
 * 
 */

#ifndef _inline_object_20_H_
#define _inline_object_20_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_20_t {
        long groupId; //numeric
        list_t *sensors; //primitive container

} inline_object_20_t;

inline_object_20_t *inline_object_20_create(
        long groupId,
        list_t *sensors
);

void inline_object_20_free(inline_object_20_t *inline_object_20);

inline_object_20_t *inline_object_20_parseFromJSON(char *jsonString);

cJSON *inline_object_20_convertToJSON(inline_object_20_t *inline_object_20);

#endif /* _inline_object_20_H_ */


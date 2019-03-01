/*
 * inline_object_24.h
 *
 * 
 */

#ifndef _inline_object_24_H_
#define _inline_object_24_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_24_t {
        long groupId; //numeric
        list_t *sensors; //primitive container

} inline_object_24_t;

inline_object_24_t *inline_object_24_create(
        long groupId,
        list_t *sensors
);

void inline_object_24_free(inline_object_24_t *inline_object_24);

inline_object_24_t *inline_object_24_parseFromJSON(char *jsonString);

cJSON *inline_object_24_convertToJSON(inline_object_24_t *inline_object_24);

#endif /* _inline_object_24_H_ */


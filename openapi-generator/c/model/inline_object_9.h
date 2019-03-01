/*
 * inline_object_9.h
 *
 * 
 */

#ifndef _inline_object_9_H_
#define _inline_object_9_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_9_t {
        long groupId; //numeric

} inline_object_9_t;

inline_object_9_t *inline_object_9_create(
        long groupId
);

void inline_object_9_free(inline_object_9_t *inline_object_9);

inline_object_9_t *inline_object_9_parseFromJSON(char *jsonString);

cJSON *inline_object_9_convertToJSON(inline_object_9_t *inline_object_9);

#endif /* _inline_object_9_H_ */


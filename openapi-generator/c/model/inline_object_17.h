/*
 * inline_object_17.h
 *
 * 
 */

#ifndef _inline_object_17_H_
#define _inline_object_17_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_17_t {
        int endMs; //numeric
        long groupId; //numeric
        int startMs; //numeric

} inline_object_17_t;

inline_object_17_t *inline_object_17_create(
        int endMs,
        long groupId,
        int startMs
);

void inline_object_17_free(inline_object_17_t *inline_object_17);

inline_object_17_t *inline_object_17_parseFromJSON(char *jsonString);

cJSON *inline_object_17_convertToJSON(inline_object_17_t *inline_object_17);

#endif /* _inline_object_17_H_ */


/*
 * inline_object_5.h
 *
 * 
 */

#ifndef _inline_object_5_H_
#define _inline_object_5_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_5_t {
        long endMs; //numeric
        long orgId; //numeric
        long startMs; //numeric

} inline_object_5_t;

inline_object_5_t *inline_object_5_create(
        long endMs,
        long orgId,
        long startMs
);

void inline_object_5_free(inline_object_5_t *inline_object_5);

inline_object_5_t *inline_object_5_parseFromJSON(char *jsonString);

cJSON *inline_object_5_convertToJSON(inline_object_5_t *inline_object_5);

#endif /* _inline_object_5_H_ */


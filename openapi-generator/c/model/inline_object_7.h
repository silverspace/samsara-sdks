/*
 * inline_object_7.h
 *
 * 
 */

#ifndef _inline_object_7_H_
#define _inline_object_7_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_7_t {
        long driverId; //numeric
        int endMs; //numeric
        long groupId; //numeric
        int startMs; //numeric

} inline_object_7_t;

inline_object_7_t *inline_object_7_create(
        long driverId,
        int endMs,
        long groupId,
        int startMs
);

void inline_object_7_free(inline_object_7_t *inline_object_7);

inline_object_7_t *inline_object_7_parseFromJSON(char *jsonString);

cJSON *inline_object_7_convertToJSON(inline_object_7_t *inline_object_7);

#endif /* _inline_object_7_H_ */


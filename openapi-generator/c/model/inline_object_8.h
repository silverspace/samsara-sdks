/*
 * inline_object_8.h
 *
 * 
 */

#ifndef _inline_object_8_H_
#define _inline_object_8_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_8_t {
        long driverId; //numeric
        int endMs; //numeric
        long groupId; //numeric
        int startMs; //numeric

} inline_object_8_t;

inline_object_8_t *inline_object_8_create(
        long driverId,
        int endMs,
        long groupId,
        int startMs
);

void inline_object_8_free(inline_object_8_t *inline_object_8);

inline_object_8_t *inline_object_8_parseFromJSON(char *jsonString);

cJSON *inline_object_8_convertToJSON(inline_object_8_t *inline_object_8);

#endif /* _inline_object_8_H_ */


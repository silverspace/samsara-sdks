/*
 * inline_object_6.h
 *
 * 
 */

#ifndef _inline_object_6_H_
#define _inline_object_6_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_6_t {
        long driverId; //numeric
        int endMs; //numeric
        long groupId; //numeric
        int startMs; //numeric

} inline_object_6_t;

inline_object_6_t *inline_object_6_create(
        long driverId,
        int endMs,
        long groupId,
        int startMs
);

void inline_object_6_free(inline_object_6_t *inline_object_6);

inline_object_6_t *inline_object_6_parseFromJSON(char *jsonString);

cJSON *inline_object_6_convertToJSON(inline_object_6_t *inline_object_6);

#endif /* _inline_object_6_H_ */


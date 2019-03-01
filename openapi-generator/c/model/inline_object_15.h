/*
 * inline_object_15.h
 *
 * 
 */

#ifndef _inline_object_15_H_
#define _inline_object_15_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_15_t {
        int endMs; //numeric
        long groupId; //numeric
        int startMs; //numeric
        long vehicleId; //numeric

} inline_object_15_t;

inline_object_15_t *inline_object_15_create(
        int endMs,
        long groupId,
        int startMs,
        long vehicleId
);

void inline_object_15_free(inline_object_15_t *inline_object_15);

inline_object_15_t *inline_object_15_parseFromJSON(char *jsonString);

cJSON *inline_object_15_convertToJSON(inline_object_15_t *inline_object_15);

#endif /* _inline_object_15_H_ */


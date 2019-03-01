/*
 * inline_object_10.h
 *
 * 
 */

#ifndef _inline_object_10_H_
#define _inline_object_10_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_10_t {
        long groupId; //numeric

} inline_object_10_t;

inline_object_10_t *inline_object_10_create(
        long groupId
);

void inline_object_10_free(inline_object_10_t *inline_object_10);

inline_object_10_t *inline_object_10_parseFromJSON(char *jsonString);

cJSON *inline_object_10_convertToJSON(inline_object_10_t *inline_object_10);

#endif /* _inline_object_10_H_ */


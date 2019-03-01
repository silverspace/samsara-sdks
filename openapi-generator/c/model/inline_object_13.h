/*
 * inline_object_13.h
 *
 * 
 */

#ifndef _inline_object_13_H_
#define _inline_object_13_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_13_t {
        long groupId; //numeric

} inline_object_13_t;

inline_object_13_t *inline_object_13_create(
        long groupId
);

void inline_object_13_free(inline_object_13_t *inline_object_13);

inline_object_13_t *inline_object_13_parseFromJSON(char *jsonString);

cJSON *inline_object_13_convertToJSON(inline_object_13_t *inline_object_13);

#endif /* _inline_object_13_H_ */


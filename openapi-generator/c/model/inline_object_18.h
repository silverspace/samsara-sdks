/*
 * inline_object_18.h
 *
 * 
 */

#ifndef _inline_object_18_H_
#define _inline_object_18_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_18_t {
        long groupId; //numeric

} inline_object_18_t;

inline_object_18_t *inline_object_18_create(
        long groupId
);

void inline_object_18_free(inline_object_18_t *inline_object_18);

inline_object_18_t *inline_object_18_parseFromJSON(char *jsonString);

cJSON *inline_object_18_convertToJSON(inline_object_18_t *inline_object_18);

#endif /* _inline_object_18_H_ */


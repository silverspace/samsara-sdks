/*
 * inline_object_3.h
 *
 * 
 */

#ifndef _inline_object_3_H_
#define _inline_object_3_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_3_t {
        long groupId; //numeric

} inline_object_3_t;

inline_object_3_t *inline_object_3_create(
        long groupId
);

void inline_object_3_free(inline_object_3_t *inline_object_3);

inline_object_3_t *inline_object_3_parseFromJSON(char *jsonString);

cJSON *inline_object_3_convertToJSON(inline_object_3_t *inline_object_3);

#endif /* _inline_object_3_H_ */


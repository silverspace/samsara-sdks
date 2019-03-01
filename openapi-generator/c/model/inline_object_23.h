/*
 * inline_object_23.h
 *
 * 
 */

#ifndef _inline_object_23_H_
#define _inline_object_23_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_23_t {
        long groupId; //numeric

} inline_object_23_t;

inline_object_23_t *inline_object_23_create(
        long groupId
);

void inline_object_23_free(inline_object_23_t *inline_object_23);

inline_object_23_t *inline_object_23_parseFromJSON(char *jsonString);

cJSON *inline_object_23_convertToJSON(inline_object_23_t *inline_object_23);

#endif /* _inline_object_23_H_ */


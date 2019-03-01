/*
 * inline_object_11.h
 *
 * 
 */

#ifndef _inline_object_11_H_
#define _inline_object_11_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_11_t {
        long groupId; //numeric

} inline_object_11_t;

inline_object_11_t *inline_object_11_create(
        long groupId
);

void inline_object_11_free(inline_object_11_t *inline_object_11);

inline_object_11_t *inline_object_11_parseFromJSON(char *jsonString);

cJSON *inline_object_11_convertToJSON(inline_object_11_t *inline_object_11);

#endif /* _inline_object_11_H_ */


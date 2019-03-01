/*
 * inline_object_2.h
 *
 * 
 */

#ifndef _inline_object_2_H_
#define _inline_object_2_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_2_t {
        char *address; //no enum string
        long groupId; //numeric
        char *name; //no enum string
        int radius; //numeric

} inline_object_2_t;

inline_object_2_t *inline_object_2_create(
        char *address,
        long groupId,
        char *name,
        int radius
);

void inline_object_2_free(inline_object_2_t *inline_object_2);

inline_object_2_t *inline_object_2_parseFromJSON(char *jsonString);

cJSON *inline_object_2_convertToJSON(inline_object_2_t *inline_object_2);

#endif /* _inline_object_2_H_ */


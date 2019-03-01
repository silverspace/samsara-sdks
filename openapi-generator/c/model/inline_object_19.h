/*
 * inline_object_19.h
 *
 * 
 */

#ifndef _inline_object_19_H_
#define _inline_object_19_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_19_t {
        long groupId; //numeric
        list_t *sensors; //primitive container

} inline_object_19_t;

inline_object_19_t *inline_object_19_create(
        long groupId,
        list_t *sensors
);

void inline_object_19_free(inline_object_19_t *inline_object_19);

inline_object_19_t *inline_object_19_parseFromJSON(char *jsonString);

cJSON *inline_object_19_convertToJSON(inline_object_19_t *inline_object_19);

#endif /* _inline_object_19_H_ */


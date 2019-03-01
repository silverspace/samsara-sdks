/*
 * inline_object_4.h
 *
 * 
 */

#ifndef _inline_object_4_H_
#define _inline_object_4_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

typedef int bool;
#define true 1
#define false 0



typedef struct inline_object_4_t {
        bool reactivate; //boolean

} inline_object_4_t;

inline_object_4_t *inline_object_4_create(
        bool reactivate
);

void inline_object_4_free(inline_object_4_t *inline_object_4);

inline_object_4_t *inline_object_4_parseFromJSON(char *jsonString);

cJSON *inline_object_4_convertToJSON(inline_object_4_t *inline_object_4);

#endif /* _inline_object_4_H_ */


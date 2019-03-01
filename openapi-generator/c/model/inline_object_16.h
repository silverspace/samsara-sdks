/*
 * inline_object_16.h
 *
 * 
 */

#ifndef _inline_object_16_H_
#define _inline_object_16_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_object_16_t {
        list_t* externalIds;
        // TODO map/hash not supported at the moment
        int harsh_accel_setting; //numeric
        char *name; //no enum string

} inline_object_16_t;

inline_object_16_t *inline_object_16_create(
        list_t* externalIds,
        // TODO map/hash not supported at the moment
        int harsh_accel_setting,
        char *name
);

void inline_object_16_free(inline_object_16_t *inline_object_16);

inline_object_16_t *inline_object_16_parseFromJSON(char *jsonString);

cJSON *inline_object_16_convertToJSON(inline_object_16_t *inline_object_16);

#endif /* _inline_object_16_H_ */


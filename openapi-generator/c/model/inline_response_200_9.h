/*
 * inline_response_200_9.h
 *
 * 
 */

#ifndef _inline_response_200_9_H_
#define _inline_response_200_9_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tag.h"




typedef struct inline_response_200_9_t {
        list_t *tags; //nonprimitive container

} inline_response_200_9_t;

inline_response_200_9_t *inline_response_200_9_create(
        list_t *tags
);

void inline_response_200_9_free(inline_response_200_9_t *inline_response_200_9);

inline_response_200_9_t *inline_response_200_9_parseFromJSON(char *jsonString);

cJSON *inline_response_200_9_convertToJSON(inline_response_200_9_t *inline_response_200_9);

#endif /* _inline_response_200_9_H_ */


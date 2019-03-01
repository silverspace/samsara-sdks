/*
 * inline_response_200_7.h
 *
 * 
 */

#ifndef _inline_response_200_7_H_
#define _inline_response_200_7_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "machine.h"




typedef struct inline_response_200_7_t {
        list_t *machines; //nonprimitive container

} inline_response_200_7_t;

inline_response_200_7_t *inline_response_200_7_create(
        list_t *machines
);

void inline_response_200_7_free(inline_response_200_7_t *inline_response_200_7);

inline_response_200_7_t *inline_response_200_7_parseFromJSON(char *jsonString);

cJSON *inline_response_200_7_convertToJSON(inline_response_200_7_t *inline_response_200_7);

#endif /* _inline_response_200_7_H_ */


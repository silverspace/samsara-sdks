/*
 * inline_response_200_3.h
 *
 * 
 */

#ifndef _inline_response_200_3_H_
#define _inline_response_200_3_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "vehicle_location.h"




typedef struct inline_response_200_3_t {
        long groupId; //numeric
        list_t *vehicles; //nonprimitive container

} inline_response_200_3_t;

inline_response_200_3_t *inline_response_200_3_create(
        long groupId,
        list_t *vehicles
);

void inline_response_200_3_free(inline_response_200_3_t *inline_response_200_3);

inline_response_200_3_t *inline_response_200_3_parseFromJSON(char *jsonString);

cJSON *inline_response_200_3_convertToJSON(inline_response_200_3_t *inline_response_200_3);

#endif /* _inline_response_200_3_H_ */


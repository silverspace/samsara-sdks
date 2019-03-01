/*
 * inline_response_200_2.h
 *
 * 
 */

#ifndef _inline_response_200_2_H_
#define _inline_response_200_2_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "pagination.h"
#include "vehicle.h"




typedef struct inline_response_200_2_t {
        pagination_t *pagination; //nonprimitive
        long groupId; //numeric
        list_t *vehicles; //nonprimitive container

} inline_response_200_2_t;

inline_response_200_2_t *inline_response_200_2_create(
        pagination_t *pagination,
        long groupId,
        list_t *vehicles
);

void inline_response_200_2_free(inline_response_200_2_t *inline_response_200_2);

inline_response_200_2_t *inline_response_200_2_parseFromJSON(char *jsonString);

cJSON *inline_response_200_2_convertToJSON(inline_response_200_2_t *inline_response_200_2);

#endif /* _inline_response_200_2_H_ */


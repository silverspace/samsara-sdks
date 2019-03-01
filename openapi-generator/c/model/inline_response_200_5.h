/*
 * inline_response_200_5.h
 *
 * 
 */

#ifndef _inline_response_200_5_H_
#define _inline_response_200_5_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "inline_response_200_5_vehicle_stats.h"
#include "pagination.h"




typedef struct inline_response_200_5_t {
        pagination_t *pagination; //nonprimitive
        list_t *vehicleStats; //nonprimitive container

} inline_response_200_5_t;

inline_response_200_5_t *inline_response_200_5_create(
        pagination_t *pagination,
        list_t *vehicleStats
);

void inline_response_200_5_free(inline_response_200_5_t *inline_response_200_5);

inline_response_200_5_t *inline_response_200_5_parseFromJSON(char *jsonString);

cJSON *inline_response_200_5_convertToJSON(inline_response_200_5_t *inline_response_200_5);

#endif /* _inline_response_200_5_H_ */


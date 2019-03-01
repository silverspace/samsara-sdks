/*
 * inline_response_200_5_vehicle_stats.h
 *
 * 
 */

#ifndef _inline_response_200_5_vehicle_stats_H_
#define _inline_response_200_5_vehicle_stats_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "aux_input_series.h"
#include "engine_state.h"




typedef struct inline_response_200_5_vehicle_stats_t {
        list_t *engineState; //nonprimitive container
        aux_input_series_t *auxInput2; //nonprimitive
        long vehicleId; //numeric
        aux_input_series_t *auxInput1; //nonprimitive

} inline_response_200_5_vehicle_stats_t;

inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats_create(
        list_t *engineState,
        aux_input_series_t *auxInput2,
        long vehicleId,
        aux_input_series_t *auxInput1
);

void inline_response_200_5_vehicle_stats_free(inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats);

inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats_parseFromJSON(char *jsonString);

cJSON *inline_response_200_5_vehicle_stats_convertToJSON(inline_response_200_5_vehicle_stats_t *inline_response_200_5_vehicle_stats);

#endif /* _inline_response_200_5_vehicle_stats_H_ */


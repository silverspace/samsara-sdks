/*
 * dispatch_route_base.h
 *
 * 
 */

#ifndef _dispatch_route_base_H_
#define _dispatch_route_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct dispatch_route_base_t {
        long actual_end_ms; //numeric
        long actual_start_ms; //numeric
        long driver_id; //numeric
        long group_id; //numeric
        char *name; //no enum string
        long scheduled_end_ms; //numeric
        long scheduled_meters; //numeric
        long scheduled_start_ms; //numeric
        char *start_location_address; //no enum string
        long start_location_address_id; //numeric
        double start_location_lat; //numeric
        double start_location_lng; //numeric
        char *start_location_name; //no enum string
        long trailer_id; //numeric
        long vehicle_id; //numeric

} dispatch_route_base_t;

dispatch_route_base_t *dispatch_route_base_create(
        long actual_end_ms,
        long actual_start_ms,
        long driver_id,
        long group_id,
        char *name,
        long scheduled_end_ms,
        long scheduled_meters,
        long scheduled_start_ms,
        char *start_location_address,
        long start_location_address_id,
        double start_location_lat,
        double start_location_lng,
        char *start_location_name,
        long trailer_id,
        long vehicle_id
);

void dispatch_route_base_free(dispatch_route_base_t *dispatch_route_base);

dispatch_route_base_t *dispatch_route_base_parseFromJSON(char *jsonString);

cJSON *dispatch_route_base_convertToJSON(dispatch_route_base_t *dispatch_route_base);

#endif /* _dispatch_route_base_H_ */


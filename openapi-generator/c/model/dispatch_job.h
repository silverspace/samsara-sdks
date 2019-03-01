/*
 * dispatch_job.h
 *
 * 
 */

#ifndef _dispatch_job_H_
#define _dispatch_job_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dispatch_job_create.h"
#include "job_status.h"




typedef struct dispatch_job_t {
        char *destination_address; //no enum string
        long destination_address_id; //numeric
        double destination_lat; //numeric
        double destination_lng; //numeric
        char *destination_name; //no enum string
        char *notes; //no enum string
        long scheduled_arrival_time_ms; //numeric
        long scheduled_departure_time_ms; //numeric
        long arrived_at_ms; //numeric
        long completed_at_ms; //numeric
        long dispatch_route_id; //numeric
        long driver_id; //numeric
        long en_route_at_ms; //numeric
        long estimated_arrival_ms; //numeric
        char *fleet_viewer_url; //no enum string
        long group_id; //numeric
        long id; //numeric
        job_status_t *job_state; //nonprimitive
        long skipped_at_ms; //numeric
        long vehicle_id; //numeric

} dispatch_job_t;

dispatch_job_t *dispatch_job_create(
        char *destination_address,
        long destination_address_id,
        double destination_lat,
        double destination_lng,
        char *destination_name,
        char *notes,
        long scheduled_arrival_time_ms,
        long scheduled_departure_time_ms,
        long arrived_at_ms,
        long completed_at_ms,
        long dispatch_route_id,
        long driver_id,
        long en_route_at_ms,
        long estimated_arrival_ms,
        char *fleet_viewer_url,
        long group_id,
        long id,
        job_status_t *job_state,
        long skipped_at_ms,
        long vehicle_id
);

void dispatch_job_free(dispatch_job_t *dispatch_job);

dispatch_job_t *dispatch_job_parseFromJSON(char *jsonString);

cJSON *dispatch_job_convertToJSON(dispatch_job_t *dispatch_job);

#endif /* _dispatch_job_H_ */


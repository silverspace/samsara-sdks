/*
 * job_update_object.h
 *
 * 
 */

#ifndef _job_update_object_H_
#define _job_update_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dispatch_route.h"
#include "job_status.h"
#include "prev_job_status.h"




typedef struct job_update_object_t {
        long changed_at_ms; //numeric
        long job_id; //numeric
        job_status_t *job_state; //nonprimitive
        prev_job_status_t *prev_job_state; //nonprimitive
        dispatch_route_t *route; //nonprimitive
        long route_id; //numeric

} job_update_object_t;

job_update_object_t *job_update_object_create(
        long changed_at_ms,
        long job_id,
        job_status_t *job_state,
        prev_job_status_t *prev_job_state,
        dispatch_route_t *route,
        long route_id
);

void job_update_object_free(job_update_object_t *job_update_object);

job_update_object_t *job_update_object_parseFromJSON(char *jsonString);

cJSON *job_update_object_convertToJSON(job_update_object_t *job_update_object);

#endif /* _job_update_object_H_ */


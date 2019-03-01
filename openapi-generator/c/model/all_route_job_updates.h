/*
 * all_route_job_updates.h
 *
 * 
 */

#ifndef _all_route_job_updates_H_
#define _all_route_job_updates_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "job_update_object.h"




typedef struct all_route_job_updates_t {
        list_t *job_updates; //nonprimitive container
        char *sequence_id; //no enum string

} all_route_job_updates_t;

all_route_job_updates_t *all_route_job_updates_create(
        list_t *job_updates,
        char *sequence_id
);

void all_route_job_updates_free(all_route_job_updates_t *all_route_job_updates);

all_route_job_updates_t *all_route_job_updates_parseFromJSON(char *jsonString);

cJSON *all_route_job_updates_convertToJSON(all_route_job_updates_t *all_route_job_updates);

#endif /* _all_route_job_updates_H_ */


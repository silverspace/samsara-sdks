/*
 * job_status.h
 *
 * The current state of the dispatch job.
 */

#ifndef _job_status_H_
#define _job_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct job_status_t {

} job_status_t;

job_status_t *job_status_create(
);

void job_status_free(job_status_t *job_status);

job_status_t *job_status_parseFromJSON(char *jsonString);

cJSON *job_status_convertToJSON(job_status_t *job_status);

#endif /* _job_status_H_ */


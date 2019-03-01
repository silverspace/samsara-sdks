/*
 * prev_job_status.h
 *
 * The previous state of the dispatch job.
 */

#ifndef _prev_job_status_H_
#define _prev_job_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct prev_job_status_t {

} prev_job_status_t;

prev_job_status_t *prev_job_status_create(
);

void prev_job_status_free(prev_job_status_t *prev_job_status);

prev_job_status_t *prev_job_status_parseFromJSON(char *jsonString);

cJSON *prev_job_status_convertToJSON(prev_job_status_t *prev_job_status);

#endif /* _prev_job_status_H_ */


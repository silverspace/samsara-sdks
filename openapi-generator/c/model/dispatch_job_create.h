/*
 * dispatch_job_create.h
 *
 * 
 */

#ifndef _dispatch_job_create_H_
#define _dispatch_job_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct dispatch_job_create_t {
        char *destination_address; //no enum string
        long destination_address_id; //numeric
        double destination_lat; //numeric
        double destination_lng; //numeric
        char *destination_name; //no enum string
        char *notes; //no enum string
        long scheduled_arrival_time_ms; //numeric
        long scheduled_departure_time_ms; //numeric

} dispatch_job_create_t;

dispatch_job_create_t *dispatch_job_create_create(
        char *destination_address,
        long destination_address_id,
        double destination_lat,
        double destination_lng,
        char *destination_name,
        char *notes,
        long scheduled_arrival_time_ms,
        long scheduled_departure_time_ms
);

void dispatch_job_create_free(dispatch_job_create_t *dispatch_job_create);

dispatch_job_create_t *dispatch_job_create_parseFromJSON(char *jsonString);

cJSON *dispatch_job_create_convertToJSON(dispatch_job_create_t *dispatch_job_create);

#endif /* _dispatch_job_create_H_ */


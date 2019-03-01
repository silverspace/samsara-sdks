/*
 * drivers_summary_response.h
 *
 * 
 */

#ifndef _drivers_summary_response_H_
#define _drivers_summary_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "drivers_summary_response_summaries.h"




typedef struct drivers_summary_response_t {
        list_t *Summaries; //nonprimitive container

} drivers_summary_response_t;

drivers_summary_response_t *drivers_summary_response_create(
        list_t *Summaries
);

void drivers_summary_response_free(drivers_summary_response_t *drivers_summary_response);

drivers_summary_response_t *drivers_summary_response_parseFromJSON(char *jsonString);

cJSON *drivers_summary_response_convertToJSON(drivers_summary_response_t *drivers_summary_response);

#endif /* _drivers_summary_response_H_ */


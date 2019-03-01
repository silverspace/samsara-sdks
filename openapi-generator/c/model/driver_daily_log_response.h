/*
 * driver_daily_log_response.h
 *
 * 
 */

#ifndef _driver_daily_log_response_H_
#define _driver_daily_log_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "driver_daily_log_response_days.h"




typedef struct driver_daily_log_response_t {
        list_t *days; //nonprimitive container

} driver_daily_log_response_t;

driver_daily_log_response_t *driver_daily_log_response_create(
        list_t *days
);

void driver_daily_log_response_free(driver_daily_log_response_t *driver_daily_log_response);

driver_daily_log_response_t *driver_daily_log_response_parseFromJSON(char *jsonString);

cJSON *driver_daily_log_response_convertToJSON(driver_daily_log_response_t *driver_daily_log_response);

#endif /* _driver_daily_log_response_H_ */


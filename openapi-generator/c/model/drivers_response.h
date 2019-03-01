/*
 * drivers_response.h
 *
 * 
 */

#ifndef _drivers_response_H_
#define _drivers_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "driver.h"




typedef struct drivers_response_t {
        list_t *drivers; //nonprimitive container

} drivers_response_t;

drivers_response_t *drivers_response_create(
        list_t *drivers
);

void drivers_response_free(drivers_response_t *drivers_response);

drivers_response_t *drivers_response_parseFromJSON(char *jsonString);

cJSON *drivers_response_convertToJSON(drivers_response_t *drivers_response);

#endif /* _drivers_response_H_ */


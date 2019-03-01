/*
 * current_driver.h
 *
 * 
 */

#ifndef _current_driver_H_
#define _current_driver_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct current_driver_t {

} current_driver_t;

current_driver_t *current_driver_create(
);

void current_driver_free(current_driver_t *current_driver);

current_driver_t *current_driver_parseFromJSON(char *jsonString);

cJSON *current_driver_convertToJSON(current_driver_t *current_driver);

#endif /* _current_driver_H_ */


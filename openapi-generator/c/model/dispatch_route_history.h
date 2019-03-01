/*
 * dispatch_route_history.h
 *
 * 
 */

#ifndef _dispatch_route_history_H_
#define _dispatch_route_history_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dispatch_route_historical_entry.h"




typedef struct dispatch_route_history_t {
        list_t *history; //nonprimitive container

} dispatch_route_history_t;

dispatch_route_history_t *dispatch_route_history_create(
        list_t *history
);

void dispatch_route_history_free(dispatch_route_history_t *dispatch_route_history);

dispatch_route_history_t *dispatch_route_history_parseFromJSON(char *jsonString);

cJSON *dispatch_route_history_convertToJSON(dispatch_route_history_t *dispatch_route_history);

#endif /* _dispatch_route_history_H_ */


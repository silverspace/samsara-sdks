/*
 * dispatch_route_historical_entry.h
 *
 * 
 */

#ifndef _dispatch_route_historical_entry_H_
#define _dispatch_route_historical_entry_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dispatch_route.h"




typedef struct dispatch_route_historical_entry_t {
        long changed_at_ms; //numeric
        dispatch_route_t *route; //nonprimitive

} dispatch_route_historical_entry_t;

dispatch_route_historical_entry_t *dispatch_route_historical_entry_create(
        long changed_at_ms,
        dispatch_route_t *route
);

void dispatch_route_historical_entry_free(dispatch_route_historical_entry_t *dispatch_route_historical_entry);

dispatch_route_historical_entry_t *dispatch_route_historical_entry_parseFromJSON(char *jsonString);

cJSON *dispatch_route_historical_entry_convertToJSON(dispatch_route_historical_entry_t *dispatch_route_historical_entry);

#endif /* _dispatch_route_historical_entry_H_ */


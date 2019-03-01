#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dispatch_route_historical_entry.h"



dispatch_route_historical_entry_t *dispatch_route_historical_entry_create(
    long changed_at_ms,
    dispatch_route_t *route
    ) {
	dispatch_route_historical_entry_t *dispatch_route_historical_entry = malloc(sizeof(dispatch_route_historical_entry_t));
	dispatch_route_historical_entry->changed_at_ms = changed_at_ms;
	dispatch_route_historical_entry->route = route;

	return dispatch_route_historical_entry;
}


void dispatch_route_historical_entry_free(dispatch_route_historical_entry_t *dispatch_route_historical_entry) {
    listEntry_t *listEntry;
	dispatch_route_free(dispatch_route_historical_entry->route);

	free(dispatch_route_historical_entry);
}

cJSON *dispatch_route_historical_entry_convertToJSON(dispatch_route_historical_entry_t *dispatch_route_historical_entry) {
	cJSON *item = cJSON_CreateObject();
	// dispatch_route_historical_entry->changed_at_ms
    if(cJSON_AddNumberToObject(item, "changed_at_ms", dispatch_route_historical_entry->changed_at_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_historical_entry->route
	cJSON *route = dispatch_route_convertToJSON(dispatch_route_historical_entry->route);
	if(route == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "route", route);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dispatch_route_historical_entry_t *dispatch_route_historical_entry_parseFromJSON(char *jsonString){

    dispatch_route_historical_entry_t *dispatch_route_historical_entry = NULL;
    cJSON *dispatch_route_historical_entryJSON = cJSON_Parse(jsonString);
    if(dispatch_route_historical_entryJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dispatch_route_historical_entry->changed_at_ms
    cJSON *changed_at_ms = cJSON_GetObjectItemCaseSensitive(dispatch_route_historical_entryJSON, "changed_at_ms");
    if(!cJSON_IsNumber(changed_at_ms))
    {
    goto end; //Numeric
    }

    // dispatch_route_historical_entry->route
    dispatch_route_t *route;
    cJSON *routeJSON = cJSON_GetObjectItemCaseSensitive(dispatch_route_historical_entryJSON, "route");
    if(dispatch_route_historical_entryJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *routeJSONData = cJSON_Print(routeJSON);
    route = dispatch_route_parseFromJSON(routeJSONData);


    dispatch_route_historical_entry = dispatch_route_historical_entry_create (
        changed_at_ms->valuedouble,
        route
        );
        free(routeJSONData);
 cJSON_Delete(dispatch_route_historical_entryJSON);
    return dispatch_route_historical_entry;
end:
    cJSON_Delete(dispatch_route_historical_entryJSON);
    return NULL;

}


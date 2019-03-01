#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dispatch_route_history.h"



dispatch_route_history_t *dispatch_route_history_create(
    list_t *history
    ) {
	dispatch_route_history_t *dispatch_route_history = malloc(sizeof(dispatch_route_history_t));
	dispatch_route_history->history = history;

	return dispatch_route_history;
}


void dispatch_route_history_free(dispatch_route_history_t *dispatch_route_history) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, dispatch_route_history->history) {
		dispatch_route_historical_entry_free(listEntry->data);
	}
	list_free(dispatch_route_history->history);

	free(dispatch_route_history);
}

cJSON *dispatch_route_history_convertToJSON(dispatch_route_history_t *dispatch_route_history) {
	cJSON *item = cJSON_CreateObject();
	// dispatch_route_history->history
    cJSON *history = cJSON_AddArrayToObject(item, "history");
	if(history == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *historyListEntry;
	list_ForEach(historyListEntry, dispatch_route_history->history) {
		cJSON *item = dispatch_route_historical_entry_convertToJSON(historyListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(history, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dispatch_route_history_t *dispatch_route_history_parseFromJSON(char *jsonString){

    dispatch_route_history_t *dispatch_route_history = NULL;
    cJSON *dispatch_route_historyJSON = cJSON_Parse(jsonString);
    if(dispatch_route_historyJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dispatch_route_history->history
    cJSON *history;
    cJSON *historyJSON = cJSON_GetObjectItemCaseSensitive(dispatch_route_historyJSON,"history");
    if(!cJSON_IsArray(historyJSON)){
        goto end; //nonprimitive container
    }

    list_t *historyList = list_create();

    cJSON_ArrayForEach(history,historyJSON )
    {
        if(!cJSON_IsObject(history)){
            goto end;
        }
		char *JSONData = cJSON_Print(history);
        dispatch_route_historical_entry_t *historyItem = dispatch_route_historical_entry_parseFromJSON(JSONData);

        list_addElement(historyList, historyItem);
        free(JSONData);
    }


    dispatch_route_history = dispatch_route_history_create (
        historyList
        );
 cJSON_Delete(dispatch_route_historyJSON);
    return dispatch_route_history;
end:
    cJSON_Delete(dispatch_route_historyJSON);
    return NULL;

}


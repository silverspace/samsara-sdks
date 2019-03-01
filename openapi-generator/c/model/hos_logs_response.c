#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hos_logs_response.h"



hos_logs_response_t *hos_logs_response_create(
    list_t *logs
    ) {
	hos_logs_response_t *hos_logs_response = malloc(sizeof(hos_logs_response_t));
	hos_logs_response->logs = logs;

	return hos_logs_response;
}


void hos_logs_response_free(hos_logs_response_t *hos_logs_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, hos_logs_response->logs) {
		hos_logs_response_logs_free(listEntry->data);
	}
	list_free(hos_logs_response->logs);

	free(hos_logs_response);
}

cJSON *hos_logs_response_convertToJSON(hos_logs_response_t *hos_logs_response) {
	cJSON *item = cJSON_CreateObject();
	// hos_logs_response->logs
    cJSON *logs = cJSON_AddArrayToObject(item, "logs");
	if(logs == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *logsListEntry;
	list_ForEach(logsListEntry, hos_logs_response->logs) {
		cJSON *item = hos_logs_response_logs_convertToJSON(logsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(logs, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

hos_logs_response_t *hos_logs_response_parseFromJSON(char *jsonString){

    hos_logs_response_t *hos_logs_response = NULL;
    cJSON *hos_logs_responseJSON = cJSON_Parse(jsonString);
    if(hos_logs_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // hos_logs_response->logs
    cJSON *logs;
    cJSON *logsJSON = cJSON_GetObjectItemCaseSensitive(hos_logs_responseJSON,"logs");
    if(!cJSON_IsArray(logsJSON)){
        goto end; //nonprimitive container
    }

    list_t *logsList = list_create();

    cJSON_ArrayForEach(logs,logsJSON )
    {
        if(!cJSON_IsObject(logs)){
            goto end;
        }
		char *JSONData = cJSON_Print(logs);
        hos_logs_response_logs_t *logsItem = hos_logs_response_logs_parseFromJSON(JSONData);

        list_addElement(logsList, logsItem);
        free(JSONData);
    }


    hos_logs_response = hos_logs_response_create (
        logsList
        );
 cJSON_Delete(hos_logs_responseJSON);
    return hos_logs_response;
end:
    cJSON_Delete(hos_logs_responseJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hos_authentication_logs_response.h"



hos_authentication_logs_response_t *hos_authentication_logs_response_create(
    list_t *authenticationLogs
    ) {
	hos_authentication_logs_response_t *hos_authentication_logs_response = malloc(sizeof(hos_authentication_logs_response_t));
	hos_authentication_logs_response->authenticationLogs = authenticationLogs;

	return hos_authentication_logs_response;
}


void hos_authentication_logs_response_free(hos_authentication_logs_response_t *hos_authentication_logs_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, hos_authentication_logs_response->authenticationLogs) {
		hos_authentication_logs_response_authentication_logs_free(listEntry->data);
	}
	list_free(hos_authentication_logs_response->authenticationLogs);

	free(hos_authentication_logs_response);
}

cJSON *hos_authentication_logs_response_convertToJSON(hos_authentication_logs_response_t *hos_authentication_logs_response) {
	cJSON *item = cJSON_CreateObject();
	// hos_authentication_logs_response->authenticationLogs
    cJSON *authenticationLogs = cJSON_AddArrayToObject(item, "authenticationLogs");
	if(authenticationLogs == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *authenticationLogsListEntry;
	list_ForEach(authenticationLogsListEntry, hos_authentication_logs_response->authenticationLogs) {
		cJSON *item = hos_authentication_logs_response_authentication_logs_convertToJSON(authenticationLogsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(authenticationLogs, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

hos_authentication_logs_response_t *hos_authentication_logs_response_parseFromJSON(char *jsonString){

    hos_authentication_logs_response_t *hos_authentication_logs_response = NULL;
    cJSON *hos_authentication_logs_responseJSON = cJSON_Parse(jsonString);
    if(hos_authentication_logs_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // hos_authentication_logs_response->authenticationLogs
    cJSON *authenticationLogs;
    cJSON *authenticationLogsJSON = cJSON_GetObjectItemCaseSensitive(hos_authentication_logs_responseJSON,"authenticationLogs");
    if(!cJSON_IsArray(authenticationLogsJSON)){
        goto end; //nonprimitive container
    }

    list_t *authenticationLogsList = list_create();

    cJSON_ArrayForEach(authenticationLogs,authenticationLogsJSON )
    {
        if(!cJSON_IsObject(authenticationLogs)){
            goto end;
        }
		char *JSONData = cJSON_Print(authenticationLogs);
        hos_authentication_logs_response_authentication_logs_t *authenticationLogsItem = hos_authentication_logs_response_authentication_logs_parseFromJSON(JSONData);

        list_addElement(authenticationLogsList, authenticationLogsItem);
        free(JSONData);
    }


    hos_authentication_logs_response = hos_authentication_logs_response_create (
        authenticationLogsList
        );
 cJSON_Delete(hos_authentication_logs_responseJSON);
    return hos_authentication_logs_response;
end:
    cJSON_Delete(hos_authentication_logs_responseJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hos_authentication_logs_response_authentication_logs.h"



hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs_create(
    char *actionType,
    char *address,
    char *city,
    long happenedAtMs,
    char *addressName,
    char *state
    ) {
	hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs = malloc(sizeof(hos_authentication_logs_response_authentication_logs_t));
	hos_authentication_logs_response_authentication_logs->actionType = actionType;
	hos_authentication_logs_response_authentication_logs->address = address;
	hos_authentication_logs_response_authentication_logs->city = city;
	hos_authentication_logs_response_authentication_logs->happenedAtMs = happenedAtMs;
	hos_authentication_logs_response_authentication_logs->addressName = addressName;
	hos_authentication_logs_response_authentication_logs->state = state;

	return hos_authentication_logs_response_authentication_logs;
}


void hos_authentication_logs_response_authentication_logs_free(hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs) {
    listEntry_t *listEntry;
    free(hos_authentication_logs_response_authentication_logs->actionType);
    free(hos_authentication_logs_response_authentication_logs->address);
    free(hos_authentication_logs_response_authentication_logs->city);
    free(hos_authentication_logs_response_authentication_logs->addressName);
    free(hos_authentication_logs_response_authentication_logs->state);

	free(hos_authentication_logs_response_authentication_logs);
}

cJSON *hos_authentication_logs_response_authentication_logs_convertToJSON(hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs) {
	cJSON *item = cJSON_CreateObject();
	// hos_authentication_logs_response_authentication_logs->actionType
    if(cJSON_AddStringToObject(item, "actionType", hos_authentication_logs_response_authentication_logs->actionType) == NULL) {
    goto fail; //String
    }

	// hos_authentication_logs_response_authentication_logs->address
    if(cJSON_AddStringToObject(item, "address", hos_authentication_logs_response_authentication_logs->address) == NULL) {
    goto fail; //String
    }

	// hos_authentication_logs_response_authentication_logs->city
    if(cJSON_AddStringToObject(item, "city", hos_authentication_logs_response_authentication_logs->city) == NULL) {
    goto fail; //String
    }

	// hos_authentication_logs_response_authentication_logs->happenedAtMs
    if(cJSON_AddNumberToObject(item, "happenedAtMs", hos_authentication_logs_response_authentication_logs->happenedAtMs) == NULL) {
    goto fail; //Numeric
    }

	// hos_authentication_logs_response_authentication_logs->addressName
    if(cJSON_AddStringToObject(item, "addressName", hos_authentication_logs_response_authentication_logs->addressName) == NULL) {
    goto fail; //String
    }

	// hos_authentication_logs_response_authentication_logs->state
    if(cJSON_AddStringToObject(item, "state", hos_authentication_logs_response_authentication_logs->state) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs_parseFromJSON(char *jsonString){

    hos_authentication_logs_response_authentication_logs_t *hos_authentication_logs_response_authentication_logs = NULL;
    cJSON *hos_authentication_logs_response_authentication_logsJSON = cJSON_Parse(jsonString);
    if(hos_authentication_logs_response_authentication_logsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // hos_authentication_logs_response_authentication_logs->actionType
    cJSON *actionType = cJSON_GetObjectItemCaseSensitive(hos_authentication_logs_response_authentication_logsJSON, "actionType");
    if(!cJSON_IsString(actionType) || (actionType->valuestring == NULL)){
    goto end; //String
    }

    // hos_authentication_logs_response_authentication_logs->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(hos_authentication_logs_response_authentication_logsJSON, "address");
    if(!cJSON_IsString(address) || (address->valuestring == NULL)){
    goto end; //String
    }

    // hos_authentication_logs_response_authentication_logs->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(hos_authentication_logs_response_authentication_logsJSON, "city");
    if(!cJSON_IsString(city) || (city->valuestring == NULL)){
    goto end; //String
    }

    // hos_authentication_logs_response_authentication_logs->happenedAtMs
    cJSON *happenedAtMs = cJSON_GetObjectItemCaseSensitive(hos_authentication_logs_response_authentication_logsJSON, "happenedAtMs");
    if(!cJSON_IsNumber(happenedAtMs))
    {
    goto end; //Numeric
    }

    // hos_authentication_logs_response_authentication_logs->addressName
    cJSON *addressName = cJSON_GetObjectItemCaseSensitive(hos_authentication_logs_response_authentication_logsJSON, "addressName");
    if(!cJSON_IsString(addressName) || (addressName->valuestring == NULL)){
    goto end; //String
    }

    // hos_authentication_logs_response_authentication_logs->state
    cJSON *state = cJSON_GetObjectItemCaseSensitive(hos_authentication_logs_response_authentication_logsJSON, "state");
    if(!cJSON_IsString(state) || (state->valuestring == NULL)){
    goto end; //String
    }


    hos_authentication_logs_response_authentication_logs = hos_authentication_logs_response_authentication_logs_create (
        strdup(actionType->valuestring),
        strdup(address->valuestring),
        strdup(city->valuestring),
        happenedAtMs->valuedouble,
        strdup(addressName->valuestring),
        strdup(state->valuestring)
        );
 cJSON_Delete(hos_authentication_logs_response_authentication_logsJSON);
    return hos_authentication_logs_response_authentication_logs;
end:
    cJSON_Delete(hos_authentication_logs_response_authentication_logsJSON);
    return NULL;

}


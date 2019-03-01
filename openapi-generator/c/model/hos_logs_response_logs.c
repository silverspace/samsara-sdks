#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hos_logs_response_logs.h"



hos_logs_response_logs_t *hos_logs_response_logs_create(
    double locLng,
    long logStartMs,
    long driverId,
    char *statusType,
    char *locCity,
    long groupId,
    char *locName,
    double locLat,
    char *remark,
    char *locState,
    long vehicleId,
    list_t *codriverIds
    ) {
	hos_logs_response_logs_t *hos_logs_response_logs = malloc(sizeof(hos_logs_response_logs_t));
	hos_logs_response_logs->locLng = locLng;
	hos_logs_response_logs->logStartMs = logStartMs;
	hos_logs_response_logs->driverId = driverId;
	hos_logs_response_logs->statusType = statusType;
	hos_logs_response_logs->locCity = locCity;
	hos_logs_response_logs->groupId = groupId;
	hos_logs_response_logs->locName = locName;
	hos_logs_response_logs->locLat = locLat;
	hos_logs_response_logs->remark = remark;
	hos_logs_response_logs->locState = locState;
	hos_logs_response_logs->vehicleId = vehicleId;
	hos_logs_response_logs->codriverIds = codriverIds;

	return hos_logs_response_logs;
}


void hos_logs_response_logs_free(hos_logs_response_logs_t *hos_logs_response_logs) {
    listEntry_t *listEntry;
    free(hos_logs_response_logs->statusType);
    free(hos_logs_response_logs->locCity);
    free(hos_logs_response_logs->locName);
    free(hos_logs_response_logs->remark);
    free(hos_logs_response_logs->locState);
	list_ForEach(listEntry, hos_logs_response_logs->codriverIds) {
		free(listEntry->data);
	}
	list_free(hos_logs_response_logs->codriverIds);

	free(hos_logs_response_logs);
}

cJSON *hos_logs_response_logs_convertToJSON(hos_logs_response_logs_t *hos_logs_response_logs) {
	cJSON *item = cJSON_CreateObject();
	// hos_logs_response_logs->locLng
    if(cJSON_AddNumberToObject(item, "locLng", hos_logs_response_logs->locLng) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_response_logs->logStartMs
    if(cJSON_AddNumberToObject(item, "logStartMs", hos_logs_response_logs->logStartMs) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_response_logs->driverId
    if(cJSON_AddNumberToObject(item, "driverId", hos_logs_response_logs->driverId) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_response_logs->statusType
    if(cJSON_AddStringToObject(item, "statusType", hos_logs_response_logs->statusType) == NULL) {
    goto fail; //String
    }

	// hos_logs_response_logs->locCity
    if(cJSON_AddStringToObject(item, "locCity", hos_logs_response_logs->locCity) == NULL) {
    goto fail; //String
    }

	// hos_logs_response_logs->groupId
    if(cJSON_AddNumberToObject(item, "groupId", hos_logs_response_logs->groupId) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_response_logs->locName
    if(cJSON_AddStringToObject(item, "locName", hos_logs_response_logs->locName) == NULL) {
    goto fail; //String
    }

	// hos_logs_response_logs->locLat
    if(cJSON_AddNumberToObject(item, "locLat", hos_logs_response_logs->locLat) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_response_logs->remark
    if(cJSON_AddStringToObject(item, "remark", hos_logs_response_logs->remark) == NULL) {
    goto fail; //String
    }

	// hos_logs_response_logs->locState
    if(cJSON_AddStringToObject(item, "locState", hos_logs_response_logs->locState) == NULL) {
    goto fail; //String
    }

	// hos_logs_response_logs->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", hos_logs_response_logs->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_response_logs->codriverIds
	cJSON *codriver_ids = cJSON_AddArrayToObject(item, "codriverIds");
	if(codriver_ids == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *codriver_idsListEntry;
    list_ForEach(codriver_idsListEntry, hos_logs_response_logs->codriverIds) {
        if(cJSON_AddNumberToObject(codriver_ids, "", *(double *)codriver_idsListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

hos_logs_response_logs_t *hos_logs_response_logs_parseFromJSON(char *jsonString){

    hos_logs_response_logs_t *hos_logs_response_logs = NULL;
    cJSON *hos_logs_response_logsJSON = cJSON_Parse(jsonString);
    if(hos_logs_response_logsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // hos_logs_response_logs->locLng
    cJSON *locLng = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "locLng");
    if(!cJSON_IsNumber(locLng))
    {
    goto end; //Numeric
    }

    // hos_logs_response_logs->logStartMs
    cJSON *logStartMs = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "logStartMs");
    if(!cJSON_IsNumber(logStartMs))
    {
    goto end; //Numeric
    }

    // hos_logs_response_logs->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // hos_logs_response_logs->statusType
    cJSON *statusType = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "statusType");
    if(!cJSON_IsString(statusType) || (statusType->valuestring == NULL)){
    goto end; //String
    }

    // hos_logs_response_logs->locCity
    cJSON *locCity = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "locCity");
    if(!cJSON_IsString(locCity) || (locCity->valuestring == NULL)){
    goto end; //String
    }

    // hos_logs_response_logs->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // hos_logs_response_logs->locName
    cJSON *locName = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "locName");
    if(!cJSON_IsString(locName) || (locName->valuestring == NULL)){
    goto end; //String
    }

    // hos_logs_response_logs->locLat
    cJSON *locLat = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "locLat");
    if(!cJSON_IsNumber(locLat))
    {
    goto end; //Numeric
    }

    // hos_logs_response_logs->remark
    cJSON *remark = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "remark");
    if(!cJSON_IsString(remark) || (remark->valuestring == NULL)){
    goto end; //String
    }

    // hos_logs_response_logs->locState
    cJSON *locState = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "locState");
    if(!cJSON_IsString(locState) || (locState->valuestring == NULL)){
    goto end; //String
    }

    // hos_logs_response_logs->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }

    // hos_logs_response_logs->codriverIds
    cJSON *codriver_ids;
    cJSON *codriverIdsJSON = cJSON_GetObjectItemCaseSensitive(hos_logs_response_logsJSON, "codriverIds");
    if(!cJSON_IsArray(codriverIdsJSON)) {
        goto end;//primitive container
    }
    list_t *codriver_idsList = list_create();

    cJSON_ArrayForEach(codriver_ids, codriverIdsJSON)
    {
        if(!cJSON_IsNumber(codriver_ids))
        {
            goto end;
        }
        list_addElement(codriver_idsList , &codriver_ids->valuedouble);

    }


    hos_logs_response_logs = hos_logs_response_logs_create (
        locLng->valuedouble,
        logStartMs->valuedouble,
        driverId->valuedouble,
        strdup(statusType->valuestring),
        strdup(locCity->valuestring),
        groupId->valuedouble,
        strdup(locName->valuestring),
        locLat->valuedouble,
        strdup(remark->valuestring),
        strdup(locState->valuestring),
        vehicleId->valuedouble,
        codriver_idsList
        );
 cJSON_Delete(hos_logs_response_logsJSON);
    return hos_logs_response_logs;
end:
    cJSON_Delete(hos_logs_response_logsJSON);
    return NULL;

}


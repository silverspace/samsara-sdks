#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hos_logs_summary_response_drivers.h"



hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers_create(
    long timeUntilBreak,
    char *vehicleName,
    long drivingInViolationToday,
    long driverId,
    long cycleRemaining,
    char *driverName,
    char *dutyStatus,
    long cycleTomorrow,
    long shiftDriveRemaining,
    long timeInCurrentStatus,
    long drivingInViolationCycle,
    long shiftRemaining
    ) {
	hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers = malloc(sizeof(hos_logs_summary_response_drivers_t));
	hos_logs_summary_response_drivers->timeUntilBreak = timeUntilBreak;
	hos_logs_summary_response_drivers->vehicleName = vehicleName;
	hos_logs_summary_response_drivers->drivingInViolationToday = drivingInViolationToday;
	hos_logs_summary_response_drivers->driverId = driverId;
	hos_logs_summary_response_drivers->cycleRemaining = cycleRemaining;
	hos_logs_summary_response_drivers->driverName = driverName;
	hos_logs_summary_response_drivers->dutyStatus = dutyStatus;
	hos_logs_summary_response_drivers->cycleTomorrow = cycleTomorrow;
	hos_logs_summary_response_drivers->shiftDriveRemaining = shiftDriveRemaining;
	hos_logs_summary_response_drivers->timeInCurrentStatus = timeInCurrentStatus;
	hos_logs_summary_response_drivers->drivingInViolationCycle = drivingInViolationCycle;
	hos_logs_summary_response_drivers->shiftRemaining = shiftRemaining;

	return hos_logs_summary_response_drivers;
}


void hos_logs_summary_response_drivers_free(hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers) {
    listEntry_t *listEntry;
    free(hos_logs_summary_response_drivers->vehicleName);
    free(hos_logs_summary_response_drivers->driverName);
    free(hos_logs_summary_response_drivers->dutyStatus);

	free(hos_logs_summary_response_drivers);
}

cJSON *hos_logs_summary_response_drivers_convertToJSON(hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers) {
	cJSON *item = cJSON_CreateObject();
	// hos_logs_summary_response_drivers->timeUntilBreak
    if(cJSON_AddNumberToObject(item, "timeUntilBreak", hos_logs_summary_response_drivers->timeUntilBreak) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_summary_response_drivers->vehicleName
    if(cJSON_AddStringToObject(item, "vehicleName", hos_logs_summary_response_drivers->vehicleName) == NULL) {
    goto fail; //String
    }

	// hos_logs_summary_response_drivers->drivingInViolationToday
    if(cJSON_AddNumberToObject(item, "drivingInViolationToday", hos_logs_summary_response_drivers->drivingInViolationToday) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_summary_response_drivers->driverId
    if(cJSON_AddNumberToObject(item, "driverId", hos_logs_summary_response_drivers->driverId) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_summary_response_drivers->cycleRemaining
    if(cJSON_AddNumberToObject(item, "cycleRemaining", hos_logs_summary_response_drivers->cycleRemaining) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_summary_response_drivers->driverName
    if(cJSON_AddStringToObject(item, "driverName", hos_logs_summary_response_drivers->driverName) == NULL) {
    goto fail; //String
    }

	// hos_logs_summary_response_drivers->dutyStatus
    if(cJSON_AddStringToObject(item, "dutyStatus", hos_logs_summary_response_drivers->dutyStatus) == NULL) {
    goto fail; //String
    }

	// hos_logs_summary_response_drivers->cycleTomorrow
    if(cJSON_AddNumberToObject(item, "cycleTomorrow", hos_logs_summary_response_drivers->cycleTomorrow) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_summary_response_drivers->shiftDriveRemaining
    if(cJSON_AddNumberToObject(item, "shiftDriveRemaining", hos_logs_summary_response_drivers->shiftDriveRemaining) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_summary_response_drivers->timeInCurrentStatus
    if(cJSON_AddNumberToObject(item, "timeInCurrentStatus", hos_logs_summary_response_drivers->timeInCurrentStatus) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_summary_response_drivers->drivingInViolationCycle
    if(cJSON_AddNumberToObject(item, "drivingInViolationCycle", hos_logs_summary_response_drivers->drivingInViolationCycle) == NULL) {
    goto fail; //Numeric
    }

	// hos_logs_summary_response_drivers->shiftRemaining
    if(cJSON_AddNumberToObject(item, "shiftRemaining", hos_logs_summary_response_drivers->shiftRemaining) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers_parseFromJSON(char *jsonString){

    hos_logs_summary_response_drivers_t *hos_logs_summary_response_drivers = NULL;
    cJSON *hos_logs_summary_response_driversJSON = cJSON_Parse(jsonString);
    if(hos_logs_summary_response_driversJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // hos_logs_summary_response_drivers->timeUntilBreak
    cJSON *timeUntilBreak = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "timeUntilBreak");
    if(!cJSON_IsNumber(timeUntilBreak))
    {
    goto end; //Numeric
    }

    // hos_logs_summary_response_drivers->vehicleName
    cJSON *vehicleName = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "vehicleName");
    if(!cJSON_IsString(vehicleName) || (vehicleName->valuestring == NULL)){
    goto end; //String
    }

    // hos_logs_summary_response_drivers->drivingInViolationToday
    cJSON *drivingInViolationToday = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "drivingInViolationToday");
    if(!cJSON_IsNumber(drivingInViolationToday))
    {
    goto end; //Numeric
    }

    // hos_logs_summary_response_drivers->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // hos_logs_summary_response_drivers->cycleRemaining
    cJSON *cycleRemaining = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "cycleRemaining");
    if(!cJSON_IsNumber(cycleRemaining))
    {
    goto end; //Numeric
    }

    // hos_logs_summary_response_drivers->driverName
    cJSON *driverName = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "driverName");
    if(!cJSON_IsString(driverName) || (driverName->valuestring == NULL)){
    goto end; //String
    }

    // hos_logs_summary_response_drivers->dutyStatus
    cJSON *dutyStatus = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "dutyStatus");
    if(!cJSON_IsString(dutyStatus) || (dutyStatus->valuestring == NULL)){
    goto end; //String
    }

    // hos_logs_summary_response_drivers->cycleTomorrow
    cJSON *cycleTomorrow = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "cycleTomorrow");
    if(!cJSON_IsNumber(cycleTomorrow))
    {
    goto end; //Numeric
    }

    // hos_logs_summary_response_drivers->shiftDriveRemaining
    cJSON *shiftDriveRemaining = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "shiftDriveRemaining");
    if(!cJSON_IsNumber(shiftDriveRemaining))
    {
    goto end; //Numeric
    }

    // hos_logs_summary_response_drivers->timeInCurrentStatus
    cJSON *timeInCurrentStatus = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "timeInCurrentStatus");
    if(!cJSON_IsNumber(timeInCurrentStatus))
    {
    goto end; //Numeric
    }

    // hos_logs_summary_response_drivers->drivingInViolationCycle
    cJSON *drivingInViolationCycle = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "drivingInViolationCycle");
    if(!cJSON_IsNumber(drivingInViolationCycle))
    {
    goto end; //Numeric
    }

    // hos_logs_summary_response_drivers->shiftRemaining
    cJSON *shiftRemaining = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_response_driversJSON, "shiftRemaining");
    if(!cJSON_IsNumber(shiftRemaining))
    {
    goto end; //Numeric
    }


    hos_logs_summary_response_drivers = hos_logs_summary_response_drivers_create (
        timeUntilBreak->valuedouble,
        strdup(vehicleName->valuestring),
        drivingInViolationToday->valuedouble,
        driverId->valuedouble,
        cycleRemaining->valuedouble,
        strdup(driverName->valuestring),
        strdup(dutyStatus->valuestring),
        cycleTomorrow->valuedouble,
        shiftDriveRemaining->valuedouble,
        timeInCurrentStatus->valuedouble,
        drivingInViolationCycle->valuedouble,
        shiftRemaining->valuedouble
        );
 cJSON_Delete(hos_logs_summary_response_driversJSON);
    return hos_logs_summary_response_drivers;
end:
    cJSON_Delete(hos_logs_summary_response_driversJSON);
    return NULL;

}


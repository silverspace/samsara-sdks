#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "driver_daily_log_response_days.h"



driver_daily_log_response_days_t *driver_daily_log_response_days_create(
    long certifiedAtMs,
    int endMs,
    int startMs,
    object_t *trailerIds,
    double activeHours,
    double distanceMiles,
    long activeMs,
    bool certified,
    object_t *vehicleIds
    ) {
	driver_daily_log_response_days_t *driver_daily_log_response_days = malloc(sizeof(driver_daily_log_response_days_t));
	driver_daily_log_response_days->certifiedAtMs = certifiedAtMs;
	driver_daily_log_response_days->endMs = endMs;
	driver_daily_log_response_days->startMs = startMs;
	driver_daily_log_response_days->trailerIds = trailerIds;
	driver_daily_log_response_days->activeHours = activeHours;
	driver_daily_log_response_days->distanceMiles = distanceMiles;
	driver_daily_log_response_days->activeMs = activeMs;
	driver_daily_log_response_days->certified = certified;
	driver_daily_log_response_days->vehicleIds = vehicleIds;

	return driver_daily_log_response_days;
}


void driver_daily_log_response_days_free(driver_daily_log_response_days_t *driver_daily_log_response_days) {
    listEntry_t *listEntry;
	_free(driver_daily_log_response_days->trailerIds);
	_free(driver_daily_log_response_days->vehicleIds);

	free(driver_daily_log_response_days);
}

cJSON *driver_daily_log_response_days_convertToJSON(driver_daily_log_response_days_t *driver_daily_log_response_days) {
	cJSON *item = cJSON_CreateObject();
	// driver_daily_log_response_days->certifiedAtMs
    if(cJSON_AddNumberToObject(item, "certifiedAtMs", driver_daily_log_response_days->certifiedAtMs) == NULL) {
    goto fail; //Numeric
    }

	// driver_daily_log_response_days->endMs
    if(cJSON_AddNumberToObject(item, "endMs", driver_daily_log_response_days->endMs) == NULL) {
    goto fail; //Numeric
    }

	// driver_daily_log_response_days->startMs
    if(cJSON_AddNumberToObject(item, "startMs", driver_daily_log_response_days->startMs) == NULL) {
    goto fail; //Numeric
    }

	// driver_daily_log_response_days->trailerIds
	cJSON *trailerIds = _convertToJSON(driver_daily_log_response_days->trailerIds);
	if(trailerIds == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "trailerIds", trailerIds);
	if(item->child == NULL) {
		goto fail;
	}

	// driver_daily_log_response_days->activeHours
    if(cJSON_AddNumberToObject(item, "activeHours", driver_daily_log_response_days->activeHours) == NULL) {
    goto fail; //Numeric
    }

	// driver_daily_log_response_days->distanceMiles
    if(cJSON_AddNumberToObject(item, "distanceMiles", driver_daily_log_response_days->distanceMiles) == NULL) {
    goto fail; //Numeric
    }

	// driver_daily_log_response_days->activeMs
    if(cJSON_AddNumberToObject(item, "activeMs", driver_daily_log_response_days->activeMs) == NULL) {
    goto fail; //Numeric
    }

	// driver_daily_log_response_days->certified
    if(cJSON_AddBoolToObject(item, "certified", driver_daily_log_response_days->certified) == NULL) {
    goto fail; //Numeric
    }

	// driver_daily_log_response_days->vehicleIds
	cJSON *vehicleIds = _convertToJSON(driver_daily_log_response_days->vehicleIds);
	if(vehicleIds == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "vehicleIds", vehicleIds);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

driver_daily_log_response_days_t *driver_daily_log_response_days_parseFromJSON(char *jsonString){

    driver_daily_log_response_days_t *driver_daily_log_response_days = NULL;
    cJSON *driver_daily_log_response_daysJSON = cJSON_Parse(jsonString);
    if(driver_daily_log_response_daysJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // driver_daily_log_response_days->certifiedAtMs
    cJSON *certifiedAtMs = cJSON_GetObjectItemCaseSensitive(driver_daily_log_response_daysJSON, "certifiedAtMs");
    if(!cJSON_IsNumber(certifiedAtMs))
    {
    goto end; //Numeric
    }

    // driver_daily_log_response_days->endMs
    cJSON *endMs = cJSON_GetObjectItemCaseSensitive(driver_daily_log_response_daysJSON, "endMs");
    if(!cJSON_IsNumber(endMs))
    {
    goto end; //Numeric
    }

    // driver_daily_log_response_days->startMs
    cJSON *startMs = cJSON_GetObjectItemCaseSensitive(driver_daily_log_response_daysJSON, "startMs");
    if(!cJSON_IsNumber(startMs))
    {
    goto end; //Numeric
    }

    // driver_daily_log_response_days->trailerIds
    _t *trailerIds;
    cJSON *trailerIdsJSON = cJSON_GetObjectItemCaseSensitive(driver_daily_log_response_daysJSON, "trailerIds");
    if(driver_daily_log_response_daysJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *trailerIdsJSONData = cJSON_Print(trailerIdsJSON);
    trailerIds = _parseFromJSON(trailerIdsJSONData);

    // driver_daily_log_response_days->activeHours
    cJSON *activeHours = cJSON_GetObjectItemCaseSensitive(driver_daily_log_response_daysJSON, "activeHours");
    if(!cJSON_IsNumber(activeHours))
    {
    goto end; //Numeric
    }

    // driver_daily_log_response_days->distanceMiles
    cJSON *distanceMiles = cJSON_GetObjectItemCaseSensitive(driver_daily_log_response_daysJSON, "distanceMiles");
    if(!cJSON_IsNumber(distanceMiles))
    {
    goto end; //Numeric
    }

    // driver_daily_log_response_days->activeMs
    cJSON *activeMs = cJSON_GetObjectItemCaseSensitive(driver_daily_log_response_daysJSON, "activeMs");
    if(!cJSON_IsNumber(activeMs))
    {
    goto end; //Numeric
    }

    // driver_daily_log_response_days->certified
    cJSON *certified = cJSON_GetObjectItemCaseSensitive(driver_daily_log_response_daysJSON, "certified");
    if(!cJSON_IsBool(certified))
    {
    goto end; //Numeric
    }

    // driver_daily_log_response_days->vehicleIds
    _t *vehicleIds;
    cJSON *vehicleIdsJSON = cJSON_GetObjectItemCaseSensitive(driver_daily_log_response_daysJSON, "vehicleIds");
    if(driver_daily_log_response_daysJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *vehicleIdsJSONData = cJSON_Print(vehicleIdsJSON);
    vehicleIds = _parseFromJSON(vehicleIdsJSONData);


    driver_daily_log_response_days = driver_daily_log_response_days_create (
        certifiedAtMs->valuedouble,
        endMs->valuedouble,
        startMs->valuedouble,
        trailerIds,
        activeHours->valuedouble,
        distanceMiles->valuedouble,
        activeMs->valuedouble,
        certified->valueint,
        vehicleIds
        );
        free(trailerIdsJSONData);
        free(vehicleIdsJSONData);
 cJSON_Delete(driver_daily_log_response_daysJSON);
    return driver_daily_log_response_days;
end:
    cJSON_Delete(driver_daily_log_response_daysJSON);
    return NULL;

}


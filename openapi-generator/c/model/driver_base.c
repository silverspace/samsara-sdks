#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "driver_base.h"



driver_base_t *driver_base_create(
    bool eldAdverseWeatherExemptionEnabled,
    bool eldBigDayExemptionEnabled,
    int eldDayStartHour,
    bool eldExempt,
    char *eldExemptReason,
    bool eldPcEnabled,
    bool eldYmEnabled,
    list_t* externalIds,
    // TODO map/hash not supported at the moment
    long groupId,
    char *licenseNumber,
    char *licenseState,
    char *name,
    char *notes,
    char *phone,
    char *username,
    long vehicleId
    ) {
	driver_base_t *driver_base = malloc(sizeof(driver_base_t));
	driver_base->eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
	driver_base->eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
	driver_base->eldDayStartHour = eldDayStartHour;
	driver_base->eldExempt = eldExempt;
	driver_base->eldExemptReason = eldExemptReason;
	driver_base->eldPcEnabled = eldPcEnabled;
	driver_base->eldYmEnabled = eldYmEnabled;
	driver_base->externalIds = externalIds;
	driver_base->groupId = groupId;
	driver_base->licenseNumber = licenseNumber;
	driver_base->licenseState = licenseState;
	driver_base->name = name;
	driver_base->notes = notes;
	driver_base->phone = phone;
	driver_base->username = username;
	driver_base->vehicleId = vehicleId;

	return driver_base;
}


void driver_base_free(driver_base_t *driver_base) {
    listEntry_t *listEntry;
    free(driver_base->eldExemptReason);
	// TODO map/hash not supported at the moment
    free(driver_base->licenseNumber);
    free(driver_base->licenseState);
    free(driver_base->name);
    free(driver_base->notes);
    free(driver_base->phone);
    free(driver_base->username);

	free(driver_base);
}

cJSON *driver_base_convertToJSON(driver_base_t *driver_base) {
	cJSON *item = cJSON_CreateObject();
	// driver_base->eldAdverseWeatherExemptionEnabled
    if(cJSON_AddBoolToObject(item, "eldAdverseWeatherExemptionEnabled", driver_base->eldAdverseWeatherExemptionEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver_base->eldBigDayExemptionEnabled
    if(cJSON_AddBoolToObject(item, "eldBigDayExemptionEnabled", driver_base->eldBigDayExemptionEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver_base->eldDayStartHour
    if(cJSON_AddNumberToObject(item, "eldDayStartHour", driver_base->eldDayStartHour) == NULL) {
    goto fail; //Numeric
    }

	// driver_base->eldExempt
    if(cJSON_AddBoolToObject(item, "eldExempt", driver_base->eldExempt) == NULL) {
    goto fail; //Numeric
    }

	// driver_base->eldExemptReason
    if(cJSON_AddStringToObject(item, "eldExemptReason", driver_base->eldExemptReason) == NULL) {
    goto fail; //String
    }

	// driver_base->eldPcEnabled
    if(cJSON_AddBoolToObject(item, "eldPcEnabled", driver_base->eldPcEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver_base->eldYmEnabled
    if(cJSON_AddBoolToObject(item, "eldYmEnabled", driver_base->eldYmEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver_base->externalIds
	// map Container
	cJSON *externalIds = cJSON_AddObjectToObject(item, "externalIds");
	if(externalIds == NULL) {
		goto fail; //primitive map container
	}
    cJSON *localMapObject = cJSON_CreateObject(); //Memory free to be implemented in user code
	listEntry_t *externalIdsListEntry;
    list_ForEach(externalIdsListEntry, driver_base->externalIds) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)externalIdsListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, (char*)localKeyValue->value) == NULL)
        {
            goto fail;
        }
        cJSON_AddItemToObject(externalIds,"", localMapObject);
    }

	// driver_base->groupId
    if(cJSON_AddNumberToObject(item, "groupId", driver_base->groupId) == NULL) {
    goto fail; //Numeric
    }

	// driver_base->licenseNumber
    if(cJSON_AddStringToObject(item, "licenseNumber", driver_base->licenseNumber) == NULL) {
    goto fail; //String
    }

	// driver_base->licenseState
    if(cJSON_AddStringToObject(item, "licenseState", driver_base->licenseState) == NULL) {
    goto fail; //String
    }

	// driver_base->name
    if(cJSON_AddStringToObject(item, "name", driver_base->name) == NULL) {
    goto fail; //String
    }

	// driver_base->notes
    if(cJSON_AddStringToObject(item, "notes", driver_base->notes) == NULL) {
    goto fail; //String
    }

	// driver_base->phone
    if(cJSON_AddStringToObject(item, "phone", driver_base->phone) == NULL) {
    goto fail; //String
    }

	// driver_base->username
    if(cJSON_AddStringToObject(item, "username", driver_base->username) == NULL) {
    goto fail; //String
    }

	// driver_base->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", driver_base->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

driver_base_t *driver_base_parseFromJSON(char *jsonString){

    driver_base_t *driver_base = NULL;
    cJSON *driver_baseJSON = cJSON_Parse(jsonString);
    if(driver_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // driver_base->eldAdverseWeatherExemptionEnabled
    cJSON *eldAdverseWeatherExemptionEnabled = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "eldAdverseWeatherExemptionEnabled");
    if(!cJSON_IsBool(eldAdverseWeatherExemptionEnabled))
    {
    goto end; //Numeric
    }

    // driver_base->eldBigDayExemptionEnabled
    cJSON *eldBigDayExemptionEnabled = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "eldBigDayExemptionEnabled");
    if(!cJSON_IsBool(eldBigDayExemptionEnabled))
    {
    goto end; //Numeric
    }

    // driver_base->eldDayStartHour
    cJSON *eldDayStartHour = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "eldDayStartHour");
    if(!cJSON_IsNumber(eldDayStartHour))
    {
    goto end; //Numeric
    }

    // driver_base->eldExempt
    cJSON *eldExempt = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "eldExempt");
    if(!cJSON_IsBool(eldExempt))
    {
    goto end; //Numeric
    }

    // driver_base->eldExemptReason
    cJSON *eldExemptReason = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "eldExemptReason");
    if(!cJSON_IsString(eldExemptReason) || (eldExemptReason->valuestring == NULL)){
    goto end; //String
    }

    // driver_base->eldPcEnabled
    cJSON *eldPcEnabled = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "eldPcEnabled");
    if(!cJSON_IsBool(eldPcEnabled))
    {
    goto end; //Numeric
    }

    // driver_base->eldYmEnabled
    cJSON *eldYmEnabled = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "eldYmEnabled");
    if(!cJSON_IsBool(eldYmEnabled))
    {
    goto end; //Numeric
    }

    // driver_base->externalIds
    // map
    cJSON *;
    cJSON *externalIdsJSON = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "externalIds");
    if(!cJSON_IsObject(externalIdsJSON)) {
        goto end;//primitive map container
    }
    list_t *List = list_create();
    keyValuePair_t *localMapKeyPair;
    cJSON_ArrayForEach(, externalIdsJSON)
    {
        if(!cJSON_IsString())
        {
            goto end;
        }
        localMapKeyPair = keyValuePair_create(strdup(->string),strdup(->valuestring))
        list_addElement(List , localMapKeyPair);

    }

    // driver_base->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // driver_base->licenseNumber
    cJSON *licenseNumber = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "licenseNumber");
    if(!cJSON_IsString(licenseNumber) || (licenseNumber->valuestring == NULL)){
    goto end; //String
    }

    // driver_base->licenseState
    cJSON *licenseState = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "licenseState");
    if(!cJSON_IsString(licenseState) || (licenseState->valuestring == NULL)){
    goto end; //String
    }

    // driver_base->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // driver_base->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // driver_base->phone
    cJSON *phone = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "phone");
    if(!cJSON_IsString(phone) || (phone->valuestring == NULL)){
    goto end; //String
    }

    // driver_base->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "username");
    if(!cJSON_IsString(username) || (username->valuestring == NULL)){
    goto end; //String
    }

    // driver_base->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(driver_baseJSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }


    driver_base = driver_base_create (
        eldAdverseWeatherExemptionEnabled->valueint,
        eldBigDayExemptionEnabled->valueint,
        eldDayStartHour->valuedouble,
        eldExempt->valueint,
        strdup(eldExemptReason->valuestring),
        eldPcEnabled->valueint,
        eldYmEnabled->valueint,
        List,
        groupId->valuedouble,
        strdup(licenseNumber->valuestring),
        strdup(licenseState->valuestring),
        strdup(name->valuestring),
        strdup(notes->valuestring),
        strdup(phone->valuestring),
        strdup(username->valuestring),
        vehicleId->valuedouble
        );
 cJSON_Delete(driver_baseJSON);
    return driver_base;
end:
    cJSON_Delete(driver_baseJSON);
    return NULL;

}


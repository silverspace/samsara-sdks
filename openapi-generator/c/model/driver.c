#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "driver.h"



driver_t *driver_create(
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
    long vehicleId,
    long id,
    bool isDeactivated,
    list_t *tags
    ) {
	driver_t *driver = malloc(sizeof(driver_t));
	driver->eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
	driver->eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
	driver->eldDayStartHour = eldDayStartHour;
	driver->eldExempt = eldExempt;
	driver->eldExemptReason = eldExemptReason;
	driver->eldPcEnabled = eldPcEnabled;
	driver->eldYmEnabled = eldYmEnabled;
	driver->externalIds = externalIds;
	driver->groupId = groupId;
	driver->licenseNumber = licenseNumber;
	driver->licenseState = licenseState;
	driver->name = name;
	driver->notes = notes;
	driver->phone = phone;
	driver->username = username;
	driver->vehicleId = vehicleId;
	driver->id = id;
	driver->isDeactivated = isDeactivated;
	driver->tags = tags;

	return driver;
}


void driver_free(driver_t *driver) {
    listEntry_t *listEntry;
    free(driver->eldExemptReason);
	// TODO map/hash not supported at the moment
    free(driver->licenseNumber);
    free(driver->licenseState);
    free(driver->name);
    free(driver->notes);
    free(driver->phone);
    free(driver->username);
		list_ForEach(listEntry, driver->tags) {
		tag_metadata_free(listEntry->data);
	}
	list_free(driver->tags);

	free(driver);
}

cJSON *driver_convertToJSON(driver_t *driver) {
	cJSON *item = cJSON_CreateObject();
	// driver->eldAdverseWeatherExemptionEnabled
    if(cJSON_AddBoolToObject(item, "eldAdverseWeatherExemptionEnabled", driver->eldAdverseWeatherExemptionEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver->eldBigDayExemptionEnabled
    if(cJSON_AddBoolToObject(item, "eldBigDayExemptionEnabled", driver->eldBigDayExemptionEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver->eldDayStartHour
    if(cJSON_AddNumberToObject(item, "eldDayStartHour", driver->eldDayStartHour) == NULL) {
    goto fail; //Numeric
    }

	// driver->eldExempt
    if(cJSON_AddBoolToObject(item, "eldExempt", driver->eldExempt) == NULL) {
    goto fail; //Numeric
    }

	// driver->eldExemptReason
    if(cJSON_AddStringToObject(item, "eldExemptReason", driver->eldExemptReason) == NULL) {
    goto fail; //String
    }

	// driver->eldPcEnabled
    if(cJSON_AddBoolToObject(item, "eldPcEnabled", driver->eldPcEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver->eldYmEnabled
    if(cJSON_AddBoolToObject(item, "eldYmEnabled", driver->eldYmEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver->externalIds
	// map Container
	cJSON *externalIds = cJSON_AddObjectToObject(item, "externalIds");
	if(externalIds == NULL) {
		goto fail; //primitive map container
	}
    cJSON *localMapObject = cJSON_CreateObject(); //Memory free to be implemented in user code
	listEntry_t *externalIdsListEntry;
    list_ForEach(externalIdsListEntry, driver->externalIds) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)externalIdsListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, (char*)localKeyValue->value) == NULL)
        {
            goto fail;
        }
        cJSON_AddItemToObject(externalIds,"", localMapObject);
    }

	// driver->groupId
    if(cJSON_AddNumberToObject(item, "groupId", driver->groupId) == NULL) {
    goto fail; //Numeric
    }

	// driver->licenseNumber
    if(cJSON_AddStringToObject(item, "licenseNumber", driver->licenseNumber) == NULL) {
    goto fail; //String
    }

	// driver->licenseState
    if(cJSON_AddStringToObject(item, "licenseState", driver->licenseState) == NULL) {
    goto fail; //String
    }

	// driver->name
    if(cJSON_AddStringToObject(item, "name", driver->name) == NULL) {
    goto fail; //String
    }

	// driver->notes
    if(cJSON_AddStringToObject(item, "notes", driver->notes) == NULL) {
    goto fail; //String
    }

	// driver->phone
    if(cJSON_AddStringToObject(item, "phone", driver->phone) == NULL) {
    goto fail; //String
    }

	// driver->username
    if(cJSON_AddStringToObject(item, "username", driver->username) == NULL) {
    goto fail; //String
    }

	// driver->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", driver->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	// driver->id
    if(cJSON_AddNumberToObject(item, "id", driver->id) == NULL) {
    goto fail; //Numeric
    }

	// driver->isDeactivated
    if(cJSON_AddBoolToObject(item, "isDeactivated", driver->isDeactivated) == NULL) {
    goto fail; //Numeric
    }

	// driver->tags
    cJSON *tags = cJSON_AddArrayToObject(item, "tags");
	if(tags == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *tagsListEntry;
	list_ForEach(tagsListEntry, driver->tags) {
		cJSON *item = tag_metadata_convertToJSON(tagsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(tags, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

driver_t *driver_parseFromJSON(char *jsonString){

    driver_t *driver = NULL;
    cJSON *driverJSON = cJSON_Parse(jsonString);
    if(driverJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // driver->eldAdverseWeatherExemptionEnabled
    cJSON *eldAdverseWeatherExemptionEnabled = cJSON_GetObjectItemCaseSensitive(driverJSON, "eldAdverseWeatherExemptionEnabled");
    if(!cJSON_IsBool(eldAdverseWeatherExemptionEnabled))
    {
    goto end; //Numeric
    }

    // driver->eldBigDayExemptionEnabled
    cJSON *eldBigDayExemptionEnabled = cJSON_GetObjectItemCaseSensitive(driverJSON, "eldBigDayExemptionEnabled");
    if(!cJSON_IsBool(eldBigDayExemptionEnabled))
    {
    goto end; //Numeric
    }

    // driver->eldDayStartHour
    cJSON *eldDayStartHour = cJSON_GetObjectItemCaseSensitive(driverJSON, "eldDayStartHour");
    if(!cJSON_IsNumber(eldDayStartHour))
    {
    goto end; //Numeric
    }

    // driver->eldExempt
    cJSON *eldExempt = cJSON_GetObjectItemCaseSensitive(driverJSON, "eldExempt");
    if(!cJSON_IsBool(eldExempt))
    {
    goto end; //Numeric
    }

    // driver->eldExemptReason
    cJSON *eldExemptReason = cJSON_GetObjectItemCaseSensitive(driverJSON, "eldExemptReason");
    if(!cJSON_IsString(eldExemptReason) || (eldExemptReason->valuestring == NULL)){
    goto end; //String
    }

    // driver->eldPcEnabled
    cJSON *eldPcEnabled = cJSON_GetObjectItemCaseSensitive(driverJSON, "eldPcEnabled");
    if(!cJSON_IsBool(eldPcEnabled))
    {
    goto end; //Numeric
    }

    // driver->eldYmEnabled
    cJSON *eldYmEnabled = cJSON_GetObjectItemCaseSensitive(driverJSON, "eldYmEnabled");
    if(!cJSON_IsBool(eldYmEnabled))
    {
    goto end; //Numeric
    }

    // driver->externalIds
    // map
    cJSON *;
    cJSON *externalIdsJSON = cJSON_GetObjectItemCaseSensitive(driverJSON, "externalIds");
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

    // driver->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(driverJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // driver->licenseNumber
    cJSON *licenseNumber = cJSON_GetObjectItemCaseSensitive(driverJSON, "licenseNumber");
    if(!cJSON_IsString(licenseNumber) || (licenseNumber->valuestring == NULL)){
    goto end; //String
    }

    // driver->licenseState
    cJSON *licenseState = cJSON_GetObjectItemCaseSensitive(driverJSON, "licenseState");
    if(!cJSON_IsString(licenseState) || (licenseState->valuestring == NULL)){
    goto end; //String
    }

    // driver->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(driverJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // driver->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(driverJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // driver->phone
    cJSON *phone = cJSON_GetObjectItemCaseSensitive(driverJSON, "phone");
    if(!cJSON_IsString(phone) || (phone->valuestring == NULL)){
    goto end; //String
    }

    // driver->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(driverJSON, "username");
    if(!cJSON_IsString(username) || (username->valuestring == NULL)){
    goto end; //String
    }

    // driver->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(driverJSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }

    // driver->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(driverJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // driver->isDeactivated
    cJSON *isDeactivated = cJSON_GetObjectItemCaseSensitive(driverJSON, "isDeactivated");
    if(!cJSON_IsBool(isDeactivated))
    {
    goto end; //Numeric
    }

    // driver->tags
    cJSON *tags;
    cJSON *tagsJSON = cJSON_GetObjectItemCaseSensitive(driverJSON,"tags");
    if(!cJSON_IsArray(tagsJSON)){
        goto end; //nonprimitive container
    }

    list_t *tagsList = list_create();

    cJSON_ArrayForEach(tags,tagsJSON )
    {
        if(!cJSON_IsObject(tags)){
            goto end;
        }
		char *JSONData = cJSON_Print(tags);
        tag_metadata_t *tagsItem = tag_metadata_parseFromJSON(JSONData);

        list_addElement(tagsList, tagsItem);
        free(JSONData);
    }


    driver = driver_create (
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
        vehicleId->valuedouble,
        id->valuedouble,
        isDeactivated->valueint,
        tagsList
        );
 cJSON_Delete(driverJSON);
    return driver;
end:
    cJSON_Delete(driverJSON);
    return NULL;

}


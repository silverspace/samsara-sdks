#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "driver_for_create.h"



driver_for_create_t *driver_for_create_create(
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
    char *password,
    list_t *tagIds
    ) {
	driver_for_create_t *driver_for_create = malloc(sizeof(driver_for_create_t));
	driver_for_create->eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
	driver_for_create->eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
	driver_for_create->eldDayStartHour = eldDayStartHour;
	driver_for_create->eldExempt = eldExempt;
	driver_for_create->eldExemptReason = eldExemptReason;
	driver_for_create->eldPcEnabled = eldPcEnabled;
	driver_for_create->eldYmEnabled = eldYmEnabled;
	driver_for_create->externalIds = externalIds;
	driver_for_create->groupId = groupId;
	driver_for_create->licenseNumber = licenseNumber;
	driver_for_create->licenseState = licenseState;
	driver_for_create->name = name;
	driver_for_create->notes = notes;
	driver_for_create->phone = phone;
	driver_for_create->username = username;
	driver_for_create->vehicleId = vehicleId;
	driver_for_create->password = password;
	driver_for_create->tagIds = tagIds;

	return driver_for_create;
}


void driver_for_create_free(driver_for_create_t *driver_for_create) {
    listEntry_t *listEntry;
    free(driver_for_create->eldExemptReason);
	// TODO map/hash not supported at the moment
    free(driver_for_create->licenseNumber);
    free(driver_for_create->licenseState);
    free(driver_for_create->name);
    free(driver_for_create->notes);
    free(driver_for_create->phone);
    free(driver_for_create->username);
    free(driver_for_create->password);
	list_ForEach(listEntry, driver_for_create->tagIds) {
		free(listEntry->data);
	}
	list_free(driver_for_create->tagIds);

	free(driver_for_create);
}

cJSON *driver_for_create_convertToJSON(driver_for_create_t *driver_for_create) {
	cJSON *item = cJSON_CreateObject();
	// driver_for_create->eldAdverseWeatherExemptionEnabled
    if(cJSON_AddBoolToObject(item, "eldAdverseWeatherExemptionEnabled", driver_for_create->eldAdverseWeatherExemptionEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver_for_create->eldBigDayExemptionEnabled
    if(cJSON_AddBoolToObject(item, "eldBigDayExemptionEnabled", driver_for_create->eldBigDayExemptionEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver_for_create->eldDayStartHour
    if(cJSON_AddNumberToObject(item, "eldDayStartHour", driver_for_create->eldDayStartHour) == NULL) {
    goto fail; //Numeric
    }

	// driver_for_create->eldExempt
    if(cJSON_AddBoolToObject(item, "eldExempt", driver_for_create->eldExempt) == NULL) {
    goto fail; //Numeric
    }

	// driver_for_create->eldExemptReason
    if(cJSON_AddStringToObject(item, "eldExemptReason", driver_for_create->eldExemptReason) == NULL) {
    goto fail; //String
    }

	// driver_for_create->eldPcEnabled
    if(cJSON_AddBoolToObject(item, "eldPcEnabled", driver_for_create->eldPcEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver_for_create->eldYmEnabled
    if(cJSON_AddBoolToObject(item, "eldYmEnabled", driver_for_create->eldYmEnabled) == NULL) {
    goto fail; //Numeric
    }

	// driver_for_create->externalIds
	// map Container
	cJSON *externalIds = cJSON_AddObjectToObject(item, "externalIds");
	if(externalIds == NULL) {
		goto fail; //primitive map container
	}
    cJSON *localMapObject = cJSON_CreateObject(); //Memory free to be implemented in user code
	listEntry_t *externalIdsListEntry;
    list_ForEach(externalIdsListEntry, driver_for_create->externalIds) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)externalIdsListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, (char*)localKeyValue->value) == NULL)
        {
            goto fail;
        }
        cJSON_AddItemToObject(externalIds,"", localMapObject);
    }

	// driver_for_create->groupId
    if(cJSON_AddNumberToObject(item, "groupId", driver_for_create->groupId) == NULL) {
    goto fail; //Numeric
    }

	// driver_for_create->licenseNumber
    if(cJSON_AddStringToObject(item, "licenseNumber", driver_for_create->licenseNumber) == NULL) {
    goto fail; //String
    }

	// driver_for_create->licenseState
    if(cJSON_AddStringToObject(item, "licenseState", driver_for_create->licenseState) == NULL) {
    goto fail; //String
    }

	// driver_for_create->name
    if(cJSON_AddStringToObject(item, "name", driver_for_create->name) == NULL) {
    goto fail; //String
    }

	// driver_for_create->notes
    if(cJSON_AddStringToObject(item, "notes", driver_for_create->notes) == NULL) {
    goto fail; //String
    }

	// driver_for_create->phone
    if(cJSON_AddStringToObject(item, "phone", driver_for_create->phone) == NULL) {
    goto fail; //String
    }

	// driver_for_create->username
    if(cJSON_AddStringToObject(item, "username", driver_for_create->username) == NULL) {
    goto fail; //String
    }

	// driver_for_create->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", driver_for_create->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	// driver_for_create->password
    if(cJSON_AddStringToObject(item, "password", driver_for_create->password) == NULL) {
    goto fail; //String
    }

	// driver_for_create->tagIds
	cJSON *tag_ids = cJSON_AddArrayToObject(item, "tagIds");
	if(tag_ids == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *tag_idsListEntry;
    list_ForEach(tag_idsListEntry, driver_for_create->tagIds) {
        if(cJSON_AddNumberToObject(tag_ids, "", *(double *)tag_idsListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

driver_for_create_t *driver_for_create_parseFromJSON(char *jsonString){

    driver_for_create_t *driver_for_create = NULL;
    cJSON *driver_for_createJSON = cJSON_Parse(jsonString);
    if(driver_for_createJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // driver_for_create->eldAdverseWeatherExemptionEnabled
    cJSON *eldAdverseWeatherExemptionEnabled = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "eldAdverseWeatherExemptionEnabled");
    if(!cJSON_IsBool(eldAdverseWeatherExemptionEnabled))
    {
    goto end; //Numeric
    }

    // driver_for_create->eldBigDayExemptionEnabled
    cJSON *eldBigDayExemptionEnabled = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "eldBigDayExemptionEnabled");
    if(!cJSON_IsBool(eldBigDayExemptionEnabled))
    {
    goto end; //Numeric
    }

    // driver_for_create->eldDayStartHour
    cJSON *eldDayStartHour = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "eldDayStartHour");
    if(!cJSON_IsNumber(eldDayStartHour))
    {
    goto end; //Numeric
    }

    // driver_for_create->eldExempt
    cJSON *eldExempt = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "eldExempt");
    if(!cJSON_IsBool(eldExempt))
    {
    goto end; //Numeric
    }

    // driver_for_create->eldExemptReason
    cJSON *eldExemptReason = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "eldExemptReason");
    if(!cJSON_IsString(eldExemptReason) || (eldExemptReason->valuestring == NULL)){
    goto end; //String
    }

    // driver_for_create->eldPcEnabled
    cJSON *eldPcEnabled = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "eldPcEnabled");
    if(!cJSON_IsBool(eldPcEnabled))
    {
    goto end; //Numeric
    }

    // driver_for_create->eldYmEnabled
    cJSON *eldYmEnabled = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "eldYmEnabled");
    if(!cJSON_IsBool(eldYmEnabled))
    {
    goto end; //Numeric
    }

    // driver_for_create->externalIds
    // map
    cJSON *;
    cJSON *externalIdsJSON = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "externalIds");
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

    // driver_for_create->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // driver_for_create->licenseNumber
    cJSON *licenseNumber = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "licenseNumber");
    if(!cJSON_IsString(licenseNumber) || (licenseNumber->valuestring == NULL)){
    goto end; //String
    }

    // driver_for_create->licenseState
    cJSON *licenseState = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "licenseState");
    if(!cJSON_IsString(licenseState) || (licenseState->valuestring == NULL)){
    goto end; //String
    }

    // driver_for_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // driver_for_create->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // driver_for_create->phone
    cJSON *phone = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "phone");
    if(!cJSON_IsString(phone) || (phone->valuestring == NULL)){
    goto end; //String
    }

    // driver_for_create->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "username");
    if(!cJSON_IsString(username) || (username->valuestring == NULL)){
    goto end; //String
    }

    // driver_for_create->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }

    // driver_for_create->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "password");
    if(!cJSON_IsString(password) || (password->valuestring == NULL)){
    goto end; //String
    }

    // driver_for_create->tagIds
    cJSON *tag_ids;
    cJSON *tagIdsJSON = cJSON_GetObjectItemCaseSensitive(driver_for_createJSON, "tagIds");
    if(!cJSON_IsArray(tagIdsJSON)) {
        goto end;//primitive container
    }
    list_t *tag_idsList = list_create();

    cJSON_ArrayForEach(tag_ids, tagIdsJSON)
    {
        if(!cJSON_IsNumber(tag_ids))
        {
            goto end;
        }
        list_addElement(tag_idsList , &tag_ids->valuedouble);

    }


    driver_for_create = driver_for_create_create (
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
        strdup(password->valuestring),
        tag_idsList
        );
 cJSON_Delete(driver_for_createJSON);
    return driver_for_create;
end:
    cJSON_Delete(driver_for_createJSON);
    return NULL;

}


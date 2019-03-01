#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fleet_vehicle_response.h"



fleet_vehicle_response_t *fleet_vehicle_response_create(
    list_t* externalIds,
    // TODO map/hash not supported at the moment
    char *harshAccelSetting,
    long id,
    char *name,
    fleet_vehicle_response_vehicle_info_t *vehicleInfo
    ) {
	fleet_vehicle_response_t *fleet_vehicle_response = malloc(sizeof(fleet_vehicle_response_t));
	fleet_vehicle_response->externalIds = externalIds;
	fleet_vehicle_response->harshAccelSetting = harshAccelSetting;
	fleet_vehicle_response->id = id;
	fleet_vehicle_response->name = name;
	fleet_vehicle_response->vehicleInfo = vehicleInfo;

	return fleet_vehicle_response;
}


void fleet_vehicle_response_free(fleet_vehicle_response_t *fleet_vehicle_response) {
    listEntry_t *listEntry;
	// TODO map/hash not supported at the moment
    free(fleet_vehicle_response->harshAccelSetting);
    free(fleet_vehicle_response->name);
	fleet_vehicle_response_vehicle_info_free(fleet_vehicle_response->vehicleInfo);

	free(fleet_vehicle_response);
}

cJSON *fleet_vehicle_response_convertToJSON(fleet_vehicle_response_t *fleet_vehicle_response) {
	cJSON *item = cJSON_CreateObject();
	// fleet_vehicle_response->externalIds
	// map Container
	cJSON *externalIds = cJSON_AddObjectToObject(item, "externalIds");
	if(externalIds == NULL) {
		goto fail; //primitive map container
	}
    cJSON *localMapObject = cJSON_CreateObject(); //Memory free to be implemented in user code
	listEntry_t *externalIdsListEntry;
    list_ForEach(externalIdsListEntry, fleet_vehicle_response->externalIds) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)externalIdsListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, (char*)localKeyValue->value) == NULL)
        {
            goto fail;
        }
        cJSON_AddItemToObject(externalIds,"", localMapObject);
    }

	// fleet_vehicle_response->harshAccelSetting
    if(cJSON_AddStringToObject(item, "harshAccelSetting", fleet_vehicle_response->harshAccelSetting) == NULL) {
    goto fail; //String
    }

	// fleet_vehicle_response->id
    if(cJSON_AddNumberToObject(item, "id", fleet_vehicle_response->id) == NULL) {
    goto fail; //Numeric
    }

	// fleet_vehicle_response->name
    if(cJSON_AddStringToObject(item, "name", fleet_vehicle_response->name) == NULL) {
    goto fail; //String
    }

	// fleet_vehicle_response->vehicleInfo
	cJSON *vehicleInfo = fleet_vehicle_response_vehicle_info_convertToJSON(fleet_vehicle_response->vehicleInfo);
	if(vehicleInfo == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "vehicleInfo", vehicleInfo);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

fleet_vehicle_response_t *fleet_vehicle_response_parseFromJSON(char *jsonString){

    fleet_vehicle_response_t *fleet_vehicle_response = NULL;
    cJSON *fleet_vehicle_responseJSON = cJSON_Parse(jsonString);
    if(fleet_vehicle_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // fleet_vehicle_response->externalIds
    // map
    cJSON *;
    cJSON *externalIdsJSON = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_responseJSON, "externalIds");
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

    // fleet_vehicle_response->harshAccelSetting
    cJSON *harshAccelSetting = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_responseJSON, "harshAccelSetting");
    if(!cJSON_IsString(harshAccelSetting) || (harshAccelSetting->valuestring == NULL)){
    goto end; //String
    }

    // fleet_vehicle_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_responseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // fleet_vehicle_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_responseJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // fleet_vehicle_response->vehicleInfo
    fleet_vehicle_response_vehicle_info_t *vehicleInfo;
    cJSON *vehicleInfoJSON = cJSON_GetObjectItemCaseSensitive(fleet_vehicle_responseJSON, "vehicleInfo");
    if(fleet_vehicle_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *vehicleInfoJSONData = cJSON_Print(vehicleInfoJSON);
    vehicleInfo = fleet_vehicle_response_vehicle_info_parseFromJSON(vehicleInfoJSONData);


    fleet_vehicle_response = fleet_vehicle_response_create (
        List,
        strdup(harshAccelSetting->valuestring),
        id->valuedouble,
        strdup(name->valuestring),
        vehicleInfo
        );
        free(vehicleInfoJSONData);
 cJSON_Delete(fleet_vehicle_responseJSON);
    return fleet_vehicle_response;
end:
    cJSON_Delete(fleet_vehicle_responseJSON);
    return NULL;

}


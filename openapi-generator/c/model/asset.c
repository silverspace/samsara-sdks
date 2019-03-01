#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset.h"



asset_t *asset_create(
    char *assetSerialNumber,
    list_t *cable,
    int engineHours,
    long id,
    char *name
    ) {
	asset_t *asset = malloc(sizeof(asset_t));
	asset->assetSerialNumber = assetSerialNumber;
	asset->cable = cable;
	asset->engineHours = engineHours;
	asset->id = id;
	asset->name = name;

	return asset;
}


void asset_free(asset_t *asset) {
    listEntry_t *listEntry;
    free(asset->assetSerialNumber);
		list_ForEach(listEntry, asset->cable) {
		asset_cable_free(listEntry->data);
	}
	list_free(asset->cable);
    free(asset->name);

	free(asset);
}

cJSON *asset_convertToJSON(asset_t *asset) {
	cJSON *item = cJSON_CreateObject();
	// asset->assetSerialNumber
    if(cJSON_AddStringToObject(item, "assetSerialNumber", asset->assetSerialNumber) == NULL) {
    goto fail; //String
    }

	// asset->cable
    cJSON *cable = cJSON_AddArrayToObject(item, "cable");
	if(cable == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *cableListEntry;
	list_ForEach(cableListEntry, asset->cable) {
		cJSON *item = asset_cable_convertToJSON(cableListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(cable, item);
	}

	// asset->engineHours
    if(cJSON_AddNumberToObject(item, "engineHours", asset->engineHours) == NULL) {
    goto fail; //Numeric
    }

	// asset->id
    if(cJSON_AddNumberToObject(item, "id", asset->id) == NULL) {
    goto fail; //Numeric
    }

	// asset->name
    if(cJSON_AddStringToObject(item, "name", asset->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_t *asset_parseFromJSON(char *jsonString){

    asset_t *asset = NULL;
    cJSON *assetJSON = cJSON_Parse(jsonString);
    if(assetJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset->assetSerialNumber
    cJSON *assetSerialNumber = cJSON_GetObjectItemCaseSensitive(assetJSON, "assetSerialNumber");
    if(!cJSON_IsString(assetSerialNumber) || (assetSerialNumber->valuestring == NULL)){
    goto end; //String
    }

    // asset->cable
    cJSON *cable;
    cJSON *cableJSON = cJSON_GetObjectItemCaseSensitive(assetJSON,"cable");
    if(!cJSON_IsArray(cableJSON)){
        goto end; //nonprimitive container
    }

    list_t *cableList = list_create();

    cJSON_ArrayForEach(cable,cableJSON )
    {
        if(!cJSON_IsObject(cable)){
            goto end;
        }
		char *JSONData = cJSON_Print(cable);
        asset_cable_t *cableItem = asset_cable_parseFromJSON(JSONData);

        list_addElement(cableList, cableItem);
        free(JSONData);
    }

    // asset->engineHours
    cJSON *engineHours = cJSON_GetObjectItemCaseSensitive(assetJSON, "engineHours");
    if(!cJSON_IsNumber(engineHours))
    {
    goto end; //Numeric
    }

    // asset->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(assetJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // asset->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(assetJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    asset = asset_create (
        strdup(assetSerialNumber->valuestring),
        cableList,
        engineHours->valuedouble,
        id->valuedouble,
        strdup(name->valuestring)
        );
 cJSON_Delete(assetJSON);
    return asset;
end:
    cJSON_Delete(assetJSON);
    return NULL;

}


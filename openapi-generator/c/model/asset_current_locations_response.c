#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_current_locations_response.h"



asset_current_locations_response_t *asset_current_locations_response_create(
    list_t *cable,
    int engineHours,
    long id,
    list_t *location,
    char *name
    ) {
	asset_current_locations_response_t *asset_current_locations_response = malloc(sizeof(asset_current_locations_response_t));
	asset_current_locations_response->cable = cable;
	asset_current_locations_response->engineHours = engineHours;
	asset_current_locations_response->id = id;
	asset_current_locations_response->location = location;
	asset_current_locations_response->name = name;

	return asset_current_locations_response;
}


void asset_current_locations_response_free(asset_current_locations_response_t *asset_current_locations_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, asset_current_locations_response->cable) {
		asset_cable_free(listEntry->data);
	}
	list_free(asset_current_locations_response->cable);
		list_ForEach(listEntry, asset_current_locations_response->location) {
		asset_current_location_free(listEntry->data);
	}
	list_free(asset_current_locations_response->location);
    free(asset_current_locations_response->name);

	free(asset_current_locations_response);
}

cJSON *asset_current_locations_response_convertToJSON(asset_current_locations_response_t *asset_current_locations_response) {
	cJSON *item = cJSON_CreateObject();
	// asset_current_locations_response->cable
    cJSON *cable = cJSON_AddArrayToObject(item, "cable");
	if(cable == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *cableListEntry;
	list_ForEach(cableListEntry, asset_current_locations_response->cable) {
		cJSON *item = asset_cable_convertToJSON(cableListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(cable, item);
	}

	// asset_current_locations_response->engineHours
    if(cJSON_AddNumberToObject(item, "engineHours", asset_current_locations_response->engineHours) == NULL) {
    goto fail; //Numeric
    }

	// asset_current_locations_response->id
    if(cJSON_AddNumberToObject(item, "id", asset_current_locations_response->id) == NULL) {
    goto fail; //Numeric
    }

	// asset_current_locations_response->location
    cJSON *location = cJSON_AddArrayToObject(item, "location");
	if(location == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *locationListEntry;
	list_ForEach(locationListEntry, asset_current_locations_response->location) {
		cJSON *item = asset_current_location_convertToJSON(locationListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(location, item);
	}

	// asset_current_locations_response->name
    if(cJSON_AddStringToObject(item, "name", asset_current_locations_response->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_current_locations_response_t *asset_current_locations_response_parseFromJSON(char *jsonString){

    asset_current_locations_response_t *asset_current_locations_response = NULL;
    cJSON *asset_current_locations_responseJSON = cJSON_Parse(jsonString);
    if(asset_current_locations_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_current_locations_response->cable
    cJSON *cable;
    cJSON *cableJSON = cJSON_GetObjectItemCaseSensitive(asset_current_locations_responseJSON,"cable");
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

    // asset_current_locations_response->engineHours
    cJSON *engineHours = cJSON_GetObjectItemCaseSensitive(asset_current_locations_responseJSON, "engineHours");
    if(!cJSON_IsNumber(engineHours))
    {
    goto end; //Numeric
    }

    // asset_current_locations_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(asset_current_locations_responseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // asset_current_locations_response->location
    cJSON *location;
    cJSON *locationJSON = cJSON_GetObjectItemCaseSensitive(asset_current_locations_responseJSON,"location");
    if(!cJSON_IsArray(locationJSON)){
        goto end; //nonprimitive container
    }

    list_t *locationList = list_create();

    cJSON_ArrayForEach(location,locationJSON )
    {
        if(!cJSON_IsObject(location)){
            goto end;
        }
		char *JSONData = cJSON_Print(location);
        asset_current_location_t *locationItem = asset_current_location_parseFromJSON(JSONData);

        list_addElement(locationList, locationItem);
        free(JSONData);
    }

    // asset_current_locations_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(asset_current_locations_responseJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    asset_current_locations_response = asset_current_locations_response_create (
        cableList,
        engineHours->valuedouble,
        id->valuedouble,
        locationList,
        strdup(name->valuestring)
        );
 cJSON_Delete(asset_current_locations_responseJSON);
    return asset_current_locations_response;
end:
    cJSON_Delete(asset_current_locations_responseJSON);
    return NULL;

}


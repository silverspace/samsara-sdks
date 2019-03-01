#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "drivers_response.h"



drivers_response_t *drivers_response_create(
    list_t *drivers
    ) {
	drivers_response_t *drivers_response = malloc(sizeof(drivers_response_t));
	drivers_response->drivers = drivers;

	return drivers_response;
}


void drivers_response_free(drivers_response_t *drivers_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, drivers_response->drivers) {
		driver_free(listEntry->data);
	}
	list_free(drivers_response->drivers);

	free(drivers_response);
}

cJSON *drivers_response_convertToJSON(drivers_response_t *drivers_response) {
	cJSON *item = cJSON_CreateObject();
	// drivers_response->drivers
    cJSON *drivers = cJSON_AddArrayToObject(item, "drivers");
	if(drivers == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *driversListEntry;
	list_ForEach(driversListEntry, drivers_response->drivers) {
		cJSON *item = driver_convertToJSON(driversListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(drivers, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

drivers_response_t *drivers_response_parseFromJSON(char *jsonString){

    drivers_response_t *drivers_response = NULL;
    cJSON *drivers_responseJSON = cJSON_Parse(jsonString);
    if(drivers_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // drivers_response->drivers
    cJSON *drivers;
    cJSON *driversJSON = cJSON_GetObjectItemCaseSensitive(drivers_responseJSON,"drivers");
    if(!cJSON_IsArray(driversJSON)){
        goto end; //nonprimitive container
    }

    list_t *driversList = list_create();

    cJSON_ArrayForEach(drivers,driversJSON )
    {
        if(!cJSON_IsObject(drivers)){
            goto end;
        }
		char *JSONData = cJSON_Print(drivers);
        driver_t *driversItem = driver_parseFromJSON(JSONData);

        list_addElement(driversList, driversItem);
        free(JSONData);
    }


    drivers_response = drivers_response_create (
        driversList
        );
 cJSON_Delete(drivers_responseJSON);
    return drivers_response;
end:
    cJSON_Delete(drivers_responseJSON);
    return NULL;

}


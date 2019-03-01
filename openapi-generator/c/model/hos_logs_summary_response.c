#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hos_logs_summary_response.h"



hos_logs_summary_response_t *hos_logs_summary_response_create(
    list_t *drivers
    ) {
	hos_logs_summary_response_t *hos_logs_summary_response = malloc(sizeof(hos_logs_summary_response_t));
	hos_logs_summary_response->drivers = drivers;

	return hos_logs_summary_response;
}


void hos_logs_summary_response_free(hos_logs_summary_response_t *hos_logs_summary_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, hos_logs_summary_response->drivers) {
		hos_logs_summary_response_drivers_free(listEntry->data);
	}
	list_free(hos_logs_summary_response->drivers);

	free(hos_logs_summary_response);
}

cJSON *hos_logs_summary_response_convertToJSON(hos_logs_summary_response_t *hos_logs_summary_response) {
	cJSON *item = cJSON_CreateObject();
	// hos_logs_summary_response->drivers
    cJSON *drivers = cJSON_AddArrayToObject(item, "drivers");
	if(drivers == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *driversListEntry;
	list_ForEach(driversListEntry, hos_logs_summary_response->drivers) {
		cJSON *item = hos_logs_summary_response_drivers_convertToJSON(driversListEntry->data);
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

hos_logs_summary_response_t *hos_logs_summary_response_parseFromJSON(char *jsonString){

    hos_logs_summary_response_t *hos_logs_summary_response = NULL;
    cJSON *hos_logs_summary_responseJSON = cJSON_Parse(jsonString);
    if(hos_logs_summary_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // hos_logs_summary_response->drivers
    cJSON *drivers;
    cJSON *driversJSON = cJSON_GetObjectItemCaseSensitive(hos_logs_summary_responseJSON,"drivers");
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
        hos_logs_summary_response_drivers_t *driversItem = hos_logs_summary_response_drivers_parseFromJSON(JSONData);

        list_addElement(driversList, driversItem);
        free(JSONData);
    }


    hos_logs_summary_response = hos_logs_summary_response_create (
        driversList
        );
 cJSON_Delete(hos_logs_summary_responseJSON);
    return hos_logs_summary_response;
end:
    cJSON_Delete(hos_logs_summary_responseJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "driver_daily_log_response.h"



driver_daily_log_response_t *driver_daily_log_response_create(
    list_t *days
    ) {
	driver_daily_log_response_t *driver_daily_log_response = malloc(sizeof(driver_daily_log_response_t));
	driver_daily_log_response->days = days;

	return driver_daily_log_response;
}


void driver_daily_log_response_free(driver_daily_log_response_t *driver_daily_log_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, driver_daily_log_response->days) {
		driver_daily_log_response_days_free(listEntry->data);
	}
	list_free(driver_daily_log_response->days);

	free(driver_daily_log_response);
}

cJSON *driver_daily_log_response_convertToJSON(driver_daily_log_response_t *driver_daily_log_response) {
	cJSON *item = cJSON_CreateObject();
	// driver_daily_log_response->days
    cJSON *days = cJSON_AddArrayToObject(item, "days");
	if(days == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *daysListEntry;
	list_ForEach(daysListEntry, driver_daily_log_response->days) {
		cJSON *item = driver_daily_log_response_days_convertToJSON(daysListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(days, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

driver_daily_log_response_t *driver_daily_log_response_parseFromJSON(char *jsonString){

    driver_daily_log_response_t *driver_daily_log_response = NULL;
    cJSON *driver_daily_log_responseJSON = cJSON_Parse(jsonString);
    if(driver_daily_log_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // driver_daily_log_response->days
    cJSON *days;
    cJSON *daysJSON = cJSON_GetObjectItemCaseSensitive(driver_daily_log_responseJSON,"days");
    if(!cJSON_IsArray(daysJSON)){
        goto end; //nonprimitive container
    }

    list_t *daysList = list_create();

    cJSON_ArrayForEach(days,daysJSON )
    {
        if(!cJSON_IsObject(days)){
            goto end;
        }
		char *JSONData = cJSON_Print(days);
        driver_daily_log_response_days_t *daysItem = driver_daily_log_response_days_parseFromJSON(JSONData);

        list_addElement(daysList, daysItem);
        free(JSONData);
    }


    driver_daily_log_response = driver_daily_log_response_create (
        daysList
        );
 cJSON_Delete(driver_daily_log_responseJSON);
    return driver_daily_log_response;
end:
    cJSON_Delete(driver_daily_log_responseJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "drivers_summary_response.h"



drivers_summary_response_t *drivers_summary_response_create(
    list_t *Summaries
    ) {
	drivers_summary_response_t *drivers_summary_response = malloc(sizeof(drivers_summary_response_t));
	drivers_summary_response->Summaries = Summaries;

	return drivers_summary_response;
}


void drivers_summary_response_free(drivers_summary_response_t *drivers_summary_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, drivers_summary_response->Summaries) {
		drivers_summary_response_summaries_free(listEntry->data);
	}
	list_free(drivers_summary_response->Summaries);

	free(drivers_summary_response);
}

cJSON *drivers_summary_response_convertToJSON(drivers_summary_response_t *drivers_summary_response) {
	cJSON *item = cJSON_CreateObject();
	// drivers_summary_response->Summaries
    cJSON *Summaries = cJSON_AddArrayToObject(item, "Summaries");
	if(Summaries == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *SummariesListEntry;
	list_ForEach(SummariesListEntry, drivers_summary_response->Summaries) {
		cJSON *item = drivers_summary_response_summaries_convertToJSON(SummariesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(Summaries, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

drivers_summary_response_t *drivers_summary_response_parseFromJSON(char *jsonString){

    drivers_summary_response_t *drivers_summary_response = NULL;
    cJSON *drivers_summary_responseJSON = cJSON_Parse(jsonString);
    if(drivers_summary_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // drivers_summary_response->Summaries
    cJSON *Summaries;
    cJSON *SummariesJSON = cJSON_GetObjectItemCaseSensitive(drivers_summary_responseJSON,"Summaries");
    if(!cJSON_IsArray(SummariesJSON)){
        goto end; //nonprimitive container
    }

    list_t *SummariesList = list_create();

    cJSON_ArrayForEach(Summaries,SummariesJSON )
    {
        if(!cJSON_IsObject(Summaries)){
            goto end;
        }
		char *JSONData = cJSON_Print(Summaries);
        drivers_summary_response_summaries_t *SummariesItem = drivers_summary_response_summaries_parseFromJSON(JSONData);

        list_addElement(SummariesList, SummariesItem);
        free(JSONData);
    }


    drivers_summary_response = drivers_summary_response_create (
        SummariesList
        );
 cJSON_Delete(drivers_summary_responseJSON);
    return drivers_summary_response;
end:
    cJSON_Delete(drivers_summary_responseJSON);
    return NULL;

}


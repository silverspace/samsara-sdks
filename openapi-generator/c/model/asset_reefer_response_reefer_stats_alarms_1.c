#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_reefer_response_reefer_stats_alarms_1.h"



asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1_create(
    list_t *alarms,
    long changedAtMs
    ) {
	asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1 = malloc(sizeof(asset_reefer_response_reefer_stats_alarms_1_t));
	asset_reefer_response_reefer_stats_alarms_1->alarms = alarms;
	asset_reefer_response_reefer_stats_alarms_1->changedAtMs = changedAtMs;

	return asset_reefer_response_reefer_stats_alarms_1;
}


void asset_reefer_response_reefer_stats_alarms_1_free(asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, asset_reefer_response_reefer_stats_alarms_1->alarms) {
		asset_reefer_response_reefer_stats_alarms_free(listEntry->data);
	}
	list_free(asset_reefer_response_reefer_stats_alarms_1->alarms);

	free(asset_reefer_response_reefer_stats_alarms_1);
}

cJSON *asset_reefer_response_reefer_stats_alarms_1_convertToJSON(asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1) {
	cJSON *item = cJSON_CreateObject();
	// asset_reefer_response_reefer_stats_alarms_1->alarms
    cJSON *alarms = cJSON_AddArrayToObject(item, "alarms");
	if(alarms == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *alarmsListEntry;
	list_ForEach(alarmsListEntry, asset_reefer_response_reefer_stats_alarms_1->alarms) {
		cJSON *item = asset_reefer_response_reefer_stats_alarms_convertToJSON(alarmsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(alarms, item);
	}

	// asset_reefer_response_reefer_stats_alarms_1->changedAtMs
    if(cJSON_AddNumberToObject(item, "changedAtMs", asset_reefer_response_reefer_stats_alarms_1->changedAtMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1_parseFromJSON(char *jsonString){

    asset_reefer_response_reefer_stats_alarms_1_t *asset_reefer_response_reefer_stats_alarms_1 = NULL;
    cJSON *asset_reefer_response_reefer_stats_alarms_1JSON = cJSON_Parse(jsonString);
    if(asset_reefer_response_reefer_stats_alarms_1JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_reefer_response_reefer_stats_alarms_1->alarms
    cJSON *alarms;
    cJSON *alarmsJSON = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_alarms_1JSON,"alarms");
    if(!cJSON_IsArray(alarmsJSON)){
        goto end; //nonprimitive container
    }

    list_t *alarmsList = list_create();

    cJSON_ArrayForEach(alarms,alarmsJSON )
    {
        if(!cJSON_IsObject(alarms)){
            goto end;
        }
		char *JSONData = cJSON_Print(alarms);
        asset_reefer_response_reefer_stats_alarms_t *alarmsItem = asset_reefer_response_reefer_stats_alarms_parseFromJSON(JSONData);

        list_addElement(alarmsList, alarmsItem);
        free(JSONData);
    }

    // asset_reefer_response_reefer_stats_alarms_1->changedAtMs
    cJSON *changedAtMs = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_alarms_1JSON, "changedAtMs");
    if(!cJSON_IsNumber(changedAtMs))
    {
    goto end; //Numeric
    }


    asset_reefer_response_reefer_stats_alarms_1 = asset_reefer_response_reefer_stats_alarms_1_create (
        alarmsList,
        changedAtMs->valuedouble
        );
 cJSON_Delete(asset_reefer_response_reefer_stats_alarms_1JSON);
    return asset_reefer_response_reefer_stats_alarms_1;
end:
    cJSON_Delete(asset_reefer_response_reefer_stats_alarms_1JSON);
    return NULL;

}


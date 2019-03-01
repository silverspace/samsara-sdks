#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_reefer_response_reefer_stats.h"



asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats_create(
    list_t *fuelPercentage,
    list_t *powerStatus,
    list_t *engineHours,
    list_t *setPoint,
    list_t *returnAirTemp,
    list_t *alarms
    ) {
	asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats = malloc(sizeof(asset_reefer_response_reefer_stats_t));
	asset_reefer_response_reefer_stats->fuelPercentage = fuelPercentage;
	asset_reefer_response_reefer_stats->powerStatus = powerStatus;
	asset_reefer_response_reefer_stats->engineHours = engineHours;
	asset_reefer_response_reefer_stats->setPoint = setPoint;
	asset_reefer_response_reefer_stats->returnAirTemp = returnAirTemp;
	asset_reefer_response_reefer_stats->alarms = alarms;

	return asset_reefer_response_reefer_stats;
}


void asset_reefer_response_reefer_stats_free(asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, asset_reefer_response_reefer_stats->fuelPercentage) {
		asset_reefer_response_reefer_stats_fuel_percentage_free(listEntry->data);
	}
	list_free(asset_reefer_response_reefer_stats->fuelPercentage);
		list_ForEach(listEntry, asset_reefer_response_reefer_stats->powerStatus) {
		asset_reefer_response_reefer_stats_power_status_free(listEntry->data);
	}
	list_free(asset_reefer_response_reefer_stats->powerStatus);
		list_ForEach(listEntry, asset_reefer_response_reefer_stats->engineHours) {
		asset_reefer_response_reefer_stats_engine_hours_free(listEntry->data);
	}
	list_free(asset_reefer_response_reefer_stats->engineHours);
		list_ForEach(listEntry, asset_reefer_response_reefer_stats->setPoint) {
		asset_reefer_response_reefer_stats_set_point_free(listEntry->data);
	}
	list_free(asset_reefer_response_reefer_stats->setPoint);
		list_ForEach(listEntry, asset_reefer_response_reefer_stats->returnAirTemp) {
		asset_reefer_response_reefer_stats_return_air_temp_free(listEntry->data);
	}
	list_free(asset_reefer_response_reefer_stats->returnAirTemp);
		list_ForEach(listEntry, asset_reefer_response_reefer_stats->alarms) {
		asset_reefer_response_reefer_stats_alarms_1_free(listEntry->data);
	}
	list_free(asset_reefer_response_reefer_stats->alarms);

	free(asset_reefer_response_reefer_stats);
}

cJSON *asset_reefer_response_reefer_stats_convertToJSON(asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats) {
	cJSON *item = cJSON_CreateObject();
	// asset_reefer_response_reefer_stats->fuelPercentage
    cJSON *fuelPercentage = cJSON_AddArrayToObject(item, "fuelPercentage");
	if(fuelPercentage == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *fuelPercentageListEntry;
	list_ForEach(fuelPercentageListEntry, asset_reefer_response_reefer_stats->fuelPercentage) {
		cJSON *item = asset_reefer_response_reefer_stats_fuel_percentage_convertToJSON(fuelPercentageListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(fuelPercentage, item);
	}

	// asset_reefer_response_reefer_stats->powerStatus
    cJSON *powerStatus = cJSON_AddArrayToObject(item, "powerStatus");
	if(powerStatus == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *powerStatusListEntry;
	list_ForEach(powerStatusListEntry, asset_reefer_response_reefer_stats->powerStatus) {
		cJSON *item = asset_reefer_response_reefer_stats_power_status_convertToJSON(powerStatusListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(powerStatus, item);
	}

	// asset_reefer_response_reefer_stats->engineHours
    cJSON *engineHours = cJSON_AddArrayToObject(item, "engineHours");
	if(engineHours == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *engineHoursListEntry;
	list_ForEach(engineHoursListEntry, asset_reefer_response_reefer_stats->engineHours) {
		cJSON *item = asset_reefer_response_reefer_stats_engine_hours_convertToJSON(engineHoursListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(engineHours, item);
	}

	// asset_reefer_response_reefer_stats->setPoint
    cJSON *setPoint = cJSON_AddArrayToObject(item, "setPoint");
	if(setPoint == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *setPointListEntry;
	list_ForEach(setPointListEntry, asset_reefer_response_reefer_stats->setPoint) {
		cJSON *item = asset_reefer_response_reefer_stats_set_point_convertToJSON(setPointListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(setPoint, item);
	}

	// asset_reefer_response_reefer_stats->returnAirTemp
    cJSON *returnAirTemp = cJSON_AddArrayToObject(item, "returnAirTemp");
	if(returnAirTemp == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *returnAirTempListEntry;
	list_ForEach(returnAirTempListEntry, asset_reefer_response_reefer_stats->returnAirTemp) {
		cJSON *item = asset_reefer_response_reefer_stats_return_air_temp_convertToJSON(returnAirTempListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(returnAirTemp, item);
	}

	// asset_reefer_response_reefer_stats->alarms
    cJSON *alarms = cJSON_AddArrayToObject(item, "alarms");
	if(alarms == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *alarmsListEntry;
	list_ForEach(alarmsListEntry, asset_reefer_response_reefer_stats->alarms) {
		cJSON *item = asset_reefer_response_reefer_stats_alarms_1_convertToJSON(alarmsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(alarms, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats_parseFromJSON(char *jsonString){

    asset_reefer_response_reefer_stats_t *asset_reefer_response_reefer_stats = NULL;
    cJSON *asset_reefer_response_reefer_statsJSON = cJSON_Parse(jsonString);
    if(asset_reefer_response_reefer_statsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_reefer_response_reefer_stats->fuelPercentage
    cJSON *fuelPercentage;
    cJSON *fuelPercentageJSON = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_statsJSON,"fuelPercentage");
    if(!cJSON_IsArray(fuelPercentageJSON)){
        goto end; //nonprimitive container
    }

    list_t *fuelPercentageList = list_create();

    cJSON_ArrayForEach(fuelPercentage,fuelPercentageJSON )
    {
        if(!cJSON_IsObject(fuelPercentage)){
            goto end;
        }
		char *JSONData = cJSON_Print(fuelPercentage);
        asset_reefer_response_reefer_stats_fuel_percentage_t *fuelPercentageItem = asset_reefer_response_reefer_stats_fuel_percentage_parseFromJSON(JSONData);

        list_addElement(fuelPercentageList, fuelPercentageItem);
        free(JSONData);
    }

    // asset_reefer_response_reefer_stats->powerStatus
    cJSON *powerStatus;
    cJSON *powerStatusJSON = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_statsJSON,"powerStatus");
    if(!cJSON_IsArray(powerStatusJSON)){
        goto end; //nonprimitive container
    }

    list_t *powerStatusList = list_create();

    cJSON_ArrayForEach(powerStatus,powerStatusJSON )
    {
        if(!cJSON_IsObject(powerStatus)){
            goto end;
        }
		char *JSONData = cJSON_Print(powerStatus);
        asset_reefer_response_reefer_stats_power_status_t *powerStatusItem = asset_reefer_response_reefer_stats_power_status_parseFromJSON(JSONData);

        list_addElement(powerStatusList, powerStatusItem);
        free(JSONData);
    }

    // asset_reefer_response_reefer_stats->engineHours
    cJSON *engineHours;
    cJSON *engineHoursJSON = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_statsJSON,"engineHours");
    if(!cJSON_IsArray(engineHoursJSON)){
        goto end; //nonprimitive container
    }

    list_t *engineHoursList = list_create();

    cJSON_ArrayForEach(engineHours,engineHoursJSON )
    {
        if(!cJSON_IsObject(engineHours)){
            goto end;
        }
		char *JSONData = cJSON_Print(engineHours);
        asset_reefer_response_reefer_stats_engine_hours_t *engineHoursItem = asset_reefer_response_reefer_stats_engine_hours_parseFromJSON(JSONData);

        list_addElement(engineHoursList, engineHoursItem);
        free(JSONData);
    }

    // asset_reefer_response_reefer_stats->setPoint
    cJSON *setPoint;
    cJSON *setPointJSON = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_statsJSON,"setPoint");
    if(!cJSON_IsArray(setPointJSON)){
        goto end; //nonprimitive container
    }

    list_t *setPointList = list_create();

    cJSON_ArrayForEach(setPoint,setPointJSON )
    {
        if(!cJSON_IsObject(setPoint)){
            goto end;
        }
		char *JSONData = cJSON_Print(setPoint);
        asset_reefer_response_reefer_stats_set_point_t *setPointItem = asset_reefer_response_reefer_stats_set_point_parseFromJSON(JSONData);

        list_addElement(setPointList, setPointItem);
        free(JSONData);
    }

    // asset_reefer_response_reefer_stats->returnAirTemp
    cJSON *returnAirTemp;
    cJSON *returnAirTempJSON = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_statsJSON,"returnAirTemp");
    if(!cJSON_IsArray(returnAirTempJSON)){
        goto end; //nonprimitive container
    }

    list_t *returnAirTempList = list_create();

    cJSON_ArrayForEach(returnAirTemp,returnAirTempJSON )
    {
        if(!cJSON_IsObject(returnAirTemp)){
            goto end;
        }
		char *JSONData = cJSON_Print(returnAirTemp);
        asset_reefer_response_reefer_stats_return_air_temp_t *returnAirTempItem = asset_reefer_response_reefer_stats_return_air_temp_parseFromJSON(JSONData);

        list_addElement(returnAirTempList, returnAirTempItem);
        free(JSONData);
    }

    // asset_reefer_response_reefer_stats->alarms
    cJSON *alarms;
    cJSON *alarmsJSON = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_statsJSON,"alarms");
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
        asset_reefer_response_reefer_stats_alarms_1_t *alarmsItem = asset_reefer_response_reefer_stats_alarms_1_parseFromJSON(JSONData);

        list_addElement(alarmsList, alarmsItem);
        free(JSONData);
    }


    asset_reefer_response_reefer_stats = asset_reefer_response_reefer_stats_create (
        fuelPercentageList,
        powerStatusList,
        engineHoursList,
        setPointList,
        returnAirTempList,
        alarmsList
        );
 cJSON_Delete(asset_reefer_response_reefer_statsJSON);
    return asset_reefer_response_reefer_stats;
end:
    cJSON_Delete(asset_reefer_response_reefer_statsJSON);
    return NULL;

}


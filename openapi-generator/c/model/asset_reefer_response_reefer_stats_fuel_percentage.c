#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_reefer_response_reefer_stats_fuel_percentage.h"



asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage_create(
    long fuelPercentage,
    long changedAtMs
    ) {
	asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage = malloc(sizeof(asset_reefer_response_reefer_stats_fuel_percentage_t));
	asset_reefer_response_reefer_stats_fuel_percentage->fuelPercentage = fuelPercentage;
	asset_reefer_response_reefer_stats_fuel_percentage->changedAtMs = changedAtMs;

	return asset_reefer_response_reefer_stats_fuel_percentage;
}


void asset_reefer_response_reefer_stats_fuel_percentage_free(asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage) {
    listEntry_t *listEntry;

	free(asset_reefer_response_reefer_stats_fuel_percentage);
}

cJSON *asset_reefer_response_reefer_stats_fuel_percentage_convertToJSON(asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage) {
	cJSON *item = cJSON_CreateObject();
	// asset_reefer_response_reefer_stats_fuel_percentage->fuelPercentage
    if(cJSON_AddNumberToObject(item, "fuelPercentage", asset_reefer_response_reefer_stats_fuel_percentage->fuelPercentage) == NULL) {
    goto fail; //Numeric
    }

	// asset_reefer_response_reefer_stats_fuel_percentage->changedAtMs
    if(cJSON_AddNumberToObject(item, "changedAtMs", asset_reefer_response_reefer_stats_fuel_percentage->changedAtMs) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage_parseFromJSON(char *jsonString){

    asset_reefer_response_reefer_stats_fuel_percentage_t *asset_reefer_response_reefer_stats_fuel_percentage = NULL;
    cJSON *asset_reefer_response_reefer_stats_fuel_percentageJSON = cJSON_Parse(jsonString);
    if(asset_reefer_response_reefer_stats_fuel_percentageJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // asset_reefer_response_reefer_stats_fuel_percentage->fuelPercentage
    cJSON *fuelPercentage = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_fuel_percentageJSON, "fuelPercentage");
    if(!cJSON_IsNumber(fuelPercentage))
    {
    goto end; //Numeric
    }

    // asset_reefer_response_reefer_stats_fuel_percentage->changedAtMs
    cJSON *changedAtMs = cJSON_GetObjectItemCaseSensitive(asset_reefer_response_reefer_stats_fuel_percentageJSON, "changedAtMs");
    if(!cJSON_IsNumber(changedAtMs))
    {
    goto end; //Numeric
    }


    asset_reefer_response_reefer_stats_fuel_percentage = asset_reefer_response_reefer_stats_fuel_percentage_create (
        fuelPercentage->valuedouble,
        changedAtMs->valuedouble
        );
 cJSON_Delete(asset_reefer_response_reefer_stats_fuel_percentageJSON);
    return asset_reefer_response_reefer_stats_fuel_percentage;
end:
    cJSON_Delete(asset_reefer_response_reefer_stats_fuel_percentageJSON);
    return NULL;

}


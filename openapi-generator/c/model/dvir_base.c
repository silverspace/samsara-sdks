#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dvir_base.h"



dvir_base_t *dvir_base_create(
    dvir_base_author_signature_t *authorSignature,
    bool defectsCorrected,
    bool defectsNeedNotBeCorrected,
    long id,
    char *inspectionType,
    char *mechanicNotes,
    dvir_base_mechanic_or_agent_signature_t *mechanicOrAgentSignature,
    dvir_base_next_driver_signature_t *nextDriverSignature,
    long odometerMiles,
    long timeMs,
    list_t *trailerDefects,
    int trailerId,
    char *trailerName,
    dvir_base_vehicle_t *vehicle,
    char *vehicleCondition,
    list_t *vehicleDefects
    ) {
	dvir_base_t *dvir_base = malloc(sizeof(dvir_base_t));
	dvir_base->authorSignature = authorSignature;
	dvir_base->defectsCorrected = defectsCorrected;
	dvir_base->defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
	dvir_base->id = id;
	dvir_base->inspectionType = inspectionType;
	dvir_base->mechanicNotes = mechanicNotes;
	dvir_base->mechanicOrAgentSignature = mechanicOrAgentSignature;
	dvir_base->nextDriverSignature = nextDriverSignature;
	dvir_base->odometerMiles = odometerMiles;
	dvir_base->timeMs = timeMs;
	dvir_base->trailerDefects = trailerDefects;
	dvir_base->trailerId = trailerId;
	dvir_base->trailerName = trailerName;
	dvir_base->vehicle = vehicle;
	dvir_base->vehicleCondition = vehicleCondition;
	dvir_base->vehicleDefects = vehicleDefects;

	return dvir_base;
}


void dvir_base_free(dvir_base_t *dvir_base) {
    listEntry_t *listEntry;
	dvir_base_author_signature_free(dvir_base->authorSignature);
    free(dvir_base->inspectionType);
    free(dvir_base->mechanicNotes);
	dvir_base_mechanic_or_agent_signature_free(dvir_base->mechanicOrAgentSignature);
	dvir_base_next_driver_signature_free(dvir_base->nextDriverSignature);
		list_ForEach(listEntry, dvir_base->trailerDefects) {
		dvir_base_trailer_defects_free(listEntry->data);
	}
	list_free(dvir_base->trailerDefects);
    free(dvir_base->trailerName);
	dvir_base_vehicle_free(dvir_base->vehicle);
    free(dvir_base->vehicleCondition);
		list_ForEach(listEntry, dvir_base->vehicleDefects) {
		dvir_base_trailer_defects_free(listEntry->data);
	}
	list_free(dvir_base->vehicleDefects);

	free(dvir_base);
}

cJSON *dvir_base_convertToJSON(dvir_base_t *dvir_base) {
	cJSON *item = cJSON_CreateObject();
	// dvir_base->authorSignature
	cJSON *authorSignature = dvir_base_author_signature_convertToJSON(dvir_base->authorSignature);
	if(authorSignature == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "authorSignature", authorSignature);
	if(item->child == NULL) {
		goto fail;
	}

	// dvir_base->defectsCorrected
    if(cJSON_AddBoolToObject(item, "defectsCorrected", dvir_base->defectsCorrected) == NULL) {
    goto fail; //Numeric
    }

	// dvir_base->defectsNeedNotBeCorrected
    if(cJSON_AddBoolToObject(item, "defectsNeedNotBeCorrected", dvir_base->defectsNeedNotBeCorrected) == NULL) {
    goto fail; //Numeric
    }

	// dvir_base->id
    if(cJSON_AddNumberToObject(item, "id", dvir_base->id) == NULL) {
    goto fail; //Numeric
    }

	// dvir_base->inspectionType
    if(cJSON_AddStringToObject(item, "inspectionType", dvir_base->inspectionType) == NULL) {
    goto fail; //String
    }

	// dvir_base->mechanicNotes
    if(cJSON_AddStringToObject(item, "mechanicNotes", dvir_base->mechanicNotes) == NULL) {
    goto fail; //String
    }

	// dvir_base->mechanicOrAgentSignature
	cJSON *mechanicOrAgentSignature = dvir_base_mechanic_or_agent_signature_convertToJSON(dvir_base->mechanicOrAgentSignature);
	if(mechanicOrAgentSignature == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "mechanicOrAgentSignature", mechanicOrAgentSignature);
	if(item->child == NULL) {
		goto fail;
	}

	// dvir_base->nextDriverSignature
	cJSON *nextDriverSignature = dvir_base_next_driver_signature_convertToJSON(dvir_base->nextDriverSignature);
	if(nextDriverSignature == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "nextDriverSignature", nextDriverSignature);
	if(item->child == NULL) {
		goto fail;
	}

	// dvir_base->odometerMiles
    if(cJSON_AddNumberToObject(item, "odometerMiles", dvir_base->odometerMiles) == NULL) {
    goto fail; //Numeric
    }

	// dvir_base->timeMs
    if(cJSON_AddNumberToObject(item, "timeMs", dvir_base->timeMs) == NULL) {
    goto fail; //Numeric
    }

	// dvir_base->trailerDefects
    cJSON *trailerDefects = cJSON_AddArrayToObject(item, "trailerDefects");
	if(trailerDefects == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *trailerDefectsListEntry;
	list_ForEach(trailerDefectsListEntry, dvir_base->trailerDefects) {
		cJSON *item = dvir_base_trailer_defects_convertToJSON(trailerDefectsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(trailerDefects, item);
	}

	// dvir_base->trailerId
    if(cJSON_AddNumberToObject(item, "trailerId", dvir_base->trailerId) == NULL) {
    goto fail; //Numeric
    }

	// dvir_base->trailerName
    if(cJSON_AddStringToObject(item, "trailerName", dvir_base->trailerName) == NULL) {
    goto fail; //String
    }

	// dvir_base->vehicle
	cJSON *vehicle = dvir_base_vehicle_convertToJSON(dvir_base->vehicle);
	if(vehicle == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "vehicle", vehicle);
	if(item->child == NULL) {
		goto fail;
	}

	// dvir_base->vehicleCondition
    if(cJSON_AddStringToObject(item, "vehicleCondition", dvir_base->vehicleCondition) == NULL) {
    goto fail; //String
    }

	// dvir_base->vehicleDefects
    cJSON *vehicleDefects = cJSON_AddArrayToObject(item, "vehicleDefects");
	if(vehicleDefects == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehicleDefectsListEntry;
	list_ForEach(vehicleDefectsListEntry, dvir_base->vehicleDefects) {
		cJSON *item = dvir_base_trailer_defects_convertToJSON(vehicleDefectsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(vehicleDefects, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dvir_base_t *dvir_base_parseFromJSON(char *jsonString){

    dvir_base_t *dvir_base = NULL;
    cJSON *dvir_baseJSON = cJSON_Parse(jsonString);
    if(dvir_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dvir_base->authorSignature
    dvir_base_author_signature_t *authorSignature;
    cJSON *authorSignatureJSON = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "authorSignature");
    if(dvir_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *authorSignatureJSONData = cJSON_Print(authorSignatureJSON);
    authorSignature = dvir_base_author_signature_parseFromJSON(authorSignatureJSONData);

    // dvir_base->defectsCorrected
    cJSON *defectsCorrected = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "defectsCorrected");
    if(!cJSON_IsBool(defectsCorrected))
    {
    goto end; //Numeric
    }

    // dvir_base->defectsNeedNotBeCorrected
    cJSON *defectsNeedNotBeCorrected = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "defectsNeedNotBeCorrected");
    if(!cJSON_IsBool(defectsNeedNotBeCorrected))
    {
    goto end; //Numeric
    }

    // dvir_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // dvir_base->inspectionType
    cJSON *inspectionType = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "inspectionType");
    if(!cJSON_IsString(inspectionType) || (inspectionType->valuestring == NULL)){
    goto end; //String
    }

    // dvir_base->mechanicNotes
    cJSON *mechanicNotes = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "mechanicNotes");
    if(!cJSON_IsString(mechanicNotes) || (mechanicNotes->valuestring == NULL)){
    goto end; //String
    }

    // dvir_base->mechanicOrAgentSignature
    dvir_base_mechanic_or_agent_signature_t *mechanicOrAgentSignature;
    cJSON *mechanicOrAgentSignatureJSON = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "mechanicOrAgentSignature");
    if(dvir_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *mechanicOrAgentSignatureJSONData = cJSON_Print(mechanicOrAgentSignatureJSON);
    mechanicOrAgentSignature = dvir_base_mechanic_or_agent_signature_parseFromJSON(mechanicOrAgentSignatureJSONData);

    // dvir_base->nextDriverSignature
    dvir_base_next_driver_signature_t *nextDriverSignature;
    cJSON *nextDriverSignatureJSON = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "nextDriverSignature");
    if(dvir_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *nextDriverSignatureJSONData = cJSON_Print(nextDriverSignatureJSON);
    nextDriverSignature = dvir_base_next_driver_signature_parseFromJSON(nextDriverSignatureJSONData);

    // dvir_base->odometerMiles
    cJSON *odometerMiles = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "odometerMiles");
    if(!cJSON_IsNumber(odometerMiles))
    {
    goto end; //Numeric
    }

    // dvir_base->timeMs
    cJSON *timeMs = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "timeMs");
    if(!cJSON_IsNumber(timeMs))
    {
    goto end; //Numeric
    }

    // dvir_base->trailerDefects
    cJSON *trailerDefects;
    cJSON *trailerDefectsJSON = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON,"trailerDefects");
    if(!cJSON_IsArray(trailerDefectsJSON)){
        goto end; //nonprimitive container
    }

    list_t *trailerDefectsList = list_create();

    cJSON_ArrayForEach(trailerDefects,trailerDefectsJSON )
    {
        if(!cJSON_IsObject(trailerDefects)){
            goto end;
        }
		char *JSONData = cJSON_Print(trailerDefects);
        dvir_base_trailer_defects_t *trailerDefectsItem = dvir_base_trailer_defects_parseFromJSON(JSONData);

        list_addElement(trailerDefectsList, trailerDefectsItem);
        free(JSONData);
    }

    // dvir_base->trailerId
    cJSON *trailerId = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "trailerId");
    if(!cJSON_IsNumber(trailerId))
    {
    goto end; //Numeric
    }

    // dvir_base->trailerName
    cJSON *trailerName = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "trailerName");
    if(!cJSON_IsString(trailerName) || (trailerName->valuestring == NULL)){
    goto end; //String
    }

    // dvir_base->vehicle
    dvir_base_vehicle_t *vehicle;
    cJSON *vehicleJSON = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "vehicle");
    if(dvir_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *vehicleJSONData = cJSON_Print(vehicleJSON);
    vehicle = dvir_base_vehicle_parseFromJSON(vehicleJSONData);

    // dvir_base->vehicleCondition
    cJSON *vehicleCondition = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON, "vehicleCondition");
    if(!cJSON_IsString(vehicleCondition) || (vehicleCondition->valuestring == NULL)){
    goto end; //String
    }

    // dvir_base->vehicleDefects
    cJSON *vehicleDefects;
    cJSON *vehicleDefectsJSON = cJSON_GetObjectItemCaseSensitive(dvir_baseJSON,"vehicleDefects");
    if(!cJSON_IsArray(vehicleDefectsJSON)){
        goto end; //nonprimitive container
    }

    list_t *vehicleDefectsList = list_create();

    cJSON_ArrayForEach(vehicleDefects,vehicleDefectsJSON )
    {
        if(!cJSON_IsObject(vehicleDefects)){
            goto end;
        }
		char *JSONData = cJSON_Print(vehicleDefects);
        dvir_base_trailer_defects_t *vehicleDefectsItem = dvir_base_trailer_defects_parseFromJSON(JSONData);

        list_addElement(vehicleDefectsList, vehicleDefectsItem);
        free(JSONData);
    }


    dvir_base = dvir_base_create (
        authorSignature,
        defectsCorrected->valueint,
        defectsNeedNotBeCorrected->valueint,
        id->valuedouble,
        strdup(inspectionType->valuestring),
        strdup(mechanicNotes->valuestring),
        mechanicOrAgentSignature,
        nextDriverSignature,
        odometerMiles->valuedouble,
        timeMs->valuedouble,
        trailerDefectsList,
        trailerId->valuedouble,
        strdup(trailerName->valuestring),
        vehicle,
        strdup(vehicleCondition->valuestring),
        vehicleDefectsList
        );
        free(authorSignatureJSONData);
        free(mechanicOrAgentSignatureJSONData);
        free(nextDriverSignatureJSONData);
        free(vehicleJSONData);
 cJSON_Delete(dvir_baseJSON);
    return dvir_base;
end:
    cJSON_Delete(dvir_baseJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_12.h"


char* inspectionTypeinline_object_12_ToString(inspectionType_e inspectionType){
    char *inspectionTypeArray[] =  { "mechanic" };
    return inspectionTypeArray[inspectionType];

}

inspectionType_e inspectionTypeinline_object_12_FromString(char* inspectionType){
    int stringToReturn = 0;
    char *inspectionTypeArray[] =  { "mechanic" };
    size_t sizeofArray = sizeof(inspectionTypeArray) / sizeof(inspectionTypeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(inspectionType, inspectionTypeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
}
char* safeinline_object_12_ToString(safe_e safe){
    char *safeArray[] =  { "safe","unsafe" };
    return safeArray[safe];

}

safe_e safeinline_object_12_FromString(char* safe){
    int stringToReturn = 0;
    char *safeArray[] =  { "safe","unsafe" };
    size_t sizeofArray = sizeof(safeArray) / sizeof(safeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(safe, safeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
}

inline_object_12_t *inline_object_12_create(
    inspectionType_e inspectionType,
    char *mechanicNotes,
    int odometerMiles,
    bool previousDefectsCorrected,
    bool previousDefectsIgnored,
    safe_e safe,
    int trailerId,
    char *userEmail,
    int vehicleId
    ) {
	inline_object_12_t *inline_object_12 = malloc(sizeof(inline_object_12_t));
	inline_object_12->inspectionType = inspectionType;
	inline_object_12->mechanicNotes = mechanicNotes;
	inline_object_12->odometerMiles = odometerMiles;
	inline_object_12->previousDefectsCorrected = previousDefectsCorrected;
	inline_object_12->previousDefectsIgnored = previousDefectsIgnored;
	inline_object_12->safe = safe;
	inline_object_12->trailerId = trailerId;
	inline_object_12->userEmail = userEmail;
	inline_object_12->vehicleId = vehicleId;

	return inline_object_12;
}


void inline_object_12_free(inline_object_12_t *inline_object_12) {
    listEntry_t *listEntry;
    free(inline_object_12->mechanicNotes);
    free(inline_object_12->userEmail);

	free(inline_object_12);
}

cJSON *inline_object_12_convertToJSON(inline_object_12_t *inline_object_12) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_12->inspectionType
    if(cJSON_AddStringToObject(item, "inspectionType", inspectionTypeinline_object_12_ToString(inline_object_12->inspectionType)) == NULL) {
    goto fail; //String
    }

	// inline_object_12->mechanicNotes
    if(cJSON_AddStringToObject(item, "mechanicNotes", inline_object_12->mechanicNotes) == NULL) {
    goto fail; //String
    }

	// inline_object_12->odometerMiles
    if(cJSON_AddNumberToObject(item, "odometerMiles", inline_object_12->odometerMiles) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_12->previousDefectsCorrected
    if(cJSON_AddBoolToObject(item, "previousDefectsCorrected", inline_object_12->previousDefectsCorrected) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_12->previousDefectsIgnored
    if(cJSON_AddBoolToObject(item, "previousDefectsIgnored", inline_object_12->previousDefectsIgnored) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_12->safe
    if(cJSON_AddStringToObject(item, "safe", safeinline_object_12_ToString(inline_object_12->safe)) == NULL) {
    goto fail; //String
    }

	// inline_object_12->trailerId
    if(cJSON_AddNumberToObject(item, "trailerId", inline_object_12->trailerId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_12->userEmail
    if(cJSON_AddStringToObject(item, "userEmail", inline_object_12->userEmail) == NULL) {
    goto fail; //String
    }

	// inline_object_12->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", inline_object_12->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_12_t *inline_object_12_parseFromJSON(char *jsonString){

    inline_object_12_t *inline_object_12 = NULL;
    cJSON *inline_object_12JSON = cJSON_Parse(jsonString);
    if(inline_object_12JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_12->inspectionType
    inspectionType_e inspectionTypeVariable;
    cJSON *inspectionType = cJSON_GetObjectItemCaseSensitive(inline_object_12JSON, "inspectionType");
    if(!cJSON_IsString(inspectionType) || (inspectionType->valuestring == NULL)){
    goto end; //String
    }

    inspectionTypeVariable = inspectionTypeinline_object_12_FromString(inspectionType->valuestring);

    // inline_object_12->mechanicNotes
    cJSON *mechanicNotes = cJSON_GetObjectItemCaseSensitive(inline_object_12JSON, "mechanicNotes");
    if(!cJSON_IsString(mechanicNotes) || (mechanicNotes->valuestring == NULL)){
    goto end; //String
    }

    // inline_object_12->odometerMiles
    cJSON *odometerMiles = cJSON_GetObjectItemCaseSensitive(inline_object_12JSON, "odometerMiles");
    if(!cJSON_IsNumber(odometerMiles))
    {
    goto end; //Numeric
    }

    // inline_object_12->previousDefectsCorrected
    cJSON *previousDefectsCorrected = cJSON_GetObjectItemCaseSensitive(inline_object_12JSON, "previousDefectsCorrected");
    if(!cJSON_IsBool(previousDefectsCorrected))
    {
    goto end; //Numeric
    }

    // inline_object_12->previousDefectsIgnored
    cJSON *previousDefectsIgnored = cJSON_GetObjectItemCaseSensitive(inline_object_12JSON, "previousDefectsIgnored");
    if(!cJSON_IsBool(previousDefectsIgnored))
    {
    goto end; //Numeric
    }

    // inline_object_12->safe
    safe_e safeVariable;
    cJSON *safe = cJSON_GetObjectItemCaseSensitive(inline_object_12JSON, "safe");
    if(!cJSON_IsString(safe) || (safe->valuestring == NULL)){
    goto end; //String
    }

    safeVariable = safeinline_object_12_FromString(safe->valuestring);

    // inline_object_12->trailerId
    cJSON *trailerId = cJSON_GetObjectItemCaseSensitive(inline_object_12JSON, "trailerId");
    if(!cJSON_IsNumber(trailerId))
    {
    goto end; //Numeric
    }

    // inline_object_12->userEmail
    cJSON *userEmail = cJSON_GetObjectItemCaseSensitive(inline_object_12JSON, "userEmail");
    if(!cJSON_IsString(userEmail) || (userEmail->valuestring == NULL)){
    goto end; //String
    }

    // inline_object_12->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(inline_object_12JSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }


    inline_object_12 = inline_object_12_create (
        inspectionTypeVariable,
        strdup(mechanicNotes->valuestring),
        odometerMiles->valuedouble,
        previousDefectsCorrected->valueint,
        previousDefectsIgnored->valueint,
        safeVariable,
        trailerId->valuedouble,
        strdup(userEmail->valuestring),
        vehicleId->valuedouble
        );
 cJSON_Delete(inline_object_12JSON);
    return inline_object_12;
end:
    cJSON_Delete(inline_object_12JSON);
    return NULL;

}


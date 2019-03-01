#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dispatch_job_create.h"



dispatch_job_create_t *dispatch_job_create_create(
    char *destination_address,
    long destination_address_id,
    double destination_lat,
    double destination_lng,
    char *destination_name,
    char *notes,
    long scheduled_arrival_time_ms,
    long scheduled_departure_time_ms
    ) {
	dispatch_job_create_t *dispatch_job_create = malloc(sizeof(dispatch_job_create_t));
	dispatch_job_create->destination_address = destination_address;
	dispatch_job_create->destination_address_id = destination_address_id;
	dispatch_job_create->destination_lat = destination_lat;
	dispatch_job_create->destination_lng = destination_lng;
	dispatch_job_create->destination_name = destination_name;
	dispatch_job_create->notes = notes;
	dispatch_job_create->scheduled_arrival_time_ms = scheduled_arrival_time_ms;
	dispatch_job_create->scheduled_departure_time_ms = scheduled_departure_time_ms;

	return dispatch_job_create;
}


void dispatch_job_create_free(dispatch_job_create_t *dispatch_job_create) {
    listEntry_t *listEntry;
    free(dispatch_job_create->destination_address);
    free(dispatch_job_create->destination_name);
    free(dispatch_job_create->notes);

	free(dispatch_job_create);
}

cJSON *dispatch_job_create_convertToJSON(dispatch_job_create_t *dispatch_job_create) {
	cJSON *item = cJSON_CreateObject();
	// dispatch_job_create->destination_address
    if(cJSON_AddStringToObject(item, "destination_address", dispatch_job_create->destination_address) == NULL) {
    goto fail; //String
    }

	// dispatch_job_create->destination_address_id
    if(cJSON_AddNumberToObject(item, "destination_address_id", dispatch_job_create->destination_address_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job_create->destination_lat
    if(cJSON_AddNumberToObject(item, "destination_lat", dispatch_job_create->destination_lat) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job_create->destination_lng
    if(cJSON_AddNumberToObject(item, "destination_lng", dispatch_job_create->destination_lng) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job_create->destination_name
    if(cJSON_AddStringToObject(item, "destination_name", dispatch_job_create->destination_name) == NULL) {
    goto fail; //String
    }

	// dispatch_job_create->notes
    if(cJSON_AddStringToObject(item, "notes", dispatch_job_create->notes) == NULL) {
    goto fail; //String
    }

	// dispatch_job_create->scheduled_arrival_time_ms
    if(cJSON_AddNumberToObject(item, "scheduled_arrival_time_ms", dispatch_job_create->scheduled_arrival_time_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job_create->scheduled_departure_time_ms
    if(cJSON_AddNumberToObject(item, "scheduled_departure_time_ms", dispatch_job_create->scheduled_departure_time_ms) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dispatch_job_create_t *dispatch_job_create_parseFromJSON(char *jsonString){

    dispatch_job_create_t *dispatch_job_create = NULL;
    cJSON *dispatch_job_createJSON = cJSON_Parse(jsonString);
    if(dispatch_job_createJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dispatch_job_create->destination_address
    cJSON *destination_address = cJSON_GetObjectItemCaseSensitive(dispatch_job_createJSON, "destination_address");
    if(!cJSON_IsString(destination_address) || (destination_address->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_job_create->destination_address_id
    cJSON *destination_address_id = cJSON_GetObjectItemCaseSensitive(dispatch_job_createJSON, "destination_address_id");
    if(!cJSON_IsNumber(destination_address_id))
    {
    goto end; //Numeric
    }

    // dispatch_job_create->destination_lat
    cJSON *destination_lat = cJSON_GetObjectItemCaseSensitive(dispatch_job_createJSON, "destination_lat");
    if(!cJSON_IsNumber(destination_lat))
    {
    goto end; //Numeric
    }

    // dispatch_job_create->destination_lng
    cJSON *destination_lng = cJSON_GetObjectItemCaseSensitive(dispatch_job_createJSON, "destination_lng");
    if(!cJSON_IsNumber(destination_lng))
    {
    goto end; //Numeric
    }

    // dispatch_job_create->destination_name
    cJSON *destination_name = cJSON_GetObjectItemCaseSensitive(dispatch_job_createJSON, "destination_name");
    if(!cJSON_IsString(destination_name) || (destination_name->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_job_create->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(dispatch_job_createJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_job_create->scheduled_arrival_time_ms
    cJSON *scheduled_arrival_time_ms = cJSON_GetObjectItemCaseSensitive(dispatch_job_createJSON, "scheduled_arrival_time_ms");
    if(!cJSON_IsNumber(scheduled_arrival_time_ms))
    {
    goto end; //Numeric
    }

    // dispatch_job_create->scheduled_departure_time_ms
    cJSON *scheduled_departure_time_ms = cJSON_GetObjectItemCaseSensitive(dispatch_job_createJSON, "scheduled_departure_time_ms");
    if(!cJSON_IsNumber(scheduled_departure_time_ms))
    {
    goto end; //Numeric
    }


    dispatch_job_create = dispatch_job_create_create (
        strdup(destination_address->valuestring),
        destination_address_id->valuedouble,
        destination_lat->valuedouble,
        destination_lng->valuedouble,
        strdup(destination_name->valuestring),
        strdup(notes->valuestring),
        scheduled_arrival_time_ms->valuedouble,
        scheduled_departure_time_ms->valuedouble
        );
 cJSON_Delete(dispatch_job_createJSON);
    return dispatch_job_create;
end:
    cJSON_Delete(dispatch_job_createJSON);
    return NULL;

}


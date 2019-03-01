#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dispatch_job.h"



dispatch_job_t *dispatch_job_create(
    char *destination_address,
    long destination_address_id,
    double destination_lat,
    double destination_lng,
    char *destination_name,
    char *notes,
    long scheduled_arrival_time_ms,
    long scheduled_departure_time_ms,
    long arrived_at_ms,
    long completed_at_ms,
    long dispatch_route_id,
    long driver_id,
    long en_route_at_ms,
    long estimated_arrival_ms,
    char *fleet_viewer_url,
    long group_id,
    long id,
    job_status_t *job_state,
    long skipped_at_ms,
    long vehicle_id
    ) {
	dispatch_job_t *dispatch_job = malloc(sizeof(dispatch_job_t));
	dispatch_job->destination_address = destination_address;
	dispatch_job->destination_address_id = destination_address_id;
	dispatch_job->destination_lat = destination_lat;
	dispatch_job->destination_lng = destination_lng;
	dispatch_job->destination_name = destination_name;
	dispatch_job->notes = notes;
	dispatch_job->scheduled_arrival_time_ms = scheduled_arrival_time_ms;
	dispatch_job->scheduled_departure_time_ms = scheduled_departure_time_ms;
	dispatch_job->arrived_at_ms = arrived_at_ms;
	dispatch_job->completed_at_ms = completed_at_ms;
	dispatch_job->dispatch_route_id = dispatch_route_id;
	dispatch_job->driver_id = driver_id;
	dispatch_job->en_route_at_ms = en_route_at_ms;
	dispatch_job->estimated_arrival_ms = estimated_arrival_ms;
	dispatch_job->fleet_viewer_url = fleet_viewer_url;
	dispatch_job->group_id = group_id;
	dispatch_job->id = id;
	dispatch_job->job_state = job_state;
	dispatch_job->skipped_at_ms = skipped_at_ms;
	dispatch_job->vehicle_id = vehicle_id;

	return dispatch_job;
}


void dispatch_job_free(dispatch_job_t *dispatch_job) {
    listEntry_t *listEntry;
    free(dispatch_job->destination_address);
    free(dispatch_job->destination_name);
    free(dispatch_job->notes);
    free(dispatch_job->fleet_viewer_url);
	job_status_free(dispatch_job->job_state);

	free(dispatch_job);
}

cJSON *dispatch_job_convertToJSON(dispatch_job_t *dispatch_job) {
	cJSON *item = cJSON_CreateObject();
	// dispatch_job->destination_address
    if(cJSON_AddStringToObject(item, "destination_address", dispatch_job->destination_address) == NULL) {
    goto fail; //String
    }

	// dispatch_job->destination_address_id
    if(cJSON_AddNumberToObject(item, "destination_address_id", dispatch_job->destination_address_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->destination_lat
    if(cJSON_AddNumberToObject(item, "destination_lat", dispatch_job->destination_lat) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->destination_lng
    if(cJSON_AddNumberToObject(item, "destination_lng", dispatch_job->destination_lng) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->destination_name
    if(cJSON_AddStringToObject(item, "destination_name", dispatch_job->destination_name) == NULL) {
    goto fail; //String
    }

	// dispatch_job->notes
    if(cJSON_AddStringToObject(item, "notes", dispatch_job->notes) == NULL) {
    goto fail; //String
    }

	// dispatch_job->scheduled_arrival_time_ms
    if(cJSON_AddNumberToObject(item, "scheduled_arrival_time_ms", dispatch_job->scheduled_arrival_time_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->scheduled_departure_time_ms
    if(cJSON_AddNumberToObject(item, "scheduled_departure_time_ms", dispatch_job->scheduled_departure_time_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->arrived_at_ms
    if(cJSON_AddNumberToObject(item, "arrived_at_ms", dispatch_job->arrived_at_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->completed_at_ms
    if(cJSON_AddNumberToObject(item, "completed_at_ms", dispatch_job->completed_at_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->dispatch_route_id
    if(cJSON_AddNumberToObject(item, "dispatch_route_id", dispatch_job->dispatch_route_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->driver_id
    if(cJSON_AddNumberToObject(item, "driver_id", dispatch_job->driver_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->en_route_at_ms
    if(cJSON_AddNumberToObject(item, "en_route_at_ms", dispatch_job->en_route_at_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->estimated_arrival_ms
    if(cJSON_AddNumberToObject(item, "estimated_arrival_ms", dispatch_job->estimated_arrival_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->fleet_viewer_url
    if(cJSON_AddStringToObject(item, "fleet_viewer_url", dispatch_job->fleet_viewer_url) == NULL) {
    goto fail; //String
    }

	// dispatch_job->group_id
    if(cJSON_AddNumberToObject(item, "group_id", dispatch_job->group_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->id
    if(cJSON_AddNumberToObject(item, "id", dispatch_job->id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->job_state
	cJSON *job_state = job_status_convertToJSON(dispatch_job->job_state);
	if(job_state == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "job_state", job_state);
	if(item->child == NULL) {
		goto fail;
	}

	// dispatch_job->skipped_at_ms
    if(cJSON_AddNumberToObject(item, "skipped_at_ms", dispatch_job->skipped_at_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_job->vehicle_id
    if(cJSON_AddNumberToObject(item, "vehicle_id", dispatch_job->vehicle_id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dispatch_job_t *dispatch_job_parseFromJSON(char *jsonString){

    dispatch_job_t *dispatch_job = NULL;
    cJSON *dispatch_jobJSON = cJSON_Parse(jsonString);
    if(dispatch_jobJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dispatch_job->destination_address
    cJSON *destination_address = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "destination_address");
    if(!cJSON_IsString(destination_address) || (destination_address->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_job->destination_address_id
    cJSON *destination_address_id = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "destination_address_id");
    if(!cJSON_IsNumber(destination_address_id))
    {
    goto end; //Numeric
    }

    // dispatch_job->destination_lat
    cJSON *destination_lat = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "destination_lat");
    if(!cJSON_IsNumber(destination_lat))
    {
    goto end; //Numeric
    }

    // dispatch_job->destination_lng
    cJSON *destination_lng = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "destination_lng");
    if(!cJSON_IsNumber(destination_lng))
    {
    goto end; //Numeric
    }

    // dispatch_job->destination_name
    cJSON *destination_name = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "destination_name");
    if(!cJSON_IsString(destination_name) || (destination_name->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_job->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_job->scheduled_arrival_time_ms
    cJSON *scheduled_arrival_time_ms = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "scheduled_arrival_time_ms");
    if(!cJSON_IsNumber(scheduled_arrival_time_ms))
    {
    goto end; //Numeric
    }

    // dispatch_job->scheduled_departure_time_ms
    cJSON *scheduled_departure_time_ms = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "scheduled_departure_time_ms");
    if(!cJSON_IsNumber(scheduled_departure_time_ms))
    {
    goto end; //Numeric
    }

    // dispatch_job->arrived_at_ms
    cJSON *arrived_at_ms = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "arrived_at_ms");
    if(!cJSON_IsNumber(arrived_at_ms))
    {
    goto end; //Numeric
    }

    // dispatch_job->completed_at_ms
    cJSON *completed_at_ms = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "completed_at_ms");
    if(!cJSON_IsNumber(completed_at_ms))
    {
    goto end; //Numeric
    }

    // dispatch_job->dispatch_route_id
    cJSON *dispatch_route_id = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "dispatch_route_id");
    if(!cJSON_IsNumber(dispatch_route_id))
    {
    goto end; //Numeric
    }

    // dispatch_job->driver_id
    cJSON *driver_id = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "driver_id");
    if(!cJSON_IsNumber(driver_id))
    {
    goto end; //Numeric
    }

    // dispatch_job->en_route_at_ms
    cJSON *en_route_at_ms = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "en_route_at_ms");
    if(!cJSON_IsNumber(en_route_at_ms))
    {
    goto end; //Numeric
    }

    // dispatch_job->estimated_arrival_ms
    cJSON *estimated_arrival_ms = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "estimated_arrival_ms");
    if(!cJSON_IsNumber(estimated_arrival_ms))
    {
    goto end; //Numeric
    }

    // dispatch_job->fleet_viewer_url
    cJSON *fleet_viewer_url = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "fleet_viewer_url");
    if(!cJSON_IsString(fleet_viewer_url) || (fleet_viewer_url->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_job->group_id
    cJSON *group_id = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "group_id");
    if(!cJSON_IsNumber(group_id))
    {
    goto end; //Numeric
    }

    // dispatch_job->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // dispatch_job->job_state
    job_status_t *job_state;
    cJSON *job_stateJSON = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "job_state");
    if(dispatch_jobJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *job_stateJSONData = cJSON_Print(job_stateJSON);
    job_state = job_status_parseFromJSON(job_stateJSONData);

    // dispatch_job->skipped_at_ms
    cJSON *skipped_at_ms = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "skipped_at_ms");
    if(!cJSON_IsNumber(skipped_at_ms))
    {
    goto end; //Numeric
    }

    // dispatch_job->vehicle_id
    cJSON *vehicle_id = cJSON_GetObjectItemCaseSensitive(dispatch_jobJSON, "vehicle_id");
    if(!cJSON_IsNumber(vehicle_id))
    {
    goto end; //Numeric
    }


    dispatch_job = dispatch_job_create (
        strdup(destination_address->valuestring),
        destination_address_id->valuedouble,
        destination_lat->valuedouble,
        destination_lng->valuedouble,
        strdup(destination_name->valuestring),
        strdup(notes->valuestring),
        scheduled_arrival_time_ms->valuedouble,
        scheduled_departure_time_ms->valuedouble,
        arrived_at_ms->valuedouble,
        completed_at_ms->valuedouble,
        dispatch_route_id->valuedouble,
        driver_id->valuedouble,
        en_route_at_ms->valuedouble,
        estimated_arrival_ms->valuedouble,
        strdup(fleet_viewer_url->valuestring),
        group_id->valuedouble,
        id->valuedouble,
        job_state,
        skipped_at_ms->valuedouble,
        vehicle_id->valuedouble
        );
        free(job_stateJSONData);
 cJSON_Delete(dispatch_jobJSON);
    return dispatch_job;
end:
    cJSON_Delete(dispatch_jobJSON);
    return NULL;

}


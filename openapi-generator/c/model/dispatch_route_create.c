#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dispatch_route_create.h"



dispatch_route_create_t *dispatch_route_create_create(
    long actual_end_ms,
    long actual_start_ms,
    long driver_id,
    long group_id,
    char *name,
    long scheduled_end_ms,
    long scheduled_meters,
    long scheduled_start_ms,
    char *start_location_address,
    long start_location_address_id,
    double start_location_lat,
    double start_location_lng,
    char *start_location_name,
    long trailer_id,
    long vehicle_id,
    list_t *dispatch_jobs
    ) {
	dispatch_route_create_t *dispatch_route_create = malloc(sizeof(dispatch_route_create_t));
	dispatch_route_create->actual_end_ms = actual_end_ms;
	dispatch_route_create->actual_start_ms = actual_start_ms;
	dispatch_route_create->driver_id = driver_id;
	dispatch_route_create->group_id = group_id;
	dispatch_route_create->name = name;
	dispatch_route_create->scheduled_end_ms = scheduled_end_ms;
	dispatch_route_create->scheduled_meters = scheduled_meters;
	dispatch_route_create->scheduled_start_ms = scheduled_start_ms;
	dispatch_route_create->start_location_address = start_location_address;
	dispatch_route_create->start_location_address_id = start_location_address_id;
	dispatch_route_create->start_location_lat = start_location_lat;
	dispatch_route_create->start_location_lng = start_location_lng;
	dispatch_route_create->start_location_name = start_location_name;
	dispatch_route_create->trailer_id = trailer_id;
	dispatch_route_create->vehicle_id = vehicle_id;
	dispatch_route_create->dispatch_jobs = dispatch_jobs;

	return dispatch_route_create;
}


void dispatch_route_create_free(dispatch_route_create_t *dispatch_route_create) {
    listEntry_t *listEntry;
    free(dispatch_route_create->name);
    free(dispatch_route_create->start_location_address);
    free(dispatch_route_create->start_location_name);
		list_ForEach(listEntry, dispatch_route_create->dispatch_jobs) {
		dispatch_job_create_free(listEntry->data);
	}
	list_free(dispatch_route_create->dispatch_jobs);

	free(dispatch_route_create);
}

cJSON *dispatch_route_create_convertToJSON(dispatch_route_create_t *dispatch_route_create) {
	cJSON *item = cJSON_CreateObject();
	// dispatch_route_create->actual_end_ms
    if(cJSON_AddNumberToObject(item, "actual_end_ms", dispatch_route_create->actual_end_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->actual_start_ms
    if(cJSON_AddNumberToObject(item, "actual_start_ms", dispatch_route_create->actual_start_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->driver_id
    if(cJSON_AddNumberToObject(item, "driver_id", dispatch_route_create->driver_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->group_id
    if(cJSON_AddNumberToObject(item, "group_id", dispatch_route_create->group_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->name
    if(cJSON_AddStringToObject(item, "name", dispatch_route_create->name) == NULL) {
    goto fail; //String
    }

	// dispatch_route_create->scheduled_end_ms
    if(cJSON_AddNumberToObject(item, "scheduled_end_ms", dispatch_route_create->scheduled_end_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->scheduled_meters
    if(cJSON_AddNumberToObject(item, "scheduled_meters", dispatch_route_create->scheduled_meters) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->scheduled_start_ms
    if(cJSON_AddNumberToObject(item, "scheduled_start_ms", dispatch_route_create->scheduled_start_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->start_location_address
    if(cJSON_AddStringToObject(item, "start_location_address", dispatch_route_create->start_location_address) == NULL) {
    goto fail; //String
    }

	// dispatch_route_create->start_location_address_id
    if(cJSON_AddNumberToObject(item, "start_location_address_id", dispatch_route_create->start_location_address_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->start_location_lat
    if(cJSON_AddNumberToObject(item, "start_location_lat", dispatch_route_create->start_location_lat) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->start_location_lng
    if(cJSON_AddNumberToObject(item, "start_location_lng", dispatch_route_create->start_location_lng) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->start_location_name
    if(cJSON_AddStringToObject(item, "start_location_name", dispatch_route_create->start_location_name) == NULL) {
    goto fail; //String
    }

	// dispatch_route_create->trailer_id
    if(cJSON_AddNumberToObject(item, "trailer_id", dispatch_route_create->trailer_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->vehicle_id
    if(cJSON_AddNumberToObject(item, "vehicle_id", dispatch_route_create->vehicle_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route_create->dispatch_jobs
    cJSON *dispatch_jobs = cJSON_AddArrayToObject(item, "dispatch_jobs");
	if(dispatch_jobs == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *dispatch_jobsListEntry;
	list_ForEach(dispatch_jobsListEntry, dispatch_route_create->dispatch_jobs) {
		cJSON *item = dispatch_job_create_convertToJSON(dispatch_jobsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(dispatch_jobs, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dispatch_route_create_t *dispatch_route_create_parseFromJSON(char *jsonString){

    dispatch_route_create_t *dispatch_route_create = NULL;
    cJSON *dispatch_route_createJSON = cJSON_Parse(jsonString);
    if(dispatch_route_createJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dispatch_route_create->actual_end_ms
    cJSON *actual_end_ms = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "actual_end_ms");
    if(!cJSON_IsNumber(actual_end_ms))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->actual_start_ms
    cJSON *actual_start_ms = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "actual_start_ms");
    if(!cJSON_IsNumber(actual_start_ms))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->driver_id
    cJSON *driver_id = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "driver_id");
    if(!cJSON_IsNumber(driver_id))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->group_id
    cJSON *group_id = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "group_id");
    if(!cJSON_IsNumber(group_id))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_route_create->scheduled_end_ms
    cJSON *scheduled_end_ms = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "scheduled_end_ms");
    if(!cJSON_IsNumber(scheduled_end_ms))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->scheduled_meters
    cJSON *scheduled_meters = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "scheduled_meters");
    if(!cJSON_IsNumber(scheduled_meters))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->scheduled_start_ms
    cJSON *scheduled_start_ms = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "scheduled_start_ms");
    if(!cJSON_IsNumber(scheduled_start_ms))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->start_location_address
    cJSON *start_location_address = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "start_location_address");
    if(!cJSON_IsString(start_location_address) || (start_location_address->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_route_create->start_location_address_id
    cJSON *start_location_address_id = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "start_location_address_id");
    if(!cJSON_IsNumber(start_location_address_id))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->start_location_lat
    cJSON *start_location_lat = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "start_location_lat");
    if(!cJSON_IsNumber(start_location_lat))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->start_location_lng
    cJSON *start_location_lng = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "start_location_lng");
    if(!cJSON_IsNumber(start_location_lng))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->start_location_name
    cJSON *start_location_name = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "start_location_name");
    if(!cJSON_IsString(start_location_name) || (start_location_name->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_route_create->trailer_id
    cJSON *trailer_id = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "trailer_id");
    if(!cJSON_IsNumber(trailer_id))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->vehicle_id
    cJSON *vehicle_id = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON, "vehicle_id");
    if(!cJSON_IsNumber(vehicle_id))
    {
    goto end; //Numeric
    }

    // dispatch_route_create->dispatch_jobs
    cJSON *dispatch_jobs;
    cJSON *dispatch_jobsJSON = cJSON_GetObjectItemCaseSensitive(dispatch_route_createJSON,"dispatch_jobs");
    if(!cJSON_IsArray(dispatch_jobsJSON)){
        goto end; //nonprimitive container
    }

    list_t *dispatch_jobsList = list_create();

    cJSON_ArrayForEach(dispatch_jobs,dispatch_jobsJSON )
    {
        if(!cJSON_IsObject(dispatch_jobs)){
            goto end;
        }
		char *JSONData = cJSON_Print(dispatch_jobs);
        dispatch_job_create_t *dispatch_jobsItem = dispatch_job_create_parseFromJSON(JSONData);

        list_addElement(dispatch_jobsList, dispatch_jobsItem);
        free(JSONData);
    }


    dispatch_route_create = dispatch_route_create_create (
        actual_end_ms->valuedouble,
        actual_start_ms->valuedouble,
        driver_id->valuedouble,
        group_id->valuedouble,
        strdup(name->valuestring),
        scheduled_end_ms->valuedouble,
        scheduled_meters->valuedouble,
        scheduled_start_ms->valuedouble,
        strdup(start_location_address->valuestring),
        start_location_address_id->valuedouble,
        start_location_lat->valuedouble,
        start_location_lng->valuedouble,
        strdup(start_location_name->valuestring),
        trailer_id->valuedouble,
        vehicle_id->valuedouble,
        dispatch_jobsList
        );
 cJSON_Delete(dispatch_route_createJSON);
    return dispatch_route_create;
end:
    cJSON_Delete(dispatch_route_createJSON);
    return NULL;

}


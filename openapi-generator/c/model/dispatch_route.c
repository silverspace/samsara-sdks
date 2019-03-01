#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dispatch_route.h"



dispatch_route_t *dispatch_route_create(
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
    list_t *dispatch_jobs,
    long id
    ) {
	dispatch_route_t *dispatch_route = malloc(sizeof(dispatch_route_t));
	dispatch_route->actual_end_ms = actual_end_ms;
	dispatch_route->actual_start_ms = actual_start_ms;
	dispatch_route->driver_id = driver_id;
	dispatch_route->group_id = group_id;
	dispatch_route->name = name;
	dispatch_route->scheduled_end_ms = scheduled_end_ms;
	dispatch_route->scheduled_meters = scheduled_meters;
	dispatch_route->scheduled_start_ms = scheduled_start_ms;
	dispatch_route->start_location_address = start_location_address;
	dispatch_route->start_location_address_id = start_location_address_id;
	dispatch_route->start_location_lat = start_location_lat;
	dispatch_route->start_location_lng = start_location_lng;
	dispatch_route->start_location_name = start_location_name;
	dispatch_route->trailer_id = trailer_id;
	dispatch_route->vehicle_id = vehicle_id;
	dispatch_route->dispatch_jobs = dispatch_jobs;
	dispatch_route->id = id;

	return dispatch_route;
}


void dispatch_route_free(dispatch_route_t *dispatch_route) {
    listEntry_t *listEntry;
    free(dispatch_route->name);
    free(dispatch_route->start_location_address);
    free(dispatch_route->start_location_name);
		list_ForEach(listEntry, dispatch_route->dispatch_jobs) {
		dispatch_job_free(listEntry->data);
	}
	list_free(dispatch_route->dispatch_jobs);

	free(dispatch_route);
}

cJSON *dispatch_route_convertToJSON(dispatch_route_t *dispatch_route) {
	cJSON *item = cJSON_CreateObject();
	// dispatch_route->actual_end_ms
    if(cJSON_AddNumberToObject(item, "actual_end_ms", dispatch_route->actual_end_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->actual_start_ms
    if(cJSON_AddNumberToObject(item, "actual_start_ms", dispatch_route->actual_start_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->driver_id
    if(cJSON_AddNumberToObject(item, "driver_id", dispatch_route->driver_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->group_id
    if(cJSON_AddNumberToObject(item, "group_id", dispatch_route->group_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->name
    if(cJSON_AddStringToObject(item, "name", dispatch_route->name) == NULL) {
    goto fail; //String
    }

	// dispatch_route->scheduled_end_ms
    if(cJSON_AddNumberToObject(item, "scheduled_end_ms", dispatch_route->scheduled_end_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->scheduled_meters
    if(cJSON_AddNumberToObject(item, "scheduled_meters", dispatch_route->scheduled_meters) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->scheduled_start_ms
    if(cJSON_AddNumberToObject(item, "scheduled_start_ms", dispatch_route->scheduled_start_ms) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->start_location_address
    if(cJSON_AddStringToObject(item, "start_location_address", dispatch_route->start_location_address) == NULL) {
    goto fail; //String
    }

	// dispatch_route->start_location_address_id
    if(cJSON_AddNumberToObject(item, "start_location_address_id", dispatch_route->start_location_address_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->start_location_lat
    if(cJSON_AddNumberToObject(item, "start_location_lat", dispatch_route->start_location_lat) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->start_location_lng
    if(cJSON_AddNumberToObject(item, "start_location_lng", dispatch_route->start_location_lng) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->start_location_name
    if(cJSON_AddStringToObject(item, "start_location_name", dispatch_route->start_location_name) == NULL) {
    goto fail; //String
    }

	// dispatch_route->trailer_id
    if(cJSON_AddNumberToObject(item, "trailer_id", dispatch_route->trailer_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->vehicle_id
    if(cJSON_AddNumberToObject(item, "vehicle_id", dispatch_route->vehicle_id) == NULL) {
    goto fail; //Numeric
    }

	// dispatch_route->dispatch_jobs
    cJSON *dispatch_jobs = cJSON_AddArrayToObject(item, "dispatch_jobs");
	if(dispatch_jobs == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *dispatch_jobsListEntry;
	list_ForEach(dispatch_jobsListEntry, dispatch_route->dispatch_jobs) {
		cJSON *item = dispatch_job_convertToJSON(dispatch_jobsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(dispatch_jobs, item);
	}

	// dispatch_route->id
    if(cJSON_AddNumberToObject(item, "id", dispatch_route->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dispatch_route_t *dispatch_route_parseFromJSON(char *jsonString){

    dispatch_route_t *dispatch_route = NULL;
    cJSON *dispatch_routeJSON = cJSON_Parse(jsonString);
    if(dispatch_routeJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dispatch_route->actual_end_ms
    cJSON *actual_end_ms = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "actual_end_ms");
    if(!cJSON_IsNumber(actual_end_ms))
    {
    goto end; //Numeric
    }

    // dispatch_route->actual_start_ms
    cJSON *actual_start_ms = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "actual_start_ms");
    if(!cJSON_IsNumber(actual_start_ms))
    {
    goto end; //Numeric
    }

    // dispatch_route->driver_id
    cJSON *driver_id = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "driver_id");
    if(!cJSON_IsNumber(driver_id))
    {
    goto end; //Numeric
    }

    // dispatch_route->group_id
    cJSON *group_id = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "group_id");
    if(!cJSON_IsNumber(group_id))
    {
    goto end; //Numeric
    }

    // dispatch_route->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_route->scheduled_end_ms
    cJSON *scheduled_end_ms = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "scheduled_end_ms");
    if(!cJSON_IsNumber(scheduled_end_ms))
    {
    goto end; //Numeric
    }

    // dispatch_route->scheduled_meters
    cJSON *scheduled_meters = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "scheduled_meters");
    if(!cJSON_IsNumber(scheduled_meters))
    {
    goto end; //Numeric
    }

    // dispatch_route->scheduled_start_ms
    cJSON *scheduled_start_ms = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "scheduled_start_ms");
    if(!cJSON_IsNumber(scheduled_start_ms))
    {
    goto end; //Numeric
    }

    // dispatch_route->start_location_address
    cJSON *start_location_address = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "start_location_address");
    if(!cJSON_IsString(start_location_address) || (start_location_address->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_route->start_location_address_id
    cJSON *start_location_address_id = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "start_location_address_id");
    if(!cJSON_IsNumber(start_location_address_id))
    {
    goto end; //Numeric
    }

    // dispatch_route->start_location_lat
    cJSON *start_location_lat = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "start_location_lat");
    if(!cJSON_IsNumber(start_location_lat))
    {
    goto end; //Numeric
    }

    // dispatch_route->start_location_lng
    cJSON *start_location_lng = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "start_location_lng");
    if(!cJSON_IsNumber(start_location_lng))
    {
    goto end; //Numeric
    }

    // dispatch_route->start_location_name
    cJSON *start_location_name = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "start_location_name");
    if(!cJSON_IsString(start_location_name) || (start_location_name->valuestring == NULL)){
    goto end; //String
    }

    // dispatch_route->trailer_id
    cJSON *trailer_id = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "trailer_id");
    if(!cJSON_IsNumber(trailer_id))
    {
    goto end; //Numeric
    }

    // dispatch_route->vehicle_id
    cJSON *vehicle_id = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "vehicle_id");
    if(!cJSON_IsNumber(vehicle_id))
    {
    goto end; //Numeric
    }

    // dispatch_route->dispatch_jobs
    cJSON *dispatch_jobs;
    cJSON *dispatch_jobsJSON = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON,"dispatch_jobs");
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
        dispatch_job_t *dispatch_jobsItem = dispatch_job_parseFromJSON(JSONData);

        list_addElement(dispatch_jobsList, dispatch_jobsItem);
        free(JSONData);
    }

    // dispatch_route->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(dispatch_routeJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    dispatch_route = dispatch_route_create (
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
        dispatch_jobsList,
        id->valuedouble
        );
 cJSON_Delete(dispatch_routeJSON);
    return dispatch_route;
end:
    cJSON_Delete(dispatch_routeJSON);
    return NULL;

}


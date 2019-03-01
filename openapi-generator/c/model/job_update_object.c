#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "job_update_object.h"



job_update_object_t *job_update_object_create(
    long changed_at_ms,
    long job_id,
    job_status_t *job_state,
    prev_job_status_t *prev_job_state,
    dispatch_route_t *route,
    long route_id
    ) {
	job_update_object_t *job_update_object = malloc(sizeof(job_update_object_t));
	job_update_object->changed_at_ms = changed_at_ms;
	job_update_object->job_id = job_id;
	job_update_object->job_state = job_state;
	job_update_object->prev_job_state = prev_job_state;
	job_update_object->route = route;
	job_update_object->route_id = route_id;

	return job_update_object;
}


void job_update_object_free(job_update_object_t *job_update_object) {
    listEntry_t *listEntry;
	job_status_free(job_update_object->job_state);
	prev_job_status_free(job_update_object->prev_job_state);
	dispatch_route_free(job_update_object->route);

	free(job_update_object);
}

cJSON *job_update_object_convertToJSON(job_update_object_t *job_update_object) {
	cJSON *item = cJSON_CreateObject();
	// job_update_object->changed_at_ms
    if(cJSON_AddNumberToObject(item, "changed_at_ms", job_update_object->changed_at_ms) == NULL) {
    goto fail; //Numeric
    }

	// job_update_object->job_id
    if(cJSON_AddNumberToObject(item, "job_id", job_update_object->job_id) == NULL) {
    goto fail; //Numeric
    }

	// job_update_object->job_state
	cJSON *job_state = job_status_convertToJSON(job_update_object->job_state);
	if(job_state == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "job_state", job_state);
	if(item->child == NULL) {
		goto fail;
	}

	// job_update_object->prev_job_state
	cJSON *prev_job_state = prev_job_status_convertToJSON(job_update_object->prev_job_state);
	if(prev_job_state == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "prev_job_state", prev_job_state);
	if(item->child == NULL) {
		goto fail;
	}

	// job_update_object->route
	cJSON *route = dispatch_route_convertToJSON(job_update_object->route);
	if(route == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "route", route);
	if(item->child == NULL) {
		goto fail;
	}

	// job_update_object->route_id
    if(cJSON_AddNumberToObject(item, "route_id", job_update_object->route_id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

job_update_object_t *job_update_object_parseFromJSON(char *jsonString){

    job_update_object_t *job_update_object = NULL;
    cJSON *job_update_objectJSON = cJSON_Parse(jsonString);
    if(job_update_objectJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // job_update_object->changed_at_ms
    cJSON *changed_at_ms = cJSON_GetObjectItemCaseSensitive(job_update_objectJSON, "changed_at_ms");
    if(!cJSON_IsNumber(changed_at_ms))
    {
    goto end; //Numeric
    }

    // job_update_object->job_id
    cJSON *job_id = cJSON_GetObjectItemCaseSensitive(job_update_objectJSON, "job_id");
    if(!cJSON_IsNumber(job_id))
    {
    goto end; //Numeric
    }

    // job_update_object->job_state
    job_status_t *job_state;
    cJSON *job_stateJSON = cJSON_GetObjectItemCaseSensitive(job_update_objectJSON, "job_state");
    if(job_update_objectJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *job_stateJSONData = cJSON_Print(job_stateJSON);
    job_state = job_status_parseFromJSON(job_stateJSONData);

    // job_update_object->prev_job_state
    prev_job_status_t *prev_job_state;
    cJSON *prev_job_stateJSON = cJSON_GetObjectItemCaseSensitive(job_update_objectJSON, "prev_job_state");
    if(job_update_objectJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *prev_job_stateJSONData = cJSON_Print(prev_job_stateJSON);
    prev_job_state = prev_job_status_parseFromJSON(prev_job_stateJSONData);

    // job_update_object->route
    dispatch_route_t *route;
    cJSON *routeJSON = cJSON_GetObjectItemCaseSensitive(job_update_objectJSON, "route");
    if(job_update_objectJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *routeJSONData = cJSON_Print(routeJSON);
    route = dispatch_route_parseFromJSON(routeJSONData);

    // job_update_object->route_id
    cJSON *route_id = cJSON_GetObjectItemCaseSensitive(job_update_objectJSON, "route_id");
    if(!cJSON_IsNumber(route_id))
    {
    goto end; //Numeric
    }


    job_update_object = job_update_object_create (
        changed_at_ms->valuedouble,
        job_id->valuedouble,
        job_state,
        prev_job_state,
        route,
        route_id->valuedouble
        );
        free(job_stateJSONData);
        free(prev_job_stateJSONData);
        free(routeJSONData);
 cJSON_Delete(job_update_objectJSON);
    return job_update_object;
end:
    cJSON_Delete(job_update_objectJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "all_route_job_updates.h"



all_route_job_updates_t *all_route_job_updates_create(
    list_t *job_updates,
    char *sequence_id
    ) {
	all_route_job_updates_t *all_route_job_updates = malloc(sizeof(all_route_job_updates_t));
	all_route_job_updates->job_updates = job_updates;
	all_route_job_updates->sequence_id = sequence_id;

	return all_route_job_updates;
}


void all_route_job_updates_free(all_route_job_updates_t *all_route_job_updates) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, all_route_job_updates->job_updates) {
		job_update_object_free(listEntry->data);
	}
	list_free(all_route_job_updates->job_updates);
    free(all_route_job_updates->sequence_id);

	free(all_route_job_updates);
}

cJSON *all_route_job_updates_convertToJSON(all_route_job_updates_t *all_route_job_updates) {
	cJSON *item = cJSON_CreateObject();
	// all_route_job_updates->job_updates
    cJSON *job_updates = cJSON_AddArrayToObject(item, "job_updates");
	if(job_updates == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *job_updatesListEntry;
	list_ForEach(job_updatesListEntry, all_route_job_updates->job_updates) {
		cJSON *item = job_update_object_convertToJSON(job_updatesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(job_updates, item);
	}

	// all_route_job_updates->sequence_id
    if(cJSON_AddStringToObject(item, "sequence_id", all_route_job_updates->sequence_id) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

all_route_job_updates_t *all_route_job_updates_parseFromJSON(char *jsonString){

    all_route_job_updates_t *all_route_job_updates = NULL;
    cJSON *all_route_job_updatesJSON = cJSON_Parse(jsonString);
    if(all_route_job_updatesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // all_route_job_updates->job_updates
    cJSON *job_updates;
    cJSON *job_updatesJSON = cJSON_GetObjectItemCaseSensitive(all_route_job_updatesJSON,"job_updates");
    if(!cJSON_IsArray(job_updatesJSON)){
        goto end; //nonprimitive container
    }

    list_t *job_updatesList = list_create();

    cJSON_ArrayForEach(job_updates,job_updatesJSON )
    {
        if(!cJSON_IsObject(job_updates)){
            goto end;
        }
		char *JSONData = cJSON_Print(job_updates);
        job_update_object_t *job_updatesItem = job_update_object_parseFromJSON(JSONData);

        list_addElement(job_updatesList, job_updatesItem);
        free(JSONData);
    }

    // all_route_job_updates->sequence_id
    cJSON *sequence_id = cJSON_GetObjectItemCaseSensitive(all_route_job_updatesJSON, "sequence_id");
    if(!cJSON_IsString(sequence_id) || (sequence_id->valuestring == NULL)){
    goto end; //String
    }


    all_route_job_updates = all_route_job_updates_create (
        job_updatesList,
        strdup(sequence_id->valuestring)
        );
 cJSON_Delete(all_route_job_updatesJSON);
    return all_route_job_updates;
end:
    cJSON_Delete(all_route_job_updatesJSON);
    return NULL;

}


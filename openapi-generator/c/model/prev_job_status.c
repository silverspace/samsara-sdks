#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "prev_job_status.h"



prev_job_status_t *prev_job_status_create(
    ) {
	prev_job_status_t *prev_job_status = malloc(sizeof(prev_job_status_t));

	return prev_job_status;
}


void prev_job_status_free(prev_job_status_t *prev_job_status) {
    listEntry_t *listEntry;

	free(prev_job_status);
}

cJSON *prev_job_status_convertToJSON(prev_job_status_t *prev_job_status) {
	cJSON *item = cJSON_CreateObject();
	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

prev_job_status_t *prev_job_status_parseFromJSON(char *jsonString){

    prev_job_status_t *prev_job_status = NULL;
    cJSON *prev_job_statusJSON = cJSON_Parse(jsonString);
    if(prev_job_statusJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }


    prev_job_status = prev_job_status_create (
        );
 cJSON_Delete(prev_job_statusJSON);
    return prev_job_status;
end:
    cJSON_Delete(prev_job_statusJSON);
    return NULL;

}


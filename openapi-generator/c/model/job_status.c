#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "job_status.h"



job_status_t *job_status_create(
    ) {
	job_status_t *job_status = malloc(sizeof(job_status_t));

	return job_status;
}


void job_status_free(job_status_t *job_status) {
    listEntry_t *listEntry;

	free(job_status);
}

cJSON *job_status_convertToJSON(job_status_t *job_status) {
	cJSON *item = cJSON_CreateObject();
	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

job_status_t *job_status_parseFromJSON(char *jsonString){

    job_status_t *job_status = NULL;
    cJSON *job_statusJSON = cJSON_Parse(jsonString);
    if(job_statusJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }


    job_status = job_status_create (
        );
 cJSON_Delete(job_statusJSON);
    return job_status;
end:
    cJSON_Delete(job_statusJSON);
    return NULL;

}


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document_base.h"



document_base_t *document_base_create(
    long dispatchJobId,
    char *notes
    ) {
	document_base_t *document_base = malloc(sizeof(document_base_t));
	document_base->dispatchJobId = dispatchJobId;
	document_base->notes = notes;

	return document_base;
}


void document_base_free(document_base_t *document_base) {
    listEntry_t *listEntry;
    free(document_base->notes);

	free(document_base);
}

cJSON *document_base_convertToJSON(document_base_t *document_base) {
	cJSON *item = cJSON_CreateObject();
	// document_base->dispatchJobId
    if(cJSON_AddNumberToObject(item, "dispatchJobId", document_base->dispatchJobId) == NULL) {
    goto fail; //Numeric
    }

	// document_base->notes
    if(cJSON_AddStringToObject(item, "notes", document_base->notes) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

document_base_t *document_base_parseFromJSON(char *jsonString){

    document_base_t *document_base = NULL;
    cJSON *document_baseJSON = cJSON_Parse(jsonString);
    if(document_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // document_base->dispatchJobId
    cJSON *dispatchJobId = cJSON_GetObjectItemCaseSensitive(document_baseJSON, "dispatchJobId");
    if(!cJSON_IsNumber(dispatchJobId))
    {
    goto end; //Numeric
    }

    // document_base->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(document_baseJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }


    document_base = document_base_create (
        dispatchJobId->valuedouble,
        strdup(notes->valuestring)
        );
 cJSON_Delete(document_baseJSON);
    return document_base;
end:
    cJSON_Delete(document_baseJSON);
    return NULL;

}


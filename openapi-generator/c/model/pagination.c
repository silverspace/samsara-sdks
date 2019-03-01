#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pagination.h"



pagination_t *pagination_create(
    char *endCursor,
    bool hasNextPage,
    bool hasPrevPage,
    char *startCursor
    ) {
	pagination_t *pagination = malloc(sizeof(pagination_t));
	pagination->endCursor = endCursor;
	pagination->hasNextPage = hasNextPage;
	pagination->hasPrevPage = hasPrevPage;
	pagination->startCursor = startCursor;

	return pagination;
}


void pagination_free(pagination_t *pagination) {
    listEntry_t *listEntry;
    free(pagination->endCursor);
    free(pagination->startCursor);

	free(pagination);
}

cJSON *pagination_convertToJSON(pagination_t *pagination) {
	cJSON *item = cJSON_CreateObject();
	// pagination->endCursor
    if(cJSON_AddStringToObject(item, "endCursor", pagination->endCursor) == NULL) {
    goto fail; //String
    }

	// pagination->hasNextPage
    if(cJSON_AddBoolToObject(item, "hasNextPage", pagination->hasNextPage) == NULL) {
    goto fail; //Numeric
    }

	// pagination->hasPrevPage
    if(cJSON_AddBoolToObject(item, "hasPrevPage", pagination->hasPrevPage) == NULL) {
    goto fail; //Numeric
    }

	// pagination->startCursor
    if(cJSON_AddStringToObject(item, "startCursor", pagination->startCursor) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

pagination_t *pagination_parseFromJSON(char *jsonString){

    pagination_t *pagination = NULL;
    cJSON *paginationJSON = cJSON_Parse(jsonString);
    if(paginationJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // pagination->endCursor
    cJSON *endCursor = cJSON_GetObjectItemCaseSensitive(paginationJSON, "endCursor");
    if(!cJSON_IsString(endCursor) || (endCursor->valuestring == NULL)){
    goto end; //String
    }

    // pagination->hasNextPage
    cJSON *hasNextPage = cJSON_GetObjectItemCaseSensitive(paginationJSON, "hasNextPage");
    if(!cJSON_IsBool(hasNextPage))
    {
    goto end; //Numeric
    }

    // pagination->hasPrevPage
    cJSON *hasPrevPage = cJSON_GetObjectItemCaseSensitive(paginationJSON, "hasPrevPage");
    if(!cJSON_IsBool(hasPrevPage))
    {
    goto end; //Numeric
    }

    // pagination->startCursor
    cJSON *startCursor = cJSON_GetObjectItemCaseSensitive(paginationJSON, "startCursor");
    if(!cJSON_IsString(startCursor) || (startCursor->valuestring == NULL)){
    goto end; //String
    }


    pagination = pagination_create (
        strdup(endCursor->valuestring),
        hasNextPage->valueint,
        hasPrevPage->valueint,
        strdup(startCursor->valuestring)
        );
 cJSON_Delete(paginationJSON);
    return pagination;
end:
    cJSON_Delete(paginationJSON);
    return NULL;

}


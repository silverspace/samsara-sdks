#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document_field_create_photo_value.h"



document_field_create_photo_value_t *document_field_create_photo_value_create(
    char *url
    ) {
	document_field_create_photo_value_t *document_field_create_photo_value = malloc(sizeof(document_field_create_photo_value_t));
	document_field_create_photo_value->url = url;

	return document_field_create_photo_value;
}


void document_field_create_photo_value_free(document_field_create_photo_value_t *document_field_create_photo_value) {
    listEntry_t *listEntry;
    free(document_field_create_photo_value->url);

	free(document_field_create_photo_value);
}

cJSON *document_field_create_photo_value_convertToJSON(document_field_create_photo_value_t *document_field_create_photo_value) {
	cJSON *item = cJSON_CreateObject();
	// document_field_create_photo_value->url
    if(cJSON_AddStringToObject(item, "url", document_field_create_photo_value->url) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

document_field_create_photo_value_t *document_field_create_photo_value_parseFromJSON(char *jsonString){

    document_field_create_photo_value_t *document_field_create_photo_value = NULL;
    cJSON *document_field_create_photo_valueJSON = cJSON_Parse(jsonString);
    if(document_field_create_photo_valueJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // document_field_create_photo_value->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(document_field_create_photo_valueJSON, "url");
    if(!cJSON_IsString(url) || (url->valuestring == NULL)){
    goto end; //String
    }


    document_field_create_photo_value = document_field_create_photo_value_create (
        strdup(url->valuestring)
        );
 cJSON_Delete(document_field_create_photo_valueJSON);
    return document_field_create_photo_value;
end:
    cJSON_Delete(document_field_create_photo_valueJSON);
    return NULL;

}


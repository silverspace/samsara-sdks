#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tag_metadata.h"



tag_metadata_t *tag_metadata_create(
    long id,
    char *name
    ) {
	tag_metadata_t *tag_metadata = malloc(sizeof(tag_metadata_t));
	tag_metadata->id = id;
	tag_metadata->name = name;

	return tag_metadata;
}


void tag_metadata_free(tag_metadata_t *tag_metadata) {
    listEntry_t *listEntry;
    free(tag_metadata->name);

	free(tag_metadata);
}

cJSON *tag_metadata_convertToJSON(tag_metadata_t *tag_metadata) {
	cJSON *item = cJSON_CreateObject();
	// tag_metadata->id
    if(cJSON_AddNumberToObject(item, "id", tag_metadata->id) == NULL) {
    goto fail; //Numeric
    }

	// tag_metadata->name
    if(cJSON_AddStringToObject(item, "name", tag_metadata->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tag_metadata_t *tag_metadata_parseFromJSON(char *jsonString){

    tag_metadata_t *tag_metadata = NULL;
    cJSON *tag_metadataJSON = cJSON_Parse(jsonString);
    if(tag_metadataJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tag_metadata->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tag_metadataJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // tag_metadata->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tag_metadataJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    tag_metadata = tag_metadata_create (
        id->valuedouble,
        strdup(name->valuestring)
        );
 cJSON_Delete(tag_metadataJSON);
    return tag_metadata;
end:
    cJSON_Delete(tag_metadataJSON);
    return NULL;

}


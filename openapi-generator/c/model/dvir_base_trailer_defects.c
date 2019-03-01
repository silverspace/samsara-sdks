#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dvir_base_trailer_defects.h"



dvir_base_trailer_defects_t *dvir_base_trailer_defects_create(
    char *comment,
    char *defectType
    ) {
	dvir_base_trailer_defects_t *dvir_base_trailer_defects = malloc(sizeof(dvir_base_trailer_defects_t));
	dvir_base_trailer_defects->comment = comment;
	dvir_base_trailer_defects->defectType = defectType;

	return dvir_base_trailer_defects;
}


void dvir_base_trailer_defects_free(dvir_base_trailer_defects_t *dvir_base_trailer_defects) {
    listEntry_t *listEntry;
    free(dvir_base_trailer_defects->comment);
    free(dvir_base_trailer_defects->defectType);

	free(dvir_base_trailer_defects);
}

cJSON *dvir_base_trailer_defects_convertToJSON(dvir_base_trailer_defects_t *dvir_base_trailer_defects) {
	cJSON *item = cJSON_CreateObject();
	// dvir_base_trailer_defects->comment
    if(cJSON_AddStringToObject(item, "comment", dvir_base_trailer_defects->comment) == NULL) {
    goto fail; //String
    }

	// dvir_base_trailer_defects->defectType
    if(cJSON_AddStringToObject(item, "defectType", dvir_base_trailer_defects->defectType) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dvir_base_trailer_defects_t *dvir_base_trailer_defects_parseFromJSON(char *jsonString){

    dvir_base_trailer_defects_t *dvir_base_trailer_defects = NULL;
    cJSON *dvir_base_trailer_defectsJSON = cJSON_Parse(jsonString);
    if(dvir_base_trailer_defectsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dvir_base_trailer_defects->comment
    cJSON *comment = cJSON_GetObjectItemCaseSensitive(dvir_base_trailer_defectsJSON, "comment");
    if(!cJSON_IsString(comment) || (comment->valuestring == NULL)){
    goto end; //String
    }

    // dvir_base_trailer_defects->defectType
    cJSON *defectType = cJSON_GetObjectItemCaseSensitive(dvir_base_trailer_defectsJSON, "defectType");
    if(!cJSON_IsString(defectType) || (defectType->valuestring == NULL)){
    goto end; //String
    }


    dvir_base_trailer_defects = dvir_base_trailer_defects_create (
        strdup(comment->valuestring),
        strdup(defectType->valuestring)
        );
 cJSON_Delete(dvir_base_trailer_defectsJSON);
    return dvir_base_trailer_defects;
end:
    cJSON_Delete(dvir_base_trailer_defectsJSON);
    return NULL;

}


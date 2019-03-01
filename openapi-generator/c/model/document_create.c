#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document_create.h"



document_create_t *document_create_create(
    long dispatchJobId,
    char *notes,
    char *documentTypeUuid,
    list_t *fields
    ) {
	document_create_t *document_create = malloc(sizeof(document_create_t));
	document_create->dispatchJobId = dispatchJobId;
	document_create->notes = notes;
	document_create->documentTypeUuid = documentTypeUuid;
	document_create->fields = fields;

	return document_create;
}


void document_create_free(document_create_t *document_create) {
    listEntry_t *listEntry;
    free(document_create->notes);
    free(document_create->documentTypeUuid);
		list_ForEach(listEntry, document_create->fields) {
		document_field_free(listEntry->data);
	}
	list_free(document_create->fields);

	free(document_create);
}

cJSON *document_create_convertToJSON(document_create_t *document_create) {
	cJSON *item = cJSON_CreateObject();
	// document_create->dispatchJobId
    if(cJSON_AddNumberToObject(item, "dispatchJobId", document_create->dispatchJobId) == NULL) {
    goto fail; //Numeric
    }

	// document_create->notes
    if(cJSON_AddStringToObject(item, "notes", document_create->notes) == NULL) {
    goto fail; //String
    }

	// document_create->documentTypeUuid
    if(cJSON_AddStringToObject(item, "documentTypeUuid", document_create->documentTypeUuid) == NULL) {
    goto fail; //String
    }

	// document_create->fields
    cJSON *fields = cJSON_AddArrayToObject(item, "fields");
	if(fields == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *fieldsListEntry;
	list_ForEach(fieldsListEntry, document_create->fields) {
		cJSON *item = document_field_convertToJSON(fieldsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(fields, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

document_create_t *document_create_parseFromJSON(char *jsonString){

    document_create_t *document_create = NULL;
    cJSON *document_createJSON = cJSON_Parse(jsonString);
    if(document_createJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // document_create->dispatchJobId
    cJSON *dispatchJobId = cJSON_GetObjectItemCaseSensitive(document_createJSON, "dispatchJobId");
    if(!cJSON_IsNumber(dispatchJobId))
    {
    goto end; //Numeric
    }

    // document_create->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(document_createJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // document_create->documentTypeUuid
    cJSON *documentTypeUuid = cJSON_GetObjectItemCaseSensitive(document_createJSON, "documentTypeUuid");
    if(!cJSON_IsString(documentTypeUuid) || (documentTypeUuid->valuestring == NULL)){
    goto end; //String
    }

    // document_create->fields
    cJSON *fields;
    cJSON *fieldsJSON = cJSON_GetObjectItemCaseSensitive(document_createJSON,"fields");
    if(!cJSON_IsArray(fieldsJSON)){
        goto end; //nonprimitive container
    }

    list_t *fieldsList = list_create();

    cJSON_ArrayForEach(fields,fieldsJSON )
    {
        if(!cJSON_IsObject(fields)){
            goto end;
        }
		char *JSONData = cJSON_Print(fields);
        document_field_t *fieldsItem = document_field_parseFromJSON(JSONData);

        list_addElement(fieldsList, fieldsItem);
        free(JSONData);
    }


    document_create = document_create_create (
        dispatchJobId->valuedouble,
        strdup(notes->valuestring),
        strdup(documentTypeUuid->valuestring),
        fieldsList
        );
 cJSON_Delete(document_createJSON);
    return document_create;
end:
    cJSON_Delete(document_createJSON);
    return NULL;

}


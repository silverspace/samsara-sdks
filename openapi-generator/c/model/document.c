#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document.h"



document_t *document_create(
    long dispatchJobId,
    char *notes,
    char *documentType,
    long driverCreatedAtMs,
    long driverId,
    list_t *fields,
    long vehicleId
    ) {
	document_t *document = malloc(sizeof(document_t));
	document->dispatchJobId = dispatchJobId;
	document->notes = notes;
	document->documentType = documentType;
	document->driverCreatedAtMs = driverCreatedAtMs;
	document->driverId = driverId;
	document->fields = fields;
	document->vehicleId = vehicleId;

	return document;
}


void document_free(document_t *document) {
    listEntry_t *listEntry;
    free(document->notes);
    free(document->documentType);
		list_ForEach(listEntry, document->fields) {
		document_field_free(listEntry->data);
	}
	list_free(document->fields);

	free(document);
}

cJSON *document_convertToJSON(document_t *document) {
	cJSON *item = cJSON_CreateObject();
	// document->dispatchJobId
    if(cJSON_AddNumberToObject(item, "dispatchJobId", document->dispatchJobId) == NULL) {
    goto fail; //Numeric
    }

	// document->notes
    if(cJSON_AddStringToObject(item, "notes", document->notes) == NULL) {
    goto fail; //String
    }

	// document->documentType
    if(cJSON_AddStringToObject(item, "documentType", document->documentType) == NULL) {
    goto fail; //String
    }

	// document->driverCreatedAtMs
    if(cJSON_AddNumberToObject(item, "driverCreatedAtMs", document->driverCreatedAtMs) == NULL) {
    goto fail; //Numeric
    }

	// document->driverId
    if(cJSON_AddNumberToObject(item, "driverId", document->driverId) == NULL) {
    goto fail; //Numeric
    }

	// document->fields
    cJSON *fields = cJSON_AddArrayToObject(item, "fields");
	if(fields == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *fieldsListEntry;
	list_ForEach(fieldsListEntry, document->fields) {
		cJSON *item = document_field_convertToJSON(fieldsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(fields, item);
	}

	// document->vehicleId
    if(cJSON_AddNumberToObject(item, "vehicleId", document->vehicleId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

document_t *document_parseFromJSON(char *jsonString){

    document_t *document = NULL;
    cJSON *documentJSON = cJSON_Parse(jsonString);
    if(documentJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // document->dispatchJobId
    cJSON *dispatchJobId = cJSON_GetObjectItemCaseSensitive(documentJSON, "dispatchJobId");
    if(!cJSON_IsNumber(dispatchJobId))
    {
    goto end; //Numeric
    }

    // document->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(documentJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // document->documentType
    cJSON *documentType = cJSON_GetObjectItemCaseSensitive(documentJSON, "documentType");
    if(!cJSON_IsString(documentType) || (documentType->valuestring == NULL)){
    goto end; //String
    }

    // document->driverCreatedAtMs
    cJSON *driverCreatedAtMs = cJSON_GetObjectItemCaseSensitive(documentJSON, "driverCreatedAtMs");
    if(!cJSON_IsNumber(driverCreatedAtMs))
    {
    goto end; //Numeric
    }

    // document->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(documentJSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // document->fields
    cJSON *fields;
    cJSON *fieldsJSON = cJSON_GetObjectItemCaseSensitive(documentJSON,"fields");
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

    // document->vehicleId
    cJSON *vehicleId = cJSON_GetObjectItemCaseSensitive(documentJSON, "vehicleId");
    if(!cJSON_IsNumber(vehicleId))
    {
    goto end; //Numeric
    }


    document = document_create (
        dispatchJobId->valuedouble,
        strdup(notes->valuestring),
        strdup(documentType->valuestring),
        driverCreatedAtMs->valuedouble,
        driverId->valuedouble,
        fieldsList,
        vehicleId->valuedouble
        );
 cJSON_Delete(documentJSON);
    return document;
end:
    cJSON_Delete(documentJSON);
    return NULL;

}


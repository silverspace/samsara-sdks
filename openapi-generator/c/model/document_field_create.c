#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document_field_create.h"



document_field_create_t *document_field_create_create(
    double numberValue,
    list_t *photoValue,
    char *stringValue,
    char *valueType
    ) {
	document_field_create_t *document_field_create = malloc(sizeof(document_field_create_t));
	document_field_create->numberValue = numberValue;
	document_field_create->photoValue = photoValue;
	document_field_create->stringValue = stringValue;
	document_field_create->valueType = valueType;

	return document_field_create;
}


void document_field_create_free(document_field_create_t *document_field_create) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, document_field_create->photoValue) {
		document_field_create_photo_value_free(listEntry->data);
	}
	list_free(document_field_create->photoValue);
    free(document_field_create->stringValue);
    free(document_field_create->valueType);

	free(document_field_create);
}

cJSON *document_field_create_convertToJSON(document_field_create_t *document_field_create) {
	cJSON *item = cJSON_CreateObject();
	// document_field_create->numberValue
    if(cJSON_AddNumberToObject(item, "numberValue", document_field_create->numberValue) == NULL) {
    goto fail; //Numeric
    }

	// document_field_create->photoValue
    cJSON *photoValue = cJSON_AddArrayToObject(item, "photoValue");
	if(photoValue == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *photoValueListEntry;
	list_ForEach(photoValueListEntry, document_field_create->photoValue) {
		cJSON *item = document_field_create_photo_value_convertToJSON(photoValueListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(photoValue, item);
	}

	// document_field_create->stringValue
    if(cJSON_AddStringToObject(item, "stringValue", document_field_create->stringValue) == NULL) {
    goto fail; //String
    }

	// document_field_create->valueType
    if(cJSON_AddStringToObject(item, "valueType", document_field_create->valueType) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

document_field_create_t *document_field_create_parseFromJSON(char *jsonString){

    document_field_create_t *document_field_create = NULL;
    cJSON *document_field_createJSON = cJSON_Parse(jsonString);
    if(document_field_createJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // document_field_create->numberValue
    cJSON *numberValue = cJSON_GetObjectItemCaseSensitive(document_field_createJSON, "numberValue");
    if(!cJSON_IsNumber(numberValue))
    {
    goto end; //Numeric
    }

    // document_field_create->photoValue
    cJSON *photoValue;
    cJSON *photoValueJSON = cJSON_GetObjectItemCaseSensitive(document_field_createJSON,"photoValue");
    if(!cJSON_IsArray(photoValueJSON)){
        goto end; //nonprimitive container
    }

    list_t *photoValueList = list_create();

    cJSON_ArrayForEach(photoValue,photoValueJSON )
    {
        if(!cJSON_IsObject(photoValue)){
            goto end;
        }
		char *JSONData = cJSON_Print(photoValue);
        document_field_create_photo_value_t *photoValueItem = document_field_create_photo_value_parseFromJSON(JSONData);

        list_addElement(photoValueList, photoValueItem);
        free(JSONData);
    }

    // document_field_create->stringValue
    cJSON *stringValue = cJSON_GetObjectItemCaseSensitive(document_field_createJSON, "stringValue");
    if(!cJSON_IsString(stringValue) || (stringValue->valuestring == NULL)){
    goto end; //String
    }

    // document_field_create->valueType
    cJSON *valueType = cJSON_GetObjectItemCaseSensitive(document_field_createJSON, "valueType");
    if(!cJSON_IsString(valueType) || (valueType->valuestring == NULL)){
    goto end; //String
    }


    document_field_create = document_field_create_create (
        numberValue->valuedouble,
        photoValueList,
        strdup(stringValue->valuestring),
        strdup(valueType->valuestring)
        );
 cJSON_Delete(document_field_createJSON);
    return document_field_create;
end:
    cJSON_Delete(document_field_createJSON);
    return NULL;

}


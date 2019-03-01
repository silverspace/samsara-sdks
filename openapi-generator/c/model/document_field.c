#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document_field.h"



document_field_t *document_field_create(
    double numberValue,
    list_t *photoValue,
    char *stringValue,
    char *valueType,
    char *label,
    object_t *value
    ) {
	document_field_t *document_field = malloc(sizeof(document_field_t));
	document_field->numberValue = numberValue;
	document_field->photoValue = photoValue;
	document_field->stringValue = stringValue;
	document_field->valueType = valueType;
	document_field->label = label;
	document_field->value = value;

	return document_field;
}


void document_field_free(document_field_t *document_field) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, document_field->photoValue) {
		document_field_create_photo_value_free(listEntry->data);
	}
	list_free(document_field->photoValue);
    free(document_field->stringValue);
    free(document_field->valueType);
    free(document_field->label);
	_free(document_field->value);

	free(document_field);
}

cJSON *document_field_convertToJSON(document_field_t *document_field) {
	cJSON *item = cJSON_CreateObject();
	// document_field->numberValue
    if(cJSON_AddNumberToObject(item, "numberValue", document_field->numberValue) == NULL) {
    goto fail; //Numeric
    }

	// document_field->photoValue
    cJSON *photoValue = cJSON_AddArrayToObject(item, "photoValue");
	if(photoValue == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *photoValueListEntry;
	list_ForEach(photoValueListEntry, document_field->photoValue) {
		cJSON *item = document_field_create_photo_value_convertToJSON(photoValueListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(photoValue, item);
	}

	// document_field->stringValue
    if(cJSON_AddStringToObject(item, "stringValue", document_field->stringValue) == NULL) {
    goto fail; //String
    }

	// document_field->valueType
    if(cJSON_AddStringToObject(item, "valueType", document_field->valueType) == NULL) {
    goto fail; //String
    }

	// document_field->label
    if(cJSON_AddStringToObject(item, "label", document_field->label) == NULL) {
    goto fail; //String
    }

	// document_field->value
	cJSON *value = _convertToJSON(document_field->value);
	if(value == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "value", value);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

document_field_t *document_field_parseFromJSON(char *jsonString){

    document_field_t *document_field = NULL;
    cJSON *document_fieldJSON = cJSON_Parse(jsonString);
    if(document_fieldJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // document_field->numberValue
    cJSON *numberValue = cJSON_GetObjectItemCaseSensitive(document_fieldJSON, "numberValue");
    if(!cJSON_IsNumber(numberValue))
    {
    goto end; //Numeric
    }

    // document_field->photoValue
    cJSON *photoValue;
    cJSON *photoValueJSON = cJSON_GetObjectItemCaseSensitive(document_fieldJSON,"photoValue");
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

    // document_field->stringValue
    cJSON *stringValue = cJSON_GetObjectItemCaseSensitive(document_fieldJSON, "stringValue");
    if(!cJSON_IsString(stringValue) || (stringValue->valuestring == NULL)){
    goto end; //String
    }

    // document_field->valueType
    cJSON *valueType = cJSON_GetObjectItemCaseSensitive(document_fieldJSON, "valueType");
    if(!cJSON_IsString(valueType) || (valueType->valuestring == NULL)){
    goto end; //String
    }

    // document_field->label
    cJSON *label = cJSON_GetObjectItemCaseSensitive(document_fieldJSON, "label");
    if(!cJSON_IsString(label) || (label->valuestring == NULL)){
    goto end; //String
    }

    // document_field->value
    _t *value;
    cJSON *valueJSON = cJSON_GetObjectItemCaseSensitive(document_fieldJSON, "value");
    if(document_fieldJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *valueJSONData = cJSON_Print(valueJSON);
    value = _parseFromJSON(valueJSONData);


    document_field = document_field_create (
        numberValue->valuedouble,
        photoValueList,
        strdup(stringValue->valuestring),
        strdup(valueType->valuestring),
        strdup(label->valuestring),
        value
        );
        free(valueJSONData);
 cJSON_Delete(document_fieldJSON);
    return document_field;
end:
    cJSON_Delete(document_fieldJSON);
    return NULL;

}


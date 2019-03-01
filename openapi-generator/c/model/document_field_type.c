#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document_field_type.h"



document_field_type_t *document_field_type_create(
    char *label,
    document_field_type_number_value_type_metadata_t *numberValueTypeMetadata,
    char *valueType
    ) {
	document_field_type_t *document_field_type = malloc(sizeof(document_field_type_t));
	document_field_type->label = label;
	document_field_type->numberValueTypeMetadata = numberValueTypeMetadata;
	document_field_type->valueType = valueType;

	return document_field_type;
}


void document_field_type_free(document_field_type_t *document_field_type) {
    listEntry_t *listEntry;
    free(document_field_type->label);
	document_field_type_number_value_type_metadata_free(document_field_type->numberValueTypeMetadata);
    free(document_field_type->valueType);

	free(document_field_type);
}

cJSON *document_field_type_convertToJSON(document_field_type_t *document_field_type) {
	cJSON *item = cJSON_CreateObject();
	// document_field_type->label
    if(cJSON_AddStringToObject(item, "label", document_field_type->label) == NULL) {
    goto fail; //String
    }

	// document_field_type->numberValueTypeMetadata
	cJSON *numberValueTypeMetadata = document_field_type_number_value_type_metadata_convertToJSON(document_field_type->numberValueTypeMetadata);
	if(numberValueTypeMetadata == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "numberValueTypeMetadata", numberValueTypeMetadata);
	if(item->child == NULL) {
		goto fail;
	}

	// document_field_type->valueType
    if(cJSON_AddStringToObject(item, "valueType", document_field_type->valueType) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

document_field_type_t *document_field_type_parseFromJSON(char *jsonString){

    document_field_type_t *document_field_type = NULL;
    cJSON *document_field_typeJSON = cJSON_Parse(jsonString);
    if(document_field_typeJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // document_field_type->label
    cJSON *label = cJSON_GetObjectItemCaseSensitive(document_field_typeJSON, "label");
    if(!cJSON_IsString(label) || (label->valuestring == NULL)){
    goto end; //String
    }

    // document_field_type->numberValueTypeMetadata
    document_field_type_number_value_type_metadata_t *numberValueTypeMetadata;
    cJSON *numberValueTypeMetadataJSON = cJSON_GetObjectItemCaseSensitive(document_field_typeJSON, "numberValueTypeMetadata");
    if(document_field_typeJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *numberValueTypeMetadataJSONData = cJSON_Print(numberValueTypeMetadataJSON);
    numberValueTypeMetadata = document_field_type_number_value_type_metadata_parseFromJSON(numberValueTypeMetadataJSONData);

    // document_field_type->valueType
    cJSON *valueType = cJSON_GetObjectItemCaseSensitive(document_field_typeJSON, "valueType");
    if(!cJSON_IsString(valueType) || (valueType->valuestring == NULL)){
    goto end; //String
    }


    document_field_type = document_field_type_create (
        strdup(label->valuestring),
        numberValueTypeMetadata,
        strdup(valueType->valuestring)
        );
        free(numberValueTypeMetadataJSONData);
 cJSON_Delete(document_field_typeJSON);
    return document_field_type;
end:
    cJSON_Delete(document_field_typeJSON);
    return NULL;

}


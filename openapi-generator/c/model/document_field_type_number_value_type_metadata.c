#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document_field_type_number_value_type_metadata.h"



document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata_create(
    long numDecimalPlaces
    ) {
	document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata = malloc(sizeof(document_field_type_number_value_type_metadata_t));
	document_field_type_number_value_type_metadata->numDecimalPlaces = numDecimalPlaces;

	return document_field_type_number_value_type_metadata;
}


void document_field_type_number_value_type_metadata_free(document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata) {
    listEntry_t *listEntry;

	free(document_field_type_number_value_type_metadata);
}

cJSON *document_field_type_number_value_type_metadata_convertToJSON(document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata) {
	cJSON *item = cJSON_CreateObject();
	// document_field_type_number_value_type_metadata->numDecimalPlaces
    if(cJSON_AddNumberToObject(item, "numDecimalPlaces", document_field_type_number_value_type_metadata->numDecimalPlaces) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata_parseFromJSON(char *jsonString){

    document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata = NULL;
    cJSON *document_field_type_number_value_type_metadataJSON = cJSON_Parse(jsonString);
    if(document_field_type_number_value_type_metadataJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // document_field_type_number_value_type_metadata->numDecimalPlaces
    cJSON *numDecimalPlaces = cJSON_GetObjectItemCaseSensitive(document_field_type_number_value_type_metadataJSON, "numDecimalPlaces");
    if(!cJSON_IsNumber(numDecimalPlaces))
    {
    goto end; //Numeric
    }


    document_field_type_number_value_type_metadata = document_field_type_number_value_type_metadata_create (
        numDecimalPlaces->valuedouble
        );
 cJSON_Delete(document_field_type_number_value_type_metadataJSON);
    return document_field_type_number_value_type_metadata;
end:
    cJSON_Delete(document_field_type_number_value_type_metadataJSON);
    return NULL;

}


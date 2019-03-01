/*
 * document_field_type_number_value_type_metadata.h
 *
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 */

#ifndef _document_field_type_number_value_type_metadata_H_
#define _document_field_type_number_value_type_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct document_field_type_number_value_type_metadata_t {
        long numDecimalPlaces; //numeric

} document_field_type_number_value_type_metadata_t;

document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata_create(
        long numDecimalPlaces
);

void document_field_type_number_value_type_metadata_free(document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata);

document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata_parseFromJSON(char *jsonString);

cJSON *document_field_type_number_value_type_metadata_convertToJSON(document_field_type_number_value_type_metadata_t *document_field_type_number_value_type_metadata);

#endif /* _document_field_type_number_value_type_metadata_H_ */


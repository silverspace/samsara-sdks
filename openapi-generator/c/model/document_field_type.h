/*
 * document_field_type.h
 *
 * 
 */

#ifndef _document_field_type_H_
#define _document_field_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "document_field_type_number_value_type_metadata.h"




typedef struct document_field_type_t {
        char *label; //no enum string
        document_field_type_number_value_type_metadata_t *numberValueTypeMetadata; //nonprimitive
        char *valueType; //no enum string

} document_field_type_t;

document_field_type_t *document_field_type_create(
        char *label,
        document_field_type_number_value_type_metadata_t *numberValueTypeMetadata,
        char *valueType
);

void document_field_type_free(document_field_type_t *document_field_type);

document_field_type_t *document_field_type_parseFromJSON(char *jsonString);

cJSON *document_field_type_convertToJSON(document_field_type_t *document_field_type);

#endif /* _document_field_type_H_ */


/*
 * document_field_create.h
 *
 * 
 */

#ifndef _document_field_create_H_
#define _document_field_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "document_field_create_photo_value.h"




typedef struct document_field_create_t {
        double numberValue; //numeric
        list_t *photoValue; //nonprimitive container
        char *stringValue; //no enum string
        char *valueType; //no enum string

} document_field_create_t;

document_field_create_t *document_field_create_create(
        double numberValue,
        list_t *photoValue,
        char *stringValue,
        char *valueType
);

void document_field_create_free(document_field_create_t *document_field_create);

document_field_create_t *document_field_create_parseFromJSON(char *jsonString);

cJSON *document_field_create_convertToJSON(document_field_create_t *document_field_create);

#endif /* _document_field_create_H_ */


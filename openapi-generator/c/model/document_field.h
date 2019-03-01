/*
 * document_field.h
 *
 * 
 */

#ifndef _document_field_H_
#define _document_field_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "document_field_create.h"
#include "document_field_create_photo_value.h"
#include "object.h"




typedef struct document_field_t {
        double numberValue; //numeric
        list_t *photoValue; //nonprimitive container
        char *stringValue; //no enum string
        char *valueType; //no enum string
        char *label; //no enum string
        object_t *value; //nonprimitive

} document_field_t;

document_field_t *document_field_create(
        double numberValue,
        list_t *photoValue,
        char *stringValue,
        char *valueType,
        char *label,
        object_t *value
);

void document_field_free(document_field_t *document_field);

document_field_t *document_field_parseFromJSON(char *jsonString);

cJSON *document_field_convertToJSON(document_field_t *document_field);

#endif /* _document_field_H_ */


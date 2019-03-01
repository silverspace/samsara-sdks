/*
 * document_type.h
 *
 * 
 */

#ifndef _document_type_H_
#define _document_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "document_field_type.h"




typedef struct document_type_t {
        list_t *fieldTypes; //primitive container
        char *name; //no enum string
        long orgId; //numeric
        char *uuid; //no enum string

} document_type_t;

document_type_t *document_type_create(
        list_t *fieldTypes,
        char *name,
        long orgId,
        char *uuid
);

void document_type_free(document_type_t *document_type);

document_type_t *document_type_parseFromJSON(char *jsonString);

cJSON *document_type_convertToJSON(document_type_t *document_type);

#endif /* _document_type_H_ */


/*
 * document_create.h
 *
 * 
 */

#ifndef _document_create_H_
#define _document_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "document_base.h"
#include "document_field.h"




typedef struct document_create_t {
        long dispatchJobId; //numeric
        char *notes; //no enum string
        char *documentTypeUuid; //no enum string
        list_t *fields; //nonprimitive container

} document_create_t;

document_create_t *document_create_create(
        long dispatchJobId,
        char *notes,
        char *documentTypeUuid,
        list_t *fields
);

void document_create_free(document_create_t *document_create);

document_create_t *document_create_parseFromJSON(char *jsonString);

cJSON *document_create_convertToJSON(document_create_t *document_create);

#endif /* _document_create_H_ */


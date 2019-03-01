/*
 * document_base.h
 *
 * 
 */

#ifndef _document_base_H_
#define _document_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct document_base_t {
        long dispatchJobId; //numeric
        char *notes; //no enum string

} document_base_t;

document_base_t *document_base_create(
        long dispatchJobId,
        char *notes
);

void document_base_free(document_base_t *document_base);

document_base_t *document_base_parseFromJSON(char *jsonString);

cJSON *document_base_convertToJSON(document_base_t *document_base);

#endif /* _document_base_H_ */


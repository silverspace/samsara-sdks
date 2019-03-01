/*
 * document.h
 *
 * 
 */

#ifndef _document_H_
#define _document_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "document_base.h"
#include "document_field.h"




typedef struct document_t {
        long dispatchJobId; //numeric
        char *notes; //no enum string
        char *documentType; //no enum string
        long driverCreatedAtMs; //numeric
        long driverId; //numeric
        list_t *fields; //nonprimitive container
        long vehicleId; //numeric

} document_t;

document_t *document_create(
        long dispatchJobId,
        char *notes,
        char *documentType,
        long driverCreatedAtMs,
        long driverId,
        list_t *fields,
        long vehicleId
);

void document_free(document_t *document);

document_t *document_parseFromJSON(char *jsonString);

cJSON *document_convertToJSON(document_t *document);

#endif /* _document_H_ */


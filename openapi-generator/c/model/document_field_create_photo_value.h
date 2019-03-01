/*
 * document_field_create_photo_value.h
 *
 * 
 */

#ifndef _document_field_create_photo_value_H_
#define _document_field_create_photo_value_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct document_field_create_photo_value_t {
        char *url; //no enum string

} document_field_create_photo_value_t;

document_field_create_photo_value_t *document_field_create_photo_value_create(
        char *url
);

void document_field_create_photo_value_free(document_field_create_photo_value_t *document_field_create_photo_value);

document_field_create_photo_value_t *document_field_create_photo_value_parseFromJSON(char *jsonString);

cJSON *document_field_create_photo_value_convertToJSON(document_field_create_photo_value_t *document_field_create_photo_value);

#endif /* _document_field_create_photo_value_H_ */


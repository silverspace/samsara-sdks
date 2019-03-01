/*
 * dvir_list_response.h
 *
 * 
 */

#ifndef _dvir_list_response_H_
#define _dvir_list_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dvir_base.h"




typedef struct dvir_list_response_t {
        list_t *dvirs; //nonprimitive container

} dvir_list_response_t;

dvir_list_response_t *dvir_list_response_create(
        list_t *dvirs
);

void dvir_list_response_free(dvir_list_response_t *dvir_list_response);

dvir_list_response_t *dvir_list_response_parseFromJSON(char *jsonString);

cJSON *dvir_list_response_convertToJSON(dvir_list_response_t *dvir_list_response);

#endif /* _dvir_list_response_H_ */


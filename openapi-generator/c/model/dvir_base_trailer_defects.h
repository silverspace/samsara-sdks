/*
 * dvir_base_trailer_defects.h
 *
 * 
 */

#ifndef _dvir_base_trailer_defects_H_
#define _dvir_base_trailer_defects_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct dvir_base_trailer_defects_t {
        char *comment; //no enum string
        char *defectType; //no enum string

} dvir_base_trailer_defects_t;

dvir_base_trailer_defects_t *dvir_base_trailer_defects_create(
        char *comment,
        char *defectType
);

void dvir_base_trailer_defects_free(dvir_base_trailer_defects_t *dvir_base_trailer_defects);

dvir_base_trailer_defects_t *dvir_base_trailer_defects_parseFromJSON(char *jsonString);

cJSON *dvir_base_trailer_defects_convertToJSON(dvir_base_trailer_defects_t *dvir_base_trailer_defects);

#endif /* _dvir_base_trailer_defects_H_ */


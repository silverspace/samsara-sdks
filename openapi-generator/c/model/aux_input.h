/*
 * aux_input.h
 *
 * Digital value of an aux input.
 */

#ifndef _aux_input_H_
#define _aux_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "object.h"

typedef int bool;
#define true 1
#define false 0



typedef struct aux_input_t {
        object_t *timeMs; //nonprimitive
        bool value; //boolean

} aux_input_t;

aux_input_t *aux_input_create(
        object_t *timeMs,
        bool value
);

void aux_input_free(aux_input_t *aux_input);

aux_input_t *aux_input_parseFromJSON(char *jsonString);

cJSON *aux_input_convertToJSON(aux_input_t *aux_input);

#endif /* _aux_input_H_ */


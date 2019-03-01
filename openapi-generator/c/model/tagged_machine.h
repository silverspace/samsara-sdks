/*
 * tagged_machine.h
 *
 * 
 */

#ifndef _tagged_machine_H_
#define _tagged_machine_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_machine_base.h"




typedef struct tagged_machine_t {
        long id; //numeric
        char *name; //no enum string

} tagged_machine_t;

tagged_machine_t *tagged_machine_create(
        long id,
        char *name
);

void tagged_machine_free(tagged_machine_t *tagged_machine);

tagged_machine_t *tagged_machine_parseFromJSON(char *jsonString);

cJSON *tagged_machine_convertToJSON(tagged_machine_t *tagged_machine);

#endif /* _tagged_machine_H_ */


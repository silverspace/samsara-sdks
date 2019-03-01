/*
 * tagged_machine_base.h
 *
 * 
 */

#ifndef _tagged_machine_base_H_
#define _tagged_machine_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct tagged_machine_base_t {
        long id; //numeric

} tagged_machine_base_t;

tagged_machine_base_t *tagged_machine_base_create(
        long id
);

void tagged_machine_base_free(tagged_machine_base_t *tagged_machine_base);

tagged_machine_base_t *tagged_machine_base_parseFromJSON(char *jsonString);

cJSON *tagged_machine_base_convertToJSON(tagged_machine_base_t *tagged_machine_base);

#endif /* _tagged_machine_base_H_ */


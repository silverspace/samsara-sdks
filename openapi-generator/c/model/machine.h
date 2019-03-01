/*
 * machine.h
 *
 * Contains information about a machine.
 */

#ifndef _machine_H_
#define _machine_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct machine_t {
        long id; //numeric
        char *name; //no enum string
        char *notes; //no enum string

} machine_t;

machine_t *machine_create(
        long id,
        char *name,
        char *notes
);

void machine_free(machine_t *machine);

machine_t *machine_parseFromJSON(char *jsonString);

cJSON *machine_convertToJSON(machine_t *machine);

#endif /* _machine_H_ */


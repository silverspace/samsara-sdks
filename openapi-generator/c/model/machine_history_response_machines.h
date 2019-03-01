/*
 * machine_history_response_machines.h
 *
 * 
 */

#ifndef _machine_history_response_machines_H_
#define _machine_history_response_machines_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "machine_history_response_vibrations.h"




typedef struct machine_history_response_machines_t {
        char *name; //no enum string
        int id; //numeric
        list_t *vibrations; //nonprimitive container

} machine_history_response_machines_t;

machine_history_response_machines_t *machine_history_response_machines_create(
        char *name,
        int id,
        list_t *vibrations
);

void machine_history_response_machines_free(machine_history_response_machines_t *machine_history_response_machines);

machine_history_response_machines_t *machine_history_response_machines_parseFromJSON(char *jsonString);

cJSON *machine_history_response_machines_convertToJSON(machine_history_response_machines_t *machine_history_response_machines);

#endif /* _machine_history_response_machines_H_ */


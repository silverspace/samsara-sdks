/*
 * machine_history_response.h
 *
 * Contains the results for a machine history request
 */

#ifndef _machine_history_response_H_
#define _machine_history_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "machine_history_response_machines.h"




typedef struct machine_history_response_t {
        list_t *machines; //nonprimitive container

} machine_history_response_t;

machine_history_response_t *machine_history_response_create(
        list_t *machines
);

void machine_history_response_free(machine_history_response_t *machine_history_response);

machine_history_response_t *machine_history_response_parseFromJSON(char *jsonString);

cJSON *machine_history_response_convertToJSON(machine_history_response_t *machine_history_response);

#endif /* _machine_history_response_H_ */


/*
 * machine_history_response_vibrations.h
 *
 * 
 */

#ifndef _machine_history_response_vibrations_H_
#define _machine_history_response_vibrations_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct machine_history_response_vibrations_t {
        double X; //numeric
        double Y; //numeric
        double Z; //numeric
        long time; //numeric

} machine_history_response_vibrations_t;

machine_history_response_vibrations_t *machine_history_response_vibrations_create(
        double X,
        double Y,
        double Z,
        long time
);

void machine_history_response_vibrations_free(machine_history_response_vibrations_t *machine_history_response_vibrations);

machine_history_response_vibrations_t *machine_history_response_vibrations_parseFromJSON(char *jsonString);

cJSON *machine_history_response_vibrations_convertToJSON(machine_history_response_vibrations_t *machine_history_response_vibrations);

#endif /* _machine_history_response_vibrations_H_ */


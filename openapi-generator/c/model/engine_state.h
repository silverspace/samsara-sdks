/*
 * engine_state.h
 *
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 */

#ifndef _engine_state_H_
#define _engine_state_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "object.h"


typedef enum  {  Running, Off, Idle } value_e;

char* valueengine_state_ToString(value_e value);

value_e valueengine_state_FromString(char* value);

typedef struct engine_state_t {
        object_t *timeMs; //nonprimitive
        value_e value; //enum string

} engine_state_t;

engine_state_t *engine_state_create(
        object_t *timeMs,
        value_e value
);

void engine_state_free(engine_state_t *engine_state);

engine_state_t *engine_state_parseFromJSON(char *jsonString);

cJSON *engine_state_convertToJSON(engine_state_t *engine_state);

#endif /* _engine_state_H_ */


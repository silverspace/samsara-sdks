/*
 * aux_input_series.h
 *
 * A list of aux input values over a timerange.
 */

#ifndef _aux_input_series_H_
#define _aux_input_series_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "aux_input.h"


typedef enum  {  Emergency Lights, Emergency Alarm, Stop Paddle, Power Take-Off, Plow, Sweeper, Salter, Boom } name_e;

char* nameaux_input_series_ToString(name_e name);

name_e nameaux_input_series_FromString(char* name);

typedef struct aux_input_series_t {
        name_e name; //enum string
        list_t *values; //nonprimitive container

} aux_input_series_t;

aux_input_series_t *aux_input_series_create(
        name_e name,
        list_t *values
);

void aux_input_series_free(aux_input_series_t *aux_input_series);

aux_input_series_t *aux_input_series_parseFromJSON(char *jsonString);

cJSON *aux_input_series_convertToJSON(aux_input_series_t *aux_input_series);

#endif /* _aux_input_series_H_ */


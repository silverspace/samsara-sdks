/*
 * inline_object_21.h
 *
 * 
 */

#ifndef _inline_object_21_H_
#define _inline_object_21_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "_sensors_history_series.h"


typedef enum  {  withNull, withPrevious } fillMissing_e;

char* fillMissinginline_object_21_ToString(fillMissing_e fillMissing);

fillMissing_e fillMissinginline_object_21_FromString(char* fillMissing);

typedef struct inline_object_21_t {
        int endMs; //numeric
        fillMissing_e fillMissing; //enum string
        long groupId; //numeric
        list_t *series; //nonprimitive container
        int startMs; //numeric
        int stepMs; //numeric

} inline_object_21_t;

inline_object_21_t *inline_object_21_create(
        int endMs,
        fillMissing_e fillMissing,
        long groupId,
        list_t *series,
        int startMs,
        int stepMs
);

void inline_object_21_free(inline_object_21_t *inline_object_21);

inline_object_21_t *inline_object_21_parseFromJSON(char *jsonString);

cJSON *inline_object_21_convertToJSON(inline_object_21_t *inline_object_21);

#endif /* _inline_object_21_H_ */


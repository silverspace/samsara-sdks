/*
 * inline_object_12.h
 *
 * 
 */

#ifndef _inline_object_12_H_
#define _inline_object_12_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0

typedef enum  {  mechanic } inspectionType_e;
typedef enum  {  safe, unsafe } safe_e;

char* inspectionTypeinline_object_12_ToString(inspectionType_e inspectionType);

inspectionType_e inspectionTypeinline_object_12_FromString(char* inspectionType);
char* safeinline_object_12_ToString(safe_e safe);

safe_e safeinline_object_12_FromString(char* safe);

typedef struct inline_object_12_t {
        inspectionType_e inspectionType; //enum string
        char *mechanicNotes; //no enum string
        int odometerMiles; //numeric
        bool previousDefectsCorrected; //boolean
        bool previousDefectsIgnored; //boolean
        safe_e safe; //enum string
        int trailerId; //numeric
        char *userEmail; //no enum string
        int vehicleId; //numeric

} inline_object_12_t;

inline_object_12_t *inline_object_12_create(
        inspectionType_e inspectionType,
        char *mechanicNotes,
        int odometerMiles,
        bool previousDefectsCorrected,
        bool previousDefectsIgnored,
        safe_e safe,
        int trailerId,
        char *userEmail,
        int vehicleId
);

void inline_object_12_free(inline_object_12_t *inline_object_12);

inline_object_12_t *inline_object_12_parseFromJSON(char *jsonString);

cJSON *inline_object_12_convertToJSON(inline_object_12_t *inline_object_12);

#endif /* _inline_object_12_H_ */


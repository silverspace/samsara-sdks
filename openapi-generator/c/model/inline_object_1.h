/*
 * inline_object_1.h
 *
 * 
 */

#ifndef _inline_object_1_H_
#define _inline_object_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "address_geofence.h"




typedef struct inline_object_1_t {
        list_t *contactIds; //primitive container
        char *formattedAddress; //no enum string
        address_geofence_t *geofence; //nonprimitive
        char *name; //no enum string
        char *notes; //no enum string
        list_t *tagIds; //primitive container

} inline_object_1_t;

inline_object_1_t *inline_object_1_create(
        list_t *contactIds,
        char *formattedAddress,
        address_geofence_t *geofence,
        char *name,
        char *notes,
        list_t *tagIds
);

void inline_object_1_free(inline_object_1_t *inline_object_1);

inline_object_1_t *inline_object_1_parseFromJSON(char *jsonString);

cJSON *inline_object_1_convertToJSON(inline_object_1_t *inline_object_1);

#endif /* _inline_object_1_H_ */


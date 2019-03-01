/*
 * _addresses_addresses.h
 *
 * 
 */

#ifndef __addresses_addresses_H_
#define __addresses_addresses_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "address_geofence.h"




typedef struct _addresses_addresses_t {
        char *notes; //no enum string
        char *formattedAddress; //no enum string
        address_geofence_t *geofence; //nonprimitive
        list_t *tagIds; //primitive container
        char *name; //no enum string
        list_t *contactIds; //primitive container

} _addresses_addresses_t;

_addresses_addresses_t *_addresses_addresses_create(
        char *notes,
        char *formattedAddress,
        address_geofence_t *geofence,
        list_t *tagIds,
        char *name,
        list_t *contactIds
);

void _addresses_addresses_free(_addresses_addresses_t *_addresses_addresses);

_addresses_addresses_t *_addresses_addresses_parseFromJSON(char *jsonString);

cJSON *_addresses_addresses_convertToJSON(_addresses_addresses_t *_addresses_addresses);

#endif /* __addresses_addresses_H_ */


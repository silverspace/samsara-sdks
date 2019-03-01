/*
 * address.h
 *
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 */

#ifndef _address_H_
#define _address_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "address_geofence.h"
#include "contact.h"
#include "tag_metadata.h"




typedef struct address_t {
        list_t *contacts; //nonprimitive container
        char *formattedAddress; //no enum string
        address_geofence_t *geofence; //nonprimitive
        long id; //numeric
        char *name; //no enum string
        char *notes; //no enum string
        list_t *tags; //nonprimitive container

} address_t;

address_t *address_create(
        list_t *contacts,
        char *formattedAddress,
        address_geofence_t *geofence,
        long id,
        char *name,
        char *notes,
        list_t *tags
);

void address_free(address_t *address);

address_t *address_parseFromJSON(char *jsonString);

cJSON *address_convertToJSON(address_t *address);

#endif /* _address_H_ */


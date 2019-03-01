/*
 * tag.h
 *
 * 
 */

#ifndef _tag_H_
#define _tag_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_address.h"
#include "tagged_asset.h"
#include "tagged_driver.h"
#include "tagged_machine.h"
#include "tagged_sensor.h"
#include "tagged_vehicle.h"




typedef struct tag_t {
        list_t *addresses; //nonprimitive container
        list_t *assets; //nonprimitive container
        list_t *drivers; //nonprimitive container
        long groupId; //numeric
        long id; //numeric
        list_t *machines; //nonprimitive container
        char *name; //no enum string
        long parentTagId; //numeric
        list_t *sensors; //nonprimitive container
        list_t *vehicles; //nonprimitive container

} tag_t;

tag_t *tag_create(
        list_t *addresses,
        list_t *assets,
        list_t *drivers,
        long groupId,
        long id,
        list_t *machines,
        char *name,
        long parentTagId,
        list_t *sensors,
        list_t *vehicles
);

void tag_free(tag_t *tag);

tag_t *tag_parseFromJSON(char *jsonString);

cJSON *tag_convertToJSON(tag_t *tag);

#endif /* _tag_H_ */


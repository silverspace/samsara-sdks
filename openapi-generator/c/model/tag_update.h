/*
 * tag_update.h
 *
 * 
 */

#ifndef _tag_update_H_
#define _tag_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_asset_base.h"
#include "tagged_driver_base.h"
#include "tagged_machine_base.h"
#include "tagged_sensor_base.h"
#include "tagged_vehicle_base.h"




typedef struct tag_update_t {
        list_t *assets; //nonprimitive container
        list_t *drivers; //nonprimitive container
        list_t *machines; //nonprimitive container
        char *name; //no enum string
        long parentTagId; //numeric
        list_t *sensors; //nonprimitive container
        list_t *vehicles; //nonprimitive container

} tag_update_t;

tag_update_t *tag_update_create(
        list_t *assets,
        list_t *drivers,
        list_t *machines,
        char *name,
        long parentTagId,
        list_t *sensors,
        list_t *vehicles
);

void tag_update_free(tag_update_t *tag_update);

tag_update_t *tag_update_parseFromJSON(char *jsonString);

cJSON *tag_update_convertToJSON(tag_update_t *tag_update);

#endif /* _tag_update_H_ */


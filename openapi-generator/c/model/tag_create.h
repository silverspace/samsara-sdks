/*
 * tag_create.h
 *
 * 
 */

#ifndef _tag_create_H_
#define _tag_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_asset_base.h"
#include "tagged_driver_base.h"
#include "tagged_machine_base.h"
#include "tagged_sensor_base.h"
#include "tagged_vehicle_base.h"




typedef struct tag_create_t {
        list_t *assets; //nonprimitive container
        list_t *drivers; //nonprimitive container
        list_t *machines; //nonprimitive container
        char *name; //no enum string
        long parentTagId; //numeric
        list_t *sensors; //nonprimitive container
        list_t *vehicles; //nonprimitive container

} tag_create_t;

tag_create_t *tag_create_create(
        list_t *assets,
        list_t *drivers,
        list_t *machines,
        char *name,
        long parentTagId,
        list_t *sensors,
        list_t *vehicles
);

void tag_create_free(tag_create_t *tag_create);

tag_create_t *tag_create_parseFromJSON(char *jsonString);

cJSON *tag_create_convertToJSON(tag_create_t *tag_create);

#endif /* _tag_create_H_ */


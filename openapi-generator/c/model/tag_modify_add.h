/*
 * tag_modify_add.h
 *
 * Specify devices, etc. that should be added to the tag.
 */

#ifndef _tag_modify_add_H_
#define _tag_modify_add_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_asset_base.h"
#include "tagged_driver_base.h"
#include "tagged_machine_base.h"
#include "tagged_sensor_base.h"
#include "tagged_vehicle_base.h"




typedef struct tag_modify_add_t {
        list_t *assets; //nonprimitive container
        list_t *sensors; //nonprimitive container
        list_t *vehicles; //nonprimitive container
        list_t *machines; //nonprimitive container
        list_t *drivers; //nonprimitive container

} tag_modify_add_t;

tag_modify_add_t *tag_modify_add_create(
        list_t *assets,
        list_t *sensors,
        list_t *vehicles,
        list_t *machines,
        list_t *drivers
);

void tag_modify_add_free(tag_modify_add_t *tag_modify_add);

tag_modify_add_t *tag_modify_add_parseFromJSON(char *jsonString);

cJSON *tag_modify_add_convertToJSON(tag_modify_add_t *tag_modify_add);

#endif /* _tag_modify_add_H_ */


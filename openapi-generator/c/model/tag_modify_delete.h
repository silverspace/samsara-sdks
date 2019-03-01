/*
 * tag_modify_delete.h
 *
 * Specify devices, etc. that should be removed from the tag.
 */

#ifndef _tag_modify_delete_H_
#define _tag_modify_delete_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tagged_asset_base.h"
#include "tagged_driver_base.h"
#include "tagged_machine_base.h"
#include "tagged_sensor_base.h"
#include "tagged_vehicle_base.h"




typedef struct tag_modify_delete_t {
        list_t *assets; //nonprimitive container
        list_t *sensors; //nonprimitive container
        list_t *vehicles; //nonprimitive container
        list_t *machines; //nonprimitive container
        list_t *drivers; //nonprimitive container

} tag_modify_delete_t;

tag_modify_delete_t *tag_modify_delete_create(
        list_t *assets,
        list_t *sensors,
        list_t *vehicles,
        list_t *machines,
        list_t *drivers
);

void tag_modify_delete_free(tag_modify_delete_t *tag_modify_delete);

tag_modify_delete_t *tag_modify_delete_parseFromJSON(char *jsonString);

cJSON *tag_modify_delete_convertToJSON(tag_modify_delete_t *tag_modify_delete);

#endif /* _tag_modify_delete_H_ */


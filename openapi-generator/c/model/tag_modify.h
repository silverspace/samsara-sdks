/*
 * tag_modify.h
 *
 * 
 */

#ifndef _tag_modify_H_
#define _tag_modify_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "tag_modify_add.h"
#include "tag_modify_delete.h"




typedef struct tag_modify_t {
        tag_modify_add_t *add; //nonprimitive
        tag_modify_delete_t *delete; //nonprimitive
        char *name; //no enum string
        long parentTagId; //numeric

} tag_modify_t;

tag_modify_t *tag_modify_create(
        tag_modify_add_t *add,
        tag_modify_delete_t *delete,
        char *name,
        long parentTagId
);

void tag_modify_free(tag_modify_t *tag_modify);

tag_modify_t *tag_modify_parseFromJSON(char *jsonString);

cJSON *tag_modify_convertToJSON(tag_modify_t *tag_modify);

#endif /* _tag_modify_H_ */


/*
 * user_tag_role.h
 *
 * 
 */

#ifndef _user_tag_role_H_
#define _user_tag_role_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "user_tag_role_tag.h"




typedef struct user_tag_role_t {
        char *role; //no enum string
        char *roleId; //no enum string
        user_tag_role_tag_t *tag; //nonprimitive

} user_tag_role_t;

user_tag_role_t *user_tag_role_create(
        char *role,
        char *roleId,
        user_tag_role_tag_t *tag
);

void user_tag_role_free(user_tag_role_t *user_tag_role);

user_tag_role_t *user_tag_role_parseFromJSON(char *jsonString);

cJSON *user_tag_role_convertToJSON(user_tag_role_t *user_tag_role);

#endif /* _user_tag_role_H_ */


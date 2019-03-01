/*
 * user_tag_role_tag.h
 *
 * 
 */

#ifndef _user_tag_role_tag_H_
#define _user_tag_role_tag_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct user_tag_role_tag_t {
        long parentTagId; //numeric
        char *name; //no enum string
        long id; //numeric

} user_tag_role_tag_t;

user_tag_role_tag_t *user_tag_role_tag_create(
        long parentTagId,
        char *name,
        long id
);

void user_tag_role_tag_free(user_tag_role_tag_t *user_tag_role_tag);

user_tag_role_tag_t *user_tag_role_tag_parseFromJSON(char *jsonString);

cJSON *user_tag_role_tag_convertToJSON(user_tag_role_tag_t *user_tag_role_tag);

#endif /* _user_tag_role_tag_H_ */


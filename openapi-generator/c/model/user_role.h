/*
 * user_role.h
 *
 * 
 */

#ifndef _user_role_H_
#define _user_role_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct user_role_t {
        char *id; //no enum string
        char *name; //no enum string

} user_role_t;

user_role_t *user_role_create(
        char *id,
        char *name
);

void user_role_free(user_role_t *user_role);

user_role_t *user_role_parseFromJSON(char *jsonString);

cJSON *user_role_convertToJSON(user_role_t *user_role);

#endif /* _user_role_H_ */


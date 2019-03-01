/*
 * user.h
 *
 * 
 */

#ifndef _user_H_
#define _user_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "user_base.h"
#include "user_tag_role.h"


typedef enum  {  default, saml } authType_e;

char* authTypeuser_ToString(authType_e authType);

authType_e authTypeuser_FromString(char* authType);

typedef struct user_t {
        authType_e authType; //enum string
        char *email; //no enum string
        char *name; //no enum string
        char *organizationRoleId; //no enum string
        long id; //numeric
        char *organizationRole; //no enum string
        list_t *tagRoles; //nonprimitive container

} user_t;

user_t *user_create(
        authType_e authType,
        char *email,
        char *name,
        char *organizationRoleId,
        long id,
        char *organizationRole,
        list_t *tagRoles
);

void user_free(user_t *user);

user_t *user_parseFromJSON(char *jsonString);

cJSON *user_convertToJSON(user_t *user);

#endif /* _user_H_ */


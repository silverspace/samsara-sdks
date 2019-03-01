/*
 * user_base.h
 *
 * 
 */

#ifndef _user_base_H_
#define _user_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"


typedef enum  {  default, saml } authType_e;

char* authTypeuser_base_ToString(authType_e authType);

authType_e authTypeuser_base_FromString(char* authType);

typedef struct user_base_t {
        authType_e authType; //enum string
        char *email; //no enum string
        char *name; //no enum string
        char *organizationRoleId; //no enum string

} user_base_t;

user_base_t *user_base_create(
        authType_e authType,
        char *email,
        char *name,
        char *organizationRoleId
);

void user_base_free(user_base_t *user_base);

user_base_t *user_base_parseFromJSON(char *jsonString);

cJSON *user_base_convertToJSON(user_base_t *user_base);

#endif /* _user_base_H_ */


#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/user.h"
#include "../model/user_role.h"


// /users/{userId:[0-9]+}
//
// Remove a user from the organization.
//
void
UsersAPI_deleteUserById(apiClient_t *apiClient,char* access_token ,long userId );



// /users/{userId:[0-9]+}
//
// Get a user.
//
user_t*
UsersAPI_getUserById(apiClient_t *apiClient,char* access_token ,long userId );



// /user_roles
//
// Get all roles in the organization.
//
list_t*
UsersAPI_listUserRoles(apiClient_t *apiClient,char* access_token );



// /users
//
// List all users in the organization.
//
list_t*
UsersAPI_listUsers(apiClient_t *apiClient,char* access_token );




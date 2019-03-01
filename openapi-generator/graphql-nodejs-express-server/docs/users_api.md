# users_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteUserById**](users_api.md#DeleteUserById) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**GetUserById**](users_api.md#GetUserById) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**ListUserRoles**](users_api.md#ListUserRoles) | **GET** /user_roles | /user_roles
[**ListUsers**](users_api.md#ListUsers) | **GET** /users | /users


<a name="DeleteUserById"></a>
# **DeleteUserById**
> DeleteUserById(accessToken, userId)

/users/{userId:[0-9]+}

Remove a user from the organization.
<a name="GetUserById"></a>
# **GetUserById**
> User GetUserById(accessToken, userId)

/users/{userId:[0-9]+}

Get a user.
<a name="ListUserRoles"></a>
# **ListUserRoles**
> UserRole ListUserRoles(accessToken)

/user_roles

Get all roles in the organization.
<a name="ListUsers"></a>
# **ListUsers**
> User ListUsers(accessToken)

/users

List all users in the organization.

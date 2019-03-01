# UsersApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteUserById**](UsersApi.md#DeleteUserById) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**GetUserById**](UsersApi.md#GetUserById) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**ListUserRoles**](UsersApi.md#ListUserRoles) | **GET** /user_roles | /user_roles
[**ListUsers**](UsersApi.md#ListUsers) | **GET** /users | /users


# **DeleteUserById**
> DeleteUserById(access.token, user.id)

/users/{userId:[0-9]+}

Remove a user from the organization.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.user.id <- 56 # integer | ID of the user.

#/users/{userId:[0-9]+}
api.instance <- UsersApi$new()
api.instance$DeleteUserById(var.access.token, var.user.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **user.id** | **integer**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetUserById**
> User GetUserById(access.token, user.id)

/users/{userId:[0-9]+}

Get a user.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.user.id <- 56 # integer | ID of the user.

#/users/{userId:[0-9]+}
api.instance <- UsersApi$new()
result <- api.instance$GetUserById(var.access.token, var.user.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **user.id** | **integer**| ID of the user. | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **ListUserRoles**
> UserRole ListUserRoles(access.token)

/user_roles

Get all roles in the organization.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.

#/user_roles
api.instance <- UsersApi$new()
result <- api.instance$ListUserRoles(var.access.token)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 

### Return type

[**UserRole**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **ListUsers**
> User ListUsers(access.token)

/users

List all users in the organization.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.

#/users
api.instance <- UsersApi$new()
result <- api.instance$ListUsers(var.access.token)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




# users_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**deleteUserById**](users_api.md#deleteUserById) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
**getUserById**](users_api.md#getUserById) | **GET** /users/{userId} | /users/{userId:[0-9]+}
**listUserRoles**](users_api.md#listUserRoles) | **GET** /user_roles | /user_roles
**list_users**](users_api.md#list_users) | **GET** /users | /users


# **deleteUserById**
> deleteUserById(access_token, user_id)
/users/{userId:[0-9]+}

Remove a user from the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **user_id** | **i64**| ID of the user. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserById**
> models::User getUserById(access_token, user_id)
/users/{userId:[0-9]+}

Get a user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **user_id** | **i64**| ID of the user. | 

### Return type

[**models::User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listUserRoles**
> Vec<models::UserRole> listUserRoles(access_token)
/user_roles

Get all roles in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 

### Return type

[**Vec<models::UserRole>**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_users**
> Vec<models::User> list_users(access_token)
/users

List all users in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 

### Return type

[**Vec<models::User>**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


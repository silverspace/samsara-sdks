# \UsersApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteUserById**](UsersApi.md#DeleteUserById) | **Delete** /users/{userId} | /users/{userId:[0-9]+}
[**GetUserById**](UsersApi.md#GetUserById) | **Get** /users/{userId} | /users/{userId:[0-9]+}
[**ListUserRoles**](UsersApi.md#ListUserRoles) | **Get** /user_roles | /user_roles
[**ListUsers**](UsersApi.md#ListUsers) | **Get** /users | /users


# **DeleteUserById**
> DeleteUserById(ctx, accessToken, userId)
/users/{userId:[0-9]+}

Remove a user from the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **userId** | **int64**| ID of the user. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetUserById**
> User GetUserById(ctx, accessToken, userId)
/users/{userId:[0-9]+}

Get a user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **userId** | **int64**| ID of the user. | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListUserRoles**
> []UserRole ListUserRoles(ctx, accessToken)
/user_roles

Get all roles in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 

### Return type

[**[]UserRole**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListUsers**
> []User ListUsers(ctx, accessToken)
/users

List all users in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 

### Return type

[**[]User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


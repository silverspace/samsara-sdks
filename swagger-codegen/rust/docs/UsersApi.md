# \UsersApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_user_by_id**](UsersApi.md#delete_user_by_id) | **Delete** /users/{userId} | /users/{userId:[0-9]+}
[**get_user_by_id**](UsersApi.md#get_user_by_id) | **Get** /users/{userId} | /users/{userId:[0-9]+}
[**list_user_roles**](UsersApi.md#list_user_roles) | **Get** /user_roles | /user_roles
[**list_users**](UsersApi.md#list_users) | **Get** /users | /users


# **delete_user_by_id**
> delete_user_by_id(access_token, user_id)
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_by_id**
> ::models::User get_user_by_id(access_token, user_id)
/users/{userId:[0-9]+}

Get a user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **user_id** | **i64**| ID of the user. | 

### Return type

[**::models::User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_user_roles**
> Vec<::models::UserRole> list_user_roles(access_token)
/user_roles

Get all roles in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 

### Return type

[**Vec<::models::UserRole>**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_users**
> Vec<::models::User> list_users(access_token)
/users

List all users in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 

### Return type

[**Vec<::models::User>**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# USERS_API

All URIs are relative to *https://api.samsara.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**delete_user_by_id**](USERS_API.md#delete_user_by_id) | **Delete** /users/{userId} | /users/{userId:[0-9]+}
[**list_user_roles**](USERS_API.md#list_user_roles) | **Get** /user_roles | /user_roles
[**list_users**](USERS_API.md#list_users) | **Get** /users | /users
[**user_by_id**](USERS_API.md#user_by_id) | **Get** /users/{userId} | /users/{userId:[0-9]+}


# **delete_user_by_id**
> delete_user_by_id (access_token: STRING_32 ; user_id: INTEGER_64 )
	

/users/{userId:[0-9]+}

Remove a user from the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **user_id** | **INTEGER_64**| ID of the user. | [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_user_roles**
> list_user_roles (access_token: STRING_32 ): detachable LIST [USER_ROLE]
	

/user_roles

Get all roles in the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]

### Return type

[**LIST [USER_ROLE]**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_users**
> list_users (access_token: STRING_32 ): detachable LIST [USER]
	

/users

List all users in the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]

### Return type

[**LIST [USER]**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_by_id**
> user_by_id (access_token: STRING_32 ; user_id: INTEGER_64 ): detachable USER
	

/users/{userId:[0-9]+}

Get a user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **user_id** | **INTEGER_64**| ID of the user. | [default to null]

### Return type

[**USER**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


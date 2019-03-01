# SwaggerClient::UsersApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_user_by_id**](UsersApi.md#delete_user_by_id) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**get_user_by_id**](UsersApi.md#get_user_by_id) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**list_user_roles**](UsersApi.md#list_user_roles) | **GET** /user_roles | /user_roles
[**list_users**](UsersApi.md#list_users) | **GET** /users | /users


# **delete_user_by_id**
> delete_user_by_id(access_token, user_id)

/users/{userId:[0-9]+}

Remove a user from the organization.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UsersApi.new

access_token = 'access_token_example' # String | Samsara API access token.

user_id = 789 # Integer | ID of the user.


begin
  #/users/{userId:[0-9]+}
  api_instance.delete_user_by_id(access_token, user_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UsersApi->delete_user_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **user_id** | **Integer**| ID of the user. | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_user_by_id**
> User get_user_by_id(access_token, user_id)

/users/{userId:[0-9]+}

Get a user.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UsersApi.new

access_token = 'access_token_example' # String | Samsara API access token.

user_id = 789 # Integer | ID of the user.


begin
  #/users/{userId:[0-9]+}
  result = api_instance.get_user_by_id(access_token, user_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UsersApi->get_user_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **user_id** | **Integer**| ID of the user. | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **list_user_roles**
> Array&lt;UserRole&gt; list_user_roles(access_token, )

/user_roles

Get all roles in the organization.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UsersApi.new

access_token = 'access_token_example' # String | Samsara API access token.


begin
  #/user_roles
  result = api_instance.list_user_roles(access_token, )
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UsersApi->list_user_roles: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 

### Return type

[**Array&lt;UserRole&gt;**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **list_users**
> Array&lt;User&gt; list_users(access_token, )

/users

List all users in the organization.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UsersApi.new

access_token = 'access_token_example' # String | Samsara API access token.


begin
  #/users
  result = api_instance.list_users(access_token, )
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UsersApi->list_users: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 

### Return type

[**Array&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




# openapi_client.UsersApi

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

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.UsersApi()
access_token = 'access_token_example' # str | Samsara API access token.
user_id = 56 # int | ID of the user.

try:
    # /users/{userId:[0-9]+}
    api_instance.delete_user_by_id(access_token, user_id)
except ApiException as e:
    print("Exception when calling UsersApi->delete_user_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **user_id** | **int**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_by_id**
> User get_user_by_id(access_token, user_id)

/users/{userId:[0-9]+}

Get a user.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.UsersApi()
access_token = 'access_token_example' # str | Samsara API access token.
user_id = 56 # int | ID of the user.

try:
    # /users/{userId:[0-9]+}
    api_response = api_instance.get_user_by_id(access_token, user_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersApi->get_user_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **user_id** | **int**| ID of the user. | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_user_roles**
> list[UserRole] list_user_roles(access_token)

/user_roles

Get all roles in the organization.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.UsersApi()
access_token = 'access_token_example' # str | Samsara API access token.

try:
    # /user_roles
    api_response = api_instance.list_user_roles(access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersApi->list_user_roles: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 

### Return type

[**list[UserRole]**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_users**
> list[User] list_users(access_token)

/users

List all users in the organization.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.UsersApi()
access_token = 'access_token_example' # str | Samsara API access token.

try:
    # /users
    api_response = api_instance.list_users(access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersApi->list_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 

### Return type

[**list[User]**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


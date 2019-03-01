# openapi.api.UsersApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserById**](UsersApi.md#deleteUserById) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**getUserById**](UsersApi.md#getUserById) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**listUserRoles**](UsersApi.md#listUserRoles) | **GET** /user_roles | /user_roles
[**listUsers**](UsersApi.md#listUsers) | **GET** /users | /users


# **deleteUserById**
> deleteUserById(accessToken, userId)

/users/{userId:[0-9]+}

Remove a user from the organization.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new UsersApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var userId = 789; // int | ID of the user.

try { 
    api_instance.deleteUserById(accessToken, userId);
} catch (e) {
    print("Exception when calling UsersApi->deleteUserById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **userId** | **int**| ID of the user. | [default to null]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserById**
> User getUserById(accessToken, userId)

/users/{userId:[0-9]+}

Get a user.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new UsersApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var userId = 789; // int | ID of the user.

try { 
    var result = api_instance.getUserById(accessToken, userId);
    print(result);
} catch (e) {
    print("Exception when calling UsersApi->getUserById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **userId** | **int**| ID of the user. | [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listUserRoles**
> List<UserRole> listUserRoles(accessToken)

/user_roles

Get all roles in the organization.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new UsersApi();
var accessToken = accessToken_example; // String | Samsara API access token.

try { 
    var result = api_instance.listUserRoles(accessToken);
    print(result);
} catch (e) {
    print("Exception when calling UsersApi->listUserRoles: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]

### Return type

[**List<UserRole>**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listUsers**
> List<User> listUsers(accessToken)

/users

List all users in the organization.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new UsersApi();
var accessToken = accessToken_example; // String | Samsara API access token.

try { 
    var result = api_instance.listUsers(accessToken);
    print(result);
} catch (e) {
    print("Exception when calling UsersApi->listUsers: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]

### Return type

[**List<User>**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


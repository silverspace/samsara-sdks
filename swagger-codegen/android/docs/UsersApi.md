# UsersApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserById**](UsersApi.md#deleteUserById) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**getUserById**](UsersApi.md#getUserById) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**listUserRoles**](UsersApi.md#listUserRoles) | **GET** /user_roles | /user_roles
[**listUsers**](UsersApi.md#listUsers) | **GET** /users | /users


<a name="deleteUserById"></a>
# **deleteUserById**
> deleteUserById(accessToken, userId)

/users/{userId:[0-9]+}

Remove a user from the organization.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long userId = 789L; // Long | ID of the user.
try {
    apiInstance.deleteUserById(accessToken, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **userId** | **Long**| ID of the user. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserById"></a>
# **getUserById**
> User getUserById(accessToken, userId)

/users/{userId:[0-9]+}

Get a user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long userId = 789L; // Long | ID of the user.
try {
    User result = apiInstance.getUserById(accessToken, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **userId** | **Long**| ID of the user. |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUserRoles"></a>
# **listUserRoles**
> List&lt;UserRole&gt; listUserRoles(accessToken)

/user_roles

Get all roles in the organization.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
try {
    List<UserRole> result = apiInstance.listUserRoles(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#listUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |

### Return type

[**List&lt;UserRole&gt;**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> List&lt;User&gt; listUsers(accessToken)

/users

List all users in the organization.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
try {
    List<User> result = apiInstance.listUsers(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#listUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


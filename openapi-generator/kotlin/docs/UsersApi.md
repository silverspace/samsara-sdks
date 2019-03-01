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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val userId : kotlin.Long = 789 // kotlin.Long | ID of the user.
try {
    apiInstance.deleteUserById(accessToken, userId)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deleteUserById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deleteUserById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **userId** | **kotlin.Long**| ID of the user. | [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserById"></a>
# **getUserById**
> User getUserById(accessToken, userId)

/users/{userId:[0-9]+}

Get a user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val userId : kotlin.Long = 789 // kotlin.Long | ID of the user.
try {
    val result : User = apiInstance.getUserById(accessToken, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **userId** | **kotlin.Long**| ID of the user. | [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUserRoles"></a>
# **listUserRoles**
> kotlin.Array&lt;UserRole&gt; listUserRoles(accessToken)

/user_roles

Get all roles in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
try {
    val result : kotlin.Array<UserRole> = apiInstance.listUserRoles(accessToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#listUserRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#listUserRoles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]

### Return type

[**kotlin.Array&lt;UserRole&gt;**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> kotlin.Array&lt;User&gt; listUsers(accessToken)

/users

List all users in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
try {
    val result : kotlin.Array<User> = apiInstance.listUsers(accessToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#listUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#listUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


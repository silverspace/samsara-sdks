# SamsaraApi.UsersApi

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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.UsersApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let userId = 789; // Number | ID of the user.
apiInstance.deleteUserById(accessToken, userId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **userId** | **Number**| ID of the user. | 

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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.UsersApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let userId = 789; // Number | ID of the user.
apiInstance.getUserById(accessToken, userId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **userId** | **Number**| ID of the user. | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUserRoles"></a>
# **listUserRoles**
> [UserRole] listUserRoles(accessToken)

/user_roles

Get all roles in the organization.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.UsersApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
apiInstance.listUserRoles(accessToken, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 

### Return type

[**[UserRole]**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> [User] listUsers(accessToken)

/users

List all users in the organization.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.UsersApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
apiInstance.listUsers(accessToken, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 

### Return type

[**[User]**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# samsara.Api.UsersApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteUserById**](UsersApi.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**GetUserById**](UsersApi.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**ListUserRoles**](UsersApi.md#listuserroles) | **GET** /user_roles | /user_roles
[**ListUsers**](UsersApi.md#listusers) | **GET** /users | /users


<a name="deleteuserbyid"></a>
# **DeleteUserById**
> void DeleteUserById (string accessToken, long? userId)

/users/{userId:[0-9]+}

Remove a user from the organization.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class DeleteUserByIdExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var userId = 789;  // long? | ID of the user.

            try
            {
                // /users/{userId:[0-9]+}
                apiInstance.DeleteUserById(accessToken, userId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.DeleteUserById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **userId** | **long?**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getuserbyid"></a>
# **GetUserById**
> User GetUserById (string accessToken, long? userId)

/users/{userId:[0-9]+}

Get a user.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class GetUserByIdExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var userId = 789;  // long? | ID of the user.

            try
            {
                // /users/{userId:[0-9]+}
                User result = apiInstance.GetUserById(accessToken, userId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.GetUserById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **userId** | **long?**| ID of the user. | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listuserroles"></a>
# **ListUserRoles**
> List<UserRole> ListUserRoles (string accessToken)

/user_roles

Get all roles in the organization.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class ListUserRolesExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.

            try
            {
                // /user_roles
                List&lt;UserRole&gt; result = apiInstance.ListUserRoles(accessToken);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.ListUserRoles: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 

### Return type

[**List<UserRole>**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listusers"></a>
# **ListUsers**
> List<User> ListUsers (string accessToken)

/users

List all users in the organization.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class ListUsersExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.

            try
            {
                // /users
                List&lt;User&gt; result = apiInstance.ListUsers(accessToken);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.ListUsers: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 

### Return type

[**List<User>**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# OpenAPI\Server\Api\UsersApiInterface

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserById**](UsersApiInterface.md#deleteUserById) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**getUserById**](UsersApiInterface.md#getUserById) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**listUserRoles**](UsersApiInterface.md#listUserRoles) | **GET** /user_roles | /user_roles
[**listUsers**](UsersApiInterface.md#listUsers) | **GET** /users | /users


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.users:
        class: Acme\MyBundle\Api\UsersApi
        tags:
            - { name: "open_apiserver.api", api: "users" }
    # ...
```

## **deleteUserById**
> deleteUserById($accessToken, $userId)

/users/{userId:[0-9]+}

Remove a user from the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#deleteUserById
     */
    public function deleteUserById($accessToken, $userId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **userId** | **int**| ID of the user. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getUserById**
> OpenAPI\Server\Model\User getUserById($accessToken, $userId)

/users/{userId:[0-9]+}

Get a user.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#getUserById
     */
    public function getUserById($accessToken, $userId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **userId** | **int**| ID of the user. |

### Return type

[**OpenAPI\Server\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listUserRoles**
> OpenAPI\Server\Model\UserRole listUserRoles($accessToken)

/user_roles

Get all roles in the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#listUserRoles
     */
    public function listUserRoles($accessToken)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |

### Return type

[**OpenAPI\Server\Model\UserRole**](../Model/UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listUsers**
> OpenAPI\Server\Model\User listUsers($accessToken)

/users

List all users in the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#listUsers
     */
    public function listUsers($accessToken)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |

### Return type

[**OpenAPI\Server\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


# OpenAPI\Server\Api\TagsApiInterface

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTag**](TagsApiInterface.md#createTag) | **POST** /tags | /tags
[**deleteTagById**](TagsApiInterface.md#deleteTagById) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**getAllTags**](TagsApiInterface.md#getAllTags) | **GET** /tags | /tags
[**getTagById**](TagsApiInterface.md#getTagById) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**modifyTagById**](TagsApiInterface.md#modifyTagById) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**updateTagById**](TagsApiInterface.md#updateTagById) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.tags:
        class: Acme\MyBundle\Api\TagsApi
        tags:
            - { name: "open_apiserver.api", api: "tags" }
    # ...
```

## **createTag**
> OpenAPI\Server\Model\Tag createTag($accessToken, $tagCreateParams)

/tags

Create a new tag for the group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TagsApiInterface;

class TagsApi implements TagsApiInterface
{

    // ...

    /**
     * Implementation of TagsApiInterface#createTag
     */
    public function createTag($accessToken, TagCreate $tagCreateParams)
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
 **tagCreateParams** | [**OpenAPI\Server\Model\TagCreate**](../Model/TagCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\Tag**](../Model/Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteTagById**
> deleteTagById($accessToken, $tagId)

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TagsApiInterface;

class TagsApi implements TagsApiInterface
{

    // ...

    /**
     * Implementation of TagsApiInterface#deleteTagById
     */
    public function deleteTagById($accessToken, $tagId)
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
 **tagId** | **int**| ID of the tag. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAllTags**
> OpenAPI\Server\Model\InlineResponse2009 getAllTags($accessToken, $groupId)

/tags

Fetch all of the tags for a group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TagsApiInterface;

class TagsApi implements TagsApiInterface
{

    // ...

    /**
     * Implementation of TagsApiInterface#getAllTags
     */
    public function getAllTags($accessToken, $groupId = null)
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
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**OpenAPI\Server\Model\InlineResponse2009**](../Model/InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getTagById**
> OpenAPI\Server\Model\Tag getTagById($accessToken, $tagId)

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TagsApiInterface;

class TagsApi implements TagsApiInterface
{

    // ...

    /**
     * Implementation of TagsApiInterface#getTagById
     */
    public function getTagById($accessToken, $tagId)
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
 **tagId** | **int**| ID of the tag. |

### Return type

[**OpenAPI\Server\Model\Tag**](../Model/Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **modifyTagById**
> OpenAPI\Server\Model\Tag modifyTagById($accessToken, $tagId, $tagModifyParams)

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TagsApiInterface;

class TagsApi implements TagsApiInterface
{

    // ...

    /**
     * Implementation of TagsApiInterface#modifyTagById
     */
    public function modifyTagById($accessToken, $tagId, TagModify $tagModifyParams)
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
 **tagId** | **int**| ID of the tag. |
 **tagModifyParams** | [**OpenAPI\Server\Model\TagModify**](../Model/TagModify.md)|  |

### Return type

[**OpenAPI\Server\Model\Tag**](../Model/Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateTagById**
> OpenAPI\Server\Model\Tag updateTagById($accessToken, $tagId, $updateTagParams)

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TagsApiInterface;

class TagsApi implements TagsApiInterface
{

    // ...

    /**
     * Implementation of TagsApiInterface#updateTagById
     */
    public function updateTagById($accessToken, $tagId, TagUpdate $updateTagParams)
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
 **tagId** | **int**| ID of the tag. |
 **updateTagParams** | [**OpenAPI\Server\Model\TagUpdate**](../Model/TagUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\Tag**](../Model/Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


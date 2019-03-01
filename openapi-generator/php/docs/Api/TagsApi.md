# OpenAPI\Client\TagsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTag**](TagsApi.md#createTag) | **POST** /tags | /tags
[**deleteTagById**](TagsApi.md#deleteTagById) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**getAllTags**](TagsApi.md#getAllTags) | **GET** /tags | /tags
[**getTagById**](TagsApi.md#getTagById) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**modifyTagById**](TagsApi.md#modifyTagById) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**updateTagById**](TagsApi.md#updateTagById) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


# **createTag**
> \OpenAPI\Client\Model\Tag createTag($access_token, $tag_create_params)

/tags

Create a new tag for the group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\TagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$tag_create_params = new \OpenAPI\Client\Model\TagCreate(); // \OpenAPI\Client\Model\TagCreate | 

try {
    $result = $apiInstance->createTag($access_token, $tag_create_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TagsApi->createTag: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **tag_create_params** | [**\OpenAPI\Client\Model\TagCreate**](../Model/TagCreate.md)|  |

### Return type

[**\OpenAPI\Client\Model\Tag**](../Model/Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteTagById**
> deleteTagById($access_token, $tag_id)

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\TagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$tag_id = 56; // int | ID of the tag.

try {
    $apiInstance->deleteTagById($access_token, $tag_id);
} catch (Exception $e) {
    echo 'Exception when calling TagsApi->deleteTagById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **tag_id** | **int**| ID of the tag. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllTags**
> \OpenAPI\Client\Model\InlineResponse2009 getAllTags($access_token, $group_id)

/tags

Fetch all of the tags for a group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\TagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_id = 56; // int | Optional group ID if the organization has multiple groups (uncommon).

try {
    $result = $apiInstance->getAllTags($access_token, $group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TagsApi->getAllTags: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse2009**](../Model/InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTagById**
> \OpenAPI\Client\Model\Tag getTagById($access_token, $tag_id)

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\TagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$tag_id = 56; // int | ID of the tag.

try {
    $result = $apiInstance->getTagById($access_token, $tag_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TagsApi->getTagById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **tag_id** | **int**| ID of the tag. |

### Return type

[**\OpenAPI\Client\Model\Tag**](../Model/Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **modifyTagById**
> \OpenAPI\Client\Model\Tag modifyTagById($access_token, $tag_id, $tag_modify_params)

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\TagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$tag_id = 56; // int | ID of the tag.
$tag_modify_params = new \OpenAPI\Client\Model\TagModify(); // \OpenAPI\Client\Model\TagModify | 

try {
    $result = $apiInstance->modifyTagById($access_token, $tag_id, $tag_modify_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TagsApi->modifyTagById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **tag_id** | **int**| ID of the tag. |
 **tag_modify_params** | [**\OpenAPI\Client\Model\TagModify**](../Model/TagModify.md)|  |

### Return type

[**\OpenAPI\Client\Model\Tag**](../Model/Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateTagById**
> \OpenAPI\Client\Model\Tag updateTagById($access_token, $tag_id, $update_tag_params)

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\TagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$tag_id = 56; // int | ID of the tag.
$update_tag_params = new \OpenAPI\Client\Model\TagUpdate(); // \OpenAPI\Client\Model\TagUpdate | 

try {
    $result = $apiInstance->updateTagById($access_token, $tag_id, $update_tag_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TagsApi->updateTagById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **tag_id** | **int**| ID of the tag. |
 **update_tag_params** | [**\OpenAPI\Client\Model\TagUpdate**](../Model/TagUpdate.md)|  |

### Return type

[**\OpenAPI\Client\Model\Tag**](../Model/Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


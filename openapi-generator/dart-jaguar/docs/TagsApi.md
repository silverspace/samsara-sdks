# openapi.api.TagsApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTag**](TagsApi.md#createTag) | **Post** /tags | /tags
[**deleteTagById**](TagsApi.md#deleteTagById) | **Delete** /tags/:tag_id | /tags/{tag_id:[0-9]+}
[**getAllTags**](TagsApi.md#getAllTags) | **Get** /tags | /tags
[**getTagById**](TagsApi.md#getTagById) | **Get** /tags/:tag_id | /tags/{tag_id:[0-9]+}
[**modifyTagById**](TagsApi.md#modifyTagById) | **Patch** /tags/:tag_id | /tags/{tag_id:[0-9]+}
[**updateTagById**](TagsApi.md#updateTagById) | **Put** /tags/:tag_id | /tags/{tag_id:[0-9]+}


# **createTag**
> Tag createTag(accessToken, tagCreateParams)

/tags

Create a new tag for the group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new TagsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var tagCreateParams = new TagCreate(); // TagCreate | 

try { 
    var result = api_instance.createTag(accessToken, tagCreateParams);
    print(result);
} catch (e) {
    print("Exception when calling TagsApi->createTag: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tagCreateParams** | [**TagCreate**](TagCreate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteTagById**
> deleteTagById(accessToken, tagId)

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new TagsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var tagId = 789; // int | ID of the tag.

try { 
    api_instance.deleteTagById(accessToken, tagId);
} catch (e) {
    print("Exception when calling TagsApi->deleteTagById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tagId** | **int**| ID of the tag. | [default to null]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllTags**
> InlineResponse2009 getAllTags(accessToken, groupId)

/tags

Fetch all of the tags for a group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new TagsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).

try { 
    var result = api_instance.getAllTags(accessToken, groupId);
    print(result);
} catch (e) {
    print("Exception when calling TagsApi->getAllTags: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTagById**
> Tag getTagById(accessToken, tagId)

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new TagsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var tagId = 789; // int | ID of the tag.

try { 
    var result = api_instance.getTagById(accessToken, tagId);
    print(result);
} catch (e) {
    print("Exception when calling TagsApi->getTagById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tagId** | **int**| ID of the tag. | [default to null]

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyTagById**
> Tag modifyTagById(accessToken, tagId, tagModifyParams)

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new TagsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var tagId = 789; // int | ID of the tag.
var tagModifyParams = new TagModify(); // TagModify | 

try { 
    var result = api_instance.modifyTagById(accessToken, tagId, tagModifyParams);
    print(result);
} catch (e) {
    print("Exception when calling TagsApi->modifyTagById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tagId** | **int**| ID of the tag. | [default to null]
 **tagModifyParams** | [**TagModify**](TagModify.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateTagById**
> Tag updateTagById(accessToken, tagId, updateTagParams)

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new TagsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var tagId = 789; // int | ID of the tag.
var updateTagParams = new TagUpdate(); // TagUpdate | 

try { 
    var result = api_instance.updateTagById(accessToken, tagId, updateTagParams);
    print(result);
} catch (e) {
    print("Exception when calling TagsApi->updateTagById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tagId** | **int**| ID of the tag. | [default to null]
 **updateTagParams** | [**TagUpdate**](TagUpdate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


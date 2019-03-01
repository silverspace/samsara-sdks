# TagsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTag**](TagsApi.md#createTag) | **POST** /tags | /tags
[**deleteTagById**](TagsApi.md#deleteTagById) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**getAllTags**](TagsApi.md#getAllTags) | **GET** /tags | /tags
[**getTagById**](TagsApi.md#getTagById) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**modifyTagById**](TagsApi.md#modifyTagById) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**updateTagById**](TagsApi.md#updateTagById) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


<a name="createTag"></a>
# **createTag**
> Tag createTag(accessToken, tagCreateParams)

/tags

Create a new tag for the group.

### Example
```java
// Import classes:
//import org.openapitools.client.api.TagsApi;

TagsApi apiInstance = new TagsApi();
String accessToken = null; // String | Samsara API access token.
TagCreate tagCreateParams = new TagCreate(); // TagCreate | 
try {
    Tag result = apiInstance.createTag(accessToken, tagCreateParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTag");
    e.printStackTrace();
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

<a name="deleteTagById"></a>
# **deleteTagById**
> deleteTagById(accessToken, tagId)

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Example
```java
// Import classes:
//import org.openapitools.client.api.TagsApi;

TagsApi apiInstance = new TagsApi();
String accessToken = null; // String | Samsara API access token.
Long tagId = null; // Long | ID of the tag.
try {
    apiInstance.deleteTagById(accessToken, tagId);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#deleteTagById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tagId** | **Long**| ID of the tag. | [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTags"></a>
# **getAllTags**
> InlineResponse2009 getAllTags(accessToken, groupId)

/tags

Fetch all of the tags for a group.

### Example
```java
// Import classes:
//import org.openapitools.client.api.TagsApi;

TagsApi apiInstance = new TagsApi();
String accessToken = null; // String | Samsara API access token.
Long groupId = null; // Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    InlineResponse2009 result = apiInstance.getAllTags(accessToken, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getAllTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagById"></a>
# **getTagById**
> Tag getTagById(accessToken, tagId)

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example
```java
// Import classes:
//import org.openapitools.client.api.TagsApi;

TagsApi apiInstance = new TagsApi();
String accessToken = null; // String | Samsara API access token.
Long tagId = null; // Long | ID of the tag.
try {
    Tag result = apiInstance.getTagById(accessToken, tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tagId** | **Long**| ID of the tag. | [default to null]

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyTagById"></a>
# **modifyTagById**
> Tag modifyTagById(accessToken, tagId, tagModifyParams)

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example
```java
// Import classes:
//import org.openapitools.client.api.TagsApi;

TagsApi apiInstance = new TagsApi();
String accessToken = null; // String | Samsara API access token.
Long tagId = null; // Long | ID of the tag.
TagModify tagModifyParams = new TagModify(); // TagModify | 
try {
    Tag result = apiInstance.modifyTagById(accessToken, tagId, tagModifyParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#modifyTagById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tagId** | **Long**| ID of the tag. | [default to null]
 **tagModifyParams** | [**TagModify**](TagModify.md)|  |

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTagById"></a>
# **updateTagById**
> Tag updateTagById(accessToken, tagId, updateTagParams)

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example
```java
// Import classes:
//import org.openapitools.client.api.TagsApi;

TagsApi apiInstance = new TagsApi();
String accessToken = null; // String | Samsara API access token.
Long tagId = null; // Long | ID of the tag.
TagUpdate updateTagParams = new TagUpdate(); // TagUpdate | 
try {
    Tag result = apiInstance.updateTagById(accessToken, tagId, updateTagParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#updateTagById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **tagId** | **Long**| ID of the tag. | [default to null]
 **updateTagParams** | [**TagUpdate**](TagUpdate.md)|  |

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


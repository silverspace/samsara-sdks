# SamsaraApi.TagsApi

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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.TagsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let tagCreateParams = new SamsaraApi.TagCreate(); // TagCreate | 
apiInstance.createTag(accessToken, tagCreateParams, (error, data, response) => {
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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.TagsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let tagId = 789; // Number | ID of the tag.
apiInstance.deleteTagById(accessToken, tagId, (error, data, response) => {
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
 **tagId** | **Number**| ID of the tag. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTags"></a>
# **getAllTags**
> InlineResponse2009 getAllTags(accessToken, opts)

/tags

Fetch all of the tags for a group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.TagsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'groupId': 789 // Number | Optional group ID if the organization has multiple groups (uncommon).
};
apiInstance.getAllTags(accessToken, opts, (error, data, response) => {
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
 **groupId** | **Number**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.TagsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let tagId = 789; // Number | ID of the tag.
apiInstance.getTagById(accessToken, tagId, (error, data, response) => {
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
 **tagId** | **Number**| ID of the tag. | 

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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.TagsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let tagId = 789; // Number | ID of the tag.
let tagModifyParams = new SamsaraApi.TagModify(); // TagModify | 
apiInstance.modifyTagById(accessToken, tagId, tagModifyParams, (error, data, response) => {
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
 **tagId** | **Number**| ID of the tag. | 
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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.TagsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let tagId = 789; // Number | ID of the tag.
let updateTagParams = new SamsaraApi.TagUpdate(); // TagUpdate | 
apiInstance.updateTagById(accessToken, tagId, updateTagParams, (error, data, response) => {
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
 **tagId** | **Number**| ID of the tag. | 
 **updateTagParams** | [**TagUpdate**](TagUpdate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


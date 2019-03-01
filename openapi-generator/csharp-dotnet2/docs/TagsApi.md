# Org.OpenAPITools.Api.TagsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateTag**](TagsApi.md#createtag) | **POST** /tags | /tags
[**DeleteTagById**](TagsApi.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**GetAllTags**](TagsApi.md#getalltags) | **GET** /tags | /tags
[**GetTagById**](TagsApi.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**ModifyTagById**](TagsApi.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**UpdateTagById**](TagsApi.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


<a name="createtag"></a>
# **CreateTag**
> Tag CreateTag (string accessToken, TagCreate tagCreateParams)

/tags

Create a new tag for the group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateTagExample
    {
        public void main()
        {
            
            var apiInstance = new TagsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var tagCreateParams = new TagCreate(); // TagCreate | 

            try
            {
                // /tags
                Tag result = apiInstance.CreateTag(accessToken, tagCreateParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TagsApi.CreateTag: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **tagCreateParams** | [**TagCreate**](TagCreate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletetagbyid"></a>
# **DeleteTagById**
> void DeleteTagById (string accessToken, long? tagId)

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteTagByIdExample
    {
        public void main()
        {
            
            var apiInstance = new TagsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var tagId = 789;  // long? | ID of the tag.

            try
            {
                // /tags/{tag_id:[0-9]+}
                apiInstance.DeleteTagById(accessToken, tagId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TagsApi.DeleteTagById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **tagId** | **long?**| ID of the tag. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getalltags"></a>
# **GetAllTags**
> InlineResponse2009 GetAllTags (string accessToken, long? groupId)

/tags

Fetch all of the tags for a group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAllTagsExample
    {
        public void main()
        {
            
            var apiInstance = new TagsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 

            try
            {
                // /tags
                InlineResponse2009 result = apiInstance.GetAllTags(accessToken, groupId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TagsApi.GetAllTags: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gettagbyid"></a>
# **GetTagById**
> Tag GetTagById (string accessToken, long? tagId)

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetTagByIdExample
    {
        public void main()
        {
            
            var apiInstance = new TagsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var tagId = 789;  // long? | ID of the tag.

            try
            {
                // /tags/{tag_id:[0-9]+}
                Tag result = apiInstance.GetTagById(accessToken, tagId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TagsApi.GetTagById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **tagId** | **long?**| ID of the tag. | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="modifytagbyid"></a>
# **ModifyTagById**
> Tag ModifyTagById (string accessToken, long? tagId, TagModify tagModifyParams)

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModifyTagByIdExample
    {
        public void main()
        {
            
            var apiInstance = new TagsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var tagId = 789;  // long? | ID of the tag.
            var tagModifyParams = new TagModify(); // TagModify | 

            try
            {
                // /tags/{tag_id:[0-9]+}
                Tag result = apiInstance.ModifyTagById(accessToken, tagId, tagModifyParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TagsApi.ModifyTagById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **tagId** | **long?**| ID of the tag. | 
 **tagModifyParams** | [**TagModify**](TagModify.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatetagbyid"></a>
# **UpdateTagById**
> Tag UpdateTagById (string accessToken, long? tagId, TagUpdate updateTagParams)

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateTagByIdExample
    {
        public void main()
        {
            
            var apiInstance = new TagsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var tagId = 789;  // long? | ID of the tag.
            var updateTagParams = new TagUpdate(); // TagUpdate | 

            try
            {
                // /tags/{tag_id:[0-9]+}
                Tag result = apiInstance.UpdateTagById(accessToken, tagId, updateTagParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TagsApi.UpdateTagById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **tagId** | **long?**| ID of the tag. | 
 **updateTagParams** | [**TagUpdate**](TagUpdate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


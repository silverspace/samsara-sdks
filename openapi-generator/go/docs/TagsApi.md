# \TagsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateTag**](TagsApi.md#CreateTag) | **Post** /tags | /tags
[**DeleteTagById**](TagsApi.md#DeleteTagById) | **Delete** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**GetAllTags**](TagsApi.md#GetAllTags) | **Get** /tags | /tags
[**GetTagById**](TagsApi.md#GetTagById) | **Get** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**ModifyTagById**](TagsApi.md#ModifyTagById) | **Patch** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**UpdateTagById**](TagsApi.md#UpdateTagById) | **Put** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


# **CreateTag**
> Tag CreateTag(ctx, accessToken, tagCreateParams)
/tags

Create a new tag for the group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
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

# **DeleteTagById**
> DeleteTagById(ctx, accessToken, tagId)
/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **tagId** | **int64**| ID of the tag. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAllTags**
> InlineResponse2009 GetAllTags(ctx, accessToken, optional)
/tags

Fetch all of the tags for a group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
 **optional** | ***GetAllTagsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetAllTagsOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **groupId** | **optional.Int64**| Optional group ID if the organization has multiple groups (uncommon). | 

### Return type

[**InlineResponse2009**](inline_response_200_9.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetTagById**
> Tag GetTagById(ctx, accessToken, tagId)
/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **tagId** | **int64**| ID of the tag. | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ModifyTagById**
> Tag ModifyTagById(ctx, accessToken, tagId, tagModifyParams)
/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **tagId** | **int64**| ID of the tag. | 
  **tagModifyParams** | [**TagModify**](TagModify.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateTagById**
> Tag UpdateTagById(ctx, accessToken, tagId, updateTagParams)
/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **tagId** | **int64**| ID of the tag. | 
  **updateTagParams** | [**TagUpdate**](TagUpdate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# \TagsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_tag**](TagsApi.md#create_tag) | **Post** /tags | /tags
[**delete_tag_by_id**](TagsApi.md#delete_tag_by_id) | **Delete** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**get_all_tags**](TagsApi.md#get_all_tags) | **Get** /tags | /tags
[**get_tag_by_id**](TagsApi.md#get_tag_by_id) | **Get** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**modify_tag_by_id**](TagsApi.md#modify_tag_by_id) | **Patch** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**update_tag_by_id**](TagsApi.md#update_tag_by_id) | **Put** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


# **create_tag**
> ::models::Tag create_tag(access_token, tag_create_params)
/tags

Create a new tag for the group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **tag_create_params** | [**TagCreate**](TagCreate.md)|  | 

### Return type

[**::models::Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_tag_by_id**
> delete_tag_by_id(access_token, tag_id)
/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **tag_id** | **i64**| ID of the tag. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_tags**
> ::models::InlineResponse2009 get_all_tags(access_token, optional)
/tags

Fetch all of the tags for a group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **i64**| Optional group ID if the organization has multiple groups (uncommon). | 

### Return type

[**::models::InlineResponse2009**](inline_response_200_9.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tag_by_id**
> ::models::Tag get_tag_by_id(access_token, tag_id)
/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **tag_id** | **i64**| ID of the tag. | 

### Return type

[**::models::Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_tag_by_id**
> ::models::Tag modify_tag_by_id(access_token, tag_id, tag_modify_params)
/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **tag_id** | **i64**| ID of the tag. | 
  **tag_modify_params** | [**TagModify**](TagModify.md)|  | 

### Return type

[**::models::Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_tag_by_id**
> ::models::Tag update_tag_by_id(access_token, tag_id, update_tag_params)
/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **tag_id** | **i64**| ID of the tag. | 
  **update_tag_params** | [**TagUpdate**](TagUpdate.md)|  | 

### Return type

[**::models::Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


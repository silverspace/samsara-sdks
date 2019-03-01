# TAGS_API

All URIs are relative to *https://api.samsara.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**all_tags**](TAGS_API.md#all_tags) | **Get** /tags | /tags
[**create_tag**](TAGS_API.md#create_tag) | **Post** /tags | /tags
[**delete_tag_by_id**](TAGS_API.md#delete_tag_by_id) | **Delete** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**modify_tag_by_id**](TAGS_API.md#modify_tag_by_id) | **Patch** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**tag_by_id**](TAGS_API.md#tag_by_id) | **Get** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**update_tag_by_id**](TAGS_API.md#update_tag_by_id) | **Put** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


# **all_tags**
> all_tags (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ): detachable INLINE_RESPONSE_200_9
	

/tags

Fetch all of the tags for a group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**INLINE_RESPONSE_200_9**](inline_response_200_9.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_tag**
> create_tag (access_token: STRING_32 ; tag_create_params: TAG_CREATE ): detachable TAG
	

/tags

Create a new tag for the group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **tag_create_params** | [**TAG_CREATE**](TAG_CREATE.md)|  | 

### Return type

[**TAG**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_tag_by_id**
> delete_tag_by_id (access_token: STRING_32 ; tag_id: INTEGER_64 )
	

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **tag_id** | **INTEGER_64**| ID of the tag. | [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_tag_by_id**
> modify_tag_by_id (access_token: STRING_32 ; tag_id: INTEGER_64 ; tag_modify_params: TAG_MODIFY ): detachable TAG
	

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **tag_id** | **INTEGER_64**| ID of the tag. | [default to null]
 **tag_modify_params** | [**TAG_MODIFY**](TAG_MODIFY.md)|  | 

### Return type

[**TAG**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tag_by_id**
> tag_by_id (access_token: STRING_32 ; tag_id: INTEGER_64 ): detachable TAG
	

/tags/{tag_id:[0-9]+}

Fetch a tag by id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **tag_id** | **INTEGER_64**| ID of the tag. | [default to null]

### Return type

[**TAG**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_tag_by_id**
> update_tag_by_id (access_token: STRING_32 ; tag_id: INTEGER_64 ; update_tag_params: TAG_UPDATE ): detachable TAG
	

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **tag_id** | **INTEGER_64**| ID of the tag. | [default to null]
 **update_tag_params** | [**TAG_UPDATE**](TAG_UPDATE.md)|  | 

### Return type

[**TAG**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


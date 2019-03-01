# TagsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateTag**](TagsApi.md#CreateTag) | **POST** /tags | /tags
[**DeleteTagById**](TagsApi.md#DeleteTagById) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**GetAllTags**](TagsApi.md#GetAllTags) | **GET** /tags | /tags
[**GetTagById**](TagsApi.md#GetTagById) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**ModifyTagById**](TagsApi.md#ModifyTagById) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**UpdateTagById**](TagsApi.md#UpdateTagById) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


# **CreateTag**
> Tag CreateTag(access.token, tag.create.params)

/tags

Create a new tag for the group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.tag.create.params <- TagCreate$new() # TagCreate | 

#/tags
api.instance <- TagsApi$new()
result <- api.instance$CreateTag(var.access.token, var.tag.create.params)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **tag.create.params** | [**TagCreate**](TagCreate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **DeleteTagById**
> DeleteTagById(access.token, tag.id)

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.tag.id <- 56 # integer | ID of the tag.

#/tags/{tag_id:[0-9]+}
api.instance <- TagsApi$new()
api.instance$DeleteTagById(var.access.token, var.tag.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **tag.id** | **integer**| ID of the tag. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetAllTags**
> InlineResponse2009 GetAllTags(access.token, group.id=var.group.id)

/tags

Fetch all of the tags for a group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.id <- 56 # integer | Optional group ID if the organization has multiple groups (uncommon).

#/tags
api.instance <- TagsApi$new()
result <- api.instance$GetAllTags(var.access.token, group.id=var.group.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.id** | **integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2009**](inline_response_200_9.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetTagById**
> Tag GetTagById(access.token, tag.id)

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.tag.id <- 56 # integer | ID of the tag.

#/tags/{tag_id:[0-9]+}
api.instance <- TagsApi$new()
result <- api.instance$GetTagById(var.access.token, var.tag.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **tag.id** | **integer**| ID of the tag. | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **ModifyTagById**
> Tag ModifyTagById(access.token, tag.id, tag.modify.params)

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.tag.id <- 56 # integer | ID of the tag.
var.tag.modify.params <- TagModify$new() # TagModify | 

#/tags/{tag_id:[0-9]+}
api.instance <- TagsApi$new()
result <- api.instance$ModifyTagById(var.access.token, var.tag.id, var.tag.modify.params)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **tag.id** | **integer**| ID of the tag. | 
 **tag.modify.params** | [**TagModify**](TagModify.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **UpdateTagById**
> Tag UpdateTagById(access.token, tag.id, update.tag.params)

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.tag.id <- 56 # integer | ID of the tag.
var.update.tag.params <- TagUpdate$new() # TagUpdate | 

#/tags/{tag_id:[0-9]+}
api.instance <- TagsApi$new()
result <- api.instance$UpdateTagById(var.access.token, var.tag.id, var.update.tag.params)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **tag.id** | **integer**| ID of the tag. | 
 **update.tag.params** | [**TagUpdate**](TagUpdate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




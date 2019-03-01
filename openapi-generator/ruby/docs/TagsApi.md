# OpenapiClient::TagsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_tag**](TagsApi.md#create_tag) | **POST** /tags | /tags
[**delete_tag_by_id**](TagsApi.md#delete_tag_by_id) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**get_all_tags**](TagsApi.md#get_all_tags) | **GET** /tags | /tags
[**get_tag_by_id**](TagsApi.md#get_tag_by_id) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**modify_tag_by_id**](TagsApi.md#modify_tag_by_id) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**update_tag_by_id**](TagsApi.md#update_tag_by_id) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


# **create_tag**
> Tag create_tag(access_token, tag_create_params)

/tags

Create a new tag for the group.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::TagsApi.new
access_token = 'access_token_example' # String | Samsara API access token.
tag_create_params = OpenapiClient::TagCreate.new # TagCreate | 

begin
  #/tags
  result = api_instance.create_tag(access_token, tag_create_params)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling TagsApi->create_tag: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **tag_create_params** | [**TagCreate**](TagCreate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_tag_by_id**
> delete_tag_by_id(access_token, tag_id)

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::TagsApi.new
access_token = 'access_token_example' # String | Samsara API access token.
tag_id = 56 # Integer | ID of the tag.

begin
  #/tags/{tag_id:[0-9]+}
  api_instance.delete_tag_by_id(access_token, tag_id)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling TagsApi->delete_tag_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **tag_id** | **Integer**| ID of the tag. | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_all_tags**
> InlineResponse2009 get_all_tags(access_token, opts)

/tags

Fetch all of the tags for a group.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::TagsApi.new
access_token = 'access_token_example' # String | Samsara API access token.
opts = {
  group_id: 56 # Integer | Optional group ID if the organization has multiple groups (uncommon).
}

begin
  #/tags
  result = api_instance.get_all_tags(access_token, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling TagsApi->get_all_tags: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **Integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_tag_by_id**
> Tag get_tag_by_id(access_token, tag_id)

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::TagsApi.new
access_token = 'access_token_example' # String | Samsara API access token.
tag_id = 56 # Integer | ID of the tag.

begin
  #/tags/{tag_id:[0-9]+}
  result = api_instance.get_tag_by_id(access_token, tag_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling TagsApi->get_tag_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **tag_id** | **Integer**| ID of the tag. | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **modify_tag_by_id**
> Tag modify_tag_by_id(access_token, tag_id, tag_modify_params)

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::TagsApi.new
access_token = 'access_token_example' # String | Samsara API access token.
tag_id = 56 # Integer | ID of the tag.
tag_modify_params = OpenapiClient::TagModify.new # TagModify | 

begin
  #/tags/{tag_id:[0-9]+}
  result = api_instance.modify_tag_by_id(access_token, tag_id, tag_modify_params)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling TagsApi->modify_tag_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **tag_id** | **Integer**| ID of the tag. | 
 **tag_modify_params** | [**TagModify**](TagModify.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_tag_by_id**
> Tag update_tag_by_id(access_token, tag_id, update_tag_params)

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::TagsApi.new
access_token = 'access_token_example' # String | Samsara API access token.
tag_id = 56 # Integer | ID of the tag.
update_tag_params = OpenapiClient::TagUpdate.new # TagUpdate | 

begin
  #/tags/{tag_id:[0-9]+}
  result = api_instance.update_tag_by_id(access_token, tag_id, update_tag_params)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling TagsApi->update_tag_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **tag_id** | **Integer**| ID of the tag. | 
 **update_tag_params** | [**TagUpdate**](TagUpdate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




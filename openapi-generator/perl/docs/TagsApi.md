# WWW::OpenAPIClient::TagsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::TagsApi;
```

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
> Tag create_tag(access_token => $access_token, tag_create_params => $tag_create_params)

/tags

Create a new tag for the group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TagsApi;
my $api_instance = WWW::OpenAPIClient::TagsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $tag_create_params = WWW::OpenAPIClient::Object::TagCreate->new(); # TagCreate | 

eval { 
    my $result = $api_instance->create_tag(access_token => $access_token, tag_create_params => $tag_create_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TagsApi->create_tag: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **tag_create_params** | [**TagCreate**](TagCreate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_tag_by_id**
> delete_tag_by_id(access_token => $access_token, tag_id => $tag_id)

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TagsApi;
my $api_instance = WWW::OpenAPIClient::TagsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $tag_id = 789; # int | ID of the tag.

eval { 
    $api_instance->delete_tag_by_id(access_token => $access_token, tag_id => $tag_id);
};
if ($@) {
    warn "Exception when calling TagsApi->delete_tag_by_id: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_tags**
> InlineResponse2009 get_all_tags(access_token => $access_token, group_id => $group_id)

/tags

Fetch all of the tags for a group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TagsApi;
my $api_instance = WWW::OpenAPIClient::TagsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).

eval { 
    my $result = $api_instance->get_all_tags(access_token => $access_token, group_id => $group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TagsApi->get_all_tags: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tag_by_id**
> Tag get_tag_by_id(access_token => $access_token, tag_id => $tag_id)

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TagsApi;
my $api_instance = WWW::OpenAPIClient::TagsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $tag_id = 789; # int | ID of the tag.

eval { 
    my $result = $api_instance->get_tag_by_id(access_token => $access_token, tag_id => $tag_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TagsApi->get_tag_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **tag_id** | **int**| ID of the tag. | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_tag_by_id**
> Tag modify_tag_by_id(access_token => $access_token, tag_id => $tag_id, tag_modify_params => $tag_modify_params)

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TagsApi;
my $api_instance = WWW::OpenAPIClient::TagsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $tag_id = 789; # int | ID of the tag.
my $tag_modify_params = WWW::OpenAPIClient::Object::TagModify->new(); # TagModify | 

eval { 
    my $result = $api_instance->modify_tag_by_id(access_token => $access_token, tag_id => $tag_id, tag_modify_params => $tag_modify_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TagsApi->modify_tag_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **tag_id** | **int**| ID of the tag. | 
 **tag_modify_params** | [**TagModify**](TagModify.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_tag_by_id**
> Tag update_tag_by_id(access_token => $access_token, tag_id => $tag_id, update_tag_params => $update_tag_params)

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TagsApi;
my $api_instance = WWW::OpenAPIClient::TagsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $tag_id = 789; # int | ID of the tag.
my $update_tag_params = WWW::OpenAPIClient::Object::TagUpdate->new(); # TagUpdate | 

eval { 
    my $result = $api_instance->update_tag_by_id(access_token => $access_token, tag_id => $tag_id, update_tag_params => $update_tag_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TagsApi->update_tag_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **tag_id** | **int**| ID of the tag. | 
 **update_tag_params** | [**TagUpdate**](TagUpdate.md)|  | 

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


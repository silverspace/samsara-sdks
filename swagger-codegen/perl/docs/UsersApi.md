# WWW::SwaggerClient::UsersApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::UsersApi;
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_user_by_id**](UsersApi.md#delete_user_by_id) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**get_user_by_id**](UsersApi.md#get_user_by_id) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**list_user_roles**](UsersApi.md#list_user_roles) | **GET** /user_roles | /user_roles
[**list_users**](UsersApi.md#list_users) | **GET** /users | /users


# **delete_user_by_id**
> delete_user_by_id(access_token => $access_token, user_id => $user_id)

/users/{userId:[0-9]+}

Remove a user from the organization.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::UsersApi;
my $api_instance = WWW::SwaggerClient::UsersApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $user_id = 789; # int | ID of the user.

eval { 
    $api_instance->delete_user_by_id(access_token => $access_token, user_id => $user_id);
};
if ($@) {
    warn "Exception when calling UsersApi->delete_user_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **user_id** | **int**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_by_id**
> User get_user_by_id(access_token => $access_token, user_id => $user_id)

/users/{userId:[0-9]+}

Get a user.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::UsersApi;
my $api_instance = WWW::SwaggerClient::UsersApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $user_id = 789; # int | ID of the user.

eval { 
    my $result = $api_instance->get_user_by_id(access_token => $access_token, user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->get_user_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **user_id** | **int**| ID of the user. | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_user_roles**
> ARRAY[UserRole] list_user_roles(access_token => $access_token)

/user_roles

Get all roles in the organization.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::UsersApi;
my $api_instance = WWW::SwaggerClient::UsersApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.

eval { 
    my $result = $api_instance->list_user_roles(access_token => $access_token);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->list_user_roles: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 

### Return type

[**ARRAY[UserRole]**](UserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_users**
> ARRAY[User] list_users(access_token => $access_token)

/users

List all users in the organization.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::UsersApi;
my $api_instance = WWW::SwaggerClient::UsersApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.

eval { 
    my $result = $api_instance->list_users(access_token => $access_token);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->list_users: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 

### Return type

[**ARRAY[User]**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


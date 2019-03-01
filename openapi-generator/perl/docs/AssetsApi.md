# WWW::OpenAPIClient::AssetsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AssetsApi;
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_asset_current_locations**](AssetsApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**get_all_assets**](AssetsApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
[**get_asset_location**](AssetsApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**get_asset_reefer**](AssetsApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **get_all_asset_current_locations**
> InlineResponse2001 get_all_asset_current_locations(access_token => $access_token, group_id => $group_id)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AssetsApi;
my $api_instance = WWW::OpenAPIClient::AssetsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).

eval { 
    my $result = $api_instance->get_all_asset_current_locations(access_token => $access_token, group_id => $group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AssetsApi->get_all_asset_current_locations: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_assets**
> InlineResponse200 get_all_assets(access_token => $access_token, group_id => $group_id)

/fleet/assets

Fetch all of the assets for the group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AssetsApi;
my $api_instance = WWW::OpenAPIClient::AssetsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).

eval { 
    my $result = $api_instance->get_all_assets(access_token => $access_token, group_id => $group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AssetsApi->get_all_assets: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_location**
> ARRAY[object] get_asset_location(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AssetsApi;
my $api_instance = WWW::OpenAPIClient::AssetsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $asset_id = 789; # int | ID of the asset
my $start_ms = 789; # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
my $end_ms = 789; # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

eval { 
    my $result = $api_instance->get_asset_location(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AssetsApi->get_asset_location: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **asset_id** | **int**| ID of the asset | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

**ARRAY[object]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_reefer**
> AssetReeferResponse get_asset_reefer(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AssetsApi;
my $api_instance = WWW::OpenAPIClient::AssetsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $asset_id = 789; # int | ID of the asset
my $start_ms = 789; # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
my $end_ms = 789; # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

eval { 
    my $result = $api_instance->get_asset_reefer(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AssetsApi->get_asset_reefer: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **asset_id** | **int**| ID of the asset | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


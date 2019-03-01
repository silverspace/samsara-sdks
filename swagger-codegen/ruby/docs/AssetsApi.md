# SwaggerClient::AssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_asset_current_locations**](AssetsApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**get_all_assets**](AssetsApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
[**get_asset_location**](AssetsApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**get_asset_reefer**](AssetsApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **get_all_asset_current_locations**
> InlineResponse2001 get_all_asset_current_locations(access_token, , opts)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AssetsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

opts = { 
  group_id: 789 # Integer | Optional group ID if the organization has multiple groups (uncommon).
}

begin
  #/fleet/assets/locations
  result = api_instance.get_all_asset_current_locations(access_token, , opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AssetsApi->get_all_asset_current_locations: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **Integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_all_assets**
> InlineResponse200 get_all_assets(access_token, , opts)

/fleet/assets

Fetch all of the assets for the group.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AssetsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

opts = { 
  group_id: 789 # Integer | Optional group ID if the organization has multiple groups (uncommon).
}

begin
  #/fleet/assets
  result = api_instance.get_all_assets(access_token, , opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AssetsApi->get_all_assets: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **Integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_asset_location**
> AssetLocationResponse get_asset_location(access_token, asset_id, start_ms, end_ms)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AssetsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

asset_id = 789 # Integer | ID of the asset

start_ms = 789 # Integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.

end_ms = 789 # Integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.


begin
  #/fleet/assets/{assetId:[0-9]+}/locations
  result = api_instance.get_asset_location(access_token, asset_id, start_ms, end_ms)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AssetsApi->get_asset_location: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **asset_id** | **Integer**| ID of the asset | 
 **start_ms** | **Integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **Integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetLocationResponse**](AssetLocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_asset_reefer**
> AssetReeferResponse get_asset_reefer(access_token, asset_id, start_ms, end_ms)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AssetsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

asset_id = 789 # Integer | ID of the asset

start_ms = 789 # Integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.

end_ms = 789 # Integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.


begin
  #/fleet/assets/{assetId:[0-9]+}/reefer
  result = api_instance.get_asset_reefer(access_token, asset_id, start_ms, end_ms)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AssetsApi->get_asset_reefer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **asset_id** | **Integer**| ID of the asset | 
 **start_ms** | **Integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **Integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




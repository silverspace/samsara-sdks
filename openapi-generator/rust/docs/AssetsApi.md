# \AssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_asset_current_locations**](AssetsApi.md#get_all_asset_current_locations) | **Get** /fleet/assets/locations | /fleet/assets/locations
[**get_all_assets**](AssetsApi.md#get_all_assets) | **Get** /fleet/assets | /fleet/assets
[**get_asset_location**](AssetsApi.md#get_asset_location) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**get_asset_reefer**](AssetsApi.md#get_asset_reefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **get_all_asset_current_locations**
> ::models::InlineResponse2001 get_all_asset_current_locations(access_token, optional)
/fleet/assets/locations

Fetch current locations of all assets for the group.

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

[**::models::InlineResponse2001**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_assets**
> ::models::InlineResponse200 get_all_assets(access_token, optional)
/fleet/assets

Fetch all of the assets for the group.

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

[**::models::InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_location**
> Vec<Value> get_asset_location(access_token, asset_id, start_ms, end_ms)
/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **asset_id** | **i64**| ID of the asset | 
  **start_ms** | **i64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **end_ms** | **i64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**Vec<Value>**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_reefer**
> ::models::AssetReeferResponse get_asset_reefer(access_token, asset_id, start_ms, end_ms)
/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **asset_id** | **i64**| ID of the asset | 
  **start_ms** | **i64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **end_ms** | **i64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**::models::AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# \AssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllAssetCurrentLocations**](AssetsApi.md#GetAllAssetCurrentLocations) | **Get** /fleet/assets/locations | /fleet/assets/locations
[**GetAllAssets**](AssetsApi.md#GetAllAssets) | **Get** /fleet/assets | /fleet/assets
[**GetAssetLocation**](AssetsApi.md#GetAssetLocation) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**GetAssetReefer**](AssetsApi.md#GetAssetReefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **GetAllAssetCurrentLocations**
> InlineResponse2001 GetAllAssetCurrentLocations(ctx, accessToken, optional)
/fleet/assets/locations

Fetch current locations of all assets for the group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
 **optional** | ***GetAllAssetCurrentLocationsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetAllAssetCurrentLocationsOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **groupId** | **optional.Int64**| Optional group ID if the organization has multiple groups (uncommon). | 

### Return type

[**InlineResponse2001**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAllAssets**
> InlineResponse200 GetAllAssets(ctx, accessToken, optional)
/fleet/assets

Fetch all of the assets for the group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
 **optional** | ***GetAllAssetsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetAllAssetsOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **groupId** | **optional.Int64**| Optional group ID if the organization has multiple groups (uncommon). | 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAssetLocation**
> []map[string]interface{} GetAssetLocation(ctx, accessToken, assetId, startMs, endMs)
/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **assetId** | **int64**| ID of the asset | 
  **startMs** | **int64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **endMs** | **int64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**[]map[string]interface{}**](map[string]interface{}.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAssetReefer**
> AssetReeferResponse GetAssetReefer(ctx, accessToken, assetId, startMs, endMs)
/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **assetId** | **int64**| ID of the asset | 
  **startMs** | **int64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **endMs** | **int64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


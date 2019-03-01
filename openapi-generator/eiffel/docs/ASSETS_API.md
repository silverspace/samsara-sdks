# ASSETS_API

All URIs are relative to *https://api.samsara.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**all_asset_current_locations**](ASSETS_API.md#all_asset_current_locations) | **Get** /fleet/assets/locations | /fleet/assets/locations
[**all_assets**](ASSETS_API.md#all_assets) | **Get** /fleet/assets | /fleet/assets
[**asset_location**](ASSETS_API.md#asset_location) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**asset_reefer**](ASSETS_API.md#asset_reefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **all_asset_current_locations**
> all_asset_current_locations (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ): detachable INLINE_RESPONSE_200_1
	

/fleet/assets/locations

Fetch current locations of all assets for the group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**INLINE_RESPONSE_200_1**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **all_assets**
> all_assets (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ): detachable INLINE_RESPONSE_200
	

/fleet/assets

Fetch all of the assets for the group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**INLINE_RESPONSE_200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_location**
> asset_location (access_token: STRING_32 ; asset_id: INTEGER_64 ; start_ms: INTEGER_64 ; end_ms: INTEGER_64 ): detachable LIST [ANY]
	

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **asset_id** | **INTEGER_64**| ID of the asset | [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**LIST [ANY]**](ANY.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_reefer**
> asset_reefer (access_token: STRING_32 ; asset_id: INTEGER_64 ; start_ms: INTEGER_64 ; end_ms: INTEGER_64 ): detachable ASSET_REEFER_RESPONSE
	

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **asset_id** | **INTEGER_64**| ID of the asset | [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**ASSET_REEFER_RESPONSE**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# AssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllAssetCurrentLocations**](AssetsApi.md#GetAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**GetAllAssets**](AssetsApi.md#GetAllAssets) | **GET** /fleet/assets | /fleet/assets
[**GetAssetLocation**](AssetsApi.md#GetAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**GetAssetReefer**](AssetsApi.md#GetAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **GetAllAssetCurrentLocations**
> InlineResponse2001 GetAllAssetCurrentLocations(access.token, group.id=var.group.id)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.id <- 56 # integer | Optional group ID if the organization has multiple groups (uncommon).

#/fleet/assets/locations
api.instance <- AssetsApi$new()
result <- api.instance$GetAllAssetCurrentLocations(var.access.token, group.id=var.group.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.id** | **integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetAllAssets**
> InlineResponse200 GetAllAssets(access.token, group.id=var.group.id)

/fleet/assets

Fetch all of the assets for the group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.id <- 56 # integer | Optional group ID if the organization has multiple groups (uncommon).

#/fleet/assets
api.instance <- AssetsApi$new()
result <- api.instance$GetAllAssets(var.access.token, group.id=var.group.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.id** | **integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetAssetLocation**
> object GetAssetLocation(access.token, asset.id, start.ms, end.ms)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.asset.id <- 56 # integer | ID of the asset
var.start.ms <- 56 # integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var.end.ms <- 56 # integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

#/fleet/assets/{assetId:[0-9]+}/locations
api.instance <- AssetsApi$new()
result <- api.instance$GetAssetLocation(var.access.token, var.asset.id, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **asset.id** | **integer**| ID of the asset | 
 **start.ms** | **integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end.ms** | **integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetAssetReefer**
> AssetReeferResponse GetAssetReefer(access.token, asset.id, start.ms, end.ms)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.asset.id <- 56 # integer | ID of the asset
var.start.ms <- 56 # integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var.end.ms <- 56 # integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

#/fleet/assets/{assetId:[0-9]+}/reefer
api.instance <- AssetsApi$new()
result <- api.instance$GetAssetReefer(var.access.token, var.asset.id, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **asset.id** | **integer**| ID of the asset | 
 **start.ms** | **integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end.ms** | **integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




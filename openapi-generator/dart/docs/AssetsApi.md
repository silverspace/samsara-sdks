# openapi.api.AssetsApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAssetCurrentLocations**](AssetsApi.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](AssetsApi.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
[**getAssetLocation**](AssetsApi.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](AssetsApi.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **getAllAssetCurrentLocations**
> InlineResponse2001 getAllAssetCurrentLocations(accessToken, groupId)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new AssetsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).

try { 
    var result = api_instance.getAllAssetCurrentLocations(accessToken, groupId);
    print(result);
} catch (e) {
    print("Exception when calling AssetsApi->getAllAssetCurrentLocations: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllAssets**
> InlineResponse200 getAllAssets(accessToken, groupId)

/fleet/assets

Fetch all of the assets for the group.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new AssetsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupId = 789; // int | Optional group ID if the organization has multiple groups (uncommon).

try { 
    var result = api_instance.getAllAssets(accessToken, groupId);
    print(result);
} catch (e) {
    print("Exception when calling AssetsApi->getAllAssets: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetLocation**
> List<Object> getAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new AssetsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var assetId = 789; // int | ID of the asset
var startMs = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var endMs = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try { 
    var result = api_instance.getAssetLocation(accessToken, assetId, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling AssetsApi->getAssetLocation: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **assetId** | **int**| ID of the asset | [default to null]
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**List<Object>**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetReefer**
> AssetReeferResponse getAssetReefer(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new AssetsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var assetId = 789; // int | ID of the asset
var startMs = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var endMs = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try { 
    var result = api_instance.getAssetReefer(accessToken, assetId, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling AssetsApi->getAssetReefer: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **assetId** | **int**| ID of the asset | [default to null]
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


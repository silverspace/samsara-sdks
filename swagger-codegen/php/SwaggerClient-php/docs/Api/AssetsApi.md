# Swagger\Client\AssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAssetCurrentLocations**](AssetsApi.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](AssetsApi.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
[**getAssetLocation**](AssetsApi.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](AssetsApi.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **getAllAssetCurrentLocations**
> \Swagger\Client\Model\InlineResponse2001 getAllAssetCurrentLocations($access_token, $group_id)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$group_id = 789; // int | Optional group ID if the organization has multiple groups (uncommon).

try {
    $result = $apiInstance->getAllAssetCurrentLocations($access_token, $group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssetsApi->getAllAssetCurrentLocations: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse2001**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllAssets**
> \Swagger\Client\Model\InlineResponse200 getAllAssets($access_token, $group_id)

/fleet/assets

Fetch all of the assets for the group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$group_id = 789; // int | Optional group ID if the organization has multiple groups (uncommon).

try {
    $result = $apiInstance->getAllAssets($access_token, $group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssetsApi->getAllAssets: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAssetLocation**
> \Swagger\Client\Model\AssetLocationResponse getAssetLocation($access_token, $asset_id, $start_ms, $end_ms)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$asset_id = 789; // int | ID of the asset
$start_ms = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
$end_ms = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try {
    $result = $apiInstance->getAssetLocation($access_token, $asset_id, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssetsApi->getAssetLocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **asset_id** | **int**| ID of the asset |
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**\Swagger\Client\Model\AssetLocationResponse**](../Model/AssetLocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAssetReefer**
> \Swagger\Client\Model\AssetReeferResponse getAssetReefer($access_token, $asset_id, $start_ms, $end_ms)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$asset_id = 789; // int | ID of the asset
$start_ms = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
$end_ms = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try {
    $result = $apiInstance->getAssetReefer($access_token, $asset_id, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssetsApi->getAssetReefer: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **asset_id** | **int**| ID of the asset |
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**\Swagger\Client\Model\AssetReeferResponse**](../Model/AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


# Swagger\Client\SafetyApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDriverSafetyScore**](SafetyApi.md#getDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getVehicleHarshEvent**](SafetyApi.md#getVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleSafetyScore**](SafetyApi.md#getVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


# **getDriverSafetyScore**
> \Swagger\Client\Model\DriverSafetyScoreResponse getDriverSafetyScore($driver_id, $access_token, $start_ms, $end_ms)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SafetyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$driver_id = 789; // int | ID of the driver
$access_token = "access_token_example"; // string | Samsara API access token.
$start_ms = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
$end_ms = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try {
    $result = $apiInstance->getDriverSafetyScore($driver_id, $access_token, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SafetyApi->getDriverSafetyScore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver_id** | **int**| ID of the driver |
 **access_token** | **string**| Samsara API access token. |
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**\Swagger\Client\Model\DriverSafetyScoreResponse**](../Model/DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getVehicleHarshEvent**
> \Swagger\Client\Model\VehicleHarshEventResponse getVehicleHarshEvent($vehicle_id, $access_token, $timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SafetyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$vehicle_id = 789; // int | ID of the vehicle
$access_token = "access_token_example"; // string | Samsara API access token.
$timestamp = 789; // int | Timestamp in milliseconds representing the timestamp of a harsh event.

try {
    $result = $apiInstance->getVehicleHarshEvent($vehicle_id, $access_token, $timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SafetyApi->getVehicleHarshEvent: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle |
 **access_token** | **string**| Samsara API access token. |
 **timestamp** | **int**| Timestamp in milliseconds representing the timestamp of a harsh event. |

### Return type

[**\Swagger\Client\Model\VehicleHarshEventResponse**](../Model/VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getVehicleSafetyScore**
> \Swagger\Client\Model\VehicleSafetyScoreResponse getVehicleSafetyScore($vehicle_id, $access_token, $start_ms, $end_ms)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SafetyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$vehicle_id = 789; // int | ID of the vehicle
$access_token = "access_token_example"; // string | Samsara API access token.
$start_ms = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
$end_ms = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try {
    $result = $apiInstance->getVehicleSafetyScore($vehicle_id, $access_token, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SafetyApi->getVehicleSafetyScore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle |
 **access_token** | **string**| Samsara API access token. |
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**\Swagger\Client\Model\VehicleSafetyScoreResponse**](../Model/VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


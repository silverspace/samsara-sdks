# openapi.api.SafetyApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDriverSafetyScore**](SafetyApi.md#getDriverSafetyScore) | **Get** /fleet/drivers/:driverId/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getVehicleHarshEvent**](SafetyApi.md#getVehicleHarshEvent) | **Get** /fleet/vehicles/:vehicleId/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleSafetyScore**](SafetyApi.md#getVehicleSafetyScore) | **Get** /fleet/vehicles/:vehicleId/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


# **getDriverSafetyScore**
> DriverSafetyScoreResponse getDriverSafetyScore(driverId, accessToken, startMs, endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new SafetyApi();
var driverId = 789; // int | ID of the driver
var accessToken = accessToken_example; // String | Samsara API access token.
var startMs = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var endMs = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try { 
    var result = api_instance.getDriverSafetyScore(driverId, accessToken, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling SafetyApi->getDriverSafetyScore: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **int**| ID of the driver | [default to null]
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleHarshEvent**
> VehicleHarshEventResponse getVehicleHarshEvent(vehicleId, accessToken, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new SafetyApi();
var vehicleId = 789; // int | ID of the vehicle
var accessToken = accessToken_example; // String | Samsara API access token.
var timestamp = 789; // int | Timestamp in milliseconds representing the timestamp of a harsh event.

try { 
    var result = api_instance.getVehicleHarshEvent(vehicleId, accessToken, timestamp);
    print(result);
} catch (e) {
    print("Exception when calling SafetyApi->getVehicleHarshEvent: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **int**| ID of the vehicle | [default to null]
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **timestamp** | **int**| Timestamp in milliseconds representing the timestamp of a harsh event. | [default to null]

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleSafetyScore**
> VehicleSafetyScoreResponse getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new SafetyApi();
var vehicleId = 789; // int | ID of the vehicle
var accessToken = accessToken_example; // String | Samsara API access token.
var startMs = 789; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var endMs = 789; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try { 
    var result = api_instance.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
    print(result);
} catch (e) {
    print("Exception when calling SafetyApi->getVehicleSafetyScore: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **int**| ID of the vehicle | [default to null]
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


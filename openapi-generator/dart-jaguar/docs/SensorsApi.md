# openapi.api.SensorsApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensors**](SensorsApi.md#getSensors) | **Post** /sensors/list | /sensors/list
[**getSensorsCargo**](SensorsApi.md#getSensorsCargo) | **Post** /sensors/cargo | /sensors/cargo
[**getSensorsDoor**](SensorsApi.md#getSensorsDoor) | **Post** /sensors/door | /sensors/door
[**getSensorsHistory**](SensorsApi.md#getSensorsHistory) | **Post** /sensors/history | /sensors/history
[**getSensorsHumidity**](SensorsApi.md#getSensorsHumidity) | **Post** /sensors/humidity | /sensors/humidity
[**getSensorsTemperature**](SensorsApi.md#getSensorsTemperature) | **Post** /sensors/temperature | /sensors/temperature


# **getSensors**
> InlineResponse2008 getSensors(accessToken, groupParam)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new SensorsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var groupParam = new InlineObject23(); // InlineObject23 | 

try { 
    var result = api_instance.getSensors(accessToken, groupParam);
    print(result);
} catch (e) {
    print("Exception when calling SensorsApi->getSensors: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject23**](InlineObject23.md)|  | 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsCargo**
> CargoResponse getSensorsCargo(accessToken, sensorParam)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new SensorsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var sensorParam = new InlineObject19(); // InlineObject19 | 

try { 
    var result = api_instance.getSensorsCargo(accessToken, sensorParam);
    print(result);
} catch (e) {
    print("Exception when calling SensorsApi->getSensorsCargo: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject19**](InlineObject19.md)|  | 

### Return type

[**CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsDoor**
> DoorResponse getSensorsDoor(accessToken, sensorParam)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new SensorsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var sensorParam = new InlineObject20(); // InlineObject20 | 

try { 
    var result = api_instance.getSensorsDoor(accessToken, sensorParam);
    print(result);
} catch (e) {
    print("Exception when calling SensorsApi->getSensorsDoor: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject20**](InlineObject20.md)|  | 

### Return type

[**DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsHistory**
> SensorHistoryResponse getSensorsHistory(accessToken, historyParam)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new SensorsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var historyParam = new InlineObject21(); // InlineObject21 | 

try { 
    var result = api_instance.getSensorsHistory(accessToken, historyParam);
    print(result);
} catch (e) {
    print("Exception when calling SensorsApi->getSensorsHistory: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **historyParam** | [**InlineObject21**](InlineObject21.md)|  | 

### Return type

[**SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsHumidity**
> HumidityResponse getSensorsHumidity(accessToken, sensorParam)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new SensorsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var sensorParam = new InlineObject22(); // InlineObject22 | 

try { 
    var result = api_instance.getSensorsHumidity(accessToken, sensorParam);
    print(result);
} catch (e) {
    print("Exception when calling SensorsApi->getSensorsHumidity: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject22**](InlineObject22.md)|  | 

### Return type

[**HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsTemperature**
> TemperatureResponse getSensorsTemperature(accessToken, sensorParam)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new SensorsApi();
var accessToken = accessToken_example; // String | Samsara API access token.
var sensorParam = new InlineObject24(); // InlineObject24 | 

try { 
    var result = api_instance.getSensorsTemperature(accessToken, sensorParam);
    print(result);
} catch (e) {
    print("Exception when calling SensorsApi->getSensorsTemperature: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject24**](InlineObject24.md)|  | 

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


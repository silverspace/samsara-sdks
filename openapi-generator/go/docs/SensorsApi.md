# \SensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSensors**](SensorsApi.md#GetSensors) | **Post** /sensors/list | /sensors/list
[**GetSensorsCargo**](SensorsApi.md#GetSensorsCargo) | **Post** /sensors/cargo | /sensors/cargo
[**GetSensorsDoor**](SensorsApi.md#GetSensorsDoor) | **Post** /sensors/door | /sensors/door
[**GetSensorsHistory**](SensorsApi.md#GetSensorsHistory) | **Post** /sensors/history | /sensors/history
[**GetSensorsHumidity**](SensorsApi.md#GetSensorsHumidity) | **Post** /sensors/humidity | /sensors/humidity
[**GetSensorsTemperature**](SensorsApi.md#GetSensorsTemperature) | **Post** /sensors/temperature | /sensors/temperature


# **GetSensors**
> InlineResponse2008 GetSensors(ctx, accessToken, groupParam)
/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **groupParam** | [**InlineObject23**](InlineObject23.md)|  | 

### Return type

[**InlineResponse2008**](inline_response_200_8.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetSensorsCargo**
> CargoResponse GetSensorsCargo(ctx, accessToken, sensorParam)
/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **sensorParam** | [**InlineObject19**](InlineObject19.md)|  | 

### Return type

[**CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetSensorsDoor**
> DoorResponse GetSensorsDoor(ctx, accessToken, sensorParam)
/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **sensorParam** | [**InlineObject20**](InlineObject20.md)|  | 

### Return type

[**DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetSensorsHistory**
> SensorHistoryResponse GetSensorsHistory(ctx, accessToken, historyParam)
/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **historyParam** | [**InlineObject21**](InlineObject21.md)|  | 

### Return type

[**SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetSensorsHumidity**
> HumidityResponse GetSensorsHumidity(ctx, accessToken, sensorParam)
/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **sensorParam** | [**InlineObject22**](InlineObject22.md)|  | 

### Return type

[**HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetSensorsTemperature**
> TemperatureResponse GetSensorsTemperature(ctx, accessToken, sensorParam)
/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **sensorParam** | [**InlineObject24**](InlineObject24.md)|  | 

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


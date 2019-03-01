# \SensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_sensors**](SensorsApi.md#get_sensors) | **Post** /sensors/list | /sensors/list
[**get_sensors_cargo**](SensorsApi.md#get_sensors_cargo) | **Post** /sensors/cargo | /sensors/cargo
[**get_sensors_door**](SensorsApi.md#get_sensors_door) | **Post** /sensors/door | /sensors/door
[**get_sensors_history**](SensorsApi.md#get_sensors_history) | **Post** /sensors/history | /sensors/history
[**get_sensors_humidity**](SensorsApi.md#get_sensors_humidity) | **Post** /sensors/humidity | /sensors/humidity
[**get_sensors_temperature**](SensorsApi.md#get_sensors_temperature) | **Post** /sensors/temperature | /sensors/temperature


# **get_sensors**
> ::models::InlineResponse2008 get_sensors(access_token, group_param)
/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **group_param** | [**InlineObject23**](InlineObject23.md)|  | 

### Return type

[**::models::InlineResponse2008**](inline_response_200_8.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_cargo**
> ::models::CargoResponse get_sensors_cargo(access_token, sensor_param)
/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **sensor_param** | [**InlineObject19**](InlineObject19.md)|  | 

### Return type

[**::models::CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_door**
> ::models::DoorResponse get_sensors_door(access_token, sensor_param)
/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **sensor_param** | [**InlineObject20**](InlineObject20.md)|  | 

### Return type

[**::models::DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_history**
> ::models::SensorHistoryResponse get_sensors_history(access_token, history_param)
/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **history_param** | [**InlineObject21**](InlineObject21.md)|  | 

### Return type

[**::models::SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_humidity**
> ::models::HumidityResponse get_sensors_humidity(access_token, sensor_param)
/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **sensor_param** | [**InlineObject22**](InlineObject22.md)|  | 

### Return type

[**::models::HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_temperature**
> ::models::TemperatureResponse get_sensors_temperature(access_token, sensor_param)
/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **sensor_param** | [**InlineObject24**](InlineObject24.md)|  | 

### Return type

[**::models::TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


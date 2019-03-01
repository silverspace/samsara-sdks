# SENSORS_API

All URIs are relative to *https://api.samsara.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**sensors**](SENSORS_API.md#sensors) | **Post** /sensors/list | /sensors/list
[**sensors_cargo**](SENSORS_API.md#sensors_cargo) | **Post** /sensors/cargo | /sensors/cargo
[**sensors_door**](SENSORS_API.md#sensors_door) | **Post** /sensors/door | /sensors/door
[**sensors_history**](SENSORS_API.md#sensors_history) | **Post** /sensors/history | /sensors/history
[**sensors_humidity**](SENSORS_API.md#sensors_humidity) | **Post** /sensors/humidity | /sensors/humidity
[**sensors_temperature**](SENSORS_API.md#sensors_temperature) | **Post** /sensors/temperature | /sensors/temperature


# **sensors**
> sensors (access_token: STRING_32 ; group_param: INLINE_OBJECT_23 ): detachable INLINE_RESPONSE_200_8
	

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_param** | [**INLINE_OBJECT_23**](INLINE_OBJECT_23.md)|  | 

### Return type

[**INLINE_RESPONSE_200_8**](inline_response_200_8.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sensors_cargo**
> sensors_cargo (access_token: STRING_32 ; sensor_param: INLINE_OBJECT_19 ): detachable CARGO_RESPONSE
	

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **sensor_param** | [**INLINE_OBJECT_19**](INLINE_OBJECT_19.md)|  | 

### Return type

[**CARGO_RESPONSE**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sensors_door**
> sensors_door (access_token: STRING_32 ; sensor_param: INLINE_OBJECT_20 ): detachable DOOR_RESPONSE
	

/sensors/door

Get door monitor status (closed / open) for requested sensors.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **sensor_param** | [**INLINE_OBJECT_20**](INLINE_OBJECT_20.md)|  | 

### Return type

[**DOOR_RESPONSE**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sensors_history**
> sensors_history (access_token: STRING_32 ; history_param: INLINE_OBJECT_21 ): detachable SENSOR_HISTORY_RESPONSE
	

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **history_param** | [**INLINE_OBJECT_21**](INLINE_OBJECT_21.md)|  | 

### Return type

[**SENSOR_HISTORY_RESPONSE**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sensors_humidity**
> sensors_humidity (access_token: STRING_32 ; sensor_param: INLINE_OBJECT_22 ): detachable HUMIDITY_RESPONSE
	

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **sensor_param** | [**INLINE_OBJECT_22**](INLINE_OBJECT_22.md)|  | 

### Return type

[**HUMIDITY_RESPONSE**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sensors_temperature**
> sensors_temperature (access_token: STRING_32 ; sensor_param: INLINE_OBJECT_24 ): detachable TEMPERATURE_RESPONSE
	

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **sensor_param** | [**INLINE_OBJECT_24**](INLINE_OBJECT_24.md)|  | 

### Return type

[**TEMPERATURE_RESPONSE**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


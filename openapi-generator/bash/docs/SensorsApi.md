# SensorsApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensors**](SensorsApi.md#getSensors) | **POST** /sensors/list | /sensors/list
[**getSensorsCargo**](SensorsApi.md#getSensorsCargo) | **POST** /sensors/cargo | /sensors/cargo
[**getSensorsDoor**](SensorsApi.md#getSensorsDoor) | **POST** /sensors/door | /sensors/door
[**getSensorsHistory**](SensorsApi.md#getSensorsHistory) | **POST** /sensors/history | /sensors/history
[**getSensorsHumidity**](SensorsApi.md#getSensorsHumidity) | **POST** /sensors/humidity | /sensors/humidity
[**getSensorsTemperature**](SensorsApi.md#getSensorsTemperature) | **POST** /sensors/temperature | /sensors/temperature


## **getSensors**

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example
```bash
 getSensors  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject23**](InlineObject23.md) |  |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getSensorsCargo**

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example
```bash
 getSensorsCargo  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject19**](InlineObject19.md) |  |

### Return type

[**CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getSensorsDoor**

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example
```bash
 getSensorsDoor  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject20**](InlineObject20.md) |  |

### Return type

[**DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getSensorsHistory**

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example
```bash
 getSensorsHistory  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **historyParam** | [**InlineObject21**](InlineObject21.md) |  |

### Return type

[**SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getSensorsHumidity**

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example
```bash
 getSensorsHumidity  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject22**](InlineObject22.md) |  |

### Return type

[**HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getSensorsTemperature**

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example
```bash
 getSensorsTemperature  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject24**](InlineObject24.md) |  |

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


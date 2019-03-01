# SensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSensors**](SensorsApi.md#GetSensors) | **POST** /sensors/list | /sensors/list
[**GetSensorsCargo**](SensorsApi.md#GetSensorsCargo) | **POST** /sensors/cargo | /sensors/cargo
[**GetSensorsDoor**](SensorsApi.md#GetSensorsDoor) | **POST** /sensors/door | /sensors/door
[**GetSensorsHistory**](SensorsApi.md#GetSensorsHistory) | **POST** /sensors/history | /sensors/history
[**GetSensorsHumidity**](SensorsApi.md#GetSensorsHumidity) | **POST** /sensors/humidity | /sensors/humidity
[**GetSensorsTemperature**](SensorsApi.md#GetSensorsTemperature) | **POST** /sensors/temperature | /sensors/temperature


# **GetSensors**
> InlineResponse2008 GetSensors(access.token, group.param)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.param <- InlineObject23$new() # InlineObject23 | 

#/sensors/list
api.instance <- SensorsApi$new()
result <- api.instance$GetSensors(var.access.token, var.group.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.param** | [**InlineObject23**](InlineObject23.md)|  | 

### Return type

[**InlineResponse2008**](inline_response_200_8.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetSensorsCargo**
> CargoResponse GetSensorsCargo(access.token, sensor.param)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.sensor.param <- InlineObject19$new() # InlineObject19 | 

#/sensors/cargo
api.instance <- SensorsApi$new()
result <- api.instance$GetSensorsCargo(var.access.token, var.sensor.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **sensor.param** | [**InlineObject19**](InlineObject19.md)|  | 

### Return type

[**CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetSensorsDoor**
> DoorResponse GetSensorsDoor(access.token, sensor.param)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.sensor.param <- InlineObject20$new() # InlineObject20 | 

#/sensors/door
api.instance <- SensorsApi$new()
result <- api.instance$GetSensorsDoor(var.access.token, var.sensor.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **sensor.param** | [**InlineObject20**](InlineObject20.md)|  | 

### Return type

[**DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetSensorsHistory**
> SensorHistoryResponse GetSensorsHistory(access.token, history.param)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.history.param <- InlineObject21$new() # InlineObject21 | 

#/sensors/history
api.instance <- SensorsApi$new()
result <- api.instance$GetSensorsHistory(var.access.token, var.history.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **history.param** | [**InlineObject21**](InlineObject21.md)|  | 

### Return type

[**SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetSensorsHumidity**
> HumidityResponse GetSensorsHumidity(access.token, sensor.param)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.sensor.param <- InlineObject22$new() # InlineObject22 | 

#/sensors/humidity
api.instance <- SensorsApi$new()
result <- api.instance$GetSensorsHumidity(var.access.token, var.sensor.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **sensor.param** | [**InlineObject22**](InlineObject22.md)|  | 

### Return type

[**HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetSensorsTemperature**
> TemperatureResponse GetSensorsTemperature(access.token, sensor.param)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.sensor.param <- InlineObject24$new() # InlineObject24 | 

#/sensors/temperature
api.instance <- SensorsApi$new()
result <- api.instance$GetSensorsTemperature(var.access.token, var.sensor.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **sensor.param** | [**InlineObject24**](InlineObject24.md)|  | 

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




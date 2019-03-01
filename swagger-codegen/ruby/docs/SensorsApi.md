# SwaggerClient::SensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_sensors**](SensorsApi.md#get_sensors) | **POST** /sensors/list | /sensors/list
[**get_sensors_cargo**](SensorsApi.md#get_sensors_cargo) | **POST** /sensors/cargo | /sensors/cargo
[**get_sensors_door**](SensorsApi.md#get_sensors_door) | **POST** /sensors/door | /sensors/door
[**get_sensors_history**](SensorsApi.md#get_sensors_history) | **POST** /sensors/history | /sensors/history
[**get_sensors_humidity**](SensorsApi.md#get_sensors_humidity) | **POST** /sensors/humidity | /sensors/humidity
[**get_sensors_temperature**](SensorsApi.md#get_sensors_temperature) | **POST** /sensors/temperature | /sensors/temperature


# **get_sensors**
> InlineResponse2008 get_sensors(access_token, group_param)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SensorsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

group_param = SwaggerClient::GroupParam.new # GroupParam | Group ID to query.


begin
  #/sensors/list
  result = api_instance.get_sensors(access_token, group_param)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SensorsApi->get_sensors: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_param** | [**GroupParam**](GroupParam.md)| Group ID to query. | 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_sensors_cargo**
> CargoResponse get_sensors_cargo(access_token, sensor_param)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SensorsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

sensor_param = SwaggerClient::SensorParam.new # SensorParam | Group ID and list of sensor IDs to query.


begin
  #/sensors/cargo
  result = api_instance.get_sensors_cargo(access_token, sensor_param)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SensorsApi->get_sensors_cargo: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **sensor_param** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. | 

### Return type

[**CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_sensors_door**
> DoorResponse get_sensors_door(access_token, sensor_param)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SensorsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

sensor_param = SwaggerClient::SensorParam.new # SensorParam | Group ID and list of sensor IDs to query.


begin
  #/sensors/door
  result = api_instance.get_sensors_door(access_token, sensor_param)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SensorsApi->get_sensors_door: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **sensor_param** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. | 

### Return type

[**DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_sensors_history**
> SensorHistoryResponse get_sensors_history(access_token, history_param)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SensorsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

history_param = SwaggerClient::HistoryParam1.new # HistoryParam1 | Group ID, time range and resolution, and list of sensor ID, field pairs to query.


begin
  #/sensors/history
  result = api_instance.get_sensors_history(access_token, history_param)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SensorsApi->get_sensors_history: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **history_param** | [**HistoryParam1**](HistoryParam1.md)| Group ID, time range and resolution, and list of sensor ID, field pairs to query. | 

### Return type

[**SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_sensors_humidity**
> HumidityResponse get_sensors_humidity(access_token, sensor_param)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SensorsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

sensor_param = SwaggerClient::SensorParam.new # SensorParam | Group ID and list of sensor IDs to query.


begin
  #/sensors/humidity
  result = api_instance.get_sensors_humidity(access_token, sensor_param)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SensorsApi->get_sensors_humidity: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **sensor_param** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. | 

### Return type

[**HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_sensors_temperature**
> TemperatureResponse get_sensors_temperature(access_token, sensor_param)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SensorsApi.new

access_token = 'access_token_example' # String | Samsara API access token.

sensor_param = SwaggerClient::SensorParam.new # SensorParam | Group ID and list of sensor IDs to query.


begin
  #/sensors/temperature
  result = api_instance.get_sensors_temperature(access_token, sensor_param)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SensorsApi->get_sensors_temperature: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **sensor_param** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. | 

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




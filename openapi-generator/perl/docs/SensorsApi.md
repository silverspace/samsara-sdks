# WWW::OpenAPIClient::SensorsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::SensorsApi;
```

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
> InlineResponse2008 get_sensors(access_token => $access_token, group_param => $group_param)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SensorsApi;
my $api_instance = WWW::OpenAPIClient::SensorsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_param = WWW::OpenAPIClient::Object::InlineObject23->new(); # InlineObject23 | 

eval { 
    my $result = $api_instance->get_sensors(access_token => $access_token, group_param => $group_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SensorsApi->get_sensors: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_param** | [**InlineObject23**](InlineObject23.md)|  | 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_cargo**
> CargoResponse get_sensors_cargo(access_token => $access_token, sensor_param => $sensor_param)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SensorsApi;
my $api_instance = WWW::OpenAPIClient::SensorsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $sensor_param = WWW::OpenAPIClient::Object::InlineObject19->new(); # InlineObject19 | 

eval { 
    my $result = $api_instance->get_sensors_cargo(access_token => $access_token, sensor_param => $sensor_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SensorsApi->get_sensors_cargo: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **sensor_param** | [**InlineObject19**](InlineObject19.md)|  | 

### Return type

[**CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_door**
> DoorResponse get_sensors_door(access_token => $access_token, sensor_param => $sensor_param)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SensorsApi;
my $api_instance = WWW::OpenAPIClient::SensorsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $sensor_param = WWW::OpenAPIClient::Object::InlineObject20->new(); # InlineObject20 | 

eval { 
    my $result = $api_instance->get_sensors_door(access_token => $access_token, sensor_param => $sensor_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SensorsApi->get_sensors_door: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **sensor_param** | [**InlineObject20**](InlineObject20.md)|  | 

### Return type

[**DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_history**
> SensorHistoryResponse get_sensors_history(access_token => $access_token, history_param => $history_param)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SensorsApi;
my $api_instance = WWW::OpenAPIClient::SensorsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $history_param = WWW::OpenAPIClient::Object::InlineObject21->new(); # InlineObject21 | 

eval { 
    my $result = $api_instance->get_sensors_history(access_token => $access_token, history_param => $history_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SensorsApi->get_sensors_history: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **history_param** | [**InlineObject21**](InlineObject21.md)|  | 

### Return type

[**SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_humidity**
> HumidityResponse get_sensors_humidity(access_token => $access_token, sensor_param => $sensor_param)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SensorsApi;
my $api_instance = WWW::OpenAPIClient::SensorsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $sensor_param = WWW::OpenAPIClient::Object::InlineObject22->new(); # InlineObject22 | 

eval { 
    my $result = $api_instance->get_sensors_humidity(access_token => $access_token, sensor_param => $sensor_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SensorsApi->get_sensors_humidity: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **sensor_param** | [**InlineObject22**](InlineObject22.md)|  | 

### Return type

[**HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sensors_temperature**
> TemperatureResponse get_sensors_temperature(access_token => $access_token, sensor_param => $sensor_param)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SensorsApi;
my $api_instance = WWW::OpenAPIClient::SensorsApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $sensor_param = WWW::OpenAPIClient::Object::InlineObject24->new(); # InlineObject24 | 

eval { 
    my $result = $api_instance->get_sensors_temperature(access_token => $access_token, sensor_param => $sensor_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SensorsApi->get_sensors_temperature: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **sensor_param** | [**InlineObject24**](InlineObject24.md)|  | 

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


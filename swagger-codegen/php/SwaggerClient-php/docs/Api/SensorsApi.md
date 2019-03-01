# Swagger\Client\SensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensors**](SensorsApi.md#getSensors) | **POST** /sensors/list | /sensors/list
[**getSensorsCargo**](SensorsApi.md#getSensorsCargo) | **POST** /sensors/cargo | /sensors/cargo
[**getSensorsDoor**](SensorsApi.md#getSensorsDoor) | **POST** /sensors/door | /sensors/door
[**getSensorsHistory**](SensorsApi.md#getSensorsHistory) | **POST** /sensors/history | /sensors/history
[**getSensorsHumidity**](SensorsApi.md#getSensorsHumidity) | **POST** /sensors/humidity | /sensors/humidity
[**getSensorsTemperature**](SensorsApi.md#getSensorsTemperature) | **POST** /sensors/temperature | /sensors/temperature


# **getSensors**
> \Swagger\Client\Model\InlineResponse2008 getSensors($access_token, $group_param)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SensorsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$group_param = new \Swagger\Client\Model\GroupParam(); // \Swagger\Client\Model\GroupParam | Group ID to query.

try {
    $result = $apiInstance->getSensors($access_token, $group_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SensorsApi->getSensors: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_param** | [**\Swagger\Client\Model\GroupParam**](../Model/GroupParam.md)| Group ID to query. |

### Return type

[**\Swagger\Client\Model\InlineResponse2008**](../Model/InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSensorsCargo**
> \Swagger\Client\Model\CargoResponse getSensorsCargo($access_token, $sensor_param)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SensorsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$sensor_param = new \Swagger\Client\Model\SensorParam(); // \Swagger\Client\Model\SensorParam | Group ID and list of sensor IDs to query.

try {
    $result = $apiInstance->getSensorsCargo($access_token, $sensor_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SensorsApi->getSensorsCargo: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **sensor_param** | [**\Swagger\Client\Model\SensorParam**](../Model/SensorParam.md)| Group ID and list of sensor IDs to query. |

### Return type

[**\Swagger\Client\Model\CargoResponse**](../Model/CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSensorsDoor**
> \Swagger\Client\Model\DoorResponse getSensorsDoor($access_token, $sensor_param)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SensorsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$sensor_param = new \Swagger\Client\Model\SensorParam(); // \Swagger\Client\Model\SensorParam | Group ID and list of sensor IDs to query.

try {
    $result = $apiInstance->getSensorsDoor($access_token, $sensor_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SensorsApi->getSensorsDoor: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **sensor_param** | [**\Swagger\Client\Model\SensorParam**](../Model/SensorParam.md)| Group ID and list of sensor IDs to query. |

### Return type

[**\Swagger\Client\Model\DoorResponse**](../Model/DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSensorsHistory**
> \Swagger\Client\Model\SensorHistoryResponse getSensorsHistory($access_token, $history_param)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SensorsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$history_param = new \Swagger\Client\Model\HistoryParam1(); // \Swagger\Client\Model\HistoryParam1 | Group ID, time range and resolution, and list of sensor ID, field pairs to query.

try {
    $result = $apiInstance->getSensorsHistory($access_token, $history_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SensorsApi->getSensorsHistory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **history_param** | [**\Swagger\Client\Model\HistoryParam1**](../Model/HistoryParam1.md)| Group ID, time range and resolution, and list of sensor ID, field pairs to query. |

### Return type

[**\Swagger\Client\Model\SensorHistoryResponse**](../Model/SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSensorsHumidity**
> \Swagger\Client\Model\HumidityResponse getSensorsHumidity($access_token, $sensor_param)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SensorsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$sensor_param = new \Swagger\Client\Model\SensorParam(); // \Swagger\Client\Model\SensorParam | Group ID and list of sensor IDs to query.

try {
    $result = $apiInstance->getSensorsHumidity($access_token, $sensor_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SensorsApi->getSensorsHumidity: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **sensor_param** | [**\Swagger\Client\Model\SensorParam**](../Model/SensorParam.md)| Group ID and list of sensor IDs to query. |

### Return type

[**\Swagger\Client\Model\HumidityResponse**](../Model/HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSensorsTemperature**
> \Swagger\Client\Model\TemperatureResponse getSensorsTemperature($access_token, $sensor_param)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SensorsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = "access_token_example"; // string | Samsara API access token.
$sensor_param = new \Swagger\Client\Model\SensorParam(); // \Swagger\Client\Model\SensorParam | Group ID and list of sensor IDs to query.

try {
    $result = $apiInstance->getSensorsTemperature($access_token, $sensor_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SensorsApi->getSensorsTemperature: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **sensor_param** | [**\Swagger\Client\Model\SensorParam**](../Model/SensorParam.md)| Group ID and list of sensor IDs to query. |

### Return type

[**\Swagger\Client\Model\TemperatureResponse**](../Model/TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


# SensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensors**](SensorsApi.md#getSensors) | **POST** /sensors/list | /sensors/list
[**getSensorsCargo**](SensorsApi.md#getSensorsCargo) | **POST** /sensors/cargo | /sensors/cargo
[**getSensorsDoor**](SensorsApi.md#getSensorsDoor) | **POST** /sensors/door | /sensors/door
[**getSensorsHistory**](SensorsApi.md#getSensorsHistory) | **POST** /sensors/history | /sensors/history
[**getSensorsHumidity**](SensorsApi.md#getSensorsHumidity) | **POST** /sensors/humidity | /sensors/humidity
[**getSensorsTemperature**](SensorsApi.md#getSensorsTemperature) | **POST** /sensors/temperature | /sensors/temperature


<a name="getSensors"></a>
# **getSensors**
> InlineResponse2008 getSensors(accessToken, groupParam)

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example
```java
// Import classes:
//import io.swagger.client.api.SensorsApi;

SensorsApi apiInstance = new SensorsApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
GroupParam groupParam = new GroupParam(); // GroupParam | Group ID to query.
try {
    InlineResponse2008 result = apiInstance.getSensors(accessToken, groupParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SensorsApi#getSensors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **groupParam** | [**GroupParam**](GroupParam.md)| Group ID to query. |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsCargo"></a>
# **getSensorsCargo**
> CargoResponse getSensorsCargo(accessToken, sensorParam)

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example
```java
// Import classes:
//import io.swagger.client.api.SensorsApi;

SensorsApi apiInstance = new SensorsApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
SensorParam sensorParam = new SensorParam(); // SensorParam | Group ID and list of sensor IDs to query.
try {
    CargoResponse result = apiInstance.getSensorsCargo(accessToken, sensorParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SensorsApi#getSensorsCargo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **sensorParam** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. |

### Return type

[**CargoResponse**](CargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsDoor"></a>
# **getSensorsDoor**
> DoorResponse getSensorsDoor(accessToken, sensorParam)

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example
```java
// Import classes:
//import io.swagger.client.api.SensorsApi;

SensorsApi apiInstance = new SensorsApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
SensorParam sensorParam = new SensorParam(); // SensorParam | Group ID and list of sensor IDs to query.
try {
    DoorResponse result = apiInstance.getSensorsDoor(accessToken, sensorParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SensorsApi#getSensorsDoor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **sensorParam** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. |

### Return type

[**DoorResponse**](DoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsHistory"></a>
# **getSensorsHistory**
> SensorHistoryResponse getSensorsHistory(accessToken, historyParam)

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example
```java
// Import classes:
//import io.swagger.client.api.SensorsApi;

SensorsApi apiInstance = new SensorsApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
HistoryParam1 historyParam = new HistoryParam1(); // HistoryParam1 | Group ID, time range and resolution, and list of sensor ID, field pairs to query.
try {
    SensorHistoryResponse result = apiInstance.getSensorsHistory(accessToken, historyParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SensorsApi#getSensorsHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **historyParam** | [**HistoryParam1**](HistoryParam1.md)| Group ID, time range and resolution, and list of sensor ID, field pairs to query. |

### Return type

[**SensorHistoryResponse**](SensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsHumidity"></a>
# **getSensorsHumidity**
> HumidityResponse getSensorsHumidity(accessToken, sensorParam)

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example
```java
// Import classes:
//import io.swagger.client.api.SensorsApi;

SensorsApi apiInstance = new SensorsApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
SensorParam sensorParam = new SensorParam(); // SensorParam | Group ID and list of sensor IDs to query.
try {
    HumidityResponse result = apiInstance.getSensorsHumidity(accessToken, sensorParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SensorsApi#getSensorsHumidity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **sensorParam** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. |

### Return type

[**HumidityResponse**](HumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSensorsTemperature"></a>
# **getSensorsTemperature**
> TemperatureResponse getSensorsTemperature(accessToken, sensorParam)

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example
```java
// Import classes:
//import io.swagger.client.api.SensorsApi;

SensorsApi apiInstance = new SensorsApi();
String accessToken = "accessToken_example"; // String | Samsara API access token.
SensorParam sensorParam = new SensorParam(); // SensorParam | Group ID and list of sensor IDs to query.
try {
    TemperatureResponse result = apiInstance.getSensorsTemperature(accessToken, sensorParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SensorsApi#getSensorsTemperature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. |
 **sensorParam** | [**SensorParam**](SensorParam.md)| Group ID and list of sensor IDs to query. |

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


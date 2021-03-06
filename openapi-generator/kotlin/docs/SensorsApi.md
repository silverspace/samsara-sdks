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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SensorsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupParam : InlineObject23 =  // InlineObject23 | 
try {
    val result : InlineResponse2008 = apiInstance.getSensors(accessToken, groupParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SensorsApi#getSensors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SensorsApi#getSensors")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject23**](InlineObject23.md)|  |

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SensorsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val sensorParam : InlineObject19 =  // InlineObject19 | 
try {
    val result : CargoResponse = apiInstance.getSensorsCargo(accessToken, sensorParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SensorsApi#getSensorsCargo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SensorsApi#getSensorsCargo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject19**](InlineObject19.md)|  |

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SensorsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val sensorParam : InlineObject20 =  // InlineObject20 | 
try {
    val result : DoorResponse = apiInstance.getSensorsDoor(accessToken, sensorParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SensorsApi#getSensorsDoor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SensorsApi#getSensorsDoor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject20**](InlineObject20.md)|  |

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SensorsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val historyParam : InlineObject21 =  // InlineObject21 | 
try {
    val result : SensorHistoryResponse = apiInstance.getSensorsHistory(accessToken, historyParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SensorsApi#getSensorsHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SensorsApi#getSensorsHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **historyParam** | [**InlineObject21**](InlineObject21.md)|  |

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SensorsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val sensorParam : InlineObject22 =  // InlineObject22 | 
try {
    val result : HumidityResponse = apiInstance.getSensorsHumidity(accessToken, sensorParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SensorsApi#getSensorsHumidity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SensorsApi#getSensorsHumidity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject22**](InlineObject22.md)|  |

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SensorsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val sensorParam : InlineObject24 =  // InlineObject24 | 
try {
    val result : TemperatureResponse = apiInstance.getSensorsTemperature(accessToken, sensorParam)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SensorsApi#getSensorsTemperature")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SensorsApi#getSensorsTemperature")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **sensorParam** | [**InlineObject24**](InlineObject24.md)|  |

### Return type

[**TemperatureResponse**](TemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# SafetyApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDriverSafetyScore**](SafetyApi.md#getDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getVehicleHarshEvent**](SafetyApi.md#getVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleSafetyScore**](SafetyApi.md#getVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


<a name="getDriverSafetyScore"></a>
# **getDriverSafetyScore**
> DriverSafetyScoreResponse getDriverSafetyScore(driverId, accessToken, startMs, endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SafetyApi()
val driverId : kotlin.Long = 789 // kotlin.Long | ID of the driver
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val startMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
val endMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    val result : DriverSafetyScoreResponse = apiInstance.getDriverSafetyScore(driverId, accessToken, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SafetyApi#getDriverSafetyScore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SafetyApi#getDriverSafetyScore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **kotlin.Long**| ID of the driver | [default to null]
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **startMs** | **kotlin.Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **kotlin.Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleHarshEvent"></a>
# **getVehicleHarshEvent**
> VehicleHarshEventResponse getVehicleHarshEvent(vehicleId, accessToken, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SafetyApi()
val vehicleId : kotlin.Long = 789 // kotlin.Long | ID of the vehicle
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val timestamp : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the timestamp of a harsh event.
try {
    val result : VehicleHarshEventResponse = apiInstance.getVehicleHarshEvent(vehicleId, accessToken, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SafetyApi#getVehicleHarshEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SafetyApi#getVehicleHarshEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **kotlin.Long**| ID of the vehicle | [default to null]
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **timestamp** | **kotlin.Long**| Timestamp in milliseconds representing the timestamp of a harsh event. | [default to null]

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleSafetyScore"></a>
# **getVehicleSafetyScore**
> VehicleSafetyScoreResponse getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SafetyApi()
val vehicleId : kotlin.Long = 789 // kotlin.Long | ID of the vehicle
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val startMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
val endMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    val result : VehicleSafetyScoreResponse = apiInstance.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SafetyApi#getVehicleSafetyScore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SafetyApi#getVehicleSafetyScore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **kotlin.Long**| ID of the vehicle | [default to null]
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **startMs** | **kotlin.Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **kotlin.Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


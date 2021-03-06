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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SafetyApi;


SafetyApi apiInstance = new SafetyApi();
Long driverId = 789L; // Long | ID of the driver
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long startMs = 789L; // Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
Long endMs = 789L; // Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    DriverSafetyScoreResponse result = apiInstance.getDriverSafetyScore(driverId, accessToken, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SafetyApi#getDriverSafetyScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **Long**| ID of the driver |
 **accessToken** | **String**| Samsara API access token. |
 **startMs** | **Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVehicleHarshEvent"></a>
# **getVehicleHarshEvent**
> VehicleHarshEventResponse getVehicleHarshEvent(vehicleId, accessToken, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SafetyApi;


SafetyApi apiInstance = new SafetyApi();
Long vehicleId = 789L; // Long | ID of the vehicle
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long timestamp = 789L; // Long | Timestamp in milliseconds representing the timestamp of a harsh event.
try {
    VehicleHarshEventResponse result = apiInstance.getVehicleHarshEvent(vehicleId, accessToken, timestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SafetyApi#getVehicleHarshEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Long**| ID of the vehicle |
 **accessToken** | **String**| Samsara API access token. |
 **timestamp** | **Long**| Timestamp in milliseconds representing the timestamp of a harsh event. |

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVehicleSafetyScore"></a>
# **getVehicleSafetyScore**
> VehicleSafetyScoreResponse getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SafetyApi;


SafetyApi apiInstance = new SafetyApi();
Long vehicleId = 789L; // Long | ID of the vehicle
String accessToken = "accessToken_example"; // String | Samsara API access token.
Long startMs = 789L; // Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
Long endMs = 789L; // Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    VehicleSafetyScoreResponse result = apiInstance.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SafetyApi#getVehicleSafetyScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Long**| ID of the vehicle |
 **accessToken** | **String**| Samsara API access token. |
 **startMs** | **Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


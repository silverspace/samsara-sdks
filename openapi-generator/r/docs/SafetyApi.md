# SafetyApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDriverSafetyScore**](SafetyApi.md#GetDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**GetVehicleHarshEvent**](SafetyApi.md#GetVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**GetVehicleSafetyScore**](SafetyApi.md#GetVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


# **GetDriverSafetyScore**
> DriverSafetyScoreResponse GetDriverSafetyScore(driver.id, access.token, start.ms, end.ms)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```R
library(openapi)

var.driver.id <- 56 # integer | ID of the driver
var.access.token <- 'access.token_example' # character | Samsara API access token.
var.start.ms <- 56 # integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var.end.ms <- 56 # integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

#/fleet/drivers/{driverId:[0-9]+}/safety/score
api.instance <- SafetyApi$new()
result <- api.instance$GetDriverSafetyScore(var.driver.id, var.access.token, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver.id** | **integer**| ID of the driver | 
 **access.token** | **character**| Samsara API access token. | 
 **start.ms** | **integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end.ms** | **integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetVehicleHarshEvent**
> VehicleHarshEventResponse GetVehicleHarshEvent(vehicle.id, access.token, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```R
library(openapi)

var.vehicle.id <- 56 # integer | ID of the vehicle
var.access.token <- 'access.token_example' # character | Samsara API access token.
var.timestamp <- 56 # integer | Timestamp in milliseconds representing the timestamp of a harsh event.

#/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
api.instance <- SafetyApi$new()
result <- api.instance$GetVehicleHarshEvent(var.vehicle.id, var.access.token, var.timestamp)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle.id** | **integer**| ID of the vehicle | 
 **access.token** | **character**| Samsara API access token. | 
 **timestamp** | **integer**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetVehicleSafetyScore**
> VehicleSafetyScoreResponse GetVehicleSafetyScore(vehicle.id, access.token, start.ms, end.ms)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```R
library(openapi)

var.vehicle.id <- 56 # integer | ID of the vehicle
var.access.token <- 'access.token_example' # character | Samsara API access token.
var.start.ms <- 56 # integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var.end.ms <- 56 # integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

#/fleet/vehicles/{vehicleId:[0-9]+}/safety/score
api.instance <- SafetyApi$new()
result <- api.instance$GetVehicleSafetyScore(var.vehicle.id, var.access.token, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle.id** | **integer**| ID of the vehicle | 
 **access.token** | **character**| Samsara API access token. | 
 **start.ms** | **integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end.ms** | **integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




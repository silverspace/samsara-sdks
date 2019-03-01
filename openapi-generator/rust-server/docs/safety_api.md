# safety_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**GetDriverSafetyScore**](safety_api.md#GetDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
**GetVehicleHarshEvent**](safety_api.md#GetVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
**GetVehicleSafetyScore**](safety_api.md#GetVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


# **GetDriverSafetyScore**
> models::DriverSafetyScoreResponse GetDriverSafetyScore(driver_id, access_token, start_ms, end_ms)
/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **driver_id** | **i64**| ID of the driver | 
  **access_token** | **String**| Samsara API access token. | 
  **start_ms** | **i64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **end_ms** | **i64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**models::DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetVehicleHarshEvent**
> models::VehicleHarshEventResponse GetVehicleHarshEvent(vehicle_id, access_token, timestamp)
/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **vehicle_id** | **i64**| ID of the vehicle | 
  **access_token** | **String**| Samsara API access token. | 
  **timestamp** | **i64**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**models::VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetVehicleSafetyScore**
> models::VehicleSafetyScoreResponse GetVehicleSafetyScore(vehicle_id, access_token, start_ms, end_ms)
/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **vehicle_id** | **i64**| ID of the vehicle | 
  **access_token** | **String**| Samsara API access token. | 
  **start_ms** | **i64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **end_ms** | **i64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**models::VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


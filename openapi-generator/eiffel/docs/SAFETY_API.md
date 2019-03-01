# SAFETY_API

All URIs are relative to *https://api.samsara.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**driver_safety_score**](SAFETY_API.md#driver_safety_score) | **Get** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**vehicle_harsh_event**](SAFETY_API.md#vehicle_harsh_event) | **Get** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**vehicle_safety_score**](SAFETY_API.md#vehicle_safety_score) | **Get** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


# **driver_safety_score**
> driver_safety_score (driver_id: INTEGER_64 ; access_token: STRING_32 ; start_ms: INTEGER_64 ; end_ms: INTEGER_64 ): detachable DRIVER_SAFETY_SCORE_RESPONSE
	

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver_id** | **INTEGER_64**| ID of the driver | [default to null]
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**DRIVER_SAFETY_SCORE_RESPONSE**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vehicle_harsh_event**
> vehicle_harsh_event (vehicle_id: INTEGER_64 ; access_token: STRING_32 ; timestamp: INTEGER_64 ): detachable VEHICLE_HARSH_EVENT_RESPONSE
	

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **INTEGER_64**| ID of the vehicle | [default to null]
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **timestamp** | **INTEGER_64**| Timestamp in milliseconds representing the timestamp of a harsh event. | [default to null]

### Return type

[**VEHICLE_HARSH_EVENT_RESPONSE**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vehicle_safety_score**
> vehicle_safety_score (vehicle_id: INTEGER_64 ; access_token: STRING_32 ; start_ms: INTEGER_64 ; end_ms: INTEGER_64 ): detachable VEHICLE_SAFETY_SCORE_RESPONSE
	

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **INTEGER_64**| ID of the vehicle | [default to null]
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**VEHICLE_SAFETY_SCORE_RESPONSE**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


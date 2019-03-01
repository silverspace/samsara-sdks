# SwaggerClient::SafetyApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_driver_safety_score**](SafetyApi.md#get_driver_safety_score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**get_vehicle_harsh_event**](SafetyApi.md#get_vehicle_harsh_event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**get_vehicle_safety_score**](SafetyApi.md#get_vehicle_safety_score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


# **get_driver_safety_score**
> DriverSafetyScoreResponse get_driver_safety_score(driver_id, access_token, start_ms, end_ms)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SafetyApi.new

driver_id = 789 # Integer | ID of the driver

access_token = 'access_token_example' # String | Samsara API access token.

start_ms = 789 # Integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.

end_ms = 789 # Integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.


begin
  #/fleet/drivers/{driverId:[0-9]+}/safety/score
  result = api_instance.get_driver_safety_score(driver_id, access_token, start_ms, end_ms)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SafetyApi->get_driver_safety_score: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver_id** | **Integer**| ID of the driver | 
 **access_token** | **String**| Samsara API access token. | 
 **start_ms** | **Integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **Integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_vehicle_harsh_event**
> VehicleHarshEventResponse get_vehicle_harsh_event(vehicle_id, access_token, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SafetyApi.new

vehicle_id = 789 # Integer | ID of the vehicle

access_token = 'access_token_example' # String | Samsara API access token.

timestamp = 789 # Integer | Timestamp in milliseconds representing the timestamp of a harsh event.


begin
  #/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  result = api_instance.get_vehicle_harsh_event(vehicle_id, access_token, timestamp)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SafetyApi->get_vehicle_harsh_event: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **Integer**| ID of the vehicle | 
 **access_token** | **String**| Samsara API access token. | 
 **timestamp** | **Integer**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_vehicle_safety_score**
> VehicleSafetyScoreResponse get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SafetyApi.new

vehicle_id = 789 # Integer | ID of the vehicle

access_token = 'access_token_example' # String | Samsara API access token.

start_ms = 789 # Integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.

end_ms = 789 # Integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.


begin
  #/fleet/vehicles/{vehicleId:[0-9]+}/safety/score
  result = api_instance.get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SafetyApi->get_vehicle_safety_score: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **Integer**| ID of the vehicle | 
 **access_token** | **String**| Samsara API access token. | 
 **start_ms** | **Integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **Integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




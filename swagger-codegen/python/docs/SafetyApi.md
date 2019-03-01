# samsara.SafetyApi

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
```python
from __future__ import print_function
import time
import samsara
from samsara.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = samsara.SafetyApi()
driver_id = 789 # int | ID of the driver
access_token = 'access_token_example' # str | Samsara API access token.
start_ms = 789 # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
end_ms = 789 # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try:
    # /fleet/drivers/{driverId:[0-9]+}/safety/score
    api_response = api_instance.get_driver_safety_score(driver_id, access_token, start_ms, end_ms)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SafetyApi->get_driver_safety_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver_id** | **int**| ID of the driver | 
 **access_token** | **str**| Samsara API access token. | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_harsh_event**
> VehicleHarshEventResponse get_vehicle_harsh_event(vehicle_id, access_token, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```python
from __future__ import print_function
import time
import samsara
from samsara.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = samsara.SafetyApi()
vehicle_id = 789 # int | ID of the vehicle
access_token = 'access_token_example' # str | Samsara API access token.
timestamp = 789 # int | Timestamp in milliseconds representing the timestamp of a harsh event.

try:
    # /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    api_response = api_instance.get_vehicle_harsh_event(vehicle_id, access_token, timestamp)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SafetyApi->get_vehicle_harsh_event: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle | 
 **access_token** | **str**| Samsara API access token. | 
 **timestamp** | **int**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_safety_score**
> VehicleSafetyScoreResponse get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```python
from __future__ import print_function
import time
import samsara
from samsara.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = samsara.SafetyApi()
vehicle_id = 789 # int | ID of the vehicle
access_token = 'access_token_example' # str | Samsara API access token.
start_ms = 789 # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
end_ms = 789 # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try:
    # /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    api_response = api_instance.get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SafetyApi->get_vehicle_safety_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle | 
 **access_token** | **str**| Samsara API access token. | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


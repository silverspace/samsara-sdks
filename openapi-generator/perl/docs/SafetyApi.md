# WWW::OpenAPIClient::SafetyApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::SafetyApi;
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_driver_safety_score**](SafetyApi.md#get_driver_safety_score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**get_vehicle_harsh_event**](SafetyApi.md#get_vehicle_harsh_event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**get_vehicle_safety_score**](SafetyApi.md#get_vehicle_safety_score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


# **get_driver_safety_score**
> DriverSafetyScoreResponse get_driver_safety_score(driver_id => $driver_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SafetyApi;
my $api_instance = WWW::OpenAPIClient::SafetyApi->new(
);

my $driver_id = 789; # int | ID of the driver
my $access_token = "access_token_example"; # string | Samsara API access token.
my $start_ms = 789; # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
my $end_ms = 789; # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

eval { 
    my $result = $api_instance->get_driver_safety_score(driver_id => $driver_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SafetyApi->get_driver_safety_score: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver_id** | **int**| ID of the driver | 
 **access_token** | **string**| Samsara API access token. | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_harsh_event**
> VehicleHarshEventResponse get_vehicle_harsh_event(vehicle_id => $vehicle_id, access_token => $access_token, timestamp => $timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SafetyApi;
my $api_instance = WWW::OpenAPIClient::SafetyApi->new(
);

my $vehicle_id = 789; # int | ID of the vehicle
my $access_token = "access_token_example"; # string | Samsara API access token.
my $timestamp = 789; # int | Timestamp in milliseconds representing the timestamp of a harsh event.

eval { 
    my $result = $api_instance->get_vehicle_harsh_event(vehicle_id => $vehicle_id, access_token => $access_token, timestamp => $timestamp);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SafetyApi->get_vehicle_harsh_event: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle | 
 **access_token** | **string**| Samsara API access token. | 
 **timestamp** | **int**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_safety_score**
> VehicleSafetyScoreResponse get_vehicle_safety_score(vehicle_id => $vehicle_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SafetyApi;
my $api_instance = WWW::OpenAPIClient::SafetyApi->new(
);

my $vehicle_id = 789; # int | ID of the vehicle
my $access_token = "access_token_example"; # string | Samsara API access token.
my $start_ms = 789; # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
my $end_ms = 789; # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

eval { 
    my $result = $api_instance->get_vehicle_safety_score(vehicle_id => $vehicle_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SafetyApi->get_vehicle_safety_score: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle | 
 **access_token** | **string**| Samsara API access token. | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


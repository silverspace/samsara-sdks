# SamsaraApi.SafetyApi

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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.SafetyApi();
let driverId = 789; // Number | ID of the driver
let accessToken = "accessToken_example"; // String | Samsara API access token.
let startMs = 789; // Number | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
let endMs = 789; // Number | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
apiInstance.getDriverSafetyScore(driverId, accessToken, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **Number**| ID of the driver | 
 **accessToken** | **String**| Samsara API access token. | 
 **startMs** | **Number**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **Number**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.SafetyApi();
let vehicleId = 789; // Number | ID of the vehicle
let accessToken = "accessToken_example"; // String | Samsara API access token.
let timestamp = 789; // Number | Timestamp in milliseconds representing the timestamp of a harsh event.
apiInstance.getVehicleHarshEvent(vehicleId, accessToken, timestamp, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Number**| ID of the vehicle | 
 **accessToken** | **String**| Samsara API access token. | 
 **timestamp** | **Number**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

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
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.SafetyApi();
let vehicleId = 789; // Number | ID of the vehicle
let accessToken = "accessToken_example"; // String | Samsara API access token.
let startMs = 789; // Number | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
let endMs = 789; // Number | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
apiInstance.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Number**| ID of the vehicle | 
 **accessToken** | **String**| Samsara API access token. | 
 **startMs** | **Number**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **Number**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


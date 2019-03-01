# samsara.Api.SafetyApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDriverSafetyScore**](SafetyApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**GetVehicleHarshEvent**](SafetyApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**GetVehicleSafetyScore**](SafetyApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


<a name="getdriversafetyscore"></a>
# **GetDriverSafetyScore**
> DriverSafetyScoreResponse GetDriverSafetyScore (long? driverId, string accessToken, long? startMs, long? endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class GetDriverSafetyScoreExample
    {
        public void main()
        {
            var apiInstance = new SafetyApi();
            var driverId = 789;  // long? | ID of the driver
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var startMs = 789;  // long? | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
            var endMs = 789;  // long? | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

            try
            {
                // /fleet/drivers/{driverId:[0-9]+}/safety/score
                DriverSafetyScoreResponse result = apiInstance.GetDriverSafetyScore(driverId, accessToken, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SafetyApi.GetDriverSafetyScore: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **long?**| ID of the driver | 
 **accessToken** | **string**| Samsara API access token. | 
 **startMs** | **long?**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **long?**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvehicleharshevent"></a>
# **GetVehicleHarshEvent**
> VehicleHarshEventResponse GetVehicleHarshEvent (long? vehicleId, string accessToken, long? timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class GetVehicleHarshEventExample
    {
        public void main()
        {
            var apiInstance = new SafetyApi();
            var vehicleId = 789;  // long? | ID of the vehicle
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var timestamp = 789;  // long? | Timestamp in milliseconds representing the timestamp of a harsh event.

            try
            {
                // /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
                VehicleHarshEventResponse result = apiInstance.GetVehicleHarshEvent(vehicleId, accessToken, timestamp);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SafetyApi.GetVehicleHarshEvent: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **long?**| ID of the vehicle | 
 **accessToken** | **string**| Samsara API access token. | 
 **timestamp** | **long?**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvehiclesafetyscore"></a>
# **GetVehicleSafetyScore**
> VehicleSafetyScoreResponse GetVehicleSafetyScore (long? vehicleId, string accessToken, long? startMs, long? endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class GetVehicleSafetyScoreExample
    {
        public void main()
        {
            var apiInstance = new SafetyApi();
            var vehicleId = 789;  // long? | ID of the vehicle
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var startMs = 789;  // long? | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
            var endMs = 789;  // long? | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

            try
            {
                // /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
                VehicleSafetyScoreResponse result = apiInstance.GetVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SafetyApi.GetVehicleSafetyScore: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **long?**| ID of the vehicle | 
 **accessToken** | **string**| Samsara API access token. | 
 **startMs** | **long?**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **long?**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


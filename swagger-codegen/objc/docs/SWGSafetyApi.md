# SWGSafetyApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDriverSafetyScore**](SWGSafetyApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getVehicleHarshEvent**](SWGSafetyApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleSafetyScore**](SWGSafetyApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


# **getDriverSafetyScore**
```objc
-(NSURLSessionTask*) getDriverSafetyScoreWithDriverId: (NSNumber*) driverId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGDriverSafetyScoreResponse* output, NSError* error)) handler;
```

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example 
```objc

NSNumber* driverId = @789; // ID of the driver
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @789; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @789; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

SWGSafetyApi*apiInstance = [[SWGSafetyApi alloc] init];

// /fleet/drivers/{driverId:[0-9]+}/safety/score
[apiInstance getDriverSafetyScoreWithDriverId:driverId
              accessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGDriverSafetyScoreResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSafetyApi->getDriverSafetyScore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **NSNumber***| ID of the driver | 
 **accessToken** | **NSString***| Samsara API access token. | 
 **startMs** | **NSNumber***| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **NSNumber***| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**SWGDriverSafetyScoreResponse***](SWGDriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleHarshEvent**
```objc
-(NSURLSessionTask*) getVehicleHarshEventWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    timestamp: (NSNumber*) timestamp
        completionHandler: (void (^)(SWGVehicleHarshEventResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example 
```objc

NSNumber* vehicleId = @789; // ID of the vehicle
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* timestamp = @789; // Timestamp in milliseconds representing the timestamp of a harsh event.

SWGSafetyApi*apiInstance = [[SWGSafetyApi alloc] init];

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[apiInstance getVehicleHarshEventWithVehicleId:vehicleId
              accessToken:accessToken
              timestamp:timestamp
          completionHandler: ^(SWGVehicleHarshEventResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSafetyApi->getVehicleHarshEvent: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **NSNumber***| ID of the vehicle | 
 **accessToken** | **NSString***| Samsara API access token. | 
 **timestamp** | **NSNumber***| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**SWGVehicleHarshEventResponse***](SWGVehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleSafetyScore**
```objc
-(NSURLSessionTask*) getVehicleSafetyScoreWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGVehicleSafetyScoreResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example 
```objc

NSNumber* vehicleId = @789; // ID of the vehicle
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @789; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @789; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

SWGSafetyApi*apiInstance = [[SWGSafetyApi alloc] init];

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[apiInstance getVehicleSafetyScoreWithVehicleId:vehicleId
              accessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGVehicleSafetyScoreResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSafetyApi->getVehicleSafetyScore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **NSNumber***| ID of the vehicle | 
 **accessToken** | **NSString***| Samsara API access token. | 
 **startMs** | **NSNumber***| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **NSNumber***| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**SWGVehicleSafetyScoreResponse***](SWGVehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


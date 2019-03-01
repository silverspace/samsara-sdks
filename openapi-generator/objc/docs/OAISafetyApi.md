# OAISafetyApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDriverSafetyScore**](OAISafetyApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getVehicleHarshEvent**](OAISafetyApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleSafetyScore**](OAISafetyApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


# **getDriverSafetyScore**
```objc
-(NSURLSessionTask*) getDriverSafetyScoreWithDriverId: (NSNumber*) driverId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(OAIDriverSafetyScoreResponse* output, NSError* error)) handler;
```

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example 
```objc

NSNumber* driverId = @56; // ID of the driver
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @56; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @56; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

OAISafetyApi*apiInstance = [[OAISafetyApi alloc] init];

// /fleet/drivers/{driverId:[0-9]+}/safety/score
[apiInstance getDriverSafetyScoreWithDriverId:driverId
              accessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(OAIDriverSafetyScoreResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISafetyApi->getDriverSafetyScore: %@", error);
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

[**OAIDriverSafetyScoreResponse***](OAIDriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleHarshEvent**
```objc
-(NSURLSessionTask*) getVehicleHarshEventWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    timestamp: (NSNumber*) timestamp
        completionHandler: (void (^)(OAIVehicleHarshEventResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example 
```objc

NSNumber* vehicleId = @56; // ID of the vehicle
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* timestamp = @56; // Timestamp in milliseconds representing the timestamp of a harsh event.

OAISafetyApi*apiInstance = [[OAISafetyApi alloc] init];

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[apiInstance getVehicleHarshEventWithVehicleId:vehicleId
              accessToken:accessToken
              timestamp:timestamp
          completionHandler: ^(OAIVehicleHarshEventResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISafetyApi->getVehicleHarshEvent: %@", error);
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

[**OAIVehicleHarshEventResponse***](OAIVehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleSafetyScore**
```objc
-(NSURLSessionTask*) getVehicleSafetyScoreWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(OAIVehicleSafetyScoreResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example 
```objc

NSNumber* vehicleId = @56; // ID of the vehicle
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @56; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @56; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

OAISafetyApi*apiInstance = [[OAISafetyApi alloc] init];

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[apiInstance getVehicleSafetyScoreWithVehicleId:vehicleId
              accessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(OAIVehicleSafetyScoreResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISafetyApi->getVehicleSafetyScore: %@", error);
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

[**OAIVehicleSafetyScoreResponse***](OAIVehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


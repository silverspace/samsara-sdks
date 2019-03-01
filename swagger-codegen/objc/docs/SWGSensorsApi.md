# SWGSensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensors**](SWGSensorsApi.md#getsensors) | **POST** /sensors/list | /sensors/list
[**getSensorsCargo**](SWGSensorsApi.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
[**getSensorsDoor**](SWGSensorsApi.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
[**getSensorsHistory**](SWGSensorsApi.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
[**getSensorsHumidity**](SWGSensorsApi.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
[**getSensorsTemperature**](SWGSensorsApi.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature


# **getSensors**
```objc
-(NSURLSessionTask*) getSensorsWithAccessToken: (NSString*) accessToken
    groupParam: (SWGGroupParam*) groupParam
        completionHandler: (void (^)(SWGInlineResponse2008* output, NSError* error)) handler;
```

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGGroupParam* groupParam = [[SWGGroupParam alloc] init]; // Group ID to query.

SWGSensorsApi*apiInstance = [[SWGSensorsApi alloc] init];

// /sensors/list
[apiInstance getSensorsWithAccessToken:accessToken
              groupParam:groupParam
          completionHandler: ^(SWGInlineResponse2008* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSensorsApi->getSensors: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**SWGGroupParam***](SWGGroupParam.md)| Group ID to query. | 

### Return type

[**SWGInlineResponse2008***](SWGInlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsCargo**
```objc
-(NSURLSessionTask*) getSensorsCargoWithAccessToken: (NSString*) accessToken
    sensorParam: (SWGSensorParam*) sensorParam
        completionHandler: (void (^)(SWGCargoResponse* output, NSError* error)) handler;
```

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGSensorParam* sensorParam = [[SWGSensorParam alloc] init]; // Group ID and list of sensor IDs to query.

SWGSensorsApi*apiInstance = [[SWGSensorsApi alloc] init];

// /sensors/cargo
[apiInstance getSensorsCargoWithAccessToken:accessToken
              sensorParam:sensorParam
          completionHandler: ^(SWGCargoResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSensorsApi->getSensorsCargo: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **sensorParam** | [**SWGSensorParam***](SWGSensorParam.md)| Group ID and list of sensor IDs to query. | 

### Return type

[**SWGCargoResponse***](SWGCargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsDoor**
```objc
-(NSURLSessionTask*) getSensorsDoorWithAccessToken: (NSString*) accessToken
    sensorParam: (SWGSensorParam*) sensorParam
        completionHandler: (void (^)(SWGDoorResponse* output, NSError* error)) handler;
```

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGSensorParam* sensorParam = [[SWGSensorParam alloc] init]; // Group ID and list of sensor IDs to query.

SWGSensorsApi*apiInstance = [[SWGSensorsApi alloc] init];

// /sensors/door
[apiInstance getSensorsDoorWithAccessToken:accessToken
              sensorParam:sensorParam
          completionHandler: ^(SWGDoorResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSensorsApi->getSensorsDoor: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **sensorParam** | [**SWGSensorParam***](SWGSensorParam.md)| Group ID and list of sensor IDs to query. | 

### Return type

[**SWGDoorResponse***](SWGDoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsHistory**
```objc
-(NSURLSessionTask*) getSensorsHistoryWithAccessToken: (NSString*) accessToken
    historyParam: (SWGHistoryParam1*) historyParam
        completionHandler: (void (^)(SWGSensorHistoryResponse* output, NSError* error)) handler;
```

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGHistoryParam1* historyParam = [[SWGHistoryParam1 alloc] init]; // Group ID, time range and resolution, and list of sensor ID, field pairs to query.

SWGSensorsApi*apiInstance = [[SWGSensorsApi alloc] init];

// /sensors/history
[apiInstance getSensorsHistoryWithAccessToken:accessToken
              historyParam:historyParam
          completionHandler: ^(SWGSensorHistoryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSensorsApi->getSensorsHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **historyParam** | [**SWGHistoryParam1***](SWGHistoryParam1.md)| Group ID, time range and resolution, and list of sensor ID, field pairs to query. | 

### Return type

[**SWGSensorHistoryResponse***](SWGSensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsHumidity**
```objc
-(NSURLSessionTask*) getSensorsHumidityWithAccessToken: (NSString*) accessToken
    sensorParam: (SWGSensorParam*) sensorParam
        completionHandler: (void (^)(SWGHumidityResponse* output, NSError* error)) handler;
```

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGSensorParam* sensorParam = [[SWGSensorParam alloc] init]; // Group ID and list of sensor IDs to query.

SWGSensorsApi*apiInstance = [[SWGSensorsApi alloc] init];

// /sensors/humidity
[apiInstance getSensorsHumidityWithAccessToken:accessToken
              sensorParam:sensorParam
          completionHandler: ^(SWGHumidityResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSensorsApi->getSensorsHumidity: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **sensorParam** | [**SWGSensorParam***](SWGSensorParam.md)| Group ID and list of sensor IDs to query. | 

### Return type

[**SWGHumidityResponse***](SWGHumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsTemperature**
```objc
-(NSURLSessionTask*) getSensorsTemperatureWithAccessToken: (NSString*) accessToken
    sensorParam: (SWGSensorParam*) sensorParam
        completionHandler: (void (^)(SWGTemperatureResponse* output, NSError* error)) handler;
```

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGSensorParam* sensorParam = [[SWGSensorParam alloc] init]; // Group ID and list of sensor IDs to query.

SWGSensorsApi*apiInstance = [[SWGSensorsApi alloc] init];

// /sensors/temperature
[apiInstance getSensorsTemperatureWithAccessToken:accessToken
              sensorParam:sensorParam
          completionHandler: ^(SWGTemperatureResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSensorsApi->getSensorsTemperature: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **sensorParam** | [**SWGSensorParam***](SWGSensorParam.md)| Group ID and list of sensor IDs to query. | 

### Return type

[**SWGTemperatureResponse***](SWGTemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


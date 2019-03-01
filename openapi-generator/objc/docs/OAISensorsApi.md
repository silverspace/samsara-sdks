# OAISensorsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensors**](OAISensorsApi.md#getsensors) | **POST** /sensors/list | /sensors/list
[**getSensorsCargo**](OAISensorsApi.md#getsensorscargo) | **POST** /sensors/cargo | /sensors/cargo
[**getSensorsDoor**](OAISensorsApi.md#getsensorsdoor) | **POST** /sensors/door | /sensors/door
[**getSensorsHistory**](OAISensorsApi.md#getsensorshistory) | **POST** /sensors/history | /sensors/history
[**getSensorsHumidity**](OAISensorsApi.md#getsensorshumidity) | **POST** /sensors/humidity | /sensors/humidity
[**getSensorsTemperature**](OAISensorsApi.md#getsensorstemperature) | **POST** /sensors/temperature | /sensors/temperature


# **getSensors**
```objc
-(NSURLSessionTask*) getSensorsWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject23*) groupParam
        completionHandler: (void (^)(OAIInlineResponse2008* output, NSError* error)) handler;
```

/sensors/list

Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject23* groupParam = [[OAIInlineObject23 alloc] init]; // 

OAISensorsApi*apiInstance = [[OAISensorsApi alloc] init];

// /sensors/list
[apiInstance getSensorsWithAccessToken:accessToken
              groupParam:groupParam
          completionHandler: ^(OAIInlineResponse2008* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISensorsApi->getSensors: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**OAIInlineObject23***](OAIInlineObject23.md)|  | 

### Return type

[**OAIInlineResponse2008***](OAIInlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsCargo**
```objc
-(NSURLSessionTask*) getSensorsCargoWithAccessToken: (NSString*) accessToken
    sensorParam: (OAIInlineObject19*) sensorParam
        completionHandler: (void (^)(OAICargoResponse* output, NSError* error)) handler;
```

/sensors/cargo

Get cargo monitor status (empty / full) for requested sensors.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject19* sensorParam = [[OAIInlineObject19 alloc] init]; // 

OAISensorsApi*apiInstance = [[OAISensorsApi alloc] init];

// /sensors/cargo
[apiInstance getSensorsCargoWithAccessToken:accessToken
              sensorParam:sensorParam
          completionHandler: ^(OAICargoResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISensorsApi->getSensorsCargo: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **sensorParam** | [**OAIInlineObject19***](OAIInlineObject19.md)|  | 

### Return type

[**OAICargoResponse***](OAICargoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsDoor**
```objc
-(NSURLSessionTask*) getSensorsDoorWithAccessToken: (NSString*) accessToken
    sensorParam: (OAIInlineObject20*) sensorParam
        completionHandler: (void (^)(OAIDoorResponse* output, NSError* error)) handler;
```

/sensors/door

Get door monitor status (closed / open) for requested sensors.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject20* sensorParam = [[OAIInlineObject20 alloc] init]; // 

OAISensorsApi*apiInstance = [[OAISensorsApi alloc] init];

// /sensors/door
[apiInstance getSensorsDoorWithAccessToken:accessToken
              sensorParam:sensorParam
          completionHandler: ^(OAIDoorResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISensorsApi->getSensorsDoor: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **sensorParam** | [**OAIInlineObject20***](OAIInlineObject20.md)|  | 

### Return type

[**OAIDoorResponse***](OAIDoorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsHistory**
```objc
-(NSURLSessionTask*) getSensorsHistoryWithAccessToken: (NSString*) accessToken
    historyParam: (OAIInlineObject21*) historyParam
        completionHandler: (void (^)(OAISensorHistoryResponse* output, NSError* error)) handler;
```

/sensors/history

Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject21* historyParam = [[OAIInlineObject21 alloc] init]; // 

OAISensorsApi*apiInstance = [[OAISensorsApi alloc] init];

// /sensors/history
[apiInstance getSensorsHistoryWithAccessToken:accessToken
              historyParam:historyParam
          completionHandler: ^(OAISensorHistoryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISensorsApi->getSensorsHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **historyParam** | [**OAIInlineObject21***](OAIInlineObject21.md)|  | 

### Return type

[**OAISensorHistoryResponse***](OAISensorHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsHumidity**
```objc
-(NSURLSessionTask*) getSensorsHumidityWithAccessToken: (NSString*) accessToken
    sensorParam: (OAIInlineObject22*) sensorParam
        completionHandler: (void (^)(OAIHumidityResponse* output, NSError* error)) handler;
```

/sensors/humidity

Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject22* sensorParam = [[OAIInlineObject22 alloc] init]; // 

OAISensorsApi*apiInstance = [[OAISensorsApi alloc] init];

// /sensors/humidity
[apiInstance getSensorsHumidityWithAccessToken:accessToken
              sensorParam:sensorParam
          completionHandler: ^(OAIHumidityResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISensorsApi->getSensorsHumidity: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **sensorParam** | [**OAIInlineObject22***](OAIInlineObject22.md)|  | 

### Return type

[**OAIHumidityResponse***](OAIHumidityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSensorsTemperature**
```objc
-(NSURLSessionTask*) getSensorsTemperatureWithAccessToken: (NSString*) accessToken
    sensorParam: (OAIInlineObject24*) sensorParam
        completionHandler: (void (^)(OAITemperatureResponse* output, NSError* error)) handler;
```

/sensors/temperature

Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject24* sensorParam = [[OAIInlineObject24 alloc] init]; // 

OAISensorsApi*apiInstance = [[OAISensorsApi alloc] init];

// /sensors/temperature
[apiInstance getSensorsTemperatureWithAccessToken:accessToken
              sensorParam:sensorParam
          completionHandler: ^(OAITemperatureResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISensorsApi->getSensorsTemperature: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **sensorParam** | [**OAIInlineObject24***](OAIInlineObject24.md)|  | 

### Return type

[**OAITemperatureResponse***](OAITemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


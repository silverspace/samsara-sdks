# OAIIndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataInputs**](OAIIndustrialApi.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
[**getDataInput**](OAIIndustrialApi.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**getMachines**](OAIIndustrialApi.md#getmachines) | **POST** /machines/list | /machines/list
[**getMachinesHistory**](OAIIndustrialApi.md#getmachineshistory) | **POST** /machines/history | /machines/history


# **getAllDataInputs**
```objc
-(NSURLSessionTask*) getAllDataInputsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(OAIInlineResponse2006* output, NSError* error)) handler;
```

/industrial/data

Fetch all of the data inputs for a group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)
NSNumber* startMs = @56; // Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
NSNumber* endMs = @56; // Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)

OAIIndustrialApi*apiInstance = [[OAIIndustrialApi alloc] init];

// /industrial/data
[apiInstance getAllDataInputsWithAccessToken:accessToken
              groupId:groupId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(OAIInlineResponse2006* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIndustrialApi->getAllDataInputs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **startMs** | **NSNumber***| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **endMs** | **NSNumber***| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**OAIInlineResponse2006***](OAIInlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDataInput**
```objc
-(NSURLSessionTask*) getDataInputWithAccessToken: (NSString*) accessToken
    dataInputId: (NSNumber*) dataInputId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(OAIDataInputHistoryResponse* output, NSError* error)) handler;
```

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* dataInputId = @56; // ID of the data input
NSNumber* startMs = @56; // Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
NSNumber* endMs = @56; // Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)

OAIIndustrialApi*apiInstance = [[OAIIndustrialApi alloc] init];

// /industrial/data/{data_input_id:[0-9]+}
[apiInstance getDataInputWithAccessToken:accessToken
              dataInputId:dataInputId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(OAIDataInputHistoryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIndustrialApi->getDataInput: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **dataInputId** | **NSNumber***| ID of the data input | 
 **startMs** | **NSNumber***| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **endMs** | **NSNumber***| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**OAIDataInputHistoryResponse***](OAIDataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMachines**
```objc
-(NSURLSessionTask*) getMachinesWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject18*) groupParam
        completionHandler: (void (^)(OAIInlineResponse2007* output, NSError* error)) handler;
```

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject18* groupParam = [[OAIInlineObject18 alloc] init]; // 

OAIIndustrialApi*apiInstance = [[OAIIndustrialApi alloc] init];

// /machines/list
[apiInstance getMachinesWithAccessToken:accessToken
              groupParam:groupParam
          completionHandler: ^(OAIInlineResponse2007* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIndustrialApi->getMachines: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**OAIInlineObject18***](OAIInlineObject18.md)|  | 

### Return type

[**OAIInlineResponse2007***](OAIInlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMachinesHistory**
```objc
-(NSURLSessionTask*) getMachinesHistoryWithAccessToken: (NSString*) accessToken
    historyParam: (OAIInlineObject17*) historyParam
        completionHandler: (void (^)(OAIMachineHistoryResponse* output, NSError* error)) handler;
```

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject17* historyParam = [[OAIInlineObject17 alloc] init]; // 

OAIIndustrialApi*apiInstance = [[OAIIndustrialApi alloc] init];

// /machines/history
[apiInstance getMachinesHistoryWithAccessToken:accessToken
              historyParam:historyParam
          completionHandler: ^(OAIMachineHistoryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIndustrialApi->getMachinesHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **historyParam** | [**OAIInlineObject17***](OAIInlineObject17.md)|  | 

### Return type

[**OAIMachineHistoryResponse***](OAIMachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


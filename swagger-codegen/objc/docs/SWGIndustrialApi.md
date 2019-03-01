# SWGIndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataInputs**](SWGIndustrialApi.md#getalldatainputs) | **GET** /industrial/data | /industrial/data
[**getDataInput**](SWGIndustrialApi.md#getdatainput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**getMachines**](SWGIndustrialApi.md#getmachines) | **POST** /machines/list | /machines/list
[**getMachinesHistory**](SWGIndustrialApi.md#getmachineshistory) | **POST** /machines/history | /machines/history


# **getAllDataInputs**
```objc
-(NSURLSessionTask*) getAllDataInputsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGInlineResponse2006* output, NSError* error)) handler;
```

/industrial/data

Fetch all of the data inputs for a group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)
NSNumber* startMs = @789; // Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
NSNumber* endMs = @789; // Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)

SWGIndustrialApi*apiInstance = [[SWGIndustrialApi alloc] init];

// /industrial/data
[apiInstance getAllDataInputsWithAccessToken:accessToken
              groupId:groupId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGInlineResponse2006* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGIndustrialApi->getAllDataInputs: %@", error);
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

[**SWGInlineResponse2006***](SWGInlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDataInput**
```objc
-(NSURLSessionTask*) getDataInputWithAccessToken: (NSString*) accessToken
    dataInputId: (NSNumber*) dataInputId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGDataInputHistoryResponse* output, NSError* error)) handler;
```

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* dataInputId = @789; // ID of the data input
NSNumber* startMs = @789; // Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
NSNumber* endMs = @789; // Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)

SWGIndustrialApi*apiInstance = [[SWGIndustrialApi alloc] init];

// /industrial/data/{data_input_id:[0-9]+}
[apiInstance getDataInputWithAccessToken:accessToken
              dataInputId:dataInputId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGDataInputHistoryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGIndustrialApi->getDataInput: %@", error);
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

[**SWGDataInputHistoryResponse***](SWGDataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMachines**
```objc
-(NSURLSessionTask*) getMachinesWithAccessToken: (NSString*) accessToken
    groupParam: (SWGGroupParam*) groupParam
        completionHandler: (void (^)(SWGInlineResponse2007* output, NSError* error)) handler;
```

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGGroupParam* groupParam = [[SWGGroupParam alloc] init]; // Group ID to query.

SWGIndustrialApi*apiInstance = [[SWGIndustrialApi alloc] init];

// /machines/list
[apiInstance getMachinesWithAccessToken:accessToken
              groupParam:groupParam
          completionHandler: ^(SWGInlineResponse2007* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGIndustrialApi->getMachines: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**SWGGroupParam***](SWGGroupParam.md)| Group ID to query. | 

### Return type

[**SWGInlineResponse2007***](SWGInlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMachinesHistory**
```objc
-(NSURLSessionTask*) getMachinesHistoryWithAccessToken: (NSString*) accessToken
    historyParam: (SWGHistoryParam*) historyParam
        completionHandler: (void (^)(SWGMachineHistoryResponse* output, NSError* error)) handler;
```

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGHistoryParam* historyParam = [[SWGHistoryParam alloc] init]; // Group ID and time range to query for events

SWGIndustrialApi*apiInstance = [[SWGIndustrialApi alloc] init];

// /machines/history
[apiInstance getMachinesHistoryWithAccessToken:accessToken
              historyParam:historyParam
          completionHandler: ^(SWGMachineHistoryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGIndustrialApi->getMachinesHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **historyParam** | [**SWGHistoryParam***](SWGHistoryParam.md)| Group ID and time range to query for events | 

### Return type

[**SWGMachineHistoryResponse***](SWGMachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


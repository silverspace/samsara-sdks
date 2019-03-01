# \IndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllDataInputs**](IndustrialApi.md#GetAllDataInputs) | **Get** /industrial/data | /industrial/data
[**GetDataInput**](IndustrialApi.md#GetDataInput) | **Get** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**GetMachines**](IndustrialApi.md#GetMachines) | **Post** /machines/list | /machines/list
[**GetMachinesHistory**](IndustrialApi.md#GetMachinesHistory) | **Post** /machines/history | /machines/history


# **GetAllDataInputs**
> InlineResponse2006 GetAllDataInputs(ctx, accessToken, optional)
/industrial/data

Fetch all of the data inputs for a group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
 **optional** | ***GetAllDataInputsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetAllDataInputsOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **groupId** | **optional.Int64**| Optional group ID if the organization has multiple groups (uncommon). | 
 **startMs** | **optional.Int64**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | 
 **endMs** | **optional.Int64**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | 

### Return type

[**InlineResponse2006**](inline_response_200_6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetDataInput**
> DataInputHistoryResponse GetDataInput(ctx, accessToken, dataInputId, optional)
/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **dataInputId** | **int64**| ID of the data input | 
 **optional** | ***GetDataInputOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetDataInputOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **startMs** | **optional.Int64**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | 
 **endMs** | **optional.Int64**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | 

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetMachines**
> InlineResponse2007 GetMachines(ctx, accessToken, groupParam)
/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **groupParam** | [**GroupParam**](GroupParam.md)| Group ID to query. | 

### Return type

[**InlineResponse2007**](inline_response_200_7.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetMachinesHistory**
> MachineHistoryResponse GetMachinesHistory(ctx, accessToken, historyParam)
/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **historyParam** | [**HistoryParam**](HistoryParam.md)| Group ID and time range to query for events | 

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


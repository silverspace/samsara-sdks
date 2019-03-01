# \IndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_data_inputs**](IndustrialApi.md#get_all_data_inputs) | **Get** /industrial/data | /industrial/data
[**get_data_input**](IndustrialApi.md#get_data_input) | **Get** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**get_machines**](IndustrialApi.md#get_machines) | **Post** /machines/list | /machines/list
[**get_machines_history**](IndustrialApi.md#get_machines_history) | **Post** /machines/history | /machines/history


# **get_all_data_inputs**
> ::models::InlineResponse2006 get_all_data_inputs(access_token, optional)
/industrial/data

Fetch all of the data inputs for a group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **i64**| Optional group ID if the organization has multiple groups (uncommon). | 
 **start_ms** | **i64**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | 
 **end_ms** | **i64**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | 

### Return type

[**::models::InlineResponse2006**](inline_response_200_6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_data_input**
> ::models::DataInputHistoryResponse get_data_input(access_token, data_input_id, optional)
/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **data_input_id** | **i64**| ID of the data input | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **data_input_id** | **i64**| ID of the data input | 
 **start_ms** | **i64**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | 
 **end_ms** | **i64**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | 

### Return type

[**::models::DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_machines**
> ::models::InlineResponse2007 get_machines(access_token, group_param)
/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **group_param** | [**InlineObject18**](InlineObject18.md)|  | 

### Return type

[**::models::InlineResponse2007**](inline_response_200_7.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_machines_history**
> ::models::MachineHistoryResponse get_machines_history(access_token, history_param)
/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **history_param** | [**InlineObject17**](InlineObject17.md)|  | 

### Return type

[**::models::MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


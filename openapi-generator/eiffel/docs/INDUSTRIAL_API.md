# INDUSTRIAL_API

All URIs are relative to *https://api.samsara.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**all_data_inputs**](INDUSTRIAL_API.md#all_data_inputs) | **Get** /industrial/data | /industrial/data
[**data_input**](INDUSTRIAL_API.md#data_input) | **Get** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**machines**](INDUSTRIAL_API.md#machines) | **Post** /machines/list | /machines/list
[**machines_history**](INDUSTRIAL_API.md#machines_history) | **Post** /machines/history | /machines/history


# **all_data_inputs**
> all_data_inputs (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ; start_ms:  detachable INTEGER_64 ; end_ms:  detachable INTEGER_64 ): detachable INLINE_RESPONSE_200_6
	

/industrial/data

Fetch all of the data inputs for a group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] [default to null]

### Return type

[**INLINE_RESPONSE_200_6**](inline_response_200_6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **data_input**
> data_input (access_token: STRING_32 ; data_input_id: INTEGER_64 ; start_ms:  detachable INTEGER_64 ; end_ms:  detachable INTEGER_64 ): detachable DATA_INPUT_HISTORY_RESPONSE
	

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **data_input_id** | **INTEGER_64**| ID of the data input | [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] [default to null]

### Return type

[**DATA_INPUT_HISTORY_RESPONSE**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **machines**
> machines (access_token: STRING_32 ; group_param: INLINE_OBJECT_18 ): detachable INLINE_RESPONSE_200_7
	

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_param** | [**INLINE_OBJECT_18**](INLINE_OBJECT_18.md)|  | 

### Return type

[**INLINE_RESPONSE_200_7**](inline_response_200_7.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **machines_history**
> machines_history (access_token: STRING_32 ; history_param: INLINE_OBJECT_17 ): detachable MACHINE_HISTORY_RESPONSE
	

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **history_param** | [**INLINE_OBJECT_17**](INLINE_OBJECT_17.md)|  | 

### Return type

[**MACHINE_HISTORY_RESPONSE**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


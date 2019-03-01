# IndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllDataInputs**](IndustrialApi.md#GetAllDataInputs) | **GET** /industrial/data | /industrial/data
[**GetDataInput**](IndustrialApi.md#GetDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**GetMachines**](IndustrialApi.md#GetMachines) | **POST** /machines/list | /machines/list
[**GetMachinesHistory**](IndustrialApi.md#GetMachinesHistory) | **POST** /machines/history | /machines/history


# **GetAllDataInputs**
> InlineResponse2006 GetAllDataInputs(access.token, group.id=var.group.id, start.ms=var.start.ms, end.ms=var.end.ms)

/industrial/data

Fetch all of the data inputs for a group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.id <- 56 # integer | Optional group ID if the organization has multiple groups (uncommon).
var.start.ms <- 56 # integer | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
var.end.ms <- 56 # integer | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.

#/industrial/data
api.instance <- IndustrialApi$new()
result <- api.instance$GetAllDataInputs(var.access.token, group.id=var.group.id, start.ms=var.start.ms, end.ms=var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.id** | **integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **start.ms** | **integer**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **end.ms** | **integer**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**InlineResponse2006**](inline_response_200_6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDataInput**
> DataInputHistoryResponse GetDataInput(access.token, data.input.id, start.ms=var.start.ms, end.ms=var.end.ms)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.data.input.id <- 56 # integer | ID of the data input
var.start.ms <- 56 # integer | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
var.end.ms <- 56 # integer | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.

#/industrial/data/{data_input_id:[0-9]+}
api.instance <- IndustrialApi$new()
result <- api.instance$GetDataInput(var.access.token, var.data.input.id, start.ms=var.start.ms, end.ms=var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **data.input.id** | **integer**| ID of the data input | 
 **start.ms** | **integer**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **end.ms** | **integer**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetMachines**
> InlineResponse2007 GetMachines(access.token, group.param)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.param <- InlineObject18$new() # InlineObject18 | 

#/machines/list
api.instance <- IndustrialApi$new()
result <- api.instance$GetMachines(var.access.token, var.group.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.param** | [**InlineObject18**](InlineObject18.md)|  | 

### Return type

[**InlineResponse2007**](inline_response_200_7.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetMachinesHistory**
> MachineHistoryResponse GetMachinesHistory(access.token, history.param)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.history.param <- InlineObject17$new() # InlineObject17 | 

#/machines/history
api.instance <- IndustrialApi$new()
result <- api.instance$GetMachinesHistory(var.access.token, var.history.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **history.param** | [**InlineObject17**](InlineObject17.md)|  | 

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




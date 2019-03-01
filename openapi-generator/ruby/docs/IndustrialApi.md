# OpenapiClient::IndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_data_inputs**](IndustrialApi.md#get_all_data_inputs) | **GET** /industrial/data | /industrial/data
[**get_data_input**](IndustrialApi.md#get_data_input) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**get_machines**](IndustrialApi.md#get_machines) | **POST** /machines/list | /machines/list
[**get_machines_history**](IndustrialApi.md#get_machines_history) | **POST** /machines/history | /machines/history


# **get_all_data_inputs**
> InlineResponse2006 get_all_data_inputs(access_token, opts)

/industrial/data

Fetch all of the data inputs for a group.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::IndustrialApi.new
access_token = 'access_token_example' # String | Samsara API access token.
opts = {
  group_id: 56, # Integer | Optional group ID if the organization has multiple groups (uncommon).
  start_ms: 56, # Integer | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
  end_ms: 56 # Integer | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
}

begin
  #/industrial/data
  result = api_instance.get_all_data_inputs(access_token, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling IndustrialApi->get_all_data_inputs: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **Integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **start_ms** | **Integer**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **end_ms** | **Integer**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_data_input**
> DataInputHistoryResponse get_data_input(access_token, data_input_id, opts)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::IndustrialApi.new
access_token = 'access_token_example' # String | Samsara API access token.
data_input_id = 56 # Integer | ID of the data input
opts = {
  start_ms: 56, # Integer | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
  end_ms: 56 # Integer | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
}

begin
  #/industrial/data/{data_input_id:[0-9]+}
  result = api_instance.get_data_input(access_token, data_input_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling IndustrialApi->get_data_input: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **data_input_id** | **Integer**| ID of the data input | 
 **start_ms** | **Integer**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **end_ms** | **Integer**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_machines**
> InlineResponse2007 get_machines(access_token, group_param)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::IndustrialApi.new
access_token = 'access_token_example' # String | Samsara API access token.
group_param = OpenapiClient::InlineObject18.new # InlineObject18 | 

begin
  #/machines/list
  result = api_instance.get_machines(access_token, group_param)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling IndustrialApi->get_machines: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_param** | [**InlineObject18**](InlineObject18.md)|  | 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_machines_history**
> MachineHistoryResponse get_machines_history(access_token, history_param)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::IndustrialApi.new
access_token = 'access_token_example' # String | Samsara API access token.
history_param = OpenapiClient::InlineObject17.new # InlineObject17 | 

begin
  #/machines/history
  result = api_instance.get_machines_history(access_token, history_param)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling IndustrialApi->get_machines_history: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **history_param** | [**InlineObject17**](InlineObject17.md)|  | 

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




# openapi_client.IndustrialApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_data_inputs**](IndustrialApi.md#get_all_data_inputs) | **GET** /industrial/data | /industrial/data
[**get_data_input**](IndustrialApi.md#get_data_input) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**get_machines**](IndustrialApi.md#get_machines) | **POST** /machines/list | /machines/list
[**get_machines_history**](IndustrialApi.md#get_machines_history) | **POST** /machines/history | /machines/history


# **get_all_data_inputs**
> InlineResponse2006 get_all_data_inputs(access_token, group_id=group_id, start_ms=start_ms, end_ms=end_ms)

/industrial/data

Fetch all of the data inputs for a group.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.IndustrialApi()
access_token = 'access_token_example' # str | Samsara API access token.
group_id = 56 # int | Optional group ID if the organization has multiple groups (uncommon). (optional)
start_ms = 56 # int | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
end_ms = 56 # int | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)

try:
    # /industrial/data
    api_response = api_instance.get_all_data_inputs(access_token, group_id=group_id, start_ms=start_ms, end_ms=end_ms)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IndustrialApi->get_all_data_inputs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **start_ms** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **end_ms** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_data_input**
> DataInputHistoryResponse get_data_input(access_token, data_input_id, start_ms=start_ms, end_ms=end_ms)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.IndustrialApi()
access_token = 'access_token_example' # str | Samsara API access token.
data_input_id = 56 # int | ID of the data input
start_ms = 56 # int | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
end_ms = 56 # int | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)

try:
    # /industrial/data/{data_input_id:[0-9]+}
    api_response = api_instance.get_data_input(access_token, data_input_id, start_ms=start_ms, end_ms=end_ms)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IndustrialApi->get_data_input: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **data_input_id** | **int**| ID of the data input | 
 **start_ms** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **end_ms** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_machines**
> InlineResponse2007 get_machines(access_token, group_param)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.IndustrialApi()
access_token = 'access_token_example' # str | Samsara API access token.
group_param = openapi_client.InlineObject18() # InlineObject18 | 

try:
    # /machines/list
    api_response = api_instance.get_machines(access_token, group_param)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IndustrialApi->get_machines: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **group_param** | [**InlineObject18**](InlineObject18.md)|  | 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_machines_history**
> MachineHistoryResponse get_machines_history(access_token, history_param)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.IndustrialApi()
access_token = 'access_token_example' # str | Samsara API access token.
history_param = openapi_client.InlineObject17() # InlineObject17 | 

try:
    # /machines/history
    api_response = api_instance.get_machines_history(access_token, history_param)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IndustrialApi->get_machines_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Samsara API access token. | 
 **history_param** | [**InlineObject17**](InlineObject17.md)|  | 

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


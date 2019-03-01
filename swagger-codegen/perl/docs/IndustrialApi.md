# WWW::SwaggerClient::IndustrialApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::IndustrialApi;
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_data_inputs**](IndustrialApi.md#get_all_data_inputs) | **GET** /industrial/data | /industrial/data
[**get_data_input**](IndustrialApi.md#get_data_input) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**get_machines**](IndustrialApi.md#get_machines) | **POST** /machines/list | /machines/list
[**get_machines_history**](IndustrialApi.md#get_machines_history) | **POST** /machines/history | /machines/history


# **get_all_data_inputs**
> InlineResponse2006 get_all_data_inputs(access_token => $access_token, group_id => $group_id, start_ms => $start_ms, end_ms => $end_ms)

/industrial/data

Fetch all of the data inputs for a group.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::IndustrialApi;
my $api_instance = WWW::SwaggerClient::IndustrialApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).
my $start_ms = 789; # int | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
my $end_ms = 789; # int | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.

eval { 
    my $result = $api_instance->get_all_data_inputs(access_token => $access_token, group_id => $group_id, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IndustrialApi->get_all_data_inputs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **start_ms** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **end_ms** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_data_input**
> DataInputHistoryResponse get_data_input(access_token => $access_token, data_input_id => $data_input_id, start_ms => $start_ms, end_ms => $end_ms)

/industrial/data/{data_input_id:[0-9]+}

Fetch datapoints from a given data input.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::IndustrialApi;
my $api_instance = WWW::SwaggerClient::IndustrialApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $data_input_id = 789; # int | ID of the data input
my $start_ms = 789; # int | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
my $end_ms = 789; # int | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.

eval { 
    my $result = $api_instance->get_data_input(access_token => $access_token, data_input_id => $data_input_id, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IndustrialApi->get_data_input: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **data_input_id** | **int**| ID of the data input | 
 **start_ms** | **int**| Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. | [optional] 
 **end_ms** | **int**| Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. | [optional] 

### Return type

[**DataInputHistoryResponse**](DataInputHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_machines**
> InlineResponse2007 get_machines(access_token => $access_token, group_param => $group_param)

/machines/list

Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::IndustrialApi;
my $api_instance = WWW::SwaggerClient::IndustrialApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $group_param = WWW::SwaggerClient::Object::GroupParam->new(); # GroupParam | Group ID to query.

eval { 
    my $result = $api_instance->get_machines(access_token => $access_token, group_param => $group_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IndustrialApi->get_machines: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_param** | [**GroupParam**](GroupParam.md)| Group ID to query. | 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_machines_history**
> MachineHistoryResponse get_machines_history(access_token => $access_token, history_param => $history_param)

/machines/history

Get historical data for machine objects. This method returns a set of historical data for all machines in a group

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::IndustrialApi;
my $api_instance = WWW::SwaggerClient::IndustrialApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $history_param = WWW::SwaggerClient::Object::HistoryParam->new(); # HistoryParam | Group ID and time range to query for events

eval { 
    my $result = $api_instance->get_machines_history(access_token => $access_token, history_param => $history_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IndustrialApi->get_machines_history: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **history_param** | [**HistoryParam**](HistoryParam.md)| Group ID and time range to query for events | 

### Return type

[**MachineHistoryResponse**](MachineHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


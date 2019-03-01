# WWW::OpenAPIClient::Object::InlineObject21

## Load the model package
```perl
use WWW::OpenAPIClient::Object::InlineObject21;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_ms** | **int** | End of the time range, specified in milliseconds UNIX time. | 
**fill_missing** | **string** |  | [optional] [default to &#39;withNull&#39;]
**group_id** | **int** | Group ID to query. | 
**series** | [**ARRAY[SensorsHistorySeries]**](SensorsHistorySeries.md) |  | 
**start_ms** | **int** | Beginning of the time range, specified in milliseconds UNIX time. | 
**step_ms** | **int** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



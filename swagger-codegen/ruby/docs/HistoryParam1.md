# SwaggerClient::HistoryParam1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_ms** | **Integer** | End of the time range, specified in milliseconds UNIX time. | 
**fill_missing** | **String** |  | [optional] [default to &#39;withNull&#39;]
**group_id** | **Integer** | Group ID to query. | 
**series** | [**Array&lt;SensorshistorySeries&gt;**](SensorshistorySeries.md) |  | 
**start_ms** | **Integer** | Beginning of the time range, specified in milliseconds UNIX time. | 
**step_ms** | **Integer** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | 



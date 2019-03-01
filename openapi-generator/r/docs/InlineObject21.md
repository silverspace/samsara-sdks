# openapi::InlineObject21

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endMs** | **integer** | End of the time range, specified in milliseconds UNIX time. | 
**fillMissing** | **character** |  | [optional] [default to &#39;withNull&#39;]
**groupId** | **integer** | Group ID to query. | 
**series** | [**SensorsHistorySeries**](_sensors_history_series.md) |  | 
**startMs** | **integer** | Beginning of the time range, specified in milliseconds UNIX time. | 
**stepMs** | **integer** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | 



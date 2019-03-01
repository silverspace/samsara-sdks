# InlineObject21

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_ms** | **i32** | End of the time range, specified in milliseconds UNIX time. | 
**fill_missing** | **String** |  | [optional] [default to withNull]
**group_id** | **i64** | Group ID to query. | 
**series** | [**Vec<::models::SensorsHistorySeries>**](_sensors_history_series.md) |  | 
**start_ms** | **i32** | Beginning of the time range, specified in milliseconds UNIX time. | 
**step_ms** | **i32** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



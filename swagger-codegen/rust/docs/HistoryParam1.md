# HistoryParam1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_ms** | **i32** | End of the time range, specified in milliseconds UNIX time. | [default to null]
**fill_missing** | **String** |  | [optional] [default to null]
**group_id** | **i64** | Group ID to query. | [default to null]
**series** | [**Vec<::models::SensorshistorySeries>**](sensorshistory_series.md) |  | [default to null]
**start_ms** | **i32** | Beginning of the time range, specified in milliseconds UNIX time. | [default to null]
**step_ms** | **i32** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



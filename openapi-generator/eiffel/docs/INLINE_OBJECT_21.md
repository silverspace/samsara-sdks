# INLINE_OBJECT_21

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_ms** | **INTEGER_32** | End of the time range, specified in milliseconds UNIX time. | [default to null]
**fill_missing** | [**STRING_32**](STRING_32.md) |  | [optional] [default to withNull]
**group_id** | **INTEGER_64** | Group ID to query. | [default to null]
**series** | [**LIST [_SENSORS_HISTORY_SERIES]**](_sensors_history_series.md) |  | [default to null]
**start_ms** | **INTEGER_32** | Beginning of the time range, specified in milliseconds UNIX time. | [default to null]
**step_ms** | **INTEGER_32** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



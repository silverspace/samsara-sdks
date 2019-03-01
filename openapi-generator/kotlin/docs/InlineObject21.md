
# InlineObject21

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endMs** | **kotlin.Int** | End of the time range, specified in milliseconds UNIX time. | 
**fillMissing** | [**inline**](#FillMissingEnum) |  |  [optional]
**groupId** | **kotlin.Long** | Group ID to query. | 
**series** | [**kotlin.Array&lt;SensorsHistorySeries&gt;**](SensorsHistorySeries.md) |  | 
**startMs** | **kotlin.Int** | Beginning of the time range, specified in milliseconds UNIX time. | 
**stepMs** | **kotlin.Int** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | 


<a name="FillMissingEnum"></a>
## Enum: fillMissing
Name | Value
---- | -----
fillMissing | withNull, withPrevious




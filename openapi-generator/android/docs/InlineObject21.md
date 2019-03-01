
# InlineObject21

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endMs** | **Integer** | End of the time range, specified in milliseconds UNIX time. | 
**fillMissing** | [**FillMissingEnum**](#FillMissingEnum) |  |  [optional]
**groupId** | **Long** | Group ID to query. | 
**series** | [**List&lt;SensorsHistorySeries&gt;**](SensorsHistorySeries.md) |  | 
**startMs** | **Integer** | Beginning of the time range, specified in milliseconds UNIX time. | 
**stepMs** | **Integer** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | 


<a name="FillMissingEnum"></a>
## Enum: FillMissingEnum
Name | Value
---- | -----




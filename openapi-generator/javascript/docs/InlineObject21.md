# SamsaraApi.InlineObject21

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endMs** | **Number** | End of the time range, specified in milliseconds UNIX time. | 
**fillMissing** | **String** |  | [optional] [default to &#39;withNull&#39;]
**groupId** | **Number** | Group ID to query. | 
**series** | [**[SensorsHistorySeries]**](SensorsHistorySeries.md) |  | 
**startMs** | **Number** | Beginning of the time range, specified in milliseconds UNIX time. | 
**stepMs** | **Number** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | 


<a name="FillMissingEnum"></a>
## Enum: FillMissingEnum


* `withNull` (value: `"withNull"`)

* `withPrevious` (value: `"withPrevious"`)





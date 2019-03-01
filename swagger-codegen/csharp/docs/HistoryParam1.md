# samsara.Model.HistoryParam1
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndMs** | **int?** | End of the time range, specified in milliseconds UNIX time. | 
**FillMissing** | **string** |  | [optional] [default to FillMissingEnum.WithNull]
**GroupId** | **long?** | Group ID to query. | 
**Series** | [**List&lt;SensorshistorySeries&gt;**](SensorshistorySeries.md) |  | 
**StartMs** | **int?** | Beginning of the time range, specified in milliseconds UNIX time. | 
**StepMs** | **int?** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


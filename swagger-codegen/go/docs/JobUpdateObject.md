# JobUpdateObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangedAtMs** | **int64** | Timestamp that this event was updated, represented as Unix milliseconds since epoch. | [optional] [default to null]
**JobId** | **int64** | ID of the Samsara job. | [optional] [default to null]
**JobState** | [***JobStatus**](jobStatus.md) |  | [optional] [default to null]
**PrevJobState** | [***PrevJobStatus**](prevJobStatus.md) |  | [optional] [default to null]
**Route** | [***DispatchRoute**](DispatchRoute.md) |  | [optional] [default to null]
**RouteId** | **int64** | ID of the Samsara dispatch route. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



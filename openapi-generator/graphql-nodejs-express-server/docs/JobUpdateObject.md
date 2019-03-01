# JobUpdateObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changedAtMs** | **Int!** | Timestamp that this event was updated, represented as Unix milliseconds since epoch. | [optional] [default to null]
**jobId** | **Int!** | ID of the Samsara job. | [optional] [default to null]
**jobState** | [***JobStatus**](jobStatus.md) |  | [optional] [default to null]
**prevJobState** | [***PrevJobStatus**](prevJobStatus.md) |  | [optional] [default to null]
**route** | [***DispatchRoute**](DispatchRoute.md) |  | [optional] [default to null]
**routeId** | **Int!** | ID of the Samsara dispatch route. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



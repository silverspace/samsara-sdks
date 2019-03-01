# JOB_UPDATE_OBJECT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_at_ms** | **INTEGER_64** | Timestamp that this event was updated, represented as Unix milliseconds since epoch. | [optional] [default to null]
**job_id** | **INTEGER_64** | ID of the Samsara job. | [optional] [default to null]
**job_state** | [**JOB_STATUS**](jobStatus.md) |  | [optional] [default to null]
**prev_job_state** | [**PREV_JOB_STATUS**](prevJobStatus.md) |  | [optional] [default to null]
**route** | [**DISPATCH_ROUTE**](DispatchRoute.md) |  | [optional] [default to null]
**route_id** | **INTEGER_64** | ID of the Samsara dispatch route. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



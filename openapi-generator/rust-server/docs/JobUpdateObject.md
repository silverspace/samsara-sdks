# JobUpdateObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_at_ms** | **i64** | Timestamp that this event was updated, represented as Unix milliseconds since epoch. | [optional] [default to None]
**job_id** | **i64** | ID of the Samsara job. | [optional] [default to None]
**job_state** | [***models::JobStatus**](jobStatus.md) |  | [optional] [default to None]
**prev_job_state** | [***models::PrevJobStatus**](prevJobStatus.md) |  | [optional] [default to None]
**route** | [***models::DispatchRoute**](DispatchRoute.md) |  | [optional] [default to None]
**route_id** | **i64** | ID of the Samsara dispatch route. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



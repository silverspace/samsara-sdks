# openapi::JobUpdateObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_at_ms** | **integer** | Timestamp that this event was updated, represented as Unix milliseconds since epoch. | [optional] 
**job_id** | **integer** | ID of the Samsara job. | [optional] 
**job_state** | [**JobStatus**](jobStatus.md) |  | [optional] 
**prev_job_state** | [**PrevJobStatus**](prevJobStatus.md) |  | [optional] 
**route** | [**DispatchRoute**](DispatchRoute.md) |  | [optional] 
**route_id** | **integer** | ID of the Samsara dispatch route. | [optional] 



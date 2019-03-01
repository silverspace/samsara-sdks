# WWW::SwaggerClient::Object::JobUpdateObject

## Load the model package
```perl
use WWW::SwaggerClient::Object::JobUpdateObject;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_at_ms** | **int** | Timestamp that this event was updated, represented as Unix milliseconds since epoch. | [optional] 
**job_id** | **int** | ID of the Samsara job. | [optional] 
**job_state** | [**JobStatus**](JobStatus.md) |  | [optional] 
**prev_job_state** | [**PrevJobStatus**](PrevJobStatus.md) |  | [optional] 
**route** | [**DispatchRoute**](DispatchRoute.md) |  | [optional] 
**route_id** | **int** | ID of the Samsara dispatch route. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



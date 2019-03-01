# OpenapiClient::JobUpdateObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_at_ms** | **Integer** | Timestamp that this event was updated, represented as Unix milliseconds since epoch. | [optional] 
**job_id** | **Integer** | ID of the Samsara job. | [optional] 
**job_state** | [**JobStatus**](JobStatus.md) |  | [optional] 
**prev_job_state** | [**PrevJobStatus**](PrevJobStatus.md) |  | [optional] 
**route** | [**DispatchRoute**](DispatchRoute.md) |  | [optional] 
**route_id** | **Integer** | ID of the Samsara dispatch route. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::JobUpdateObject.new(changed_at_ms: 1462881998034,
                                 job_id: 773,
                                 job_state: null,
                                 prev_job_state: null,
                                 route: null,
                                 route_id: 556)
```



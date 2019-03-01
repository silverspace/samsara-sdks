# JobUpdateObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changedAtMs** | **int** | Timestamp that this event was updated, represented as Unix milliseconds since epoch. | [optional] 
**jobId** | **int** | ID of the Samsara job. | [optional] 
**jobState** | [**OpenAPI\Server\Model\JobStatus**](JobStatus.md) |  | [optional] 
**prevJobState** | [**OpenAPI\Server\Model\PrevJobStatus**](PrevJobStatus.md) |  | [optional] 
**route** | [**OpenAPI\Server\Model\DispatchRoute**](DispatchRoute.md) |  | [optional] 
**routeId** | **int** | ID of the Samsara dispatch route. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



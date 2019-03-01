# DispatchJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationAddress** | **string** | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] 
**destinationAddressId** | **int** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] 
**destinationLat** | **double** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destinationLng** | **double** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destinationName** | **string** | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] 
**notes** | **string** | Notes regarding the details of this job. | [optional] 
**scheduledArrivalTimeMs** | **int** | The time at which the assigned driver is scheduled to arrive at the job destination. | 
**scheduledDepartureTimeMs** | **int** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] 
**arrivedAtMs** | **int** | The time at which the driver arrived at the job destination. | [optional] 
**completedAtMs** | **int** | The time at which the job was marked complete (e.g. started driving to the next destination). | [optional] 
**dispatchRouteId** | **int** | ID of the route that this job belongs to. | 
**driverId** | **int** | ID of the driver assigned to the dispatch job. | [optional] 
**enRouteAtMs** | **int** | The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). | [optional] 
**estimatedArrivalMs** | **int** | The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. | [optional] 
**fleetViewerUrl** | **string** | Fleet viewer url of the dispatch job. | [optional] 
**groupId** | **int** |  | 
**id** | **int** | ID of the Samsara dispatch job. | 
**jobState** | [**OpenAPI\Server\Model\JobStatus**](JobStatus.md) |  | 
**skippedAtMs** | **int** | The time at which the job was marked skipped. | [optional] 
**vehicleId** | **int** | ID of the vehicle used for the dispatch job. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# SamsaraApi.DispatchJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationAddress** | **String** | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] 
**destinationAddressId** | **Number** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] 
**destinationLat** | **Number** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destinationLng** | **Number** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destinationName** | **String** | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] 
**notes** | **String** | Notes regarding the details of this job. | [optional] 
**scheduledArrivalTimeMs** | **Number** | The time at which the assigned driver is scheduled to arrive at the job destination. | 
**scheduledDepartureTimeMs** | **Number** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] 
**arrivedAtMs** | **Number** | The time at which the driver arrived at the job destination. | [optional] 
**completedAtMs** | **Number** | The time at which the job was marked complete (e.g. started driving to the next destination). | [optional] 
**dispatchRouteId** | **Number** | ID of the route that this job belongs to. | 
**driverId** | **Number** | ID of the driver assigned to the dispatch job. | [optional] 
**enRouteAtMs** | **Number** | The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). | [optional] 
**estimatedArrivalMs** | **Number** | The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. | [optional] 
**fleetViewerUrl** | **String** | Fleet viewer url of the dispatch job. | [optional] 
**groupId** | **Number** |  | 
**id** | **Number** | ID of the Samsara dispatch job. | 
**jobState** | [**JobStatus**](JobStatus.md) |  | 
**skippedAtMs** | **Number** | The time at which the job was marked skipped. | [optional] 
**vehicleId** | **Number** | ID of the vehicle used for the dispatch job. | [optional] 



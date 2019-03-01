# SWGDispatchJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationAddress** | **NSString*** | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] 
**destinationAddressId** | **NSNumber*** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] 
**destinationLat** | **NSNumber*** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destinationLng** | **NSNumber*** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destinationName** | **NSString*** | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] 
**notes** | **NSString*** | Notes regarding the details of this job. | [optional] 
**scheduledArrivalTimeMs** | **NSNumber*** | The time at which the assigned driver is scheduled to arrive at the job destination. | 
**scheduledDepartureTimeMs** | **NSNumber*** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] 
**arrivedAtMs** | **NSNumber*** | The time at which the driver arrived at the job destination. | [optional] 
**completedAtMs** | **NSNumber*** | The time at which the job was marked complete (e.g. started driving to the next destination). | [optional] 
**dispatchRouteId** | **NSNumber*** | ID of the route that this job belongs to. | 
**driverId** | **NSNumber*** | ID of the driver assigned to the dispatch job. | [optional] 
**enRouteAtMs** | **NSNumber*** | The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). | [optional] 
**estimatedArrivalMs** | **NSNumber*** | The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. | [optional] 
**fleetViewerUrl** | **NSString*** | Fleet viewer url of the dispatch job. | [optional] 
**groupId** | **NSNumber*** |  | 
**_id** | **NSNumber*** | ID of the Samsara dispatch job. | 
**jobState** | [**SWGJobStatus***](SWGJobStatus.md) |  | 
**skippedAtMs** | **NSNumber*** | The time at which the job was marked skipped. | [optional] 
**vehicleId** | **NSNumber*** | ID of the vehicle used for the dispatch job. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



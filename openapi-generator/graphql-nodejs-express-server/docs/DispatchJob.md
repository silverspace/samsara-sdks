# DispatchJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationAddress** | **String!** | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] [default to null]
**destinationAddressId** | **Int!** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] [default to null]
**destinationLat** | **Float!** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] [default to null]
**destinationLng** | **Float!** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] [default to null]
**destinationName** | **String!** | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] [default to null]
**notes** | **String!** | Notes regarding the details of this job. | [optional] [default to null]
**scheduledArrivalTimeMs** | **Int!** | The time at which the assigned driver is scheduled to arrive at the job destination. | [default to null]
**scheduledDepartureTimeMs** | **Int!** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] [default to null]
**arrivedAtMs** | **Int!** | The time at which the driver arrived at the job destination. | [optional] [default to null]
**completedAtMs** | **Int!** | The time at which the job was marked complete (e.g. started driving to the next destination). | [optional] [default to null]
**dispatchRouteId** | **Int!** | ID of the route that this job belongs to. | [default to null]
**driverId** | **Int!** | ID of the driver assigned to the dispatch job. | [optional] [default to null]
**enRouteAtMs** | **Int!** | The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). | [optional] [default to null]
**estimatedArrivalMs** | **Int!** | The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. | [optional] [default to null]
**fleetViewerUrl** | **String!** | Fleet viewer url of the dispatch job. | [optional] [default to null]
**groupId** | **Int!** |  | [default to null]
**Id_** | **Int!** | ID of the Samsara dispatch job. | [default to null]
**jobState** | [***JobStatus**](jobStatus.md) |  | [default to null]
**skippedAtMs** | **Int!** | The time at which the job was marked skipped. | [optional] [default to null]
**vehicleId** | **Int!** | ID of the vehicle used for the dispatch job. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



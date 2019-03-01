# DispatchJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DestinationAddress** | **string** | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] [default to null]
**DestinationAddressId** | **int64** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] [default to null]
**DestinationLat** | **float64** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] [default to null]
**DestinationLng** | **float64** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] [default to null]
**DestinationName** | **string** | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] [default to null]
**Notes** | **string** | Notes regarding the details of this job. | [optional] [default to null]
**ScheduledArrivalTimeMs** | **int64** | The time at which the assigned driver is scheduled to arrive at the job destination. | [default to null]
**ScheduledDepartureTimeMs** | **int64** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] [default to null]
**ArrivedAtMs** | **int64** | The time at which the driver arrived at the job destination. | [optional] [default to null]
**CompletedAtMs** | **int64** | The time at which the job was marked complete (e.g. started driving to the next destination). | [optional] [default to null]
**DispatchRouteId** | **int64** | ID of the route that this job belongs to. | [default to null]
**DriverId** | **int64** | ID of the driver assigned to the dispatch job. | [optional] [default to null]
**EnRouteAtMs** | **int64** | The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). | [optional] [default to null]
**EstimatedArrivalMs** | **int64** | The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. | [optional] [default to null]
**FleetViewerUrl** | **string** | Fleet viewer url of the dispatch job. | [optional] [default to null]
**GroupId** | **int64** |  | [default to null]
**Id** | **int64** | ID of the Samsara dispatch job. | [default to null]
**JobState** | [***JobStatus**](jobStatus.md) |  | [default to null]
**SkippedAtMs** | **int64** | The time at which the job was marked skipped. | [optional] [default to null]
**VehicleId** | **int64** | ID of the vehicle used for the dispatch job. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



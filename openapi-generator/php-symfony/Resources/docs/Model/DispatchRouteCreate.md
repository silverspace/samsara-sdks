# DispatchRouteCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actualEndMs** | **int** | The time in Unix epoch milliseconds that the route actually ended. | [optional] 
**actualStartMs** | **int** | The time in Unix epoch milliseconds that the route actually started. | [optional] 
**driverId** | **int** | ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] 
**groupId** | **int** | ID of the group if the organization has multiple groups (optional). | [optional] 
**name** | **string** | Descriptive name of this route. | 
**scheduledEndMs** | **int** | The time in Unix epoch milliseconds that the last job in the route is scheduled to end. | 
**scheduledMeters** | **int** | The distance expected to be traveled for this route in meters. | [optional] 
**scheduledStartMs** | **int** | The time in Unix epoch milliseconds that the route is scheduled to start. | 
**startLocationAddress** | **string** | The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. | [optional] 
**startLocationAddressId** | **int** | ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. | [optional] 
**startLocationLat** | **double** | Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] 
**startLocationLng** | **double** | Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] 
**startLocationName** | **string** | The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry. | [optional] 
**trailerId** | **int** | ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. | [optional] 
**vehicleId** | **int** | ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] 
**dispatchJobs** | [**OpenAPI\Server\Model\DispatchJobCreate**](DispatchJobCreate.md) | The dispatch jobs to create for this route. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



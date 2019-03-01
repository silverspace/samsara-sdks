# SamsaraApi.DispatchRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actualEndMs** | **Number** | The time in Unix epoch milliseconds that the route actually ended. | [optional] 
**actualStartMs** | **Number** | The time in Unix epoch milliseconds that the route actually started. | [optional] 
**driverId** | **Number** | ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] 
**groupId** | **Number** | ID of the group if the organization has multiple groups (optional). | [optional] 
**name** | **String** | Descriptive name of this route. | 
**scheduledEndMs** | **Number** | The time in Unix epoch milliseconds that the last job in the route is scheduled to end. | 
**scheduledMeters** | **Number** | The distance expected to be traveled for this route in meters. | [optional] 
**scheduledStartMs** | **Number** | The time in Unix epoch milliseconds that the route is scheduled to start. | 
**startLocationAddress** | **String** | The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. | [optional] 
**startLocationAddressId** | **Number** | ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. | [optional] 
**startLocationLat** | **Number** | Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] 
**startLocationLng** | **Number** | Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] 
**startLocationName** | **String** | The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry. | [optional] 
**trailerId** | **Number** | ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. | [optional] 
**vehicleId** | **Number** | ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] 
**dispatchJobs** | [**[DispatchJob]**](DispatchJob.md) | The dispatch jobs associated with this route. | 
**id** | **Number** | ID of the Samsara dispatch route. | 



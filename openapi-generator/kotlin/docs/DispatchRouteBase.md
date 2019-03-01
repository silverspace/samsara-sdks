
# DispatchRouteBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actualEndMs** | **kotlin.Long** | The time in Unix epoch milliseconds that the route actually ended. |  [optional]
**actualStartMs** | **kotlin.Long** | The time in Unix epoch milliseconds that the route actually started. |  [optional]
**driverId** | **kotlin.Long** | ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. |  [optional]
**groupId** | **kotlin.Long** | ID of the group if the organization has multiple groups (optional). |  [optional]
**name** | **kotlin.String** | Descriptive name of this route. | 
**scheduledEndMs** | **kotlin.Long** | The time in Unix epoch milliseconds that the last job in the route is scheduled to end. | 
**scheduledMeters** | **kotlin.Long** | The distance expected to be traveled for this route in meters. |  [optional]
**scheduledStartMs** | **kotlin.Long** | The time in Unix epoch milliseconds that the route is scheduled to start. | 
**startLocationAddress** | **kotlin.String** | The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. |  [optional]
**startLocationAddressId** | **kotlin.Long** | ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. |  [optional]
**startLocationLat** | **kotlin.Double** | Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. |  [optional]
**startLocationLng** | **kotlin.Double** | Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. |  [optional]
**startLocationName** | **kotlin.String** | The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry. |  [optional]
**trailerId** | **kotlin.Long** | ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. |  [optional]
**vehicleId** | **kotlin.Long** | ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. |  [optional]




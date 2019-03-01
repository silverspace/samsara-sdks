# Org.OpenAPITools.Model.DispatchRoute
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActualEndMs** | **long** | The time in Unix epoch milliseconds that the route actually ended. | [optional] 
**ActualStartMs** | **long** | The time in Unix epoch milliseconds that the route actually started. | [optional] 
**DriverId** | **long** | ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] 
**GroupId** | **long** | ID of the group if the organization has multiple groups (optional). | [optional] 
**Name** | **string** | Descriptive name of this route. | 
**ScheduledEndMs** | **long** | The time in Unix epoch milliseconds that the last job in the route is scheduled to end. | 
**ScheduledMeters** | **long** | The distance expected to be traveled for this route in meters. | [optional] 
**ScheduledStartMs** | **long** | The time in Unix epoch milliseconds that the route is scheduled to start. | 
**StartLocationAddress** | **string** | The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. | [optional] 
**StartLocationAddressId** | **long** | ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. | [optional] 
**StartLocationLat** | **double** | Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] 
**StartLocationLng** | **double** | Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] 
**StartLocationName** | **string** | The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry. | [optional] 
**TrailerId** | **long** | ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. | [optional] 
**VehicleId** | **long** | ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] 
**DispatchJobs** | [**List&lt;DispatchJob&gt;**](DispatchJob.md) | The dispatch jobs associated with this route. | 
**Id** | **long** | ID of the Samsara dispatch route. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


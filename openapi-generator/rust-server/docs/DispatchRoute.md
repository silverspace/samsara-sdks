# DispatchRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actual_end_ms** | **i64** | The time in Unix epoch milliseconds that the route actually ended. | [optional] [default to None]
**actual_start_ms** | **i64** | The time in Unix epoch milliseconds that the route actually started. | [optional] [default to None]
**driver_id** | **i64** | ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] [default to None]
**group_id** | **i64** | ID of the group if the organization has multiple groups (optional). | [optional] [default to None]
**name** | **String** | Descriptive name of this route. | 
**scheduled_end_ms** | **i64** | The time in Unix epoch milliseconds that the last job in the route is scheduled to end. | 
**scheduled_meters** | **i64** | The distance expected to be traveled for this route in meters. | [optional] [default to None]
**scheduled_start_ms** | **i64** | The time in Unix epoch milliseconds that the route is scheduled to start. | 
**start_location_address** | **String** | The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. | [optional] [default to None]
**start_location_address_id** | **i64** | ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. | [optional] [default to None]
**start_location_lat** | **f64** | Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] [default to None]
**start_location_lng** | **f64** | Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] [default to None]
**start_location_name** | **String** | The name of the route's starting location. If provided, it will take precedence over the name of the address book entry. | [optional] [default to None]
**trailer_id** | **i64** | ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. | [optional] [default to None]
**vehicle_id** | **i64** | ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] [default to None]
**dispatch_jobs** | [**Vec<models::DispatchJob>**](DispatchJob.md) | The dispatch jobs associated with this route. | 
**id** | **i64** | ID of the Samsara dispatch route. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



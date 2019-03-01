# DISPATCH_ROUTE_BASE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actual_end_ms** | **INTEGER_64** | The time in Unix epoch milliseconds that the route actually ended. | [optional] [default to null]
**actual_start_ms** | **INTEGER_64** | The time in Unix epoch milliseconds that the route actually started. | [optional] [default to null]
**driver_id** | **INTEGER_64** | ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] [default to null]
**group_id** | **INTEGER_64** | ID of the group if the organization has multiple groups (optional). | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Descriptive name of this route. | [default to null]
**scheduled_end_ms** | **INTEGER_64** | The time in Unix epoch milliseconds that the last job in the route is scheduled to end. | [default to null]
**scheduled_meters** | **INTEGER_64** | The distance expected to be traveled for this route in meters. | [optional] [default to null]
**scheduled_start_ms** | **INTEGER_64** | The time in Unix epoch milliseconds that the route is scheduled to start. | [default to null]
**start_location_address** | [**STRING_32**](STRING_32.md) | The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. | [optional] [default to null]
**start_location_address_id** | **INTEGER_64** | ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. | [optional] [default to null]
**start_location_lat** | **REAL_64** | Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] [default to null]
**start_location_lng** | **REAL_64** | Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] [default to null]
**start_location_name** | [**STRING_32**](STRING_32.md) | The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry. | [optional] [default to null]
**trailer_id** | **INTEGER_64** | ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. | [optional] [default to null]
**vehicle_id** | **INTEGER_64** | ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



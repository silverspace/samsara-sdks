# OpenapiClient::DispatchRouteBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actual_end_ms** | **Integer** | The time in Unix epoch milliseconds that the route actually ended. | [optional] 
**actual_start_ms** | **Integer** | The time in Unix epoch milliseconds that the route actually started. | [optional] 
**driver_id** | **Integer** | ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] 
**group_id** | **Integer** | ID of the group if the organization has multiple groups (optional). | [optional] 
**name** | **String** | Descriptive name of this route. | 
**scheduled_end_ms** | **Integer** | The time in Unix epoch milliseconds that the last job in the route is scheduled to end. | 
**scheduled_meters** | **Integer** | The distance expected to be traveled for this route in meters. | [optional] 
**scheduled_start_ms** | **Integer** | The time in Unix epoch milliseconds that the route is scheduled to start. | 
**start_location_address** | **String** | The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. | [optional] 
**start_location_address_id** | **Integer** | ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. | [optional] 
**start_location_lat** | **Float** | Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] 
**start_location_lng** | **Float** | Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. | [optional] 
**start_location_name** | **String** | The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry. | [optional] 
**trailer_id** | **Integer** | ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. | [optional] 
**vehicle_id** | **Integer** | ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DispatchRouteBase.new(actual_end_ms: 1462882101000,
                                 actual_start_ms: 1462882098000,
                                 driver_id: 555,
                                 group_id: 101,
                                 name: Bid #123,
                                 scheduled_end_ms: 1462881998034,
                                 scheduled_meters: 10000,
                                 scheduled_start_ms: 1462881998034,
                                 start_location_address: 123 Main St, Philadelphia, PA 19106,
                                 start_location_address_id: 67890,
                                 start_location_lat: 123.456,
                                 start_location_lng: 37.459,
                                 start_location_name: ACME Inc. Philadelphia HQ,
                                 trailer_id: 666,
                                 vehicle_id: 444)
```



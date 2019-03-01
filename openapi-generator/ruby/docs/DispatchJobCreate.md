# OpenapiClient::DispatchJobCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_address** | **String** | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] 
**destination_address_id** | **Integer** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] 
**destination_lat** | **Float** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destination_lng** | **Float** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destination_name** | **String** | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] 
**notes** | **String** | Notes regarding the details of this job. | [optional] 
**scheduled_arrival_time_ms** | **Integer** | The time at which the assigned driver is scheduled to arrive at the job destination. | 
**scheduled_departure_time_ms** | **Integer** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DispatchJobCreate.new(destination_address: 123 Main St, Philadelphia, PA 19106,
                                 destination_address_id: 67890,
                                 destination_lat: 123.456,
                                 destination_lng: 37.459,
                                 destination_name: ACME Inc. Philadelphia HQ,
                                 notes: Ensure crates are stacked no more than 3 high.,
                                 scheduled_arrival_time_ms: 1462881998034,
                                 scheduled_departure_time_ms: 1462881998034)
```



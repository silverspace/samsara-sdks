# openapi::DispatchJobCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_address** | **character** | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] 
**destination_address_id** | **integer** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] 
**destination_lat** | **numeric** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destination_lng** | **numeric** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] 
**destination_name** | **character** | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] 
**notes** | **character** | Notes regarding the details of this job. | [optional] 
**scheduled_arrival_time_ms** | **integer** | The time at which the assigned driver is scheduled to arrive at the job destination. | 
**scheduled_departure_time_ms** | **integer** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] 



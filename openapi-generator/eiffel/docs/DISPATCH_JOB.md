# DISPATCH_JOB

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_address** | [**STRING_32**](STRING_32.md) | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] [default to null]
**destination_address_id** | **INTEGER_64** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] [default to null]
**destination_lat** | **REAL_64** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] [default to null]
**destination_lng** | **REAL_64** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] [default to null]
**destination_name** | [**STRING_32**](STRING_32.md) | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] [default to null]
**notes** | [**STRING_32**](STRING_32.md) | Notes regarding the details of this job. | [optional] [default to null]
**scheduled_arrival_time_ms** | **INTEGER_64** | The time at which the assigned driver is scheduled to arrive at the job destination. | [default to null]
**scheduled_departure_time_ms** | **INTEGER_64** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] [default to null]
**arrived_at_ms** | **INTEGER_64** | The time at which the driver arrived at the job destination. | [optional] [default to null]
**completed_at_ms** | **INTEGER_64** | The time at which the job was marked complete (e.g. started driving to the next destination). | [optional] [default to null]
**dispatch_route_id** | **INTEGER_64** | ID of the route that this job belongs to. | [default to null]
**driver_id** | **INTEGER_64** | ID of the driver assigned to the dispatch job. | [optional] [default to null]
**en_route_at_ms** | **INTEGER_64** | The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). | [optional] [default to null]
**estimated_arrival_ms** | **INTEGER_64** | The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. | [optional] [default to null]
**fleet_viewer_url** | [**STRING_32**](STRING_32.md) | Fleet viewer url of the dispatch job. | [optional] [default to null]
**group_id** | **INTEGER_64** |  | [default to null]
**id** | **INTEGER_64** | ID of the Samsara dispatch job. | [default to null]
**job_state** | [**JOB_STATUS**](jobStatus.md) |  | [default to null]
**skipped_at_ms** | **INTEGER_64** | The time at which the job was marked skipped. | [optional] [default to null]
**vehicle_id** | **INTEGER_64** | ID of the vehicle used for the dispatch job. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



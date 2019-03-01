# DispatchJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_address** | **String** | The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. | [optional] [default to None]
**destination_address_id** | **i64** | ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. | [optional] [default to None]
**destination_lat** | **f64** | Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] [default to None]
**destination_lng** | **f64** | Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. | [optional] [default to None]
**destination_name** | **String** | The name of the job destination. If provided, it will take precedence over the name of the address book entry. | [optional] [default to None]
**notes** | **String** | Notes regarding the details of this job. | [optional] [default to None]
**scheduled_arrival_time_ms** | **i64** | The time at which the assigned driver is scheduled to arrive at the job destination. | 
**scheduled_departure_time_ms** | **i64** | The time at which the assigned driver is scheduled to depart from the job destination. | [optional] [default to None]
**arrived_at_ms** | **i64** | The time at which the driver arrived at the job destination. | [optional] [default to None]
**completed_at_ms** | **i64** | The time at which the job was marked complete (e.g. started driving to the next destination). | [optional] [default to None]
**dispatch_route_id** | **i64** | ID of the route that this job belongs to. | 
**driver_id** | **i64** | ID of the driver assigned to the dispatch job. | [optional] [default to None]
**en_route_at_ms** | **i64** | The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). | [optional] [default to None]
**estimated_arrival_ms** | **i64** | The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. | [optional] [default to None]
**fleet_viewer_url** | **String** | Fleet viewer url of the dispatch job. | [optional] [default to None]
**group_id** | **i64** |  | 
**id** | **i64** | ID of the Samsara dispatch job. | 
**job_state** | [***models::JobStatus**](jobStatus.md) |  | 
**skipped_at_ms** | **i64** | The time at which the job was marked skipped. | [optional] [default to None]
**vehicle_id** | **i64** | ID of the vehicle used for the dispatch job. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



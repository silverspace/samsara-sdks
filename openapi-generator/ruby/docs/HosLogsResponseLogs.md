# OpenapiClient::HosLogsResponseLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loc_lng** | **Float** | Longitude at which the log was recorded. | [optional] 
**log_start_ms** | **Integer** | The time at which the log/HOS status started in UNIX milliseconds. | [optional] 
**driver_id** | **Integer** | ID of the driver. | [optional] 
**status_type** | **String** | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] 
**loc_city** | **String** | City in which the log was recorded. | [optional] 
**group_id** | **Integer** | ID of the group. | [optional] 
**loc_name** | **String** | Name of location at which the log was recorded. | [optional] 
**loc_lat** | **Float** | Latitude at which the log was recorded. | [optional] 
**remark** | **String** | Remark associated with the log entry. | [optional] 
**loc_state** | **String** | State in which the log was recorded. | [optional] 
**vehicle_id** | **Integer** | ID of the vehicle. | [optional] 
**codriver_ids** | **Array&lt;Integer&gt;** |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::HosLogsResponseLogs.new(loc_lng: -98.502888123,
                                 log_start_ms: 1462881998034,
                                 driver_id: 444,
                                 status_type: OFF_DUTY,
                                 loc_city: Ahwatukee,
                                 group_id: 101,
                                 loc_name: McLean Site A,
                                 loc_lat: 23.413702345,
                                 remark: Lunch Break,
                                 loc_state: Arizona,
                                 vehicle_id: 112,
                                 codriver_ids: null)
```



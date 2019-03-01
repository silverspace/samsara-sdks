# OpenapiClient::HosLogsSummaryResponseDrivers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time_until_break** | **Integer** | The amount of time (in ms) remaining until the driver cannot drive without a rest break. | [optional] 
**vehicle_name** | **String** | Name of the vehicle. | [optional] 
**driving_in_violation_today** | **Integer** | The amount of driving time in violation today (in ms). | [optional] 
**driver_id** | **Integer** | ID of the driver. | [optional] 
**cycle_remaining** | **Integer** | The amount of remaining cycle time (in ms). | [optional] 
**driver_name** | **String** | Name of the driver. | [optional] 
**duty_status** | **String** | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] 
**cycle_tomorrow** | **Integer** | The amount of cycle time (in ms) available tomorrow. | [optional] 
**shift_drive_remaining** | **Integer** | The amount of remaining shift drive time (in ms). | [optional] 
**time_in_current_status** | **Integer** | The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;. | [optional] 
**driving_in_violation_cycle** | **Integer** | The amount of driving time in violation in this cycle (in ms). | [optional] 
**shift_remaining** | **Integer** | The amount of remaining shift time (in ms). | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::HosLogsSummaryResponseDrivers.new(time_until_break: 28800000,
                                 vehicle_name: Vehicle 1,
                                 driving_in_violation_today: 39600000,
                                 driver_id: 444,
                                 cycle_remaining: 252000000,
                                 driver_name: Fred Jacobs,
                                 duty_status: OFF_DUTY,
                                 cycle_tomorrow: 252000000,
                                 shift_drive_remaining: 39600000,
                                 time_in_current_status: 5000,
                                 driving_in_violation_cycle: 50400000,
                                 shift_remaining: 50400000)
```



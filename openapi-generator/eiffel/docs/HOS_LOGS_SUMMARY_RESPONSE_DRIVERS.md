# HOS_LOGS_SUMMARY_RESPONSE_DRIVERS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time_until_break** | **INTEGER_64** | The amount of time (in ms) remaining until the driver cannot drive without a rest break. | [optional] [default to null]
**vehicle_name** | [**STRING_32**](STRING_32.md) | Name of the vehicle. | [optional] [default to null]
**driving_in_violation_today** | **INTEGER_64** | The amount of driving time in violation today (in ms). | [optional] [default to null]
**driver_id** | **INTEGER_64** | ID of the driver. | [optional] [default to null]
**cycle_remaining** | **INTEGER_64** | The amount of remaining cycle time (in ms). | [optional] [default to null]
**driver_name** | [**STRING_32**](STRING_32.md) | Name of the driver. | [optional] [default to null]
**duty_status** | [**STRING_32**](STRING_32.md) | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] [default to null]
**cycle_tomorrow** | **INTEGER_64** | The amount of cycle time (in ms) available tomorrow. | [optional] [default to null]
**shift_drive_remaining** | **INTEGER_64** | The amount of remaining shift drive time (in ms). | [optional] [default to null]
**time_in_current_status** | **INTEGER_64** | The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;. | [optional] [default to null]
**driving_in_violation_cycle** | **INTEGER_64** | The amount of driving time in violation in this cycle (in ms). | [optional] [default to null]
**shift_remaining** | **INTEGER_64** | The amount of remaining shift time (in ms). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# HosLogsSummaryResponseDrivers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time_until_break** | **i64** | The amount of time (in ms) remaining until the driver cannot drive without a rest break. | [optional] [default to None]
**vehicle_name** | **String** | Name of the vehicle. | [optional] [default to None]
**driving_in_violation_today** | **i64** | The amount of driving time in violation today (in ms). | [optional] [default to None]
**driver_id** | **i64** | ID of the driver. | [optional] [default to None]
**cycle_remaining** | **i64** | The amount of remaining cycle time (in ms). | [optional] [default to None]
**driver_name** | **String** | Name of the driver. | [optional] [default to None]
**duty_status** | **String** | The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. | [optional] [default to None]
**cycle_tomorrow** | **i64** | The amount of cycle time (in ms) available tomorrow. | [optional] [default to None]
**shift_drive_remaining** | **i64** | The amount of remaining shift drive time (in ms). | [optional] [default to None]
**time_in_current_status** | **i64** | The amount of time (in ms) that the driver has been in the current `dutyStatus`. | [optional] [default to None]
**driving_in_violation_cycle** | **i64** | The amount of driving time in violation in this cycle (in ms). | [optional] [default to None]
**shift_remaining** | **i64** | The amount of remaining shift time (in ms). | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# HosLogsSummaryResponseDrivers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CycleRemaining** | **int64** | The amount of remaining cycle time (in ms). | [optional] [default to null]
**CycleTomorrow** | **int64** | The amount of cycle time (in ms) available tomorrow. | [optional] [default to null]
**DriverId** | **int64** | ID of the driver. | [optional] [default to null]
**DriverName** | **string** | Name of the driver. | [optional] [default to null]
**DrivingInViolationCycle** | **int64** | The amount of driving time in violation in this cycle (in ms). | [optional] [default to null]
**DrivingInViolationToday** | **int64** | The amount of driving time in violation today (in ms). | [optional] [default to null]
**DutyStatus** | **string** | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] [default to null]
**ShiftDriveRemaining** | **int64** | The amount of remaining shift drive time (in ms). | [optional] [default to null]
**ShiftRemaining** | **int64** | The amount of remaining shift time (in ms). | [optional] [default to null]
**TimeInCurrentStatus** | **int64** | The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;. | [optional] [default to null]
**TimeUntilBreak** | **int64** | The amount of time (in ms) remaining until the driver cannot drive without a rest break. | [optional] [default to null]
**VehicleName** | **string** | Name of the vehicle. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



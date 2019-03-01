# HosLogsSummaryResponseDrivers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TimeUntilBreak** | **int64** | The amount of time (in ms) remaining until the driver cannot drive without a rest break. | [optional] 
**VehicleName** | **string** | Name of the vehicle. | [optional] 
**DrivingInViolationToday** | **int64** | The amount of driving time in violation today (in ms). | [optional] 
**DriverId** | **int64** | ID of the driver. | [optional] 
**CycleRemaining** | **int64** | The amount of remaining cycle time (in ms). | [optional] 
**DriverName** | **string** | Name of the driver. | [optional] 
**DutyStatus** | **string** | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] 
**CycleTomorrow** | **int64** | The amount of cycle time (in ms) available tomorrow. | [optional] 
**ShiftDriveRemaining** | **int64** | The amount of remaining shift drive time (in ms). | [optional] 
**TimeInCurrentStatus** | **int64** | The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;. | [optional] 
**DrivingInViolationCycle** | **int64** | The amount of driving time in violation in this cycle (in ms). | [optional] 
**ShiftRemaining** | **int64** | The amount of remaining shift time (in ms). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



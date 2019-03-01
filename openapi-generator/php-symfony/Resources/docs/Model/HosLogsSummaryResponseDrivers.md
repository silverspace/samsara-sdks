# HosLogsSummaryResponseDrivers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeUntilBreak** | **int** | The amount of time (in ms) remaining until the driver cannot drive without a rest break. | [optional] 
**vehicleName** | **string** | Name of the vehicle. | [optional] 
**drivingInViolationToday** | **int** | The amount of driving time in violation today (in ms). | [optional] 
**driverId** | **int** | ID of the driver. | [optional] 
**cycleRemaining** | **int** | The amount of remaining cycle time (in ms). | [optional] 
**driverName** | **string** | Name of the driver. | [optional] 
**dutyStatus** | **string** | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] 
**cycleTomorrow** | **int** | The amount of cycle time (in ms) available tomorrow. | [optional] 
**shiftDriveRemaining** | **int** | The amount of remaining shift drive time (in ms). | [optional] 
**timeInCurrentStatus** | **int** | The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;. | [optional] 
**drivingInViolationCycle** | **int** | The amount of driving time in violation in this cycle (in ms). | [optional] 
**shiftRemaining** | **int** | The amount of remaining shift time (in ms). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



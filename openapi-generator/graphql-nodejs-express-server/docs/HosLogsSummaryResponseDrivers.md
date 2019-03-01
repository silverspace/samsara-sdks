# HosLogsSummaryResponseDrivers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeUntilBreak** | **Int!** | The amount of time (in ms) remaining until the driver cannot drive without a rest break. | [optional] [default to null]
**vehicleName** | **String!** | Name of the vehicle. | [optional] [default to null]
**drivingInViolationToday** | **Int!** | The amount of driving time in violation today (in ms). | [optional] [default to null]
**driverId** | **Int!** | ID of the driver. | [optional] [default to null]
**cycleRemaining** | **Int!** | The amount of remaining cycle time (in ms). | [optional] [default to null]
**driverName** | **String!** | Name of the driver. | [optional] [default to null]
**dutyStatus** | **String!** | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] [default to null]
**cycleTomorrow** | **Int!** | The amount of cycle time (in ms) available tomorrow. | [optional] [default to null]
**shiftDriveRemaining** | **Int!** | The amount of remaining shift drive time (in ms). | [optional] [default to null]
**timeInCurrentStatus** | **Int!** | The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;. | [optional] [default to null]
**drivingInViolationCycle** | **Int!** | The amount of driving time in violation in this cycle (in ms). | [optional] [default to null]
**shiftRemaining** | **Int!** | The amount of remaining shift time (in ms). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



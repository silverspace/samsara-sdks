
# HosLogsSummaryResponseDrivers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeUntilBreak** | **kotlin.Long** | The amount of time (in ms) remaining until the driver cannot drive without a rest break. |  [optional]
**vehicleName** | **kotlin.String** | Name of the vehicle. |  [optional]
**drivingInViolationToday** | **kotlin.Long** | The amount of driving time in violation today (in ms). |  [optional]
**driverId** | **kotlin.Long** | ID of the driver. |  [optional]
**cycleRemaining** | **kotlin.Long** | The amount of remaining cycle time (in ms). |  [optional]
**driverName** | **kotlin.String** | Name of the driver. |  [optional]
**dutyStatus** | **kotlin.String** | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. |  [optional]
**cycleTomorrow** | **kotlin.Long** | The amount of cycle time (in ms) available tomorrow. |  [optional]
**shiftDriveRemaining** | **kotlin.Long** | The amount of remaining shift drive time (in ms). |  [optional]
**timeInCurrentStatus** | **kotlin.Long** | The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;. |  [optional]
**drivingInViolationCycle** | **kotlin.Long** | The amount of driving time in violation in this cycle (in ms). |  [optional]
**shiftRemaining** | **kotlin.Long** | The amount of remaining shift time (in ms). |  [optional]




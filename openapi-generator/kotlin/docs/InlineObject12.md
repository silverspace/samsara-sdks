
# InlineObject12

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inspectionType** | [**inline**](#InspectionTypeEnum) | Only type &#39;mechanic&#39; is currently accepted. | 
**mechanicNotes** | **kotlin.String** | Any notes from the mechanic. |  [optional]
**odometerMiles** | **kotlin.Int** | The current odometer of the vehicle. |  [optional]
**previousDefectsCorrected** | **kotlin.Boolean** | Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. |  [optional]
**previousDefectsIgnored** | **kotlin.Boolean** | Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. |  [optional]
**safe** | [**inline**](#SafeEnum) | Whether or not this vehicle or trailer is safe to drive. | 
**trailerId** | **kotlin.Int** | Id of trailer being inspected. Either vehicleId or trailerId must be provided. |  [optional]
**userEmail** | **kotlin.String** | The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email. | 
**vehicleId** | **kotlin.Int** | Id of vehicle being inspected. Either vehicleId or trailerId must be provided. |  [optional]


<a name="InspectionTypeEnum"></a>
## Enum: inspectionType
Name | Value
---- | -----
inspectionType | mechanic


<a name="SafeEnum"></a>
## Enum: safe
Name | Value
---- | -----
safe | safe, unsafe




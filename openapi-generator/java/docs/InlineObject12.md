
# InlineObject12

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inspectionType** | [**InspectionTypeEnum**](#InspectionTypeEnum) | Only type &#39;mechanic&#39; is currently accepted. | 
**mechanicNotes** | **String** | Any notes from the mechanic. |  [optional]
**odometerMiles** | **Integer** | The current odometer of the vehicle. |  [optional]
**previousDefectsCorrected** | **Boolean** | Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. |  [optional]
**previousDefectsIgnored** | **Boolean** | Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. |  [optional]
**safe** | [**SafeEnum**](#SafeEnum) | Whether or not this vehicle or trailer is safe to drive. | 
**trailerId** | **Integer** | Id of trailer being inspected. Either vehicleId or trailerId must be provided. |  [optional]
**userEmail** | **String** | The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email. | 
**vehicleId** | **Integer** | Id of vehicle being inspected. Either vehicleId or trailerId must be provided. |  [optional]


<a name="InspectionTypeEnum"></a>
## Enum: InspectionTypeEnum
Name | Value
---- | -----
MECHANIC | &quot;mechanic&quot;


<a name="SafeEnum"></a>
## Enum: SafeEnum
Name | Value
---- | -----
SAFE | &quot;safe&quot;
UNSAFE | &quot;unsafe&quot;




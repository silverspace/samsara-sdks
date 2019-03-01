# openapi::InlineObject12

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inspectionType** | **character** | Only type &#39;mechanic&#39; is currently accepted. | 
**mechanicNotes** | **character** | Any notes from the mechanic. | [optional] 
**odometerMiles** | **integer** | The current odometer of the vehicle. | [optional] 
**previousDefectsCorrected** | **character** | Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] 
**previousDefectsIgnored** | **character** | Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] 
**safe** | **character** | Whether or not this vehicle or trailer is safe to drive. | 
**trailerId** | **integer** | Id of trailer being inspected. Either vehicleId or trailerId must be provided. | [optional] 
**userEmail** | **character** | The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email. | 
**vehicleId** | **integer** | Id of vehicle being inspected. Either vehicleId or trailerId must be provided. | [optional] 



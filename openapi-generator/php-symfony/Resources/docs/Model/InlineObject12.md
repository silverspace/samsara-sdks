# InlineObject12

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inspectionType** | **string** | Only type &#39;mechanic&#39; is currently accepted. | 
**mechanicNotes** | **string** | Any notes from the mechanic. | [optional] 
**odometerMiles** | **int** | The current odometer of the vehicle. | [optional] 
**previousDefectsCorrected** | **bool** | Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] 
**previousDefectsIgnored** | **bool** | Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] 
**safe** | **string** | Whether or not this vehicle or trailer is safe to drive. | 
**trailerId** | **int** | Id of trailer being inspected. Either vehicleId or trailerId must be provided. | [optional] 
**userEmail** | **string** | The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email. | 
**vehicleId** | **int** | Id of vehicle being inspected. Either vehicleId or trailerId must be provided. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



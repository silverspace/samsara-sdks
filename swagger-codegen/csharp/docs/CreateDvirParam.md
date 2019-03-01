# samsara.Model.CreateDvirParam
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InspectionType** | **string** | Only type &#39;mechanic&#39; is currently accepted. | 
**MechanicNotes** | **string** | Any notes from the mechanic. | [optional] 
**OdometerMiles** | **int?** | The current odometer of the vehicle. | [optional] 
**PreviousDefectsCorrected** | **bool?** | Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] 
**PreviousDefectsIgnored** | **bool?** | Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] 
**Safe** | **string** | Whether or not this vehicle or trailer is safe to drive. | 
**TrailerId** | **int?** | Id of trailer being inspected. Either vehicleId or trailerId must be provided. | [optional] 
**UserEmail** | **string** | The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email. | 
**VehicleId** | **int?** | Id of vehicle being inspected. Either vehicleId or trailerId must be provided. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


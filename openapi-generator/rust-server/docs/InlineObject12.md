# InlineObject12

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inspection_type** | **String** | Only type 'mechanic' is currently accepted. | 
**mechanic_notes** | **String** | Any notes from the mechanic. | [optional] [default to None]
**odometer_miles** | **isize** | The current odometer of the vehicle. | [optional] [default to None]
**previous_defects_corrected** | **bool** | Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] [default to None]
**previous_defects_ignored** | **bool** | Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] [default to None]
**safe** | **String** | Whether or not this vehicle or trailer is safe to drive. | 
**trailer_id** | **isize** | Id of trailer being inspected. Either vehicleId or trailerId must be provided. | [optional] [default to None]
**user_email** | **String** | The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email. | 
**vehicle_id** | **isize** | Id of vehicle being inspected. Either vehicleId or trailerId must be provided. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# openapi.model.InlineObject12

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inspectionType** | **String** | Only type &#39;mechanic&#39; is currently accepted. | [default to null]
**mechanicNotes** | **String** | Any notes from the mechanic. | [optional] [default to null]
**odometerMiles** | **int** | The current odometer of the vehicle. | [optional] [default to null]
**previousDefectsCorrected** | **bool** | Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] [default to null]
**previousDefectsIgnored** | **bool** | Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. | [optional] [default to null]
**safe** | **String** | Whether or not this vehicle or trailer is safe to drive. | [default to null]
**trailerId** | **int** | Id of trailer being inspected. Either vehicleId or trailerId must be provided. | [optional] [default to null]
**userEmail** | **String** | The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email. | [default to null]
**vehicleId** | **int** | Id of vehicle being inspected. Either vehicleId or trailerId must be provided. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



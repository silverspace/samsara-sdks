# openapi.model.DvirBase

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorSignature** | [**DvirBaseAuthorSignature**](DvirBaseAuthorSignature.md) |  | [optional] [default to null]
**defectsCorrected** | **bool** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] [default to null]
**defectsNeedNotBeCorrected** | **bool** | Signifies if the defects on this vehicle can be ignored. | [optional] [default to null]
**id** | **int** | The id of this DVIR record. | [optional] [default to null]
**inspectionType** | **String** | Inspection type of the DVIR. | [optional] [default to null]
**mechanicNotes** | **String** | The mechanics notes on the DVIR. | [optional] [default to null]
**mechanicOrAgentSignature** | [**DvirBaseMechanicOrAgentSignature**](DvirBaseMechanicOrAgentSignature.md) |  | [optional] [default to null]
**nextDriverSignature** | [**DvirBaseNextDriverSignature**](DvirBaseNextDriverSignature.md) |  | [optional] [default to null]
**odometerMiles** | **int** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] [default to null]
**timeMs** | **int** | Timestamp of this DVIR in UNIX milliseconds. | [optional] [default to null]
**trailerDefects** | [**List&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] [default to const []]
**trailerId** | **int** | The id of the trailer which was part of the DVIR. | [optional] [default to null]
**trailerName** | **String** | The name of the trailer which was part of the DVIR. | [optional] [default to null]
**vehicle** | [**DvirBaseVehicle**](DvirBaseVehicle.md) |  | [optional] [default to null]
**vehicleCondition** | **String** | The condition of vechile on which DVIR was done. | [optional] [default to null]
**vehicleDefects** | [**List&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



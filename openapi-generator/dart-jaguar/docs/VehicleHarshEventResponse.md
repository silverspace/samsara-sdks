# openapi.model.VehicleHarshEventResponse

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadForwardVideoUrl** | **String** | URL for downloading the forward facing video | [optional] [default to null]
**downloadInwardVideoUrl** | **String** | URL for downloading the inward facing video | [optional] [default to null]
**downloadTrackedInwardVideoUrl** | **String** | URL for downloading the tracked inward facing video | [optional] [default to null]
**harshEventType** | **String** | Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] | [default to null]
**incidentReportUrl** | **String** | URL of the associated incident report page | [default to null]
**isDistracted** | **bool** | Whether the driver was deemed distracted during this harsh event | [optional] [default to null]
**location** | [**VehicleHarshEventResponseLocation**](VehicleHarshEventResponseLocation.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



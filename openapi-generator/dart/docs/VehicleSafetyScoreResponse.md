# openapi.model.VehicleSafetyScoreResponse

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crashCount** | **int** | Crash event count | [optional] [default to null]
**harshAccelCount** | **int** | Harsh acceleration event count | [optional] [default to null]
**harshBrakingCount** | **int** | Harsh braking event count | [optional] [default to null]
**harshEvents** | [**List&lt;SafetyReportHarshEvent&gt;**](SafetyReportHarshEvent.md) |  | [optional] [default to []]
**harshTurningCount** | **int** | Harsh turning event count | [optional] [default to null]
**safetyScore** | **int** | Safety Score | [optional] [default to null]
**safetyScoreRank** | **String** | Safety Score Rank | [optional] [default to null]
**timeOverSpeedLimitMs** | **int** | Amount of time driven over the speed limit in milliseconds | [optional] [default to null]
**totalDistanceDrivenMeters** | **int** | Total distance driven in meters | [optional] [default to null]
**totalHarshEventCount** | **int** | Total harsh event count | [optional] [default to null]
**totalTimeDrivenMs** | **int** | Amount of time driven in milliseconds | [optional] [default to null]
**vehicleId** | **int** | Vehicle ID | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



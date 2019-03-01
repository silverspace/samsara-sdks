# openapi.model.VehicleLocation

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **double** | Heading in degrees. | [optional] [default to null]
**id** | **int** | ID of the vehicle. | [default to null]
**latitude** | **double** | Latitude in decimal degrees. | [optional] [default to null]
**location** | **String** | Text representation of nearest identifiable location to (latitude, longitude) coordinates. | [optional] [default to null]
**longitude** | **double** | Longitude in decimal degrees. | [optional] [default to null]
**name** | **String** | Name of the vehicle. | [optional] [default to null]
**odometerMeters** | **int** | The number of meters reported by the odometer. | [optional] [default to null]
**onTrip** | **bool** | Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. | [optional] [default to null]
**speed** | **double** | Speed in miles per hour. | [optional] [default to null]
**time** | **int** | The time the reported location was logged, reported as a UNIX timestamp in milliseconds. | [optional] [default to null]
**vin** | **String** | Vehicle Identification Number (VIN) of the vehicle. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



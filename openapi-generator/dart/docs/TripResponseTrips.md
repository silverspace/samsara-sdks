# openapi.model.TripResponseTrips

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endOdometer** | **int** | Odometer reading at the end of the trip. | [optional] [default to null]
**distanceMeters** | **int** | Length of the trip in meters. | [optional] [default to null]
**endMs** | **int** | End of the trip in UNIX milliseconds. | [optional] [default to null]
**startMs** | **int** | Beginning of the trip in UNIX milliseconds. | [optional] [default to null]
**fuelConsumedMl** | **int** | Amount in milliliters of fuel consumed on this trip. | [optional] [default to null]
**startAddress** | **String** | Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. | [optional] [default to null]
**startCoordinates** | [**TripResponseStartCoordinates**](TripResponseStartCoordinates.md) |  | [optional] [default to null]
**endCoordinates** | [**TripResponseEndCoordinates**](TripResponseEndCoordinates.md) |  | [optional] [default to null]
**startOdometer** | **int** | Odometer reading at the beginning of the trip. | [optional] [default to null]
**driverId** | **int** | ID of the driver. | [optional] [default to null]
**startLocation** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]
**tollMeters** | **int** | Length in meters trip spent on toll roads. | [optional] [default to null]
**endAddress** | **String** | Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. | [optional] [default to null]
**endLocation** | **String** | Geocoded street address of start (latitude, longitude) coordinates. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



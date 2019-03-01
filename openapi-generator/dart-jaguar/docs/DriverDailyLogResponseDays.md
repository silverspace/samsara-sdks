# openapi.model.DriverDailyLogResponseDays

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certifiedAtMs** | **int** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] [default to null]
**endMs** | **int** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**startMs** | **int** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**trailerIds** | [**Object**](.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] [default to null]
**activeHours** | **double** | Hours spent on duty or driving, rounded to two decimal places. | [optional] [default to null]
**distanceMiles** | **double** | Distance driven in miles, rounded to two decimal places. | [optional] [default to null]
**activeMs** | **int** | Milliseconds spent on duty or driving. | [optional] [default to null]
**certified** | **bool** | Whether this HOS day chart was certified by the driver. | [optional] [default to null]
**vehicleIds** | [**Object**](.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



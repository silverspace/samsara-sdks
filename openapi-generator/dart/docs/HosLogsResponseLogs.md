# openapi.model.HosLogsResponseLogs

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locLng** | **double** | Longitude at which the log was recorded. | [optional] [default to null]
**logStartMs** | **int** | The time at which the log/HOS status started in UNIX milliseconds. | [optional] [default to null]
**driverId** | **int** | ID of the driver. | [optional] [default to null]
**statusType** | **String** | The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. | [optional] [default to null]
**locCity** | **String** | City in which the log was recorded. | [optional] [default to null]
**groupId** | **int** | ID of the group. | [optional] [default to null]
**locName** | **String** | Name of location at which the log was recorded. | [optional] [default to null]
**locLat** | **double** | Latitude at which the log was recorded. | [optional] [default to null]
**remark** | **String** | Remark associated with the log entry. | [optional] [default to null]
**locState** | **String** | State in which the log was recorded. | [optional] [default to null]
**vehicleId** | **int** | ID of the vehicle. | [optional] [default to null]
**codriverIds** | **List&lt;int&gt;** |  | [optional] [default to []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



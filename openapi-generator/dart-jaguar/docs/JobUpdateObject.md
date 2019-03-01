# openapi.model.JobUpdateObject

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changedAtMs** | **int** | Timestamp that this event was updated, represented as Unix milliseconds since epoch. | [optional] [default to null]
**jobId** | **int** | ID of the Samsara job. | [optional] [default to null]
**jobState** | [**JobStatus**](JobStatus.md) |  | [optional] [default to null]
**prevJobState** | [**PrevJobStatus**](PrevJobStatus.md) |  | [optional] [default to null]
**route** | [**DispatchRoute**](DispatchRoute.md) |  | [optional] [default to null]
**routeId** | **int** | ID of the Samsara dispatch route. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# openapi.model.InlineObject21

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endMs** | **int** | End of the time range, specified in milliseconds UNIX time. | [default to null]
**fillMissing** | **String** |  | [optional] [default to &quot;withNull&quot;]
**groupId** | **int** | Group ID to query. | [default to null]
**series** | [**List&lt;SensorsHistorySeries&gt;**](SensorsHistorySeries.md) |  | [default to const []]
**startMs** | **int** | Beginning of the time range, specified in milliseconds UNIX time. | [default to null]
**stepMs** | **int** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



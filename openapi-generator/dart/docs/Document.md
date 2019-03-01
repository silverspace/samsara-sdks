# openapi.model.Document

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatchJobId** | **int** | ID of the Samsara dispatch job for which the document is submitted | [optional] [default to null]
**notes** | **String** | Notes submitted with this document. | [optional] [default to null]
**documentType** | **String** | Descriptive name of this type of document. | [default to null]
**driverCreatedAtMs** | **int** | The time in Unix epoch milliseconds that the document is created. | [default to null]
**driverId** | **int** | ID of the driver for whom the document is submitted | [default to null]
**fields** | [**List&lt;DocumentField&gt;**](DocumentField.md) | The fields associated with this document. | [default to []]
**vehicleId** | **int** | VehicleID of the driver at document creation. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



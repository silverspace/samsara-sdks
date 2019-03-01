# openapi.model.DocumentCreate

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatchJobId** | **int** | ID of the Samsara dispatch job for which the document is submitted | [optional] [default to null]
**notes** | **String** | Notes submitted with this document. | [optional] [default to null]
**documentTypeUuid** | **String** | Universally unique identifier for the document type this document is being created for. | [default to null]
**fields** | [**List&lt;DocumentField&gt;**](DocumentField.md) | List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



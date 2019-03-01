# openapi.model.DocumentField

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberValue** | **double** | Value of this field if this document field has valueType: ValueType_Number. | [optional] [default to null]
**photoValue** | [**List&lt;DocumentFieldCreatePhotoValue&gt;**](DocumentFieldCreatePhotoValue.md) | Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. | [optional] [default to const []]
**stringValue** | **String** | Value of this field if this document field has valueType: ValueType_String. | [optional] [default to null]
**valueType** | **String** | Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. | [default to null]
**label** | **String** | Descriptive name of this field. | [default to null]
**value** | [**Object**](.md) | DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



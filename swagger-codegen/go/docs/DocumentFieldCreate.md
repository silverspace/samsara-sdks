# DocumentFieldCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumberValue** | **float64** | Value of this field if this document field has valueType: ValueType_Number. | [optional] [default to null]
**PhotoValue** | [**[]DocumentFieldCreatePhotoValue**](DocumentFieldCreate_photoValue.md) | Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. | [optional] [default to null]
**StringValue** | **string** | Value of this field if this document field has valueType: ValueType_String. | [optional] [default to null]
**ValueType** | **string** | Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



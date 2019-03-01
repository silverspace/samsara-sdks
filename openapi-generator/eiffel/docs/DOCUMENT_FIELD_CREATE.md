# DOCUMENT_FIELD_CREATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_value** | **REAL_64** | Value of this field if this document field has valueType: ValueType_Number. | [optional] [default to null]
**photo_value** | [**LIST [DOCUMENT_FIELD_CREATE_PHOTO_VALUE]**](DocumentFieldCreate_photoValue.md) | Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. | [optional] [default to null]
**string_value** | [**STRING_32**](STRING_32.md) | Value of this field if this document field has valueType: ValueType_String. | [optional] [default to null]
**value_type** | [**STRING_32**](STRING_32.md) | Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)




# DocumentFieldCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberValue** | **Double** | Value of this field if this document field has valueType: ValueType_Number. |  [optional]
**photoValue** | [**List&lt;DocumentFieldCreatePhotoValue&gt;**](DocumentFieldCreatePhotoValue.md) | Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. |  [optional]
**stringValue** | **String** | Value of this field if this document field has valueType: ValueType_String. |  [optional]
**valueType** | **String** | Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. | 




# SWGDocumentField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberValue** | **NSNumber*** | Value of this field if this document field has valueType: ValueType_Number. | [optional] 
**photoValue** | [**NSArray&lt;SWGDocumentFieldCreatePhotoValue&gt;***](SWGDocumentFieldCreatePhotoValue.md) | Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. | [optional] 
**stringValue** | **NSString*** | Value of this field if this document field has valueType: ValueType_String. | [optional] 
**valueType** | **NSString*** | Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. | 
**label** | **NSString*** | Descriptive name of this field. | 
**value** | [**SWG***](SWG.md) | DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



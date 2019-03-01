# OpenapiClient::DocumentField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_value** | **Float** | Value of this field if this document field has valueType: ValueType_Number. | [optional] 
**photo_value** | [**Array&lt;DocumentFieldCreatePhotoValue&gt;**](DocumentFieldCreatePhotoValue.md) | Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. | [optional] 
**string_value** | **String** | Value of this field if this document field has valueType: ValueType_String. | [optional] 
**value_type** | **String** | Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. | 
**label** | **String** | Descriptive name of this field. | 
**value** | [**Object**](.md) | DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DocumentField.new(number_value: 12.34,
                                 photo_value: [{url&#x3D;https://www.samsara.com/photo1}, {url&#x3D;https://www.samsara.com/photo2}],
                                 string_value: This is a string.,
                                 value_type: ValueType_Number,
                                 label: Fuel Cost ($),
                                 value: 23.45)
```



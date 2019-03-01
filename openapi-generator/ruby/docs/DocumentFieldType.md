# OpenapiClient::DocumentFieldType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | Descriptive name of this field type. | 
**number_value_type_metadata** | [**DocumentFieldTypeNumberValueTypeMetadata**](DocumentFieldTypeNumberValueTypeMetadata.md) |  | [optional] 
**value_type** | **String** | The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DocumentFieldType.new(label: Fuel Cost ($),
                                 number_value_type_metadata: null,
                                 value_type: ValueType_Number)
```



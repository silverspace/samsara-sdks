# OpenapiClient::DocumentType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field_types** | **Array&lt;Array&gt;** | The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. | [optional] 
**name** | **String** | Name of the document type. | 
**org_id** | **Integer** | ID for the organization this document belongs to. | 
**uuid** | **String** | Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DocumentType.new(field_types: null,
                                 name: Fuel Receipt,
                                 org_id: 773,
                                 uuid: 4aff772c-a7bb-45e6-8e41-6a53e34feb83)
```



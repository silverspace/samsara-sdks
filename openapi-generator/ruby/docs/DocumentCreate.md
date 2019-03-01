# OpenapiClient::DocumentCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatch_job_id** | **Integer** | ID of the Samsara dispatch job for which the document is submitted | [optional] 
**notes** | **String** | Notes submitted with this document. | [optional] 
**document_type_uuid** | **String** | Universally unique identifier for the document type this document is being created for. | 
**fields** | [**Array&lt;DocumentField&gt;**](DocumentField.md) | List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DocumentCreate.new(dispatch_job_id: 773,
                                 notes: Fueled up before delivery.,
                                 document_type_uuid: 4aff772c-a7bb-45e6-8e41-6a53e34feb83,
                                 fields: [{label&#x3D;Driver Photo, photoValue&#x3D;[], valueType&#x3D;ValueType_Photo}, {label&#x3D;Gallons, numberValue&#x3D;12.34, valueType&#x3D;ValueType_Number}, {label&#x3D;City, stringValue&#x3D;San Francisco, CA, valueType&#x3D;ValueType_String}])
```



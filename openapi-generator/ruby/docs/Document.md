# OpenapiClient::Document

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatch_job_id** | **Integer** | ID of the Samsara dispatch job for which the document is submitted | [optional] 
**notes** | **String** | Notes submitted with this document. | [optional] 
**document_type** | **String** | Descriptive name of this type of document. | 
**driver_created_at_ms** | **Integer** | The time in Unix epoch milliseconds that the document is created. | 
**driver_id** | **Integer** | ID of the driver for whom the document is submitted | 
**fields** | [**Array&lt;DocumentField&gt;**](DocumentField.md) | The fields associated with this document. | 
**vehicle_id** | **Integer** | VehicleID of the driver at document creation. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::Document.new(dispatch_job_id: 773,
                                 notes: Fueled up before delivery.,
                                 document_type: Fuel Receipt,
                                 driver_created_at_ms: 1462881998034,
                                 driver_id: 555,
                                 fields: [{label&#x3D;Photos, photoValue&#x3D;[], valueType&#x3D;ValueType_Photo}, {label&#x3D;Gallons, numberValue&#x3D;12.34, valueType&#x3D;ValueType_Number}, {label&#x3D;City, stringValue&#x3D;San Francisco, CA, valueType&#x3D;ValueType_String}],
                                 vehicle_id: 222)
```



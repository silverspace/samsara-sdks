# SwaggerClient::Document

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



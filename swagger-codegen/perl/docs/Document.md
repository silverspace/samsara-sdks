# WWW::SwaggerClient::Object::Document

## Load the model package
```perl
use WWW::SwaggerClient::Object::Document;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatch_job_id** | **int** | ID of the Samsara dispatch job for which the document is submitted | [optional] 
**notes** | **string** | Notes submitted with this document. | [optional] 
**document_type** | **string** | Descriptive name of this type of document. | 
**driver_created_at_ms** | **int** | The time in Unix epoch milliseconds that the document is created. | 
**driver_id** | **int** | ID of the driver for whom the document is submitted | 
**fields** | [**ARRAY[DocumentField]**](DocumentField.md) | The fields associated with this document. | 
**vehicle_id** | **int** | VehicleID of the driver at document creation. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



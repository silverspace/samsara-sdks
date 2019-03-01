# Document

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatch_job_id** | **i64** | ID of the Samsara dispatch job for which the document is submitted | [optional] [default to null]
**notes** | **String** | Notes submitted with this document. | [optional] [default to null]
**document_type** | **String** | Descriptive name of this type of document. | [default to null]
**driver_created_at_ms** | **i64** | The time in Unix epoch milliseconds that the document is created. | [default to null]
**driver_id** | **i64** | ID of the driver for whom the document is submitted | [default to null]
**fields** | [**Vec<::models::DocumentField>**](DocumentField.md) | The fields associated with this document. | [default to null]
**vehicle_id** | **i64** | VehicleID of the driver at document creation. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# DOCUMENT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatch_job_id** | **INTEGER_64** | ID of the Samsara dispatch job for which the document is submitted | [optional] [default to null]
**notes** | [**STRING_32**](STRING_32.md) | Notes submitted with this document. | [optional] [default to null]
**document_type** | [**STRING_32**](STRING_32.md) | Descriptive name of this type of document. | [default to null]
**driver_created_at_ms** | **INTEGER_64** | The time in Unix epoch milliseconds that the document is created. | [default to null]
**driver_id** | **INTEGER_64** | ID of the driver for whom the document is submitted | [default to null]
**fields** | [**LIST [DOCUMENT_FIELD]**](DocumentField.md) | The fields associated with this document. | [default to null]
**vehicle_id** | **INTEGER_64** | VehicleID of the driver at document creation. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



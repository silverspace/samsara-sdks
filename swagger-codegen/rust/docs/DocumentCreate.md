# DocumentCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatch_job_id** | **i64** | ID of the Samsara dispatch job for which the document is submitted | [optional] [default to null]
**notes** | **String** | Notes submitted with this document. | [optional] [default to null]
**document_type_uuid** | **String** | Universally unique identifier for the document type this document is being created for. | [default to null]
**fields** | [**Vec<::models::DocumentField>**](DocumentField.md) | List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



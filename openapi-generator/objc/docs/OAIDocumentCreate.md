# OAIDocumentCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatchJobId** | **NSNumber*** | ID of the Samsara dispatch job for which the document is submitted | [optional] 
**notes** | **NSString*** | Notes submitted with this document. | [optional] 
**documentTypeUuid** | **NSString*** | Universally unique identifier for the document type this document is being created for. | 
**fields** | [**NSArray&lt;OAIDocumentField&gt;***](OAIDocumentField.md) | List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)




# DocumentCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatchJobId** | **Long** | ID of the Samsara dispatch job for which the document is submitted |  [optional]
**notes** | **String** | Notes submitted with this document. |  [optional]
**documentTypeUuid** | **String** | Universally unique identifier for the document type this document is being created for. | 
**fields** | [**List&lt;DocumentField&gt;**](DocumentField.md) | List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 




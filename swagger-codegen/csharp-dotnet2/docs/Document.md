# samsara.Model.Document
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DispatchJobId** | **long?** | ID of the Samsara dispatch job for which the document is submitted | [optional] 
**Notes** | **string** | Notes submitted with this document. | [optional] 
**DocumentType** | **string** | Descriptive name of this type of document. | 
**DriverCreatedAtMs** | **long?** | The time in Unix epoch milliseconds that the document is created. | 
**DriverId** | **long?** | ID of the driver for whom the document is submitted | 
**Fields** | [**List&lt;DocumentField&gt;**](DocumentField.md) | The fields associated with this document. | 
**VehicleId** | **long?** | VehicleID of the driver at document creation. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


# Document

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatchJobId** | **Int!** | ID of the Samsara dispatch job for which the document is submitted | [optional] [default to null]
**notes** | **String!** | Notes submitted with this document. | [optional] [default to null]
**documentType** | **String!** | Descriptive name of this type of document. | [default to null]
**driverCreatedAtMs** | **Int!** | The time in Unix epoch milliseconds that the document is created. | [default to null]
**driverId** | **Int!** | ID of the driver for whom the document is submitted | [default to null]
**fields** | [**DocumentField**](DocumentField.md) | The fields associated with this document. | [default to null]
**vehicleId** | **Int!** | VehicleID of the driver at document creation. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



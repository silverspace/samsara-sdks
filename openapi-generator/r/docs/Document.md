# openapi::Document

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatchJobId** | **integer** | ID of the Samsara dispatch job for which the document is submitted | [optional] 
**notes** | **character** | Notes submitted with this document. | [optional] 
**documentType** | **character** | Descriptive name of this type of document. | 
**driverCreatedAtMs** | **integer** | The time in Unix epoch milliseconds that the document is created. | 
**driverId** | **integer** | ID of the driver for whom the document is submitted | 
**fields** | [**DocumentField**](DocumentField.md) | The fields associated with this document. | 
**vehicleId** | **integer** | VehicleID of the driver at document creation. | [optional] 



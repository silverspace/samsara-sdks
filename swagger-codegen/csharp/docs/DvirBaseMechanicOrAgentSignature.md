# samsara.Model.DvirBaseMechanicOrAgentSignature
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DriverId** | **long?** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] 
**Email** | **string** | Email of the  agent|mechanic who signed the DVIR. | [optional] 
**MechanicUserId** | **long?** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] 
**Name** | **string** | The name of the agent or mechanic who signed the DVIR. | [optional] 
**SignedAt** | **long?** | The time in millis when the DVIR was signed | [optional] 
**Type** | **string** | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] 
**Username** | **string** | Username of the  agent|mechanic who signed the DVIR. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


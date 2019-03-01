# DvirBaseMechanicOrAgentSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driver_id** | **int** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] 
**email** | **str** | Email of the  agent|mechanic who signed the DVIR. | [optional] 
**mechanic_user_id** | **int** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] 
**name** | **str** | The name of the agent or mechanic who signed the DVIR. | [optional] 
**signed_at** | **int** | The time in millis when the DVIR was signed | [optional] 
**type** | **str** | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] 
**username** | **str** | Username of the  agent|mechanic who signed the DVIR. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



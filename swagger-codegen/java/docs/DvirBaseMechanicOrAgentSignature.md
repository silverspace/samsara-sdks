
# DvirBaseMechanicOrAgentSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driverId** | **Long** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. |  [optional]
**email** | **String** | Email of the  agent|mechanic who signed the DVIR. |  [optional]
**mechanicUserId** | **Long** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. |  [optional]
**name** | **String** | The name of the agent or mechanic who signed the DVIR. |  [optional]
**signedAt** | **Long** | The time in millis when the DVIR was signed |  [optional]
**type** | **String** | Type corresponds to whether the signature corresponds to driver|mechanic. |  [optional]
**username** | **String** | Username of the  agent|mechanic who signed the DVIR. |  [optional]




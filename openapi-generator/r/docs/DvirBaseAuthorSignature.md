# openapi::DvirBaseAuthorSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mechanicUserId** | **integer** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] 
**driverId** | **integer** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] 
**name** | **character** | The name of the driver or mechanic who signed the DVIR. | [optional] 
**signedAt** | **integer** | The time in millis when the DVIR was signed | [optional] 
**type** | **character** | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] 
**email** | **character** | Email of the  driver|mechanic who signed the DVIR. | [optional] 
**username** | **character** | Username of the  driver|mechanic who signed the DVIR. | [optional] 



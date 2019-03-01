# OAIDvirBaseAuthorSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mechanicUserId** | **NSNumber*** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] 
**driverId** | **NSNumber*** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] 
**name** | **NSString*** | The name of the driver or mechanic who signed the DVIR. | [optional] 
**signedAt** | **NSNumber*** | The time in millis when the DVIR was signed | [optional] 
**type** | **NSString*** | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] 
**email** | **NSString*** | Email of the  driver|mechanic who signed the DVIR. | [optional] 
**username** | **NSString*** | Username of the  driver|mechanic who signed the DVIR. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



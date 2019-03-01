
# DvirBaseAuthorSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mechanicUserId** | **Long** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. |  [optional]
**driverId** | **Long** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. |  [optional]
**name** | **String** | The name of the driver or mechanic who signed the DVIR. |  [optional]
**signedAt** | **Long** | The time in millis when the DVIR was signed |  [optional]
**type** | **String** | Type corresponds to whether the signature corresponds to driver|mechanic. |  [optional]
**email** | **String** | Email of the  driver|mechanic who signed the DVIR. |  [optional]
**username** | **String** | Username of the  driver|mechanic who signed the DVIR. |  [optional]




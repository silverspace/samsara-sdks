
# DvirBaseAuthorSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mechanicUserId** | **kotlin.Long** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. |  [optional]
**driverId** | **kotlin.Long** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. |  [optional]
**name** | **kotlin.String** | The name of the driver or mechanic who signed the DVIR. |  [optional]
**signedAt** | **kotlin.Long** | The time in millis when the DVIR was signed |  [optional]
**type** | **kotlin.String** | Type corresponds to whether the signature corresponds to driver|mechanic. |  [optional]
**email** | **kotlin.String** | Email of the  driver|mechanic who signed the DVIR. |  [optional]
**username** | **kotlin.String** | Username of the  driver|mechanic who signed the DVIR. |  [optional]




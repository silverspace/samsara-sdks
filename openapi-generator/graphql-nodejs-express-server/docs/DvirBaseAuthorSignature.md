# DvirBaseAuthorSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mechanicUserId** | **Int!** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] [default to null]
**driverId** | **Int!** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] [default to null]
**name** | **String!** | The name of the driver or mechanic who signed the DVIR. | [optional] [default to null]
**signedAt** | **Int!** | The time in millis when the DVIR was signed | [optional] [default to null]
**Type_** | **String!** | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] [default to null]
**email** | **String!** | Email of the  driver|mechanic who signed the DVIR. | [optional] [default to null]
**username** | **String!** | Username of the  driver|mechanic who signed the DVIR. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



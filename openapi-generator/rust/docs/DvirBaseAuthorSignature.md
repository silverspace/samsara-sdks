# DvirBaseAuthorSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mechanic_user_id** | **i64** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] 
**driver_id** | **i64** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] 
**name** | **String** | The name of the driver or mechanic who signed the DVIR. | [optional] 
**signed_at** | **i64** | The time in millis when the DVIR was signed | [optional] 
**_type** | **String** | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] 
**email** | **String** | Email of the  driver|mechanic who signed the DVIR. | [optional] 
**username** | **String** | Username of the  driver|mechanic who signed the DVIR. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



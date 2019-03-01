# DVIR_BASE_AUTHOR_SIGNATURE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mechanic_user_id** | **INTEGER_64** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] [default to null]
**driver_id** | **INTEGER_64** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name of the driver or mechanic who signed the DVIR. | [optional] [default to null]
**signed_at** | **INTEGER_64** | The time in millis when the DVIR was signed | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] [default to null]
**email** | [**STRING_32**](STRING_32.md) | Email of the  driver|mechanic who signed the DVIR. | [optional] [default to null]
**username** | [**STRING_32**](STRING_32.md) | Username of the  driver|mechanic who signed the DVIR. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



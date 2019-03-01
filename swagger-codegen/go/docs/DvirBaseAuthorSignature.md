# DvirBaseAuthorSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DriverId** | **int64** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] [default to null]
**Email** | **string** | Email of the  driver|mechanic who signed the DVIR. | [optional] [default to null]
**MechanicUserId** | **int64** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] [default to null]
**Name** | **string** | The name of the driver or mechanic who signed the DVIR. | [optional] [default to null]
**SignedAt** | **int64** | The time in millis when the DVIR was signed | [optional] [default to null]
**Type_** | **string** | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] [default to null]
**Username** | **string** | Username of the  driver|mechanic who signed the DVIR. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



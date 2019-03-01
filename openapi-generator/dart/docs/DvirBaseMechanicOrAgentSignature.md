# openapi.model.DvirBaseMechanicOrAgentSignature

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mechanicUserId** | **int** | ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. | [optional] [default to null]
**driverId** | **int** | ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. | [optional] [default to null]
**name** | **String** | The name of the agent or mechanic who signed the DVIR. | [optional] [default to null]
**signedAt** | **int** | The time in millis when the DVIR was signed | [optional] [default to null]
**type** | **String** | Type corresponds to whether the signature corresponds to driver|mechanic. | [optional] [default to null]
**email** | **String** | Email of the  agent|mechanic who signed the DVIR. | [optional] [default to null]
**username** | **String** | Username of the  agent|mechanic who signed the DVIR. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



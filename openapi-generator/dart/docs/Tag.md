# openapi.model.Tag

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;TaggedAddress&gt;**](TaggedAddress.md) | The addresses that belong to this tag. | [optional] [default to []]
**assets** | [**List&lt;TaggedAsset&gt;**](TaggedAsset.md) | The assets that belong to this tag. | [optional] [default to []]
**drivers** | [**List&lt;TaggedDriver&gt;**](TaggedDriver.md) | The drivers that belong to this tag. | [optional] [default to []]
**groupId** | **int** | The GroupID that this tag belongs to. | [optional] [default to null]
**id** | **int** | The ID of this tag. | [default to null]
**machines** | [**List&lt;TaggedMachine&gt;**](TaggedMachine.md) | The machines that belong to this tag. | [optional] [default to []]
**name** | **String** | Name of this tag. | [default to null]
**parentTagId** | **int** | If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. | [optional] [default to null]
**sensors** | [**List&lt;TaggedSensor&gt;**](TaggedSensor.md) | The sensors that belong to this tag. | [optional] [default to []]
**vehicles** | [**List&lt;TaggedVehicle&gt;**](TaggedVehicle.md) | The vehicles that belong to this tag. | [optional] [default to []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# openapi.model.TagCreate

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | [**List&lt;TaggedAssetBase&gt;**](TaggedAssetBase.md) | The assets that belong to this tag. | [optional] [default to []]
**drivers** | [**List&lt;TaggedDriverBase&gt;**](TaggedDriverBase.md) | The drivers that belong to this tag. | [optional] [default to []]
**machines** | [**List&lt;TaggedMachineBase&gt;**](TaggedMachineBase.md) | The machines that belong to this tag. | [optional] [default to []]
**name** | **String** | Name of this tag. | [default to null]
**parentTagId** | **int** | If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. | [optional] [default to null]
**sensors** | [**List&lt;TaggedSensorBase&gt;**](TaggedSensorBase.md) | The sensors that belong to this tag. | [optional] [default to []]
**vehicles** | [**List&lt;TaggedVehicleBase&gt;**](TaggedVehicleBase.md) | The vehicles that belong to this tag. | [optional] [default to []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



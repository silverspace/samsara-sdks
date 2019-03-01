# WWW::SwaggerClient::Object::TagUpdate

## Load the model package
```perl
use WWW::SwaggerClient::Object::TagUpdate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | [**ARRAY[TaggedAssetBase]**](TaggedAssetBase.md) | The assets that belong to this tag. | [optional] 
**drivers** | [**ARRAY[TaggedDriverBase]**](TaggedDriverBase.md) | The drivers that belong to this tag. | [optional] 
**machines** | [**ARRAY[TaggedMachineBase]**](TaggedMachineBase.md) | The machines that belong to this tag. | [optional] 
**name** | **string** | Updated name of this tag. | [optional] 
**parent_tag_id** | **int** | If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. | [optional] 
**sensors** | [**ARRAY[TaggedSensorBase]**](TaggedSensorBase.md) | The sensors that belong to this tag. | [optional] 
**vehicles** | [**ARRAY[TaggedVehicleBase]**](TaggedVehicleBase.md) | The vehicles that belong to this tag. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



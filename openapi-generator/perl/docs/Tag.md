# WWW::OpenAPIClient::Object::Tag

## Load the model package
```perl
use WWW::OpenAPIClient::Object::Tag;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**ARRAY[TaggedAddress]**](TaggedAddress.md) | The addresses that belong to this tag. | [optional] 
**assets** | [**ARRAY[TaggedAsset]**](TaggedAsset.md) | The assets that belong to this tag. | [optional] 
**drivers** | [**ARRAY[TaggedDriver]**](TaggedDriver.md) | The drivers that belong to this tag. | [optional] 
**group_id** | **int** | The GroupID that this tag belongs to. | [optional] 
**id** | **int** | The ID of this tag. | 
**machines** | [**ARRAY[TaggedMachine]**](TaggedMachine.md) | The machines that belong to this tag. | [optional] 
**name** | **string** | Name of this tag. | 
**parent_tag_id** | **int** | If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. | [optional] 
**sensors** | [**ARRAY[TaggedSensor]**](TaggedSensor.md) | The sensors that belong to this tag. | [optional] 
**vehicles** | [**ARRAY[TaggedVehicle]**](TaggedVehicle.md) | The vehicles that belong to this tag. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# TagCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | [**Vec<models::TaggedAssetBase>**](TaggedAssetBase.md) | The assets that belong to this tag. | [optional] [default to None]
**drivers** | [**Vec<models::TaggedDriverBase>**](TaggedDriverBase.md) | The drivers that belong to this tag. | [optional] [default to None]
**machines** | [**Vec<models::TaggedMachineBase>**](TaggedMachineBase.md) | The machines that belong to this tag. | [optional] [default to None]
**name** | **String** | Name of this tag. | 
**parent_tag_id** | **i64** | If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. | [optional] [default to None]
**sensors** | [**Vec<models::TaggedSensorBase>**](TaggedSensorBase.md) | The sensors that belong to this tag. | [optional] [default to None]
**vehicles** | [**Vec<models::TaggedVehicleBase>**](TaggedVehicleBase.md) | The vehicles that belong to this tag. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



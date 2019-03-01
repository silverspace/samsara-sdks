# OpenapiClient::TagUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | [**Array&lt;TaggedAssetBase&gt;**](TaggedAssetBase.md) | The assets that belong to this tag. | [optional] 
**drivers** | [**Array&lt;TaggedDriverBase&gt;**](TaggedDriverBase.md) | The drivers that belong to this tag. | [optional] 
**machines** | [**Array&lt;TaggedMachineBase&gt;**](TaggedMachineBase.md) | The machines that belong to this tag. | [optional] 
**name** | **String** | Updated name of this tag. | [optional] 
**parent_tag_id** | **Integer** | If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. | [optional] 
**sensors** | [**Array&lt;TaggedSensorBase&gt;**](TaggedSensorBase.md) | The sensors that belong to this tag. | [optional] 
**vehicles** | [**Array&lt;TaggedVehicleBase&gt;**](TaggedVehicleBase.md) | The vehicles that belong to this tag. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::TagUpdate.new(assets: null,
                                 drivers: null,
                                 machines: null,
                                 name: Broken Vehicles,
                                 parent_tag_id: 8389,
                                 sensors: null,
                                 vehicles: null)
```



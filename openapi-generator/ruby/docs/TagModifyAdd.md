# OpenapiClient::TagModifyAdd

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | [**Array&lt;TaggedAssetBase&gt;**](TaggedAssetBase.md) | The assets to be added to this tag. | [optional] 
**sensors** | [**Array&lt;TaggedSensorBase&gt;**](TaggedSensorBase.md) | The sensors to be added to this tag. | [optional] 
**vehicles** | [**Array&lt;TaggedVehicleBase&gt;**](TaggedVehicleBase.md) | The vehicles to be added to this tag. | [optional] 
**machines** | [**Array&lt;TaggedMachineBase&gt;**](TaggedMachineBase.md) | The machines to be added to this tag. | [optional] 
**drivers** | [**Array&lt;TaggedDriverBase&gt;**](TaggedDriverBase.md) | The drivers to be added to this tag. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::TagModifyAdd.new(assets: null,
                                 sensors: null,
                                 vehicles: null,
                                 machines: null,
                                 drivers: null)
```



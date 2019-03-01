# OpenapiClient::Asset

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_serial_number** | **String** | Serial number of the host asset | [optional] 
**cable** | [**Array&lt;AssetCable&gt;**](AssetCable.md) | The cable connected to the asset | [optional] 
**engine_hours** | **Integer** | Engine hours | [optional] 
**id** | **Integer** | Asset ID | 
**name** | **String** | Asset name | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::Asset.new(asset_serial_number: SNTEST123,
                                 cable: null,
                                 engine_hours: 104,
                                 id: 1,
                                 name: Trailer 123)
```



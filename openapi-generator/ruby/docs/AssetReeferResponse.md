# OpenapiClient::AssetReeferResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_type** | **String** | Asset type | [optional] 
**id** | **Integer** | Asset ID | [optional] 
**name** | **String** | Asset name | [optional] 
**reefer_stats** | [**AssetReeferResponseReeferStats**](AssetReeferResponseReeferStats.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AssetReeferResponse.new(asset_type: Reefer (Thermo King),
                                 id: 1,
                                 name: Reefer 123,
                                 reefer_stats: null)
```



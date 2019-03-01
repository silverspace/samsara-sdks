# OpenapiClient::AssetCurrentLocationsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cable** | [**Array&lt;AssetCable&gt;**](AssetCable.md) | The cable connected to the asset | [optional] 
**engine_hours** | **Integer** | Engine hours | [optional] 
**id** | **Integer** | Asset ID | 
**location** | [**Array&lt;AssetCurrentLocation&gt;**](AssetCurrentLocation.md) | Current location of an asset | [optional] 
**name** | **String** | Asset name | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AssetCurrentLocationsResponse.new(cable: null,
                                 engine_hours: 104,
                                 id: 1,
                                 location: null,
                                 name: Trailer 123)
```



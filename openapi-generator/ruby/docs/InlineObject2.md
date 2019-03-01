# OpenapiClient::InlineObject2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | The address of the entry to add, as it would be recognized if provided to maps.google.com. | 
**group_id** | **Integer** | Group ID to query. | 
**name** | **String** | Name of the location to add to the address book. | 
**radius** | **Integer** | Radius in meters of the address (used for matching vehicle trip stops to this location). | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineObject2.new(address: 501 York St,
                                 group_id: 101,
                                 name: HQ,
                                 radius: 10)
```



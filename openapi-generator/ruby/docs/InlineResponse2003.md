# OpenapiClient::InlineResponse2003

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_id** | **Integer** | Group ID to query. | [optional] 
**vehicles** | [**Array&lt;VehicleLocation&gt;**](VehicleLocation.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineResponse2003.new(group_id: 101,
                                 vehicles: null)
```



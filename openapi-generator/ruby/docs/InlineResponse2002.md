# OpenapiClient::InlineResponse2002

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagination** | [**Pagination**](Pagination.md) |  | [optional] 
**group_id** | **Integer** | Group ID to query. | [optional] 
**vehicles** | [**Array&lt;Vehicle&gt;**](Vehicle.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineResponse2002.new(pagination: null,
                                 group_id: 101,
                                 vehicles: null)
```



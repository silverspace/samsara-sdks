# OpenapiClient::InlineObject15

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_ms** | **Integer** | End of the time range, specified in milliseconds UNIX time. | 
**group_id** | **Integer** | Group ID to query. | 
**start_ms** | **Integer** | Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs | 
**vehicle_id** | **Integer** | Vehicle ID to query. | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineObject15.new(end_ms: 1462881998034,
                                 group_id: 101,
                                 start_ms: 1462878398034,
                                 vehicle_id: 112)
```



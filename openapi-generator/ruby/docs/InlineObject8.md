# OpenapiClient::InlineObject8

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driver_id** | **Integer** | Driver ID to query. | 
**end_ms** | **Integer** | End of the time range, specified in milliseconds UNIX time. | 
**group_id** | **Integer** | Group ID to query. | 
**start_ms** | **Integer** | Beginning of the time range, specified in milliseconds UNIX time. | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineObject8.new(driver_id: 444,
                                 end_ms: 1462881998034,
                                 group_id: 101,
                                 start_ms: 1462878398034)
```



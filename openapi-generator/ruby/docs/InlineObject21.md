# OpenapiClient::InlineObject21

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_ms** | **Integer** | End of the time range, specified in milliseconds UNIX time. | 
**fill_missing** | **String** |  | [optional] [default to &#39;withNull&#39;]
**group_id** | **Integer** | Group ID to query. | 
**series** | [**Array&lt;SensorsHistorySeries&gt;**](SensorsHistorySeries.md) |  | 
**start_ms** | **Integer** | Beginning of the time range, specified in milliseconds UNIX time. | 
**step_ms** | **Integer** | Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineObject21.new(end_ms: 1462881998034,
                                 fill_missing: null,
                                 group_id: 101,
                                 series: null,
                                 start_ms: 1462878398034,
                                 step_ms: 3600000)
```



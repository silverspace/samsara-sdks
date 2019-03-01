# OpenapiClient::SensorHistoryResponseResults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**series** | **Array&lt;Integer&gt;** | List of datapoints, one for each requested (sensor, field) pair. | [optional] 
**time_ms** | **Integer** | Timestamp in UNIX milliseconds. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::SensorHistoryResponseResults.new(series: null,
                                 time_ms: 1453449599999)
```



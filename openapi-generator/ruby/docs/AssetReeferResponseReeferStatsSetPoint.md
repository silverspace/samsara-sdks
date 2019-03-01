# OpenapiClient::AssetReeferResponseReeferStatsSetPoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**temp_in_milli_c** | **Integer** | Set point temperature in millidegree Celsius. | [optional] 
**changed_at_ms** | **Integer** | Timestamp in Unix milliseconds since epoch. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AssetReeferResponseReeferStatsSetPoint.new(temp_in_milli_c: 31110,
                                 changed_at_ms: 1453449599999)
```



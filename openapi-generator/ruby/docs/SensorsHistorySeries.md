# OpenapiClient::SensorsHistorySeries

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | Field to query. | 
**widget_id** | **Integer** | Sensor ID to query. | 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::SensorsHistorySeries.new(field: ambientTemperature,
                                 widget_id: 1)
```



# OpenapiClient::AssetReeferResponseReeferStatsAlarms

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**severity** | **Integer** | Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action | [optional] 
**operator_action** | **String** | Recommended operator action | [optional] 
**description** | **String** | Description of the alarm | [optional] 
**alarm_code** | **Integer** | ID of the alarm | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AssetReeferResponseReeferStatsAlarms.new(severity: 1,
                                 operator_action: Check and repair at end of trip,
                                 description: Check Return Air Sensor,
                                 alarm_code: 102)
```



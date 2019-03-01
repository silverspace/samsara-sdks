# OpenapiClient::SafetyReportHarshEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**harsh_event_type** | **String** | Type of the harsh event | [optional] 
**timestamp_ms** | **Integer** | Timestamp that the harsh event occurred in Unix milliseconds since epoch | [optional] 
**vehicle_id** | **Integer** | Vehicle associated with the harsh event | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::SafetyReportHarshEvent.new(harsh_event_type: Harsh Braking,
                                 timestamp_ms: 1535590776000,
                                 vehicle_id: 212014918086169)
```



# OpenapiClient::VehicleSafetyScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crash_count** | **Integer** | Crash event count | [optional] 
**harsh_accel_count** | **Integer** | Harsh acceleration event count | [optional] 
**harsh_braking_count** | **Integer** | Harsh braking event count | [optional] 
**harsh_events** | [**Array&lt;SafetyReportHarshEvent&gt;**](SafetyReportHarshEvent.md) |  | [optional] 
**harsh_turning_count** | **Integer** | Harsh turning event count | [optional] 
**safety_score** | **Integer** | Safety Score | [optional] 
**safety_score_rank** | **String** | Safety Score Rank | [optional] 
**time_over_speed_limit_ms** | **Integer** | Amount of time driven over the speed limit in milliseconds | [optional] 
**total_distance_driven_meters** | **Integer** | Total distance driven in meters | [optional] 
**total_harsh_event_count** | **Integer** | Total harsh event count | [optional] 
**total_time_driven_ms** | **Integer** | Amount of time driven in milliseconds | [optional] 
**vehicle_id** | **Integer** | Vehicle ID | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::VehicleSafetyScoreResponse.new(crash_count: 0,
                                 harsh_accel_count: 1,
                                 harsh_braking_count: 2,
                                 harsh_events: null,
                                 harsh_turning_count: 0,
                                 safety_score: 97,
                                 safety_score_rank: 26,
                                 time_over_speed_limit_ms: 3769,
                                 total_distance_driven_meters: 291836,
                                 total_harsh_event_count: 3,
                                 total_time_driven_ms: 19708293,
                                 vehicle_id: 4321)
```



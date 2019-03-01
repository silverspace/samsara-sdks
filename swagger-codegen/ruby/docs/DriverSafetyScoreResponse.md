# SwaggerClient::DriverSafetyScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crash_count** | **Integer** | Crash event count | [optional] 
**driver_id** | **Integer** | Driver ID | [optional] 
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



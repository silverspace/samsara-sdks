# DriverSafetyScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crash_count** | **i32** | Crash event count | [optional] 
**driver_id** | **i32** | Driver ID | [optional] 
**harsh_accel_count** | **i32** | Harsh acceleration event count | [optional] 
**harsh_braking_count** | **i32** | Harsh braking event count | [optional] 
**harsh_events** | [**Vec<::models::SafetyReportHarshEvent>**](SafetyReportHarshEvent.md) |  | [optional] 
**harsh_turning_count** | **i32** | Harsh turning event count | [optional] 
**safety_score** | **i32** | Safety Score | [optional] 
**safety_score_rank** | **String** | Safety Score Rank | [optional] 
**time_over_speed_limit_ms** | **i32** | Amount of time driven over the speed limit in milliseconds | [optional] 
**total_distance_driven_meters** | **i32** | Total distance driven in meters | [optional] 
**total_harsh_event_count** | **i32** | Total harsh event count | [optional] 
**total_time_driven_ms** | **i32** | Amount of time driven in milliseconds | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



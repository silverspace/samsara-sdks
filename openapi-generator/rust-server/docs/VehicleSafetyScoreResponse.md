# VehicleSafetyScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crash_count** | **isize** | Crash event count | [optional] [default to None]
**harsh_accel_count** | **isize** | Harsh acceleration event count | [optional] [default to None]
**harsh_braking_count** | **isize** | Harsh braking event count | [optional] [default to None]
**harsh_events** | [**Vec<models::SafetyReportHarshEvent>**](SafetyReportHarshEvent.md) |  | [optional] [default to None]
**harsh_turning_count** | **isize** | Harsh turning event count | [optional] [default to None]
**safety_score** | **isize** | Safety Score | [optional] [default to None]
**safety_score_rank** | **String** | Safety Score Rank | [optional] [default to None]
**time_over_speed_limit_ms** | **isize** | Amount of time driven over the speed limit in milliseconds | [optional] [default to None]
**total_distance_driven_meters** | **isize** | Total distance driven in meters | [optional] [default to None]
**total_harsh_event_count** | **isize** | Total harsh event count | [optional] [default to None]
**total_time_driven_ms** | **isize** | Amount of time driven in milliseconds | [optional] [default to None]
**vehicle_id** | **isize** | Vehicle ID | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



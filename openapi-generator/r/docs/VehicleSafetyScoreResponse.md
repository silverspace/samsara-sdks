# openapi::VehicleSafetyScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crashCount** | **integer** | Crash event count | [optional] 
**harshAccelCount** | **integer** | Harsh acceleration event count | [optional] 
**harshBrakingCount** | **integer** | Harsh braking event count | [optional] 
**harshEvents** | [**SafetyReportHarshEvent**](SafetyReportHarshEvent.md) |  | [optional] 
**harshTurningCount** | **integer** | Harsh turning event count | [optional] 
**safetyScore** | **integer** | Safety Score | [optional] 
**safetyScoreRank** | **character** | Safety Score Rank | [optional] 
**timeOverSpeedLimitMs** | **integer** | Amount of time driven over the speed limit in milliseconds | [optional] 
**totalDistanceDrivenMeters** | **integer** | Total distance driven in meters | [optional] 
**totalHarshEventCount** | **integer** | Total harsh event count | [optional] 
**totalTimeDrivenMs** | **integer** | Amount of time driven in milliseconds | [optional] 
**vehicleId** | **integer** | Vehicle ID | [optional] 



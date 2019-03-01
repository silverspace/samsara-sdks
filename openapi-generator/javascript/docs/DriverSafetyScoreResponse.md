# SamsaraApi.DriverSafetyScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crashCount** | **Number** | Crash event count | [optional] 
**driverId** | **Number** | Driver ID | [optional] 
**harshAccelCount** | **Number** | Harsh acceleration event count | [optional] 
**harshBrakingCount** | **Number** | Harsh braking event count | [optional] 
**harshEvents** | [**[SafetyReportHarshEvent]**](SafetyReportHarshEvent.md) |  | [optional] 
**harshTurningCount** | **Number** | Harsh turning event count | [optional] 
**safetyScore** | **Number** | Safety Score | [optional] 
**safetyScoreRank** | **String** | Safety Score Rank | [optional] 
**timeOverSpeedLimitMs** | **Number** | Amount of time driven over the speed limit in milliseconds | [optional] 
**totalDistanceDrivenMeters** | **Number** | Total distance driven in meters | [optional] 
**totalHarshEventCount** | **Number** | Total harsh event count | [optional] 
**totalTimeDrivenMs** | **Number** | Amount of time driven in milliseconds | [optional] 



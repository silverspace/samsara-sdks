
# DriverSafetyScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crashCount** | **kotlin.Int** | Crash event count |  [optional]
**driverId** | **kotlin.Int** | Driver ID |  [optional]
**harshAccelCount** | **kotlin.Int** | Harsh acceleration event count |  [optional]
**harshBrakingCount** | **kotlin.Int** | Harsh braking event count |  [optional]
**harshEvents** | [**kotlin.Array&lt;SafetyReportHarshEvent&gt;**](SafetyReportHarshEvent.md) |  |  [optional]
**harshTurningCount** | **kotlin.Int** | Harsh turning event count |  [optional]
**safetyScore** | **kotlin.Int** | Safety Score |  [optional]
**safetyScoreRank** | **kotlin.String** | Safety Score Rank |  [optional]
**timeOverSpeedLimitMs** | **kotlin.Int** | Amount of time driven over the speed limit in milliseconds |  [optional]
**totalDistanceDrivenMeters** | **kotlin.Int** | Total distance driven in meters |  [optional]
**totalHarshEventCount** | **kotlin.Int** | Total harsh event count |  [optional]
**totalTimeDrivenMs** | **kotlin.Int** | Amount of time driven in milliseconds |  [optional]




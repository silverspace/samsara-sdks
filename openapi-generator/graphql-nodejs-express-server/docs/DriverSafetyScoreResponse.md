# DriverSafetyScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crashCount** | **Int!** | Crash event count | [optional] [default to null]
**driverId** | **Int!** | Driver ID | [optional] [default to null]
**harshAccelCount** | **Int!** | Harsh acceleration event count | [optional] [default to null]
**harshBrakingCount** | **Int!** | Harsh braking event count | [optional] [default to null]
**harshEvents** | [**SafetyReportHarshEvent**](SafetyReportHarshEvent.md) |  | [optional] [default to null]
**harshTurningCount** | **Int!** | Harsh turning event count | [optional] [default to null]
**safetyScore** | **Int!** | Safety Score | [optional] [default to null]
**safetyScoreRank** | **String!** | Safety Score Rank | [optional] [default to null]
**timeOverSpeedLimitMs** | **Int!** | Amount of time driven over the speed limit in milliseconds | [optional] [default to null]
**totalDistanceDrivenMeters** | **Int!** | Total distance driven in meters | [optional] [default to null]
**totalHarshEventCount** | **Int!** | Total harsh event count | [optional] [default to null]
**totalTimeDrivenMs** | **Int!** | Amount of time driven in milliseconds | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



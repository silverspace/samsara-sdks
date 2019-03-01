# Org.OpenAPITools.Model.DriverSafetyScoreResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CrashCount** | **int?** | Crash event count | [optional] 
**DriverId** | **int?** | Driver ID | [optional] 
**HarshAccelCount** | **int?** | Harsh acceleration event count | [optional] 
**HarshBrakingCount** | **int?** | Harsh braking event count | [optional] 
**HarshEvents** | [**List<SafetyReportHarshEvent>**](SafetyReportHarshEvent.md) |  | [optional] 
**HarshTurningCount** | **int?** | Harsh turning event count | [optional] 
**SafetyScore** | **int?** | Safety Score | [optional] 
**SafetyScoreRank** | **string** | Safety Score Rank | [optional] 
**TimeOverSpeedLimitMs** | **int?** | Amount of time driven over the speed limit in milliseconds | [optional] 
**TotalDistanceDrivenMeters** | **int?** | Total distance driven in meters | [optional] 
**TotalHarshEventCount** | **int?** | Total harsh event count | [optional] 
**TotalTimeDrivenMs** | **int?** | Amount of time driven in milliseconds | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


# DriverSafetyScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crashCount** | **int** | Crash event count | [optional] 
**driverId** | **int** | Driver ID | [optional] 
**harshAccelCount** | **int** | Harsh acceleration event count | [optional] 
**harshBrakingCount** | **int** | Harsh braking event count | [optional] 
**harshEvents** | [**OpenAPI\Server\Model\SafetyReportHarshEvent**](SafetyReportHarshEvent.md) |  | [optional] 
**harshTurningCount** | **int** | Harsh turning event count | [optional] 
**safetyScore** | **int** | Safety Score | [optional] 
**safetyScoreRank** | **string** | Safety Score Rank | [optional] 
**timeOverSpeedLimitMs** | **int** | Amount of time driven over the speed limit in milliseconds | [optional] 
**totalDistanceDrivenMeters** | **int** | Total distance driven in meters | [optional] 
**totalHarshEventCount** | **int** | Total harsh event count | [optional] 
**totalTimeDrivenMs** | **int** | Amount of time driven in milliseconds | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



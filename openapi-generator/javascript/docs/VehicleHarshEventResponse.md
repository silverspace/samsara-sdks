# SamsaraApi.VehicleHarshEventResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadForwardVideoUrl** | **String** | URL for downloading the forward facing video | [optional] 
**downloadInwardVideoUrl** | **String** | URL for downloading the inward facing video | [optional] 
**downloadTrackedInwardVideoUrl** | **String** | URL for downloading the tracked inward facing video | [optional] 
**harshEventType** | **String** | Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] | 
**incidentReportUrl** | **String** | URL of the associated incident report page | 
**isDistracted** | **Boolean** | Whether the driver was deemed distracted during this harsh event | [optional] 
**location** | [**VehicleHarshEventResponseLocation**](VehicleHarshEventResponseLocation.md) |  | [optional] 



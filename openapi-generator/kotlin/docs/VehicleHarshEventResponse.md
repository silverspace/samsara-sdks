
# VehicleHarshEventResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadForwardVideoUrl** | **kotlin.String** | URL for downloading the forward facing video |  [optional]
**downloadInwardVideoUrl** | **kotlin.String** | URL for downloading the inward facing video |  [optional]
**downloadTrackedInwardVideoUrl** | **kotlin.String** | URL for downloading the tracked inward facing video |  [optional]
**harshEventType** | **kotlin.String** | Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] | 
**incidentReportUrl** | **kotlin.String** | URL of the associated incident report page | 
**isDistracted** | **kotlin.Boolean** | Whether the driver was deemed distracted during this harsh event |  [optional]
**location** | [**VehicleHarshEventResponseLocation**](VehicleHarshEventResponseLocation.md) |  |  [optional]




# openapi::VehicleHarshEventResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadForwardVideoUrl** | **character** | URL for downloading the forward facing video | [optional] 
**downloadInwardVideoUrl** | **character** | URL for downloading the inward facing video | [optional] 
**downloadTrackedInwardVideoUrl** | **character** | URL for downloading the tracked inward facing video | [optional] 
**harshEventType** | **character** | Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] | 
**incidentReportUrl** | **character** | URL of the associated incident report page | 
**isDistracted** | **character** | Whether the driver was deemed distracted during this harsh event | [optional] 
**location** | [**VehicleHarshEventResponseLocation**](VehicleHarshEventResponse_location.md) |  | [optional] 



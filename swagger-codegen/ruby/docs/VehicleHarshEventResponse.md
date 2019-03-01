# SwaggerClient::VehicleHarshEventResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_forward_video_url** | **String** | URL for downloading the forward facing video | [optional] 
**download_inward_video_url** | **String** | URL for downloading the inward facing video | [optional] 
**download_tracked_inward_video_url** | **String** | URL for downloading the tracked inward facing video | [optional] 
**harsh_event_type** | **String** | Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] | 
**incident_report_url** | **String** | URL of the associated incident report page | 
**is_distracted** | **BOOLEAN** | Whether the driver was deemed distracted during this harsh event | [optional] 
**location** | [**VehicleHarshEventResponseLocation**](VehicleHarshEventResponseLocation.md) |  | [optional] 



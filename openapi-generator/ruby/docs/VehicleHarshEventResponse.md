# OpenapiClient::VehicleHarshEventResponse

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

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::VehicleHarshEventResponse.new(download_forward_video_url: https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-123456789.mp4?...,
                                 download_inward_video_url: https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.mp4?...,
                                 download_tracked_inward_video_url: https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.tracked.mp4?...,
                                 harsh_event_type: Harsh Braking,
                                 incident_report_url: https://cloud.samsara.com/groups/1234/fleet/reports/safety/vehicle/212123456789012/incident/1539201882984,
                                 is_distracted: true,
                                 location: null)
```



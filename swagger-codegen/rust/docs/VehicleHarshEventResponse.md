# VehicleHarshEventResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_forward_video_url** | **String** | URL for downloading the forward facing video | [optional] [default to null]
**download_inward_video_url** | **String** | URL for downloading the inward facing video | [optional] [default to null]
**download_tracked_inward_video_url** | **String** | URL for downloading the tracked inward facing video | [optional] [default to null]
**harsh_event_type** | **String** | Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] | [default to null]
**incident_report_url** | **String** | URL of the associated incident report page | [default to null]
**is_distracted** | **bool** | Whether the driver was deemed distracted during this harsh event | [optional] [default to null]
**location** | [***::models::VehicleHarshEventResponseLocation**](VehicleHarshEventResponse_location.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



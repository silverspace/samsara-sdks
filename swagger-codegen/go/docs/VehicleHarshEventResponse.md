# VehicleHarshEventResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DownloadForwardVideoUrl** | **string** | URL for downloading the forward facing video | [optional] [default to null]
**DownloadInwardVideoUrl** | **string** | URL for downloading the inward facing video | [optional] [default to null]
**DownloadTrackedInwardVideoUrl** | **string** | URL for downloading the tracked inward facing video | [optional] [default to null]
**HarshEventType** | **string** | Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] | [default to null]
**IncidentReportUrl** | **string** | URL of the associated incident report page | [default to null]
**IsDistracted** | **bool** | Whether the driver was deemed distracted during this harsh event | [optional] [default to null]
**Location** | [***VehicleHarshEventResponseLocation**](VehicleHarshEventResponse_location.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



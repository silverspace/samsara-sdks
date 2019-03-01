# Org.OpenAPITools.Model.VehicleHarshEventResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DownloadForwardVideoUrl** | **string** | URL for downloading the forward facing video | [optional] 
**DownloadInwardVideoUrl** | **string** | URL for downloading the inward facing video | [optional] 
**DownloadTrackedInwardVideoUrl** | **string** | URL for downloading the tracked inward facing video | [optional] 
**HarshEventType** | **string** | Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] | 
**IncidentReportUrl** | **string** | URL of the associated incident report page | 
**IsDistracted** | **bool?** | Whether the driver was deemed distracted during this harsh event | [optional] 
**Location** | [**VehicleHarshEventResponseLocation**](VehicleHarshEventResponseLocation.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


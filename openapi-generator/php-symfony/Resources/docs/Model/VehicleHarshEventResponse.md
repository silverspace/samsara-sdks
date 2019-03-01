# VehicleHarshEventResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadForwardVideoUrl** | **string** | URL for downloading the forward facing video | [optional] 
**downloadInwardVideoUrl** | **string** | URL for downloading the inward facing video | [optional] 
**downloadTrackedInwardVideoUrl** | **string** | URL for downloading the tracked inward facing video | [optional] 
**harshEventType** | **string** | Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] | 
**incidentReportUrl** | **string** | URL of the associated incident report page | 
**isDistracted** | **bool** | Whether the driver was deemed distracted during this harsh event | [optional] 
**location** | [**OpenAPI\Server\Model\VehicleHarshEventResponseLocation**](VehicleHarshEventResponseLocation.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



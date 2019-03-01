# DvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorSignature** | [**OpenAPI\Server\Model\DvirBaseAuthorSignature**](DvirBaseAuthorSignature.md) |  | [optional] 
**defectsCorrected** | **bool** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] 
**defectsNeedNotBeCorrected** | **bool** | Signifies if the defects on this vehicle can be ignored. | [optional] 
**id** | **int** | The id of this DVIR record. | [optional] 
**inspectionType** | **string** | Inspection type of the DVIR. | [optional] 
**mechanicNotes** | **string** | The mechanics notes on the DVIR. | [optional] 
**mechanicOrAgentSignature** | [**OpenAPI\Server\Model\DvirBaseMechanicOrAgentSignature**](DvirBaseMechanicOrAgentSignature.md) |  | [optional] 
**nextDriverSignature** | [**OpenAPI\Server\Model\DvirBaseNextDriverSignature**](DvirBaseNextDriverSignature.md) |  | [optional] 
**odometerMiles** | **int** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] 
**timeMs** | **int** | Timestamp of this DVIR in UNIX milliseconds. | [optional] 
**trailerDefects** | [**OpenAPI\Server\Model\DvirBaseTrailerDefects**](DvirBaseTrailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] 
**trailerId** | **int** | The id of the trailer which was part of the DVIR. | [optional] 
**trailerName** | **string** | The name of the trailer which was part of the DVIR. | [optional] 
**vehicle** | [**OpenAPI\Server\Model\DvirBaseVehicle**](DvirBaseVehicle.md) |  | [optional] 
**vehicleCondition** | **string** | The condition of vechile on which DVIR was done. | [optional] 
**vehicleDefects** | [**OpenAPI\Server\Model\DvirBaseTrailerDefects**](DvirBaseTrailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# OAIDvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorSignature** | [**OAIDvirBaseAuthorSignature***](OAIDvirBaseAuthorSignature.md) |  | [optional] 
**defectsCorrected** | **NSNumber*** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] 
**defectsNeedNotBeCorrected** | **NSNumber*** | Signifies if the defects on this vehicle can be ignored. | [optional] 
**_id** | **NSNumber*** | The id of this DVIR record. | [optional] 
**inspectionType** | **NSString*** | Inspection type of the DVIR. | [optional] 
**mechanicNotes** | **NSString*** | The mechanics notes on the DVIR. | [optional] 
**mechanicOrAgentSignature** | [**OAIDvirBaseMechanicOrAgentSignature***](OAIDvirBaseMechanicOrAgentSignature.md) |  | [optional] 
**nextDriverSignature** | [**OAIDvirBaseNextDriverSignature***](OAIDvirBaseNextDriverSignature.md) |  | [optional] 
**odometerMiles** | **NSNumber*** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] 
**timeMs** | **NSNumber*** | Timestamp of this DVIR in UNIX milliseconds. | [optional] 
**trailerDefects** | [**NSArray&lt;OAIDvirBaseTrailerDefects&gt;***](OAIDvirBaseTrailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] 
**trailerId** | **NSNumber*** | The id of the trailer which was part of the DVIR. | [optional] 
**trailerName** | **NSString*** | The name of the trailer which was part of the DVIR. | [optional] 
**vehicle** | [**OAIDvirBaseVehicle***](OAIDvirBaseVehicle.md) |  | [optional] 
**vehicleCondition** | **NSString*** | The condition of vechile on which DVIR was done. | [optional] 
**vehicleDefects** | [**NSArray&lt;OAIDvirBaseTrailerDefects&gt;***](OAIDvirBaseTrailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



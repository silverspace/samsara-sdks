# openapi::DvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorSignature** | [**DvirBaseAuthorSignature**](DvirBase_authorSignature.md) |  | [optional] 
**defectsCorrected** | **character** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] 
**defectsNeedNotBeCorrected** | **character** | Signifies if the defects on this vehicle can be ignored. | [optional] 
**id** | **integer** | The id of this DVIR record. | [optional] 
**inspectionType** | **character** | Inspection type of the DVIR. | [optional] 
**mechanicNotes** | **character** | The mechanics notes on the DVIR. | [optional] 
**mechanicOrAgentSignature** | [**DvirBaseMechanicOrAgentSignature**](DvirBase_mechanicOrAgentSignature.md) |  | [optional] 
**nextDriverSignature** | [**DvirBaseNextDriverSignature**](DvirBase_nextDriverSignature.md) |  | [optional] 
**odometerMiles** | **integer** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] 
**timeMs** | **integer** | Timestamp of this DVIR in UNIX milliseconds. | [optional] 
**trailerDefects** | [**DvirBaseTrailerDefects**](DvirBase_trailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] 
**trailerId** | **integer** | The id of the trailer which was part of the DVIR. | [optional] 
**trailerName** | **character** | The name of the trailer which was part of the DVIR. | [optional] 
**vehicle** | [**DvirBaseVehicle**](DvirBase_vehicle.md) |  | [optional] 
**vehicleCondition** | **character** | The condition of vechile on which DVIR was done. | [optional] 
**vehicleDefects** | [**DvirBaseTrailerDefects**](DvirBase_trailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] 



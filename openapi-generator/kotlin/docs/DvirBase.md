
# DvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorSignature** | [**DvirBaseAuthorSignature**](DvirBaseAuthorSignature.md) |  |  [optional]
**defectsCorrected** | **kotlin.Boolean** | Signifies if the defects on the vehicle corrected after the DVIR is done. |  [optional]
**defectsNeedNotBeCorrected** | **kotlin.Boolean** | Signifies if the defects on this vehicle can be ignored. |  [optional]
**id** | **kotlin.Long** | The id of this DVIR record. |  [optional]
**inspectionType** | **kotlin.String** | Inspection type of the DVIR. |  [optional]
**mechanicNotes** | **kotlin.String** | The mechanics notes on the DVIR. |  [optional]
**mechanicOrAgentSignature** | [**DvirBaseMechanicOrAgentSignature**](DvirBaseMechanicOrAgentSignature.md) |  |  [optional]
**nextDriverSignature** | [**DvirBaseNextDriverSignature**](DvirBaseNextDriverSignature.md) |  |  [optional]
**odometerMiles** | **kotlin.Long** | The odometer reading in miles for the vehicle when the DVIR was done. |  [optional]
**timeMs** | **kotlin.Long** | Timestamp of this DVIR in UNIX milliseconds. |  [optional]
**trailerDefects** | [**kotlin.Array&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the trailer which was part of the DVIR. |  [optional]
**trailerId** | **kotlin.Int** | The id of the trailer which was part of the DVIR. |  [optional]
**trailerName** | **kotlin.String** | The name of the trailer which was part of the DVIR. |  [optional]
**vehicle** | [**DvirBaseVehicle**](DvirBaseVehicle.md) |  |  [optional]
**vehicleCondition** | **kotlin.String** | The condition of vechile on which DVIR was done. |  [optional]
**vehicleDefects** | [**kotlin.Array&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. |  [optional]




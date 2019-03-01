
# DvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorSignature** | [**DvirBaseAuthorSignature**](DvirBaseAuthorSignature.md) |  |  [optional]
**defectsCorrected** | **Boolean** | Signifies if the defects on the vehicle corrected after the DVIR is done. |  [optional]
**defectsNeedNotBeCorrected** | **Boolean** | Signifies if the defects on this vehicle can be ignored. |  [optional]
**id** | **Long** | The id of this DVIR record. |  [optional]
**inspectionType** | **String** | Inspection type of the DVIR. |  [optional]
**mechanicNotes** | **String** | The mechanics notes on the DVIR. |  [optional]
**mechanicOrAgentSignature** | [**DvirBaseMechanicOrAgentSignature**](DvirBaseMechanicOrAgentSignature.md) |  |  [optional]
**nextDriverSignature** | [**DvirBaseNextDriverSignature**](DvirBaseNextDriverSignature.md) |  |  [optional]
**odometerMiles** | **Long** | The odometer reading in miles for the vehicle when the DVIR was done. |  [optional]
**timeMs** | **Long** | Timestamp of this DVIR in UNIX milliseconds. |  [optional]
**trailerDefects** | [**List&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the trailer which was part of the DVIR. |  [optional]
**trailerId** | **Integer** | The id of the trailer which was part of the DVIR. |  [optional]
**trailerName** | **String** | The name of the trailer which was part of the DVIR. |  [optional]
**vehicle** | [**DvirBaseVehicle**](DvirBaseVehicle.md) |  |  [optional]
**vehicleCondition** | **String** | The condition of vechile on which DVIR was done. |  [optional]
**vehicleDefects** | [**List&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. |  [optional]




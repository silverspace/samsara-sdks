# DvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorSignature** | [***DvirBaseAuthorSignature**](DvirBase_authorSignature.md) |  | [optional] [default to null]
**defectsCorrected** | **Boolean!** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] [default to null]
**defectsNeedNotBeCorrected** | **Boolean!** | Signifies if the defects on this vehicle can be ignored. | [optional] [default to null]
**Id_** | **Int!** | The id of this DVIR record. | [optional] [default to null]
**inspectionType** | **String!** | Inspection type of the DVIR. | [optional] [default to null]
**mechanicNotes** | **String!** | The mechanics notes on the DVIR. | [optional] [default to null]
**mechanicOrAgentSignature** | [***DvirBaseMechanicOrAgentSignature**](DvirBase_mechanicOrAgentSignature.md) |  | [optional] [default to null]
**nextDriverSignature** | [***DvirBaseNextDriverSignature**](DvirBase_nextDriverSignature.md) |  | [optional] [default to null]
**odometerMiles** | **Int!** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] [default to null]
**timeMs** | **Int!** | Timestamp of this DVIR in UNIX milliseconds. | [optional] [default to null]
**trailerDefects** | [**DvirBaseTrailerDefects**](DvirBase_trailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] [default to null]
**trailerId** | **Int!** | The id of the trailer which was part of the DVIR. | [optional] [default to null]
**trailerName** | **String!** | The name of the trailer which was part of the DVIR. | [optional] [default to null]
**vehicle** | [***DvirBaseVehicle**](DvirBase_vehicle.md) |  | [optional] [default to null]
**vehicleCondition** | **String!** | The condition of vechile on which DVIR was done. | [optional] [default to null]
**vehicleDefects** | [**DvirBaseTrailerDefects**](DvirBase_trailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



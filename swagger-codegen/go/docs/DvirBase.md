# DvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuthorSignature** | [***DvirBaseAuthorSignature**](DvirBase_authorSignature.md) |  | [optional] [default to null]
**DefectsCorrected** | **bool** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] [default to null]
**DefectsNeedNotBeCorrected** | **bool** | Signifies if the defects on this vehicle can be ignored. | [optional] [default to null]
**Id** | **int64** | The id of this DVIR record. | [optional] [default to null]
**InspectionType** | **string** | Inspection type of the DVIR. | [optional] [default to null]
**MechanicNotes** | **string** | The mechanics notes on the DVIR. | [optional] [default to null]
**MechanicOrAgentSignature** | [***DvirBaseMechanicOrAgentSignature**](DvirBase_mechanicOrAgentSignature.md) |  | [optional] [default to null]
**NextDriverSignature** | [***DvirBaseNextDriverSignature**](DvirBase_nextDriverSignature.md) |  | [optional] [default to null]
**OdometerMiles** | **int64** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] [default to null]
**TimeMs** | **int64** | Timestamp of this DVIR in UNIX milliseconds. | [optional] [default to null]
**TrailerDefects** | [**[]DvirBaseTrailerDefects**](DvirBase_trailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] [default to null]
**TrailerId** | **int32** | The id of the trailer which was part of the DVIR. | [optional] [default to null]
**TrailerName** | **string** | The name of the trailer which was part of the DVIR. | [optional] [default to null]
**Vehicle** | [***DvirBaseVehicle**](DvirBase_vehicle.md) |  | [optional] [default to null]
**VehicleCondition** | **string** | The condition of vechile on which DVIR was done. | [optional] [default to null]
**VehicleDefects** | [**[]DvirBaseTrailerDefects**](DvirBase_trailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



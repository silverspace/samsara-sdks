# Org.OpenAPITools.Model.DvirBase
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuthorSignature** | [**DvirBaseAuthorSignature**](DvirBaseAuthorSignature.md) |  | [optional] 
**DefectsCorrected** | **bool?** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] 
**DefectsNeedNotBeCorrected** | **bool?** | Signifies if the defects on this vehicle can be ignored. | [optional] 
**Id** | **long?** | The id of this DVIR record. | [optional] 
**InspectionType** | **string** | Inspection type of the DVIR. | [optional] 
**MechanicNotes** | **string** | The mechanics notes on the DVIR. | [optional] 
**MechanicOrAgentSignature** | [**DvirBaseMechanicOrAgentSignature**](DvirBaseMechanicOrAgentSignature.md) |  | [optional] 
**NextDriverSignature** | [**DvirBaseNextDriverSignature**](DvirBaseNextDriverSignature.md) |  | [optional] 
**OdometerMiles** | **long?** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] 
**TimeMs** | **long?** | Timestamp of this DVIR in UNIX milliseconds. | [optional] 
**TrailerDefects** | [**List&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] 
**TrailerId** | **int?** | The id of the trailer which was part of the DVIR. | [optional] 
**TrailerName** | **string** | The name of the trailer which was part of the DVIR. | [optional] 
**Vehicle** | [**DvirBaseVehicle**](DvirBaseVehicle.md) |  | [optional] 
**VehicleCondition** | **string** | The condition of vechile on which DVIR was done. | [optional] 
**VehicleDefects** | [**List&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


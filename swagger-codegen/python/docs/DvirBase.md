# DvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_signature** | [**DvirBaseAuthorSignature**](DvirBaseAuthorSignature.md) |  | [optional] 
**defects_corrected** | **bool** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] 
**defects_need_not_be_corrected** | **bool** | Signifies if the defects on this vehicle can be ignored. | [optional] 
**id** | **int** | The id of this DVIR record. | [optional] 
**inspection_type** | **str** | Inspection type of the DVIR. | [optional] 
**mechanic_notes** | **str** | The mechanics notes on the DVIR. | [optional] 
**mechanic_or_agent_signature** | [**DvirBaseMechanicOrAgentSignature**](DvirBaseMechanicOrAgentSignature.md) |  | [optional] 
**next_driver_signature** | [**DvirBaseNextDriverSignature**](DvirBaseNextDriverSignature.md) |  | [optional] 
**odometer_miles** | **int** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] 
**time_ms** | **int** | Timestamp of this DVIR in UNIX milliseconds. | [optional] 
**trailer_defects** | [**list[DvirBaseTrailerDefects]**](DvirBaseTrailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] 
**trailer_id** | **int** | The id of the trailer which was part of the DVIR. | [optional] 
**trailer_name** | **str** | The name of the trailer which was part of the DVIR. | [optional] 
**vehicle** | [**DvirBaseVehicle**](DvirBaseVehicle.md) |  | [optional] 
**vehicle_condition** | **str** | The condition of vechile on which DVIR was done. | [optional] 
**vehicle_defects** | [**list[DvirBaseTrailerDefects]**](DvirBaseTrailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# DvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_signature** | [***::models::DvirBaseAuthorSignature**](DvirBase_authorSignature.md) |  | [optional] 
**defects_corrected** | **bool** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] 
**defects_need_not_be_corrected** | **bool** | Signifies if the defects on this vehicle can be ignored. | [optional] 
**id** | **i64** | The id of this DVIR record. | [optional] 
**inspection_type** | **String** | Inspection type of the DVIR. | [optional] 
**mechanic_notes** | **String** | The mechanics notes on the DVIR. | [optional] 
**mechanic_or_agent_signature** | [***::models::DvirBaseMechanicOrAgentSignature**](DvirBase_mechanicOrAgentSignature.md) |  | [optional] 
**next_driver_signature** | [***::models::DvirBaseNextDriverSignature**](DvirBase_nextDriverSignature.md) |  | [optional] 
**odometer_miles** | **i64** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] 
**time_ms** | **i64** | Timestamp of this DVIR in UNIX milliseconds. | [optional] 
**trailer_defects** | [**Vec<::models::DvirBaseTrailerDefects>**](DvirBase_trailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] 
**trailer_id** | **i32** | The id of the trailer which was part of the DVIR. | [optional] 
**trailer_name** | **String** | The name of the trailer which was part of the DVIR. | [optional] 
**vehicle** | [***::models::DvirBaseVehicle**](DvirBase_vehicle.md) |  | [optional] 
**vehicle_condition** | **String** | The condition of vechile on which DVIR was done. | [optional] 
**vehicle_defects** | [**Vec<::models::DvirBaseTrailerDefects>**](DvirBase_trailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



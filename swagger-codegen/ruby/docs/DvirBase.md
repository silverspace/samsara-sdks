# SwaggerClient::DvirBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_signature** | [**DvirBaseAuthorSignature**](DvirBaseAuthorSignature.md) |  | [optional] 
**defects_corrected** | **BOOLEAN** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] 
**defects_need_not_be_corrected** | **BOOLEAN** | Signifies if the defects on this vehicle can be ignored. | [optional] 
**id** | **Integer** | The id of this DVIR record. | [optional] 
**inspection_type** | **String** | Inspection type of the DVIR. | [optional] 
**mechanic_notes** | **String** | The mechanics notes on the DVIR. | [optional] 
**mechanic_or_agent_signature** | [**DvirBaseMechanicOrAgentSignature**](DvirBaseMechanicOrAgentSignature.md) |  | [optional] 
**next_driver_signature** | [**DvirBaseNextDriverSignature**](DvirBaseNextDriverSignature.md) |  | [optional] 
**odometer_miles** | **Integer** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] 
**time_ms** | **Integer** | Timestamp of this DVIR in UNIX milliseconds. | [optional] 
**trailer_defects** | [**Array&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] 
**trailer_id** | **Integer** | The id of the trailer which was part of the DVIR. | [optional] 
**trailer_name** | **String** | The name of the trailer which was part of the DVIR. | [optional] 
**vehicle** | [**DvirBaseVehicle**](DvirBaseVehicle.md) |  | [optional] 
**vehicle_condition** | **String** | The condition of vechile on which DVIR was done. | [optional] 
**vehicle_defects** | [**Array&lt;DvirBaseTrailerDefects&gt;**](DvirBaseTrailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] 



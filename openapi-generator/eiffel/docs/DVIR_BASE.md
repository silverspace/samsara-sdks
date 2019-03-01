# DVIR_BASE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_signature** | [**DVIR_BASE_AUTHOR_SIGNATURE**](DvirBase_authorSignature.md) |  | [optional] [default to null]
**defects_corrected** | **BOOLEAN** | Signifies if the defects on the vehicle corrected after the DVIR is done. | [optional] [default to null]
**defects_need_not_be_corrected** | **BOOLEAN** | Signifies if the defects on this vehicle can be ignored. | [optional] [default to null]
**id** | **INTEGER_64** | The id of this DVIR record. | [optional] [default to null]
**inspection_type** | [**STRING_32**](STRING_32.md) | Inspection type of the DVIR. | [optional] [default to null]
**mechanic_notes** | [**STRING_32**](STRING_32.md) | The mechanics notes on the DVIR. | [optional] [default to null]
**mechanic_or_agent_signature** | [**DVIR_BASE_MECHANIC_OR_AGENT_SIGNATURE**](DvirBase_mechanicOrAgentSignature.md) |  | [optional] [default to null]
**next_driver_signature** | [**DVIR_BASE_NEXT_DRIVER_SIGNATURE**](DvirBase_nextDriverSignature.md) |  | [optional] [default to null]
**odometer_miles** | **INTEGER_64** | The odometer reading in miles for the vehicle when the DVIR was done. | [optional] [default to null]
**time_ms** | **INTEGER_64** | Timestamp of this DVIR in UNIX milliseconds. | [optional] [default to null]
**trailer_defects** | [**LIST [DVIR_BASE_TRAILER_DEFECTS]**](DvirBase_trailerDefects.md) | Defects registered for the trailer which was part of the DVIR. | [optional] [default to null]
**trailer_id** | **INTEGER_32** | The id of the trailer which was part of the DVIR. | [optional] [default to null]
**trailer_name** | [**STRING_32**](STRING_32.md) | The name of the trailer which was part of the DVIR. | [optional] [default to null]
**vehicle** | [**DVIR_BASE_VEHICLE**](DvirBase_vehicle.md) |  | [optional] [default to null]
**vehicle_condition** | [**STRING_32**](STRING_32.md) | The condition of vechile on which DVIR was done. | [optional] [default to null]
**vehicle_defects** | [**LIST [DVIR_BASE_TRAILER_DEFECTS]**](DvirBase_trailerDefects.md) | Defects registered for the vehicle which was part of the DVIR. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



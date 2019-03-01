# DRIVER_BASE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eld_adverse_weather_exemption_enabled** | **BOOLEAN** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] [default to null]
**eld_big_day_exemption_enabled** | **BOOLEAN** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] [default to null]
**eld_day_start_hour** | **INTEGER_32** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] [default to null]
**eld_exempt** | **BOOLEAN** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] [default to null]
**eld_exempt_reason** | [**STRING_32**](STRING_32.md) | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] [default to null]
**eld_pc_enabled** | **BOOLEAN** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to false]
**eld_ym_enabled** | **BOOLEAN** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to false]
**external_ids** | [**STRING_TABLE[STRING_32]**](STRING_32.md) | Dictionary of external IDs (string key-value pairs) | [optional] [default to null]
**group_id** | **INTEGER_64** | ID of the group if the organization has multiple groups (uncommon). | [optional] [default to null]
**license_number** | [**STRING_32**](STRING_32.md) | Driver&#39;s state issued license number. | [optional] [default to null]
**license_state** | [**STRING_32**](STRING_32.md) | Abbreviation of state that issued driver&#39;s license. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Driver&#39;s name. | [default to null]
**notes** | [**STRING_32**](STRING_32.md) | Notes about the driver. | [optional] [default to null]
**phone** | [**STRING_32**](STRING_32.md) | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] [default to null]
**username** | [**STRING_32**](STRING_32.md) | Driver&#39;s login username into the driver app. | [optional] [default to null]
**vehicle_id** | **INTEGER_64** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



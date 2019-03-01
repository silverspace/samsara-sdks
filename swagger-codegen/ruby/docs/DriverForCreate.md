# SwaggerClient::DriverForCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eld_adverse_weather_exemption_enabled** | **BOOLEAN** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] 
**eld_big_day_exemption_enabled** | **BOOLEAN** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] 
**eld_day_start_hour** | **Integer** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] 
**eld_exempt** | **BOOLEAN** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] 
**eld_exempt_reason** | **String** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] 
**eld_pc_enabled** | **BOOLEAN** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to false]
**eld_ym_enabled** | **BOOLEAN** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to false]
**external_ids** | **Hash&lt;String, String&gt;** | Dictionary of external IDs (string key-value pairs) | [optional] 
**group_id** | **Integer** | ID of the group if the organization has multiple groups (uncommon). | [optional] 
**license_number** | **String** | Driver&#39;s state issued license number. | [optional] 
**license_state** | **String** | Abbreviation of state that issued driver&#39;s license. | [optional] 
**name** | **String** | Driver&#39;s name. | 
**notes** | **String** | Notes about the driver. | [optional] 
**phone** | **String** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] 
**username** | **String** | Driver&#39;s login username into the driver app. | [optional] 
**vehicle_id** | **Integer** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] 
**password** | **String** | Driver&#39;s password for the driver app. | 
**tag_ids** | [**TagIds**](TagIds.md) |  | [optional] 



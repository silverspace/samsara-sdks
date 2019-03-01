# DriverForCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eld_adverse_weather_exemption_enabled** | **bool** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] 
**eld_big_day_exemption_enabled** | **bool** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] 
**eld_day_start_hour** | **int** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] 
**eld_exempt** | **bool** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] 
**eld_exempt_reason** | **string** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] 
**eld_pc_enabled** | **bool** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to false]
**eld_ym_enabled** | **bool** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to false]
**external_ids** | **map[string,string]** | Dictionary of external IDs (string key-value pairs) | [optional] 
**group_id** | **int** | ID of the group if the organization has multiple groups (uncommon). | [optional] 
**license_number** | **string** | Driver&#39;s state issued license number. | [optional] 
**license_state** | **string** | Abbreviation of state that issued driver&#39;s license. | [optional] 
**name** | **string** | Driver&#39;s name. | 
**notes** | **string** | Notes about the driver. | [optional] 
**phone** | **string** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] 
**username** | **string** | Driver&#39;s login username into the driver app. | [optional] 
**vehicle_id** | **int** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] 
**password** | **string** | Driver&#39;s password for the driver app. | 
**tag_ids** | [**\Swagger\Client\Model\TagIds**](TagIds.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



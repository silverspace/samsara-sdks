# SamsaraApi.Driver

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eldAdverseWeatherExemptionEnabled** | **Boolean** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] 
**eldBigDayExemptionEnabled** | **Boolean** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] 
**eldDayStartHour** | **Number** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] 
**eldExempt** | **Boolean** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] 
**eldExemptReason** | **String** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] 
**eldPcEnabled** | **Boolean** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to false]
**eldYmEnabled** | **Boolean** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to false]
**externalIds** | **{String: String}** | Dictionary of external IDs (string key-value pairs) | [optional] 
**groupId** | **Number** | ID of the group if the organization has multiple groups (uncommon). | [optional] 
**licenseNumber** | **String** | Driver&#39;s state issued license number. | [optional] 
**licenseState** | **String** | Abbreviation of state that issued driver&#39;s license. | [optional] 
**name** | **String** | Driver&#39;s name. | 
**notes** | **String** | Notes about the driver. | [optional] 
**phone** | **String** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] 
**username** | **String** | Driver&#39;s login username into the driver app. | [optional] 
**vehicleId** | **Number** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] 
**id** | **Number** | ID of the driver. | 
**isDeactivated** | **Boolean** | True if the driver account has been deactivated. | [optional] 
**tags** | [**[TagMetadata]**](TagMetadata.md) |  | [optional] 



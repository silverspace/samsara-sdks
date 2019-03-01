# openapi::DriverForCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eldAdverseWeatherExemptionEnabled** | **character** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] 
**eldBigDayExemptionEnabled** | **character** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] 
**eldDayStartHour** | **integer** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] 
**eldExempt** | **character** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] 
**eldExemptReason** | **character** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] 
**eldPcEnabled** | **character** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to FALSE]
**eldYmEnabled** | **character** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to FALSE]
**externalIds** | **character** | Dictionary of external IDs (string key-value pairs) | [optional] 
**groupId** | **integer** | ID of the group if the organization has multiple groups (uncommon). | [optional] 
**licenseNumber** | **character** | Driver&#39;s state issued license number. | [optional] 
**licenseState** | **character** | Abbreviation of state that issued driver&#39;s license. | [optional] 
**name** | **character** | Driver&#39;s name. | 
**notes** | **character** | Notes about the driver. | [optional] 
**phone** | **character** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] 
**username** | **character** | Driver&#39;s login username into the driver app. | [optional] 
**vehicleId** | **integer** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] 
**password** | **character** | Driver&#39;s password for the driver app. | 
**tagIds** | **integer** | A list of tag IDs. | [optional] 



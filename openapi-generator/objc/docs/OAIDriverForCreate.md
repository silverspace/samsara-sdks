# OAIDriverForCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eldAdverseWeatherExemptionEnabled** | **NSNumber*** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] 
**eldBigDayExemptionEnabled** | **NSNumber*** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] 
**eldDayStartHour** | **NSNumber*** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] 
**eldExempt** | **NSNumber*** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] 
**eldExemptReason** | **NSString*** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] 
**eldPcEnabled** | **NSNumber*** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to @(NO)]
**eldYmEnabled** | **NSNumber*** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to @(NO)]
**externalIds** | **NSDictionary&lt;NSString*, NSString*&gt;*** | Dictionary of external IDs (string key-value pairs) | [optional] 
**groupId** | **NSNumber*** | ID of the group if the organization has multiple groups (uncommon). | [optional] 
**licenseNumber** | **NSString*** | Driver&#39;s state issued license number. | [optional] 
**licenseState** | **NSString*** | Abbreviation of state that issued driver&#39;s license. | [optional] 
**name** | **NSString*** | Driver&#39;s name. | 
**notes** | **NSString*** | Notes about the driver. | [optional] 
**phone** | **NSString*** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] 
**username** | **NSString*** | Driver&#39;s login username into the driver app. | [optional] 
**vehicleId** | **NSNumber*** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] 
**password** | **NSString*** | Driver&#39;s password for the driver app. | 
**tagIds** | **NSArray&lt;NSNumber*&gt;*** | A list of tag IDs. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



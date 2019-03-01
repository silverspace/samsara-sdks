# Org.OpenAPITools.Model.Driver
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EldAdverseWeatherExemptionEnabled** | **bool?** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] 
**EldBigDayExemptionEnabled** | **bool?** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] 
**EldDayStartHour** | **int?** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] 
**EldExempt** | **bool?** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] 
**EldExemptReason** | **string** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] 
**EldPcEnabled** | **bool?** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to false]
**EldYmEnabled** | **bool?** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to false]
**ExternalIds** | **Dictionary<string, string>** | Dictionary of external IDs (string key-value pairs) | [optional] 
**GroupId** | **long?** | ID of the group if the organization has multiple groups (uncommon). | [optional] 
**LicenseNumber** | **string** | Driver&#39;s state issued license number. | [optional] 
**LicenseState** | **string** | Abbreviation of state that issued driver&#39;s license. | [optional] 
**Name** | **string** | Driver&#39;s name. | 
**Notes** | **string** | Notes about the driver. | [optional] 
**Phone** | **string** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] 
**Username** | **string** | Driver&#39;s login username into the driver app. | [optional] 
**VehicleId** | **long?** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] 
**Id** | **long?** | ID of the driver. | 
**IsDeactivated** | **bool?** | True if the driver account has been deactivated. | [optional] 
**Tags** | [**List<TagMetadata>**](TagMetadata.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


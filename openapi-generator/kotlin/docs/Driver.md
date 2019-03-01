
# Driver

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eldAdverseWeatherExemptionEnabled** | **kotlin.Boolean** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. |  [optional]
**eldBigDayExemptionEnabled** | **kotlin.Boolean** | Flag indicating this driver may use Big Day excemptions in ELD logs. |  [optional]
**eldDayStartHour** | **kotlin.Int** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. |  [optional]
**eldExempt** | **kotlin.Boolean** | Flag indicating this driver is exempt from the Electronic Logging Mandate. |  [optional]
**eldExemptReason** | **kotlin.String** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). |  [optional]
**eldPcEnabled** | **kotlin.Boolean** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. |  [optional]
**eldYmEnabled** | **kotlin.Boolean** | Flag indicating this driver may select the Yard Move duty status in ELD logs. |  [optional]
**externalIds** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Dictionary of external IDs (string key-value pairs) |  [optional]
**groupId** | **kotlin.Long** | ID of the group if the organization has multiple groups (uncommon). |  [optional]
**licenseNumber** | **kotlin.String** | Driver&#39;s state issued license number. |  [optional]
**licenseState** | **kotlin.String** | Abbreviation of state that issued driver&#39;s license. |  [optional]
**name** | **kotlin.String** | Driver&#39;s name. | 
**notes** | **kotlin.String** | Notes about the driver. |  [optional]
**phone** | **kotlin.String** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 |  [optional]
**username** | **kotlin.String** | Driver&#39;s login username into the driver app. |  [optional]
**vehicleId** | **kotlin.Long** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). |  [optional]
**id** | **kotlin.Long** | ID of the driver. | 
**isDeactivated** | **kotlin.Boolean** | True if the driver account has been deactivated. |  [optional]
**tags** | [**kotlin.Array&lt;TagMetadata&gt;**](TagMetadata.md) |  |  [optional]




# Driver

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eldAdverseWeatherExemptionEnabled** | **bool** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] 
**eldBigDayExemptionEnabled** | **bool** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] 
**eldDayStartHour** | **int** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] 
**eldExempt** | **bool** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] 
**eldExemptReason** | **string** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] 
**eldPcEnabled** | **bool** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to false]
**eldYmEnabled** | **bool** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to false]
**externalIds** | **string** | Dictionary of external IDs (string key-value pairs) | [optional] 
**groupId** | **int** | ID of the group if the organization has multiple groups (uncommon). | [optional] 
**licenseNumber** | **string** | Driver&#39;s state issued license number. | [optional] 
**licenseState** | **string** | Abbreviation of state that issued driver&#39;s license. | [optional] 
**name** | **string** | Driver&#39;s name. | 
**notes** | **string** | Notes about the driver. | [optional] 
**phone** | **string** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] 
**username** | **string** | Driver&#39;s login username into the driver app. | [optional] 
**vehicleId** | **int** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] 
**id** | **int** | ID of the driver. | 
**isDeactivated** | **bool** | True if the driver account has been deactivated. | [optional] 
**tags** | [**OpenAPI\Server\Model\TagMetadata**](TagMetadata.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



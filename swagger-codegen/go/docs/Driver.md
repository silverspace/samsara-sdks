# Driver

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EldAdverseWeatherExemptionEnabled** | **bool** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] [default to null]
**EldBigDayExemptionEnabled** | **bool** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] [default to null]
**EldDayStartHour** | **int32** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] [default to null]
**EldExempt** | **bool** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] [default to null]
**EldExemptReason** | **string** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] [default to null]
**EldPcEnabled** | **bool** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to null]
**EldYmEnabled** | **bool** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to null]
**ExternalIds** | **map[string]string** | Dictionary of external IDs (string key-value pairs) | [optional] [default to null]
**GroupId** | **int64** | ID of the group if the organization has multiple groups (uncommon). | [optional] [default to null]
**LicenseNumber** | **string** | Driver&#39;s state issued license number. | [optional] [default to null]
**LicenseState** | **string** | Abbreviation of state that issued driver&#39;s license. | [optional] [default to null]
**Name** | **string** | Driver&#39;s name. | [default to null]
**Notes** | **string** | Notes about the driver. | [optional] [default to null]
**Phone** | **string** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] [default to null]
**Username** | **string** | Driver&#39;s login username into the driver app. | [optional] [default to null]
**VehicleId** | **int64** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] [default to null]
**CurrentVehicleId** | **int64** | ID of the vehicle that this driver is currently assigned to. Omitted if there is no current vehicle assignment for this driver. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



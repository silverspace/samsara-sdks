# openapi.model.Driver

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eldAdverseWeatherExemptionEnabled** | **bool** | Flag indicating this driver may use Adverse Weather exemptions in ELD logs. | [optional] [default to null]
**eldBigDayExemptionEnabled** | **bool** | Flag indicating this driver may use Big Day excemptions in ELD logs. | [optional] [default to null]
**eldDayStartHour** | **int** | 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. | [optional] [default to null]
**eldExempt** | **bool** | Flag indicating this driver is exempt from the Electronic Logging Mandate. | [optional] [default to null]
**eldExemptReason** | **String** | Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). | [optional] [default to null]
**eldPcEnabled** | **bool** | Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. | [optional] [default to false]
**eldYmEnabled** | **bool** | Flag indicating this driver may select the Yard Move duty status in ELD logs. | [optional] [default to false]
**externalIds** | **Map&lt;String, String&gt;** | Dictionary of external IDs (string key-value pairs) | [optional] [default to {}]
**groupId** | **int** | ID of the group if the organization has multiple groups (uncommon). | [optional] [default to null]
**licenseNumber** | **String** | Driver&#39;s state issued license number. | [optional] [default to null]
**licenseState** | **String** | Abbreviation of state that issued driver&#39;s license. | [optional] [default to null]
**name** | **String** | Driver&#39;s name. | [default to null]
**notes** | **String** | Notes about the driver. | [optional] [default to null]
**phone** | **String** | Driver&#39;s phone number. Please include only digits, ex. 4157771234 | [optional] [default to null]
**username** | **String** | Driver&#39;s login username into the driver app. | [optional] [default to null]
**vehicleId** | **int** | ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). | [optional] [default to null]
**id** | **int** | ID of the driver. | [default to null]
**isDeactivated** | **bool** | True if the driver account has been deactivated. | [optional] [default to null]
**tags** | [**List&lt;TagMetadata&gt;**](TagMetadata.md) |  | [optional] [default to []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



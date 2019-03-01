# samsara.Model.DriverDailyLogResponseDays
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActiveHours** | **double?** | Hours spent on duty or driving, rounded to two decimal places. | [optional] 
**ActiveMs** | **long?** | Milliseconds spent on duty or driving. | [optional] 
**Certified** | **bool?** | Whether this HOS day chart was certified by the driver. | [optional] 
**CertifiedAtMs** | **long?** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] 
**DistanceMiles** | **double?** | Distance driven in miles, rounded to two decimal places. | [optional] 
**EndMs** | **int?** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**StartMs** | **int?** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**TrailerIds** | **Object** | List of trailer ID&#39;s associated with the driver for the day. | [optional] 
**VehicleIds** | **Object** | List of vehicle ID&#39;s associated with the driver for the day. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


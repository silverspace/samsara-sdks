# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CertifiedAtMs** | **int64** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] 
**EndMs** | **int32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**StartMs** | **int32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**TrailerIds** | [**map[string]interface{}**](.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] 
**ActiveHours** | **float64** | Hours spent on duty or driving, rounded to two decimal places. | [optional] 
**DistanceMiles** | **float64** | Distance driven in miles, rounded to two decimal places. | [optional] 
**ActiveMs** | **int64** | Milliseconds spent on duty or driving. | [optional] 
**Certified** | **bool** | Whether this HOS day chart was certified by the driver. | [optional] 
**VehicleIds** | [**map[string]interface{}**](.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



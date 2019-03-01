# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActiveHours** | **float64** | Hours spent on duty or driving, rounded to two decimal places. | [optional] [default to null]
**ActiveMs** | **int64** | Milliseconds spent on duty or driving. | [optional] [default to null]
**Certified** | **bool** | Whether this HOS day chart was certified by the driver. | [optional] [default to null]
**CertifiedAtMs** | **int64** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] [default to null]
**DistanceMiles** | **float64** | Distance driven in miles, rounded to two decimal places. | [optional] [default to null]
**EndMs** | **int32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**StartMs** | **int32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**TrailerIds** | [***interface{}**](interface{}.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] [default to null]
**VehicleIds** | [***interface{}**](interface{}.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



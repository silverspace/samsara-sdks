# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certifiedAtMs** | **Int!** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] [default to null]
**endMs** | **Int!** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**startMs** | **Int!** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**trailerIds** | [***TodoObjectMapping**](.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] [default to null]
**activeHours** | **Float!** | Hours spent on duty or driving, rounded to two decimal places. | [optional] [default to null]
**distanceMiles** | **Float!** | Distance driven in miles, rounded to two decimal places. | [optional] [default to null]
**activeMs** | **Int!** | Milliseconds spent on duty or driving. | [optional] [default to null]
**certified** | **Boolean!** | Whether this HOS day chart was certified by the driver. | [optional] [default to null]
**vehicleIds** | [***TodoObjectMapping**](.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



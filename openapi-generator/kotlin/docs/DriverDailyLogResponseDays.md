
# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certifiedAtMs** | **kotlin.Long** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. |  [optional]
**endMs** | **kotlin.Int** | End of the HOS day, specified in milliseconds UNIX time. |  [optional]
**startMs** | **kotlin.Int** | End of the HOS day, specified in milliseconds UNIX time. |  [optional]
**trailerIds** | [**kotlin.Any**](.md) | List of trailer ID&#39;s associated with the driver for the day. |  [optional]
**activeHours** | **kotlin.Double** | Hours spent on duty or driving, rounded to two decimal places. |  [optional]
**distanceMiles** | **kotlin.Double** | Distance driven in miles, rounded to two decimal places. |  [optional]
**activeMs** | **kotlin.Long** | Milliseconds spent on duty or driving. |  [optional]
**certified** | **kotlin.Boolean** | Whether this HOS day chart was certified by the driver. |  [optional]
**vehicleIds** | [**kotlin.Any**](.md) | List of vehicle ID&#39;s associated with the driver for the day. |  [optional]





# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeHours** | **Double** | Hours spent on duty or driving, rounded to two decimal places. |  [optional]
**activeMs** | **Long** | Milliseconds spent on duty or driving. |  [optional]
**certified** | **Boolean** | Whether this HOS day chart was certified by the driver. |  [optional]
**certifiedAtMs** | **Long** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. |  [optional]
**distanceMiles** | **Double** | Distance driven in miles, rounded to two decimal places. |  [optional]
**endMs** | **Integer** | End of the HOS day, specified in milliseconds UNIX time. |  [optional]
**startMs** | **Integer** | End of the HOS day, specified in milliseconds UNIX time. |  [optional]
**trailerIds** | **Object** | List of trailer ID&#39;s associated with the driver for the day. |  [optional]
**vehicleIds** | **Object** | List of vehicle ID&#39;s associated with the driver for the day. |  [optional]




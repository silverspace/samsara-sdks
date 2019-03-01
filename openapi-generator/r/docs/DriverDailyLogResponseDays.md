# openapi::DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certifiedAtMs** | **integer** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] 
**endMs** | **integer** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**startMs** | **integer** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**trailerIds** | [**object**](.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] 
**activeHours** | **numeric** | Hours spent on duty or driving, rounded to two decimal places. | [optional] 
**distanceMiles** | **numeric** | Distance driven in miles, rounded to two decimal places. | [optional] 
**activeMs** | **integer** | Milliseconds spent on duty or driving. | [optional] 
**certified** | **character** | Whether this HOS day chart was certified by the driver. | [optional] 
**vehicleIds** | [**object**](.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] 



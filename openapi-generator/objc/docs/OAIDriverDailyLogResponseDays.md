# OAIDriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certifiedAtMs** | **NSNumber*** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] 
**endMs** | **NSNumber*** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**startMs** | **NSNumber*** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**trailerIds** | [**NSObject***](.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] 
**activeHours** | **NSNumber*** | Hours spent on duty or driving, rounded to two decimal places. | [optional] 
**distanceMiles** | **NSNumber*** | Distance driven in miles, rounded to two decimal places. | [optional] 
**activeMs** | **NSNumber*** | Milliseconds spent on duty or driving. | [optional] 
**certified** | **NSNumber*** | Whether this HOS day chart was certified by the driver. | [optional] 
**vehicleIds** | [**NSObject***](.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



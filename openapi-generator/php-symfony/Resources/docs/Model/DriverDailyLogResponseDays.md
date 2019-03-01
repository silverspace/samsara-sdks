# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certifiedAtMs** | **int** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] 
**endMs** | **int** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**startMs** | **int** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**trailerIds** | [**array**](.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] 
**activeHours** | **double** | Hours spent on duty or driving, rounded to two decimal places. | [optional] 
**distanceMiles** | **double** | Distance driven in miles, rounded to two decimal places. | [optional] 
**activeMs** | **int** | Milliseconds spent on duty or driving. | [optional] 
**certified** | **bool** | Whether this HOS day chart was certified by the driver. | [optional] 
**vehicleIds** | [**array**](.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_hours** | **double** | Hours spent on duty or driving, rounded to two decimal places. | [optional] 
**active_ms** | **int** | Milliseconds spent on duty or driving. | [optional] 
**certified** | **bool** | Whether this HOS day chart was certified by the driver. | [optional] 
**certified_at_ms** | **int** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] 
**distance_miles** | **double** | Distance driven in miles, rounded to two decimal places. | [optional] 
**end_ms** | **int** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**start_ms** | **int** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**trailer_ids** | **object** | List of trailer ID&#39;s associated with the driver for the day. | [optional] 
**vehicle_ids** | **object** | List of vehicle ID&#39;s associated with the driver for the day. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



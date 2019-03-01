# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certified_at_ms** | **i64** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] 
**end_ms** | **i32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**start_ms** | **i32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**trailer_ids** | [***Value**](.md) | List of trailer ID's associated with the driver for the day. | [optional] 
**active_hours** | **f64** | Hours spent on duty or driving, rounded to two decimal places. | [optional] 
**distance_miles** | **f64** | Distance driven in miles, rounded to two decimal places. | [optional] 
**active_ms** | **i64** | Milliseconds spent on duty or driving. | [optional] 
**certified** | **bool** | Whether this HOS day chart was certified by the driver. | [optional] 
**vehicle_ids** | [***Value**](.md) | List of vehicle ID's associated with the driver for the day. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



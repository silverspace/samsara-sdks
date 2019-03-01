# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_hours** | **f64** | Hours spent on duty or driving, rounded to two decimal places. | [optional] [default to null]
**active_ms** | **i64** | Milliseconds spent on duty or driving. | [optional] [default to null]
**certified** | **bool** | Whether this HOS day chart was certified by the driver. | [optional] [default to null]
**certified_at_ms** | **i64** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] [default to null]
**distance_miles** | **f64** | Distance driven in miles, rounded to two decimal places. | [optional] [default to null]
**end_ms** | **i32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**start_ms** | **i32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**trailer_ids** | [***Value**](Value.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] [default to null]
**vehicle_ids** | [***Value**](Value.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



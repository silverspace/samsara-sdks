# DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certified_at_ms** | **i64** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] [default to None]
**end_ms** | **isize** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to None]
**start_ms** | **isize** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to None]
**trailer_ids** | [***Object**](.md) | List of trailer ID's associated with the driver for the day. | [optional] [default to None]
**active_hours** | **f64** | Hours spent on duty or driving, rounded to two decimal places. | [optional] [default to None]
**distance_miles** | **f64** | Distance driven in miles, rounded to two decimal places. | [optional] [default to None]
**active_ms** | **i64** | Milliseconds spent on duty or driving. | [optional] [default to None]
**certified** | **bool** | Whether this HOS day chart was certified by the driver. | [optional] [default to None]
**vehicle_ids** | [***Object**](.md) | List of vehicle ID's associated with the driver for the day. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



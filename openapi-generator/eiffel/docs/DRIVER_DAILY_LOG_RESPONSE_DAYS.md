# DRIVER_DAILY_LOG_RESPONSE_DAYS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certified_at_ms** | **INTEGER_64** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] [default to null]
**end_ms** | **INTEGER_32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**start_ms** | **INTEGER_32** | End of the HOS day, specified in milliseconds UNIX time. | [optional] [default to null]
**trailer_ids** | [**ANY**](.md) | List of trailer ID&#39;s associated with the driver for the day. | [optional] [default to null]
**active_hours** | **REAL_64** | Hours spent on duty or driving, rounded to two decimal places. | [optional] [default to null]
**distance_miles** | **REAL_64** | Distance driven in miles, rounded to two decimal places. | [optional] [default to null]
**active_ms** | **INTEGER_64** | Milliseconds spent on duty or driving. | [optional] [default to null]
**certified** | **BOOLEAN** | Whether this HOS day chart was certified by the driver. | [optional] [default to null]
**vehicle_ids** | [**ANY**](.md) | List of vehicle ID&#39;s associated with the driver for the day. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



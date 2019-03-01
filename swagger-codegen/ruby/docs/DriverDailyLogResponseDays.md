# SwaggerClient::DriverDailyLogResponseDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_hours** | **Float** | Hours spent on duty or driving, rounded to two decimal places. | [optional] 
**active_ms** | **Integer** | Milliseconds spent on duty or driving. | [optional] 
**certified** | **BOOLEAN** | Whether this HOS day chart was certified by the driver. | [optional] 
**certified_at_ms** | **Integer** | Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. | [optional] 
**distance_miles** | **Float** | Distance driven in miles, rounded to two decimal places. | [optional] 
**end_ms** | **Integer** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**start_ms** | **Integer** | End of the HOS day, specified in milliseconds UNIX time. | [optional] 
**trailer_ids** | **Object** | List of trailer ID&#39;s associated with the driver for the day. | [optional] 
**vehicle_ids** | **Object** | List of vehicle ID&#39;s associated with the driver for the day. | [optional] 


